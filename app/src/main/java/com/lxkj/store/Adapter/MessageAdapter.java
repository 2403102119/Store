package com.lxkj.store.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lxkj.store.R;

import java.util.List;
import java.util.Map;


/**
 * Created by Administrator on 2019/6/26.
 */

public class MessageAdapter extends  RecyclerView.Adapter<MessageAdapter.MyHolder> {
    private Context context;
    private List<Map<String, Object>> list;
    public MessageAdapter(Context context, List<Map<String, Object>> list) {
        this.context = context;
        this.list = list;

    }
    @Override
    public MessageAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.particulars, parent, false);
        return new MessageAdapter.MyHolder(view);
    }

    @Override
    public void onBindViewHolder(MessageAdapter.MyHolder holder, int position) {

    }

    @Override
    public int getItemCount() {

//        if (list == null) {
//            return 0;
//        } else {
//            return list.size();
//        }
        return 5;
    }


    public class MyHolder extends RecyclerView.ViewHolder {
        public MyHolder(View itemView) {
            super(itemView);

        }
    }
    private MessageAdapter.OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(MessageAdapter.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void OnItemClickListener(int firstPosition);

    }
}
