package com.lxkj.store.Activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lxkj.store.Adapter.MessageAdapter;
import com.lxkj.store.Base.BaseActivity;
import com.lxkj.store.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MessageActivity extends BaseActivity {
    private RecyclerView particulars;
    LinearLayoutManager layoutManager;
    MessageAdapter adapter;
    List<Map<String,Object>> list=new ArrayList<>();

    @Override
    protected void initView(Bundle savedInstanceState) {
        setContainer(R.layout.activity_message);
        setTopTitle("常见问题");
        particulars = findViewById(R.id.recycle);
    }

    @Override
    protected void initEvent() {

    }

    @Override
    protected void initData() {
        layoutManager = new LinearLayoutManager(MessageActivity.this);
        particulars.setLayoutManager(layoutManager);
        adapter = new MessageAdapter(MessageActivity.this, list);
        particulars.setAdapter(adapter);
        adapter.setOnItemClickListener(new MessageAdapter.OnItemClickListener() {
            @Override
            public void OnItemClickListener(int firstPosition) {

            }



        });

    }
}
