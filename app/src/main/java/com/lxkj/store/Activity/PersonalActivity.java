package com.lxkj.store.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lxkj.store.Base.BaseActivity;
import com.lxkj.store.R;

public class PersonalActivity extends BaseActivity {


    @Override
    protected void initView(Bundle savedInstanceState) {
        setContainer(R.layout.activity_personal);
        setTopTitle("个人信息");
    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected void initData() {

    }
}
