package com.qf.zxw.quanminzhibo.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.qf.zxw.quanminzhibo.R;
import com.qf.zxw.quanminzhibo.ThirdActivity;
import com.qf.zxw.quanminzhibo.bean.SecondBean;
import com.qf.zxw.quanminzhibo.widget.CircleImageView;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Administrator on 2016/11/22.
 */
public class SecondRecycleAdapter extends RecyclerView.Adapter<SecondRecycleAdapter.ViewHolder>{
    private Context context;
    private List<SecondBean>data;

    public SecondRecycleAdapter(Context context, List<SecondBean> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolder viewHolder = new ViewHolder(LayoutInflater.from(context).inflate(R.layout.second_item,parent,false));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        SecondBean bean = data.get(position);
        if (bean.getAvatar() != null&&bean.getThumb()!=null&&bean.getAvatar().length()>0&&bean.getThumb().length()>0) {
            Picasso.with(context).load(bean.getThumb()).error(R.mipmap.ic_launcher).into(holder.imageView);
            Picasso.with(context).load(bean.getAvatar()).error(R.mipmap.ic_launcher).into(holder.image_touxiang);
        }

        holder.text_title.setText(bean.getTitle());
        holder.text_nick.setText(bean.getNick());
        final String uid = bean.getUid();
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ThirdActivity.class);
                intent.putExtra("uid",uid);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data!=null?data.size():0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
         CircleImageView image_touxiang;
        private TextView text_title,text_nick;
        private LinearLayout linearLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.second_item_image);
            image_touxiang = (CircleImageView) itemView.findViewById(R.id.second_item_touxiang);
            text_title = (TextView) itemView.findViewById(R.id.second_item_title);
            text_nick = (TextView) itemView.findViewById(R.id.second_item_nick);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.second_item_linear);
        }
    }
}
