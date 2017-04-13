package com.zijin.wifi_student.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.zijin.wifi_student.R;

/**
 * Created by yin on 2017/4/10.
 */
public class MessageFragment extends Fragment implements View.OnClickListener{
    private Context mContext;
    private Button btn_one;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_message,container,false);
        btn_one = (Button)view.findViewById(R.id.btn_one);
        btn_one.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_one:
                TextView mTextViewUser = (TextView)getActivity().findViewById(R.id.tab_menu_message_num);
                mTextViewUser.setText("17");
                mTextViewUser.setVisibility(View.VISIBLE);
                break;
        }
    }
}