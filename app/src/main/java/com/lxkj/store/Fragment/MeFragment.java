package com.lxkj.store.Fragment;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.bumptech.glide.Glide;
import com.lxkj.store.Base.BaseFragment;
import com.lxkj.store.R;


import de.hdodenhof.circleimageview.CircleImageView;
import okhttp3.Call;

/**
 * Created by Administrator on 2019/6/26.
 */
/*
*我的页面
*@Author:李迪迦
*@Date:2019.6.26
*/
public class MeFragment extends BaseFragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_me, container, false);
        initView(view);
        initData();
        return view;
    }
    private void initView(View view) {




    }
    private void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

        }
    }




    @Override
    public void onResume() {
        super.onResume();
    }

}
