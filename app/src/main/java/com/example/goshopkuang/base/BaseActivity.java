package com.example.goshopkuang.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.goshopkuang.interfaces.IBaseView;
import com.example.goshopkuang.interfaces.IPresenter;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity<V extends IBaseView, P extends IPresenter> extends AppCompatActivity implements IBaseView {
    //获取布局文件
    protected abstract int getLayout();

    //初始化view
    protected abstract void initView();

    //初始化数据
    protected abstract void initData();

    //初始化P层
    protected abstract P initPresenter();

    protected P presenter;

    Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        unbinder = ButterKnife.bind(this);
        initView();
        presenter = initPresenter();
        if (presenter != null) {
            presenter.attchView(this);
        }
        initData();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (presenter != null) {
            presenter.attchView(this);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(unbinder != null){
            unbinder.unbind();
        }
        if(presenter != null){
            presenter.detachView();
        }
    }
    /* @Override
    public void showErrMsg(String err) {

    }*/
}
