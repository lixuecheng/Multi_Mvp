package com.example.lixuecheng.mvpshow.presenter;

import com.example.lixuecheng.mvpshow.bean.Girl;
import com.example.lixuecheng.mvpshow.model.GirlModelImpl;
import com.example.lixuecheng.mvpshow.model.IGirlModel;
import com.example.lixuecheng.mvpshow.view.IGirlView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * 表示层
 */
public class GirlPresenter<T extends IGirlView> extends BasePresenter<T>{
    //view层引用
//    IGirlView girlView;
    //model层引用
    IGirlModel iGirlModel = new GirlModelImpl();
    //model层引用
    //构造方法
    public GirlPresenter() {
//        this.girlView = view;
//        mViewRef = new WeakReference<>(view);
    }




    //执行数据
    public void fetch() {
        if(mViewRef != null) {
            mViewRef.get().showLoading();
            if(iGirlModel != null) {
                iGirlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
                    @Override
                    public void onComplete(List<Girl> girls) {
                        if(mViewRef != null) {
                            mViewRef.get().showGirls(girls);
                        }
                    }
                });
            }
        }

    }
}
