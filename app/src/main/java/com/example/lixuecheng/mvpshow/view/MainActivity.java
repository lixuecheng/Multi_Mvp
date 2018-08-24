package com.example.lixuecheng.mvpshow.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lixuecheng.mvpshow.R;
import com.example.lixuecheng.mvpshow.adapter.MyAdapter;
import com.example.lixuecheng.mvpshow.bean.Girl;
import com.example.lixuecheng.mvpshow.presenter.GirlPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<IGirlView,GirlPresenter<IGirlView>> implements IGirlView{

    ListView listView;
    GirlPresenter girlPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        List<Girl> datas = new ArrayList<>();
//        datas.add(new Girl(R.drawable.first, "小美丽"));
//        datas.add(new Girl(R.drawable.second, "小美丽"));
//        datas.add(new Girl(R.drawable.third, "小美丽"));
//        datas.add(new Girl(R.drawable.fourth, "小美丽"));
//        MyAdapter myAdapter = new MyAdapter(this, datas);
        listView = findViewById(R.id.mylistview);
//        new GirlPresenter<>(this).fetch();
        girlPresenter.fetch();
//        listView.setAdapter(myAdapter);
//        myAdapter.notifyDataSetChanged();
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "加载成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showGirls(List<Girl> girls) {
        MyAdapter myAdapter = new MyAdapter(this, girls);
        listView.setAdapter(myAdapter);

    }


    @Override
    protected GirlPresenter<IGirlView> creatPresenter() {
        return new GirlPresenter<>();
    }
}
