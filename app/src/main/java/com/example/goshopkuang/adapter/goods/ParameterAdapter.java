package com.example.goshopkuang.adapter.goods;

import android.widget.TextView;


import com.example.goshopkuang.R;
import com.example.goshopkuang.base.adapter.BaseAdapter;
import com.example.goshopkuang.model.bean.goods.AttributeBean;

import java.util.List;

public class ParameterAdapter extends BaseAdapter {

    public ParameterAdapter(List mDatas) {
        super(mDatas);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_goods_parameter_list;
    }

    @Override
    protected void bindData(BaseAdapter.BaseViewHolder holder, int position, Object o) {
        AttributeBean bean = (AttributeBean) mDatas.get(position);
        TextView name = (TextView) holder.getView(R.id.tv_name_parameter);
        name.setText(bean.getName());
        TextView value = (TextView) holder.getView(R.id.tv_value_parameter);
        value.setText(bean.getValue());
    }

}
