package com.zijin.wifi_student.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.zijin.wifi_student.R;

/**
 * Created by yin on 2017/4/12.
 */
public class SearchWifiActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView iv_phone;
    private Button btn_back,btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivty_searchwifi);
        iv_phone = (ImageView) findViewById(R.id.iv_phone);
        btn_back = (Button) findViewById(R.id.btn_back);
        btn_login = (Button) findViewById(R.id.btn_login);
        iv_phone.setOnClickListener(this);
        btn_back.setOnClickListener(this);
        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.iv_phone:
                Toast.makeText(SearchWifiActivity.this, "正在搜索", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_back:
                Intent intent1 = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent1);
                break;
            case R.id.btn_login:
                Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
