package com.lxkj.store.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.lxkj.store.Base.BaseActivity;
import com.lxkj.store.R;

public class ProductActivity extends BaseActivity implements View.OnClickListener{

    private TextView tv_submit;

    @Override
    protected void initView(Bundle savedInstanceState) {
        setContainer(R.layout.activity_product);
        setTopTitle("申请单品代理");
        tv_submit = findViewById(R.id.tv_submit);
    }

    @Override
    protected void initEvent() {
        tv_submit.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tv_submit://订单支付成功
                Intent intent = new Intent(ProductActivity.this,Payment_successActivity.class);
                startActivity(intent);
                break;
        }
    }
}
