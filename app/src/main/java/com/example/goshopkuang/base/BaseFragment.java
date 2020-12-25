package com.example.goshopkuang.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.goshopkuang.interfaces.IBaseView;
import com.example.goshopkuang.interfaces.IPresenter;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseFragment<V extends IBaseView, P extends IPresenter> extends Fragment implements IBaseView {

    protected P presenter;
    protected Context context;
    Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayout(), null);
        context = this.getContext();
        unbinder = ButterKnife.bind(this, view);
        initView(view);
        presenter = createPresenter();
        if (presenter != null) presenter.attchView(this);
        initData();
        return view;
    }

    //获取布局
    protected abstract int getLayout();

    //初始化布局
    protected abstract void initView(View view);

    //初始化数据
    protected abstract void initData();

    //创建P
    protected abstract P createPresenter();

    @Override
    public void onResume() {
        super.onResume();
        if (presenter!=null){
            presenter.attchView(this);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.detachView();
        }
        if (unbinder != null) {
            unbinder.unbind();
        }
    }

   /* @Override
    public void showErrMsg(String err) {

    }*/
}
