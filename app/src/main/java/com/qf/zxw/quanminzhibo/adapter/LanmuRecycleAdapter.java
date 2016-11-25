package com.qf.zxw.quanminzhibo.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.qf.zxw.quanminzhibo.R;
import com.qf.zxw.quanminzhibo.SecondActivity;
import com.qf.zxw.quanminzhibo.bean.LanmuBean;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Administrator on 2016/11/22.
 */
public class LanmuRecycleAdapter extends RecyclerView.Adapter<LanmuRecycleAdapter.ViewHolder>{
    private Context context;
    private List<LanmuBean>data;

    public LanmuRecycleAdapter(Context context, List<LanmuBean> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(context).inflate(R.layout.lanmu_item,parent,false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        LanmuBean news = data.get(position);
        holder.textView.setText(news.getName());
        Picasso.with(context).load(news.getImage()).into(holder.imageView);
        //单条点击事件
        final String slug = news.getSlug();
        final String name = news.getName();
        holder.frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SecondActivity.class);
                intent.putExtra("slug",slug);
                intent.putExtra("name",name);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data!=null?data.size():0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private FrameLayout frameLayout;
        private ImageView imageView;
        private TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            frameLayout = (FrameLayout) itemView.findViewById(R.id.lanmu_item_linear);
            imageView = (ImageView) itemView.findViewById(R.id.lanmu_item_image);
            textView = (TextView) itemView.findViewById(R.id.lanmu_item_text);
        }
    }
}
