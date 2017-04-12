package com.zijin.wifi_student.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.zijin.wifi_student.R;

/**
 * Created by yin on 2017/4/12.
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button login_btn_back,login_btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_btn_back = (Button) findViewById(R.id.login_btn_back);
        login_btn_next = (Button) findViewById(R.id.login_btn_next);
        login_btn_back.setOnClickListener(this);
        login_btn_next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login_btn_back:
                Intent intent1 = new Intent(getApplicationContext(), WelcomeActivity.class);
                startActivity(intent1);
                break;
            case R.id.login_btn_next:
                Intent intent2 = new Intent(getApplicationContext(), SearchWifiActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
