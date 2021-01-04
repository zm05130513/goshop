package com.example.goshopkuang.view.main.mine;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.goshopkuang.R;
import com.example.goshopkuang.base.BaseFragment;
import com.example.goshopkuang.interfaces.IPresenter;

import butterknife.BindView;
import butterknife.Unbinder;

public class MineFragment extends BaseFragment implements View.OnClickListener {
    @BindView(R.id.iv_wo_nameImage)
    ImageView ivWoNameImage;
    @BindView(R.id.tv_wo_di_name)
    TextView tvWoDiName;
    @BindView(R.id.rv_wo_list)
    RecyclerView rvWoList;

    Unbinder unbinder;
    @BindView(R.id.tx_add)
    TextView ivWoDi;
    Unbinder unbinder1;

    @Override
    protected int getLayout() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initView(View view) {
        ivWoDi.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected IPresenter createPresenter() {
        return null;
    }

    @Override
    public void showErrMsg(String err) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tx_add:
                Intent intent = new Intent(getActivity(), AddressActivity.class);
                startActivity(intent);
                break;
        }
    }
}