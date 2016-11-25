package com.qf.zxw.quanminzhibo.json;


import com.qf.zxw.quanminzhibo.bean.SecondBean;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/23.
 */
public class ZhiboJson {
    public static List<SecondBean>getData(String jsonStr){
        List<SecondBean>data = new ArrayList<>();
        try {
            JSONObject object = new JSONObject(jsonStr);
            JSONArray array = object.getJSONArray("data");
            for (int i = 0; i < array.length(); i++) {
                JSONObject o = array.getJSONObject(i);
                String title = o.getString("title");//房间
                String avatar = o.getString("avatar");//头像
                String thumb = o.getString("thumb");//图片
                String nick = o.getString("nick");//主播
                SecondBean bean = new SecondBean();
                bean.setTitle(title);
                bean.setAvatar(avatar);
                bean.setThumb(thumb);
                bean.setNick(nick);
                data.add(bean);
            }
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
