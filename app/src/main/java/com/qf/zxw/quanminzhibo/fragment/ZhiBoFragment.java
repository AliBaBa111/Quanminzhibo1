package com.qf.zxw.quanminzhibo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qf.zxw.quanminzhibo.R;
import com.qf.zxw.quanminzhibo.adapter.SecondRecycleAdapter;
import com.qf.zxw.quanminzhibo.bean.SecondBean;
import com.qf.zxw.quanminzhibo.callback.LanmuCallBack;
import com.qf.zxw.quanminzhibo.http.PublicHttp;
import com.qf.zxw.quanminzhibo.json.SecondJson;
import com.qf.zxw.quanminzhibo.uri.Url;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ZhiBoFragment extends Fragment {
    private RecyclerView recyclerView;
    private Toolbar toolbar;
    private SecondRecycleAdapter adapter;
    private List<SecondBean> data;
    public ZhiBoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_zhi_bo, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.zhibo_recycleView);
        toolbar = (Toolbar) view.findViewById(R.id.zhibo_toolbar);

        new PublicHttp(new LanmuCallBack() {
            @Override
            public void getData(byte[] bytes) {
                String jsonStr = new String(bytes);
                data = SecondJson.getData(jsonStr);
                adapter = new SecondRecycleAdapter(getActivity(),data);
                recyclerView.setAdapter(adapter);
                //管理者
                GridLayoutManager manager = new GridLayoutManager(getActivity(),2);
                manager.setOrientation(GridLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(manager);
            }
        }).execute(Url.Zhibo);
        return view;
    }

}