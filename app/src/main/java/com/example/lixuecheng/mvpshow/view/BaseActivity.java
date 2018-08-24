package com.example.lixuecheng.mvpshow.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.lixuecheng.mvpshow.presenter.BasePresenter;

public abstract class BaseActivity<V,T extends BasePresenter<V>>extends Activity {
    public T girlPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        girlPresenter = creatPresenter();
        girlPresenter.attchView((V)this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        girlPresenter.dettachView();
    }

    protected abstract  T creatPresenter();
}
