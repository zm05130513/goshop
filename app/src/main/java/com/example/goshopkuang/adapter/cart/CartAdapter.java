package com.example.goshopkuang.adapter.cart;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.goshopkuang.R;
import com.example.goshopkuang.model.bean.goods.CartBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ItemHolder> {

    private List<CartBean.DataBean.CartListBean> list;
    private int layoutId;
    public CartAdapter(List<CartBean.DataBean.CartListBean> list, int layoutId, ItemBindListener
            bindListener) {
        this.list = list;
        this.layoutId = layoutId;
        this.bindListener = bindListener;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(layoutId, viewGroup, false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int i) {
        if (bindListener!=null) {
            bindListener.onBindItem(holder,i);
        }
    }

    /*//删除被选中的条目
    public void delete() {
        for (int i = 0 ; i < list.size() ; i++) {
            CartBean.DataBean.CartListBean datasBean = list.get(i);
            boolean cbState = datasBean.isCheck();
            if (cbState) {
                list.remove(datasBean);
                i--;
            }
        }
        notifyDataSetChanged();
    }*/
    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ItemHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.rb_cart_list)
        RadioButton rbCartList;
        @BindView(R.id.iv_cart_list)
        ImageView ivCartList;
        @BindView(R.id.tv_cart_name)
        TextView tvCartName;
        @BindView(R.id.tv_cart_price)
        TextView tvCartPrice;
        @BindView(R.id.tv_minus)
        TextView tvMinus;
        @BindView(R.id.tv_count)
        TextView tvCount;
        @BindView(R.id.tv_add)
        TextView tvAdd;
        @BindView(R.id.tv_goods_count)
        TextView tvGoodsCount;
        @BindView(R.id.fl_cart)
        FrameLayout flCart;
        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    private ItemBindListener bindListener;

    public void setBindListener(ItemBindListener bindListener) {
        this.bindListener = bindListener;
    }

    public interface ItemBindListener{
        void onBindItem(ItemHolder holder,int position);
    }
}
