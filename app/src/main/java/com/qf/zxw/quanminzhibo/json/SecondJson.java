package com.qf.zxw.quanminzhibo.json;

import com.qf.zxw.quanminzhibo.bean.SecondBean;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/22.
 */
public class SecondJson {
    public static List<SecondBean> getData(String jsonStr){
        List<SecondBean> data = new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(jsonStr);
            JSONArray array = jsonObject.getJSONArray("data");
            for (int i = 0; i < array.length(); i++) {
                JSONObject object = array.getJSONObject(i);
                String title = object.getString("title");//房间
                String avatar = object.getString("avatar");//头像
                String thumb = object.getString("thumb");//图片
                String nick = object.getString("nick");//主播
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
