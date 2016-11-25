package com.qf.zxw.quanminzhibo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.qf.zxw.quanminzhibo.R;

import java.util.List;

/**
 * Created by Administrator on 2016/11/22.
 */
public class WodeListviewAdapter extends BaseAdapter {
    List<Integer> icons;
    List<String> strings;
    Context context;

    public WodeListviewAdapter(List<Integer> icons, List<String> strings, Context context) {
        this.icons = icons;
        this.strings = strings;
        this.context = context;
    }

    @Override
    public int getCount() {
        return strings!=null?strings.size():0;
    }

    @Override
    public Object getItem(int position) {
        return strings.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.wodelistviewitem,parent,false);


        return convertView;
    }

}
