package com.lxkj.store.Fragment;


import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lxkj.store.Adapter.ContriAdapter;
import com.lxkj.store.Adapter.MultiAdapter;
import com.lxkj.store.Adapter.ProductAdapter;
import com.lxkj.store.Base.BaseFragment;
import com.lxkj.store.R;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * Created by Administrator on 2019/6/26.
 */
/*
*首页页面
*@Author:李迪迦
*@Date:
*/
public class HomeFragment extends BaseFragment implements View.OnClickListener {
    private RecyclerView recycle,ry_multi,ry_product,ry_falls;
    private LinearLayoutManager layoutManager;
    private GridLayoutManager gridLayoutManager;
    private StaggeredGridLayoutManager staggeredGridLayoutManager;
    ContriAdapter adapter;
    MultiAdapter multiAdapter;
    ProductAdapter productAdapter;
    private Banner banner;
    private ArrayList<String> list_path;
    private ArrayList<String> list_title;
    List<Map<String,Object>> list=new ArrayList<>();
    List<Map<String,Object>> list2=new ArrayList<>();
    List<Map<String,Object>> list3=new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        initView(view);
        initData();

        return view;
    }

    private void initView(View view) {
        recycle = view.findViewById(R.id.recycle);
        banner = view.findViewById(R.id.banner);
        ry_multi = view.findViewById(R.id.ry_multi);
        ry_product = view.findViewById(R.id.ry_product);
        ry_falls = view.findViewById(R.id.ry_falls);

        layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recycle.setLayoutManager(layoutManager);
        adapter = new ContriAdapter(getContext(), list);
        recycle.setAdapter(adapter);
        adapter.setOnItemClickListener(new ContriAdapter.OnItemClickListener() {
            @Override
            public void OnItemClickListener(int firstPosition) {

            }

        });

        gridLayoutManager = new GridLayoutManager(getContext(),5);
        ry_multi.setLayoutManager(gridLayoutManager);
        multiAdapter = new MultiAdapter(getContext(), list2);
        ry_multi.setAdapter(multiAdapter);
        multiAdapter.setOnItemClickListener(new MultiAdapter.OnItemClickListener() {
            @Override
            public void OnItemClickListener(int firstPosition) {


            }


        });

        layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        ry_product.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(getContext(), list3);
        ry_product.setAdapter(productAdapter);
        productAdapter.setOnItemClickListener(new ProductAdapter.OnItemClickListener() {
            @Override
            public void OnItemClickListener(int firstPosition) {


            }

        });

        staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        ry_falls.setLayoutManager(staggeredGridLayoutManager);
        productAdapter = new ProductAdapter(getContext(), list3);
        ry_falls.setAdapter(productAdapter);
        productAdapter.setOnItemClickListener(new ProductAdapter.OnItemClickListener() {
            @Override
            public void OnItemClickListener(int firstPosition) {


            }

        });


    }

    private void initData() {
        list_path = new ArrayList<>();
        //放标题的集合
        list_title = new ArrayList<>();

        list_path.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic21363tj30ci08ct96.jpg");
        list_path.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic259ohaj30ci08c74r.jpg");
        list_path.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic2b16zuj30ci08cwf4.jpg");
        list_path.add("http://ww4.sinaimg.cn/large/006uZZy8jw1faic2e7vsaj30ci08cglz.jpg");
        list_title.add("好好学习");
        list_title.add("好好学习");
        list_title.add("好好学习");
        list_title.add("好好学习");
        //设置内置样式，共有六种可以点入方法内逐一体验使用。
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        //设置图片加载器，图片加载器在下方
        banner.setImageLoader(new MyLoader());
        //设置图片网址或地址的集合
        banner.setImages(list_path);
        //设置轮播的动画效果，内含多种特效，可点入方法内查找后内逐一体验
        banner.setBannerAnimation(Transformer.Default);
        //设置轮播图的标题集合
        banner.setBannerTitles(list_title);
        //设置轮播间隔时间
        banner.setDelayTime(3000);
        //设置是否为自动轮播，默认是“是”。
        banner.isAutoPlay(true);
        //设置指示器的位置，小点点，左中右。
        banner.setIndicatorGravity(BannerConfig.CENTER).start();

    }

    //自定义的图片加载器
    private class MyLoader extends ImageLoader {
        @Override
        public void displayImage(Context context, Object path, ImageView imageView) {
            Glide.with(context).load((String) path).into(imageView);
        }

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

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);

    }
}
