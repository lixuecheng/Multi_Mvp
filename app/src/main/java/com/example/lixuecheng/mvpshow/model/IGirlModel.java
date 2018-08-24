package com.example.lixuecheng.mvpshow.model;

import com.example.lixuecheng.mvpshow.bean.Girl;

import java.util.List;

/**
 * 加载数据
 */
public interface IGirlModel {
//    不好，ui会等待网络
//    void loadGirl(List<Girl> girls);
    void loadGirl(GirlOnLoadListener girlOnLoadListener);
    interface GirlOnLoadListener{
        void onComplete(List<Girl> girls);
    }
}
