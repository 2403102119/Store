package com.lxkj.store.Fragment;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.bumptech.glide.Glide;
import com.lxkj.store.Activity.GiftActivity;
import com.lxkj.store.Activity.MessageActivity;
import com.lxkj.store.Activity.PersonalActivity;
import com.lxkj.store.Activity.ProductActivity;
import com.lxkj.store.Activity.SetActivity;
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
*@Date:2019.10.8
*/
public class MeFragment extends BaseFragment implements View.OnClickListener {
    private ImageView im_message,im_set;
    private LinearLayout ll_personal_details,ll_product,ll_gift;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_me, container, false);
        initView(view);
        initData();
        return view;
    }
    private void initView(View view) {
        im_message = view.findViewById(R.id.im_message);
        im_set = view.findViewById(R.id.im_message);
        ll_personal_details = view.findViewById(R.id.ll_personal_details);
        ll_product = view.findViewById(R.id.ll_product);
        ll_gift = view.findViewById(R.id.ll_gift);




    }
    private void initData() {
        im_message.setOnClickListener(this);
        im_set.setOnClickListener(this);
        ll_personal_details.setOnClickListener(this);
        ll_product.setOnClickListener(this);
        ll_gift.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.im_message://常见问题
                Intent intent = new Intent(getActivity(), MessageActivity.class);
                startActivity(intent);
                break;
            case R.id.im_set://设置
                Intent intent1 = new Intent(getActivity(), SetActivity.class);
                startActivity(intent1);
                break;
            case R.id.ll_personal_details://个人信息
                Intent intent2 = new Intent(getActivity(), PersonalActivity.class);
                startActivity(intent2);
                break;
            case R.id.ll_product://申请单品代理
                Intent intent3 = new Intent(getActivity(), ProductActivity.class);
                startActivity(intent3);
                break;
            case R.id.ll_gift://申请赠品单品代理
                Intent intent4 = new Intent(getActivity(), GiftActivity.class);
                startActivity(intent4);
                break;
        }
    }




    @Override
    public void onResume() {
        super.onResume();
    }

}
