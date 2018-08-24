package com.example.lixuecheng.mvpshow.view;

import com.example.lixuecheng.mvpshow.bean.Girl;

import java.util.List;

public interface IGirlView {
    void showLoading();
    void showGirls(List<Girl> girls);
}
