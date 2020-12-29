package com.example.goshopkuang.view.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.goshopkuang.R;
import com.example.goshopkuang.base.BaseActivity;
import com.example.goshopkuang.interfaces.IPresenter;
import com.example.goshopkuang.interfaces.home.HomeContract;
import com.example.goshopkuang.model.bean.home.BrandDetial;
import com.example.goshopkuang.presenter.home.BrandDetailPresenter;

import butterknife.BindView;

public class BrandDetailActivity extends BaseActivity implements HomeContract.BrandDetailView {
    @BindView(R.id.iv_brand_detail)
    ImageView ivBrandDetail;
    @BindView(R.id.tv_brand_name)
    TextView tvBrandName;
    @BindView(R.id.tv_desc_brand)
    TextView tvDescBrand;
    @BindView(R.id.rv_brand_detail)
    RecyclerView rvBrandDetail;
    private String id;

    @Override
    protected int getLayout() {
        return R.layout.activity_brand_detail;
    }

    @Override
    protected void initView() {
        Intent intent = getIntent();
        id=intent.getStringExtra("id");
    }

    @Override
    protected void initData() {
        ((BrandDetailPresenter)presenter).brandDetail(id);
    }

    @Override
    protected IPresenter initPresenter() {
        return new BrandDetailPresenter();
    }


    @Override
    public void getBrandDetailReturn(BrandDetial data) {
        BrandDetial.DataBean.BrandBean brand = data.getData().getBrand();
        Glide.with(this).load(brand.getList_pic_url()).into(ivBrandDetail);
        tvBrandName.setText(brand.getName());
        tvDescBrand.setText(brand.getSimple_desc());
    }

    @Override
    public void showErrMsg(String err) {
        Toast.makeText(this, err, Toast.LENGTH_SHORT).show();
    }
}