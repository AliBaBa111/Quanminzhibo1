package com.qf.zxw.quanminzhibo.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.qf.zxw.quanminzhibo.R;
import com.qf.zxw.quanminzhibo.SousuoActivity;
import com.qf.zxw.quanminzhibo.adapter.LanmuRecycleAdapter;
import com.qf.zxw.quanminzhibo.bean.LanmuBean;
import com.qf.zxw.quanminzhibo.callback.LanmuCallBack;
import com.qf.zxw.quanminzhibo.http.PublicHttp;
import com.qf.zxw.quanminzhibo.json.LanmuJson;
import com.qf.zxw.quanminzhibo.uri.Url;

import java.util.List;


public class LanmuFragment extends Fragment {
    private RecyclerView recyclerView;
    private ImageView imageView;
    private List<LanmuBean>list;
    private LanmuRecycleAdapter adapter;
    public LanmuFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lanmu, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycleView);
        imageView = (ImageView) view.findViewById(R.id.lanmu_sousuo);
        //数据
        new PublicHttp(new LanmuCallBack() {
            @Override
            public void getData(byte[] bytes) {
                String news = new String(bytes);
                Log.e("AAAAA","==>"+news);
                list = LanmuJson.getData(news);
                adapter = new LanmuRecycleAdapter(getActivity(),list);
                //adapter
                recyclerView.setAdapter(adapter);
                //管理者
                GridLayoutManager manager = new GridLayoutManager(getActivity(),3);
                manager.setOrientation(GridLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(manager);
            }
        }).execute(Url.Lanmu);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SousuoActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        return view;
    }


}
