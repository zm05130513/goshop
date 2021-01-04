package com.example.goshopkuang.view.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.goshopkuang.R;
import com.example.goshopkuang.base.BaseActivity;
import com.example.goshopkuang.interfaces.IPresenter;

import butterknife.BindView;

public class HotShowActivity extends BaseActivity {
    @BindView(R.id.iv_show)
    ImageView ivShow;
    @BindView(R.id.tv_zhoHe)
    TextView tvzhoHe;
    @BindView(R.id.tv_price_hotShow)
    TextView tvpriceHotShow;
    @BindView(R.id.tv_sort)
    TextView tvSort;


    @Override
    protected int getLayout() {
        return R.layout.activity_hot_show;
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
        Toast.makeText(this, err, Toast.LENGTH_SHORT).show();
    }
}