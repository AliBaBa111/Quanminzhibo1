package com.qf.zxw.quanminzhibo.uri;

/**
 * Created by Administrator on 2016/11/21.
 */
public class Url {
    //推荐地址===================================================
    //分类（推荐，颜值控，英雄联盟。。。。）
    public static String Fenlei = "http://www.quanmin.tv/json/app/index/category/info-android.json?v=2.2.4&os=1&ver=4";

    //精彩推荐。。颜值控等（6个）
    public static String Tuijian = "http://www.quanmin.tv/json/app/index/recommend/list-android.json?11211748&v=2.2.4&os=1&ver=4";

    //下拉刷新的(修改的值是11211748)
    public static String TuijianShuaxin = "http://www.quanmin.tv/json/app/index/recommend/list-android.json?11211802&v=2.2.4&os=1&ver=4";

    //栏目==========================================================
    //栏目
    public static String Lanmu = "http://www.quanmin.tv/json/categories/list.json?11211803&v=2.2.4&os=1&ver=4";

    //获得地址
    public static String getLanmuPath(String slug){
        return "http://www.quanmin.tv/json/categories/"+slug+"/list.json?11211900&v=2.2.4&os=1&ver=4";
    }


//    //英雄联盟
//    public static String Lol = "http://www.quanmin.tv/json/categories/lol/list.json?11211841&v=2.2.4&os=1&ver=4";
//
//    //全民星宿
//    public static String Quanmin = "http://www.quanmin.tv/json/categories/beauty/list.json?11211841&v=2.2.4&os=1&ver=4";
//
//    //炉石传说
//    public static String Lushi = "http://www.quanmin.tv/json/categories/heartstone/list.json?11211847&v=2.2.4&os=1&ver=4";
//
//    //全民户外
//    public static String Quanminhuwai = "http://www.quanmin.tv/json/categories/huwai/list.json?11211848&v=2.2.4&os=1&ver=4";
//
//    //守望先锋
//    public static String Shouwang = "http://www.quanmin.tv/json/categories/overwatch/list.json?11211848&v=2.2.4&os=1&ver=4";
//
//    //颜值控
//    public static String Yanzhi = "http://www.quanmin.tv/json/categories/love/list.json?11211841&v=2.2.4&os=1&ver=4";
//
//    //王者荣耀
//    public static String Wangzhe = "http://www.quanmin.tv/json/categories/wangzhe/list.json?11211850&v=2.2.4&os=1&ver=4";
//
//    //QQ飞车
//    public static String QQfeiche = "http://www.quanmin.tv/json/categories/qqfeiche/list.json?11211851&v=2.2.4&os=1&ver=4";
//
//    //阴阳师
//    public static String Yingyang = "http://www.quanmin.tv/json/categories/yys/list.json?11211851&v=2.2.4&os=1&ver=4";
//
//    //单机主机
//    public static String Danji = "http://www.quanmin.tv/json/categories/tvgame/list.json?11211851&v=2.2.4&os=1&ver=4";
//
//    //穿越火线
//    public static String CF = "http://www.quanmin.tv/json/categories/cfpc/list.json?11211852&v=2.2.4&os=1&ver=4";
//
//    //手游专区
//    public static String Shouyou = "http://www.quanmin.tv/json/categories/mobilegame/list.json?11211852&v=2.2.4&os=1&ver=4";
//
//    //街篮专区
//    public static String Jielan = "http://www.quanmin.tv/json/categories/fs/list.json?11211853&v=2.2.4&os=1&ver=4";
//
//    //劲舞团
//    public static String Jinwu = "http://www.quanmin.tv/json/categories/au/list.json?11211853&v=2.2.4&os=1&ver=4";
//
//    //暴雪经典
//    public static String Baoxue = "http://www.quanmin.tv/json/categories/blizzard/list.json?11211853&v=2.2.4&os=1&ver=4";
//
//    //二次元区
//    public static String Erciyuan = "http://www.quanmin.tv/json/categories/erciyuan/list.json?11211854&v=2.2.4&os=1&ver=4";
//
//    //DOTA2
//    public static String Dota2 = "http://www.quanmin.tv/json/categories/dota2/list.json?11211854&v=2.2.4&os=1&ver=4";
//
//    //装甲风暴
//    public static String Zhuangjia = "http://www.quanmin.tv/json/categories/zhuangjiafengbao/list.json?11211854&v=2.2.4&os=1&ver=4";
//
//    //DNF
//    public static String Dnf = "http://www.quanmin.tv/json/categories/dnf/list.json?11211855&v=2.2.4&os=1&ver=4";
//
//    //球球大作战
//    public static String Qiuqiu = "http://www.quanmin.tv/json/categories/qiuqiu/list.json?11211855&v=2.2.4&os=1&ver=4";
//
//    //网络游戏
//    public static String Wangluo = "http://www.quanmin.tv/json/categories/webgame/list.json?11211858&v=2.2.4&os=1&ver=4";
//
//    //传奇专区
//    public static String Chuanqi = "http://www.quanmin.tv/json/categories/chuanqi/list.json?11211858&v=2.2.4&os=1&ver=4";
//
//    //魔兽争霸3
//    public static String Moshou = "http://www.quanmin.tv/json/categories/war3/list.json?11211859&v=2.2.4&os=1&ver=4";
//
//    //FIFA
//    public static String Fifa = "http://www.quanmin.tv/json/categories/fifa/list.json?11211859&v=2.2.4&os=1&ver=4";
//
//    //NBA2K
//    public static String Nba2k = "http://www.quanmin.tv/json/categories/nba2k/list.json?11211900&v=2.2.4&os=1&ver=4";



    //直播=====================================================

    public static String Zhibo = "http://www.quanmin.tv/json/play/list.json?11211841&v=2.2.4&os=1&ver=4";

    //直播开始====================================


    public static String getZhiboPath(String number){
        return "http://www.quanmin.tv/json/rooms/"+number+"/info1.json?11212104&v=2.2.4&os=1&ver=4";
    }

}
