package com.zijin.wifi_student.activity;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zijin.wifi_student.R;
import com.zijin.wifi_student.fragment.MessageFragment;
import com.zijin.wifi_student.fragment.PersonFragment;
import com.zijin.wifi_student.fragment.UserFragment;

/**
 * Created by yin on 2017/4/12.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout ly_user,ly_message,ly_person;
    private TextView tv_user,tv_message,tv_person;
    private TextView tv_message_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindView();

        setSelected();
        tv_user.setSelected(true);
        UserFragment fg1 = new UserFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fg1).commit();
    }

    private void bindView() {

        ly_user = (LinearLayout)findViewById(R.id.ly_tab_menu_user);
        ly_message = (LinearLayout)findViewById(R.id.ly_tab_menu_message);
        ly_person = (LinearLayout)findViewById(R.id.ly_tab_menu_person);

        tv_user = (TextView)findViewById(R.id.tab_menu_user);
        tv_message = (TextView)findViewById(R.id.tab_menu_message);
        tv_person = (TextView)findViewById(R.id.tab_menu_person);

        tv_message_num = (TextView)findViewById(R.id.tab_menu_message_num);

        ly_user.setOnClickListener(this);
        ly_message.setOnClickListener(this);
        ly_person.setOnClickListener(this);
    }

    //重置所有文本的选中状态
    private void setSelected() {
        tv_user.setSelected(false);
        tv_message.setSelected(false);
        tv_person.setSelected(false);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.ly_tab_menu_user:
                setSelected();
                tv_user.setSelected(true);

                UserFragment fg1 = new UserFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fg1).commit();
                break;
            case R.id.ly_tab_menu_message:
                setSelected();
                tv_message.setSelected(true);
                tv_message_num.setVisibility(View.INVISIBLE);

                MessageFragment fg2 = new MessageFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fg2).commit();
                break;
            case R.id.ly_tab_menu_person:
                setSelected();
                tv_person.setSelected(true);

                PersonFragment fg3 = new PersonFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fg3).commit();
                break;
        }
    }

}
