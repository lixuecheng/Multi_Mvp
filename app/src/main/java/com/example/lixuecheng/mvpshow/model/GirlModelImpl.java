package com.example.lixuecheng.mvpshow.model;

import com.example.lixuecheng.mvpshow.R;
import com.example.lixuecheng.mvpshow.bean.Girl;

import java.util.ArrayList;
import java.util.List;

public class GirlModelImpl implements IGirlModel{
    @Override
    public void loadGirl(GirlOnLoadListener girlOnLoadListener) {
        List<Girl> datas = new ArrayList<>();
        datas.add(new Girl(R.drawable.first, "小美丽"));
        datas.add(new Girl(R.drawable.second, "中美丽"));
        datas.add(new Girl(R.drawable.third, "大美丽"));
        datas.add(new Girl(R.drawable.fourth, "最美丽"));
        girlOnLoadListener.onComplete(datas);
    }
}
