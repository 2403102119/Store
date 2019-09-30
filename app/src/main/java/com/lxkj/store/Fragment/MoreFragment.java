package com.lxkj.store.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.fastjson.JSON;
import com.lxkj.store.Base.BaseFragment;
import com.lxkj.store.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import okhttp3.Call;

/**
 * Created by Administrator on 2019/6/26.
 */
/*
*资讯页面
*@Author:李迪迦
*@Date:
*/
public class MoreFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_more, container, false);
        initView(view);
        initData();

        return view;
    }
    private void initView(View view) {
    }
    private void initData() {



    }


    @Override
    public void onResume() {
        super.onResume();
    }
}
