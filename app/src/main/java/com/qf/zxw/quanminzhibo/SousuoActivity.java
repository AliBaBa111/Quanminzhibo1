package com.qf.zxw.quanminzhibo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import com.qf.zxw.quanminzhibo.adapter.ListViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class SousuoActivity extends AppCompatActivity {
    private EditText editText;
    private ListView listView;
    private List<String>data;
    private ListViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sousuo);
        editText = (EditText) findViewById(R.id.sousuo_edittext);
        listView = (ListView) findViewById(R.id.sousuo_listView);
        data = new ArrayList<>();
    }

    public void MyBtnClick(View view) {
        switch (view.getId()){
            case R.id.btn_sousuo:
                String context = editText.getText().toString().trim();
                data.add(context);
                adapter = new ListViewAdapter(SousuoActivity.this,data);
                listView.setAdapter(adapter);
                //搜索页面


                break;
            case R.id.btn_return:
                Intent intent = new Intent(SousuoActivity.this, MainActivity.class);
                intent.putExtra("position",1);
                startActivity(intent);
                finish();
                break;
            case R.id.btn_clear:
                //清除listView的数据
                if(data!=null){
                    data.clear();
                    adapter.notifyDataSetChanged();
                }
                break;
        }
    }
}
