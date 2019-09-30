package com.lxkj.store.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.lxkj.store.Base.BaseFragment;
import com.lxkj.store.R;



/**
 * Created by Administrator on 2019/6/26.
 */
/*
*首页页面
*@Author:李迪迦
*@Date:
*/
public class HomeFragment extends BaseFragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
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
//        home_page();
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);

    }
}
