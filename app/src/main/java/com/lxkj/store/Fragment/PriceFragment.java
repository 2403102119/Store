package com.lxkj.store.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.alibaba.fastjson.JSON;
import com.lxkj.store.Base.BaseFragment;
import com.lxkj.store.R;
import com.zhangke.websocket.SimpleListener;
import com.zhangke.websocket.SocketListener;
import com.zhangke.websocket.WebSocketHandler;
import com.zhangke.websocket.response.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Administrator on 2019/6/26.
 */
/*
*行情页面
*@Author:李迪迦
*@Date:2019.6.27
*/
public class PriceFragment extends BaseFragment {
    private RecyclerView price;
    private LinearLayoutManager layoutManager;
    List<Map<String,Object>> list=new ArrayList<>();
    private ImageView im_search,im_sort,im_add;






    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_price, container, false);
        initView(view);
        initData();




        return view;
    }
    private void initView(View view) {

    }
    private void initData() {


    }

    @Override
    public void onDestroy() {
        super.onDestroy();


//        Map<String,Object> map=new HashMap<>();
//        map.put("sub","market.allcoin.detail");
//        map.put("id","allcoin");
//        String json= StringUtil.map2Json(map);
//        WebSocketHandler.getDefault().send(json);
//
//        Map<String,Object> map1=new HashMap<>();
//        map.put("ping","ping");
//        String json1= StringUtil.map2Json(map1);
//        WebSocketHandler.getDefault().send(json1);
//
//        WebSocketHandler.getDefault().removeListener( socketListener);
    }
}
