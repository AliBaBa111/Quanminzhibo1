package com.qf.zxw.quanminzhibo.json;


import com.qf.zxw.quanminzhibo.bean.LanmuBean;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/22.
 */
public class LanmuJson {
    public static List<LanmuBean> getData(String jsonStr){
        List<LanmuBean>data = new ArrayList<>();
        try {
            JSONArray array = new JSONArray(jsonStr);
            for (int i = 0; i < array.length(); i++) {
                JSONObject object = array.getJSONObject(i);
                // name;//名字 slug;//地址名 first_letter; image;//图标地址 thumb; priority;
                String name = object.getString("name");
                String slug = object.getString("slug");
                String first_letter = object.getString("first_letter");
                String image = object.getString("image");
                String thumb = object.getString("thumb");
                int priority = object.getInt("priority");
                LanmuBean beans = new LanmuBean();
                beans.setName(name);
                beans.setSlug(slug);
                beans.setFirst_letter(first_letter);
                beans.setImage(image);
                beans.setThumb(thumb);
                beans.setPriority(priority);
                data.add(beans);
            }
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  data;
    }
}
