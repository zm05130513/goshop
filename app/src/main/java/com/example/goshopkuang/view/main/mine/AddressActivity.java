package com.example.goshopkuang.view.main.mine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.goshopkuang.R;
import com.example.goshopkuang.base.BaseActivity;
import com.example.goshopkuang.interfaces.IPresenter;

import butterknife.BindView;

public class AddressActivity extends BaseActivity {


    @Override
    protected int getLayout() {
        return R.layout.activity_address;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected IPresenter initPresenter() {
        return null;
    }

    @Override
    public void showErrMsg(String err) {

    }
}