package com.qf.zxw.quanminzhibo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.qf.zxw.quanminzhibo.R;

import java.util.List;

/**
 * Created by Administrator on 2016/11/22.
 */
public class ListViewAdapter extends BaseAdapter {
    private Context context;
    private List<String>data;

    public ListViewAdapter(Context context, List<String> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data!=null?data.size():0;
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
            holder = new ViewHolder();
            holder.textView = (TextView) convertView.findViewById(R.id.list_item_text);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        String name = data.get(position);
        holder.textView.setText(name);
        return convertView;
    }
    class ViewHolder {
        TextView textView;
    }
}
