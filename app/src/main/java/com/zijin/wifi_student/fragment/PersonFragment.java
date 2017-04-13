package com.zijin.wifi_student.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zijin.wifi_student.R;

/**
 * Created by yin on 2017/4/10.
 */
public class PersonFragment extends Fragment {
    private Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_person,container,false);
        return view;
    }


}