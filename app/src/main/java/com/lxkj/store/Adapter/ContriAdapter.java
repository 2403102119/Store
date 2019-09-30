package com.lxkj.store.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.lxkj.store.R;

import java.util.List;
import java.util.Map;


/**
 * Created by Administrator on 2019/9/29 0029.
 */

public class ContriAdapter extends RecyclerView.Adapter<ContriAdapter.MyHolder> {
    private Context context;
    private List<Map<String, Object>> list;

    public ContriAdapter(Context context, List<Map<String, Object>> list) {
        this.context = context;
        this.list = list;

    }

    @Override
    public ContriAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contrii_layout, parent, false);
        return new ContriAdapter.MyHolder(view);
    }

    @Override
    public void onBindViewHolder(ContriAdapter.MyHolder holder, final int position) {

    }

    @Override
    public int getItemCount() {
//        if (list == null){
//            return 0;
//        }else {
//            return list.size();
//        }
        return 10;
    }


    public class MyHolder extends RecyclerView.ViewHolder {
        View ve_slider;
        public MyHolder(View itemView) {
            super(itemView);
            ve_slider = itemView.findViewById(R.id.ve_slider);
        }
    }
    private ContriAdapter.OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(ContriAdapter.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void OnItemClickListener(int firstPosition);


    }
}
