package com.qf.zxw.quanminzhibo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.qf.zxw.quanminzhibo.R;

public class WodeFragment extends Fragment {
    View view;
    LinearLayout linearLayout;
    public WodeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_wode, container, false);
        ListView lv= (ListView) view.findViewById(R.id.wode_lv);
        linearLayout= (LinearLayout) view.findViewById(R.id.linert);


        return view;
    }


}

