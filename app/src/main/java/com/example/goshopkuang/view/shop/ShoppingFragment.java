package com.example.goshopkuang.view.shop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.goshopkuang.R;
import com.example.goshopkuang.adapter.cart.CartAdapter;
import com.example.goshopkuang.base.BaseFragment;
import com.example.goshopkuang.constants.Constant;
import com.example.goshopkuang.interfaces.IPresenter;
import com.example.goshopkuang.interfaces.cart.CartContract;
import com.example.goshopkuang.model.bean.goods.CartBean;
import com.example.goshopkuang.presenter.cart.CartPresenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Unbinder;

public class ShoppingFragment extends BaseFragment implements CartContract.View, CompoundButton.OnCheckedChangeListener {
    @BindView(R.id.ll_header)
    LinearLayout llHeader;
    @BindView(R.id.rv_shop_cart)
    RecyclerView rvShopCart;
    @BindView(R.id.rb_shop_choice)
    RadioButton rbShopChoice;
    @BindView(R.id.tv_shop_finish)
    TextView tvShopFinish;
    @BindView(R.id.tv_shop_del)
    TextView tvShopDel;
    @BindView(R.id.ll_footer)
    RelativeLayout llFooter;
    @BindView(R.id.tv_total_price)
    TextView tvTotalPrice;
    Unbinder unbinder;
    private CartAdapter cartAdapter;
    private boolean edit = true;
    private boolean state;
    private LinearLayout ll;
    private TextView name;
    private TextView count;
    private TextView goodsCount;
    private List<CartBean.DataBean.CartListBean> list;
    private boolean afterState;
    private int productId;
    private int goodsId;
    private int id;


    @Override
    protected int getLayout() {
        return R.layout.fragment_shop;
    }

    @Override
    protected void initView(View view) {
        rbShopChoice.setChecked(true);
        rbShopChoice.setOnCheckedChangeListener(this);
        list = new ArrayList<>();
    }

    @Override
    protected void initData() {
        ((CartPresenter) presenter).cartList(Constant.UID);
    }

    @Override
    protected IPresenter createPresenter() {
        return new CartPresenter();
    }

    @Override
    public void cartListReturn(CartBean bean) {
        rvShopCart.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvShopCart.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        List<CartBean.DataBean.CartListBean> listBeans = bean.getData().getCartList();
        if (listBeans.size() <= 0 && listBeans == null) {
            rbShopChoice.setChecked(false);
        }
        list.addAll(listBeans);
        cartAdapter = new CartAdapter(list, R.layout.layout_cart_list, new CartAdapter.ItemBindListener() {
            @Override
            public void onBindItem(CartAdapter.ItemHolder holder, int position) {
                CartBean.DataBean.CartListBean listBean = list.get(position);
                goodsId = listBean.getGoods_id();
                id = listBean.getId();
                productId = listBean.getProduct_id();

                View view = holder.itemView;
                ImageView iv = view.findViewById(R.id.iv_cart_list);
                final RadioButton rb = view.findViewById(R.id.rb_cart_list);
                name = view.findViewById(R.id.tv_cart_name);
                TextView price = view.findViewById(R.id.tv_cart_price);
                TextView tvMinus = view.findViewById(R.id.tv_minus);
                TextView tvAdd = view.findViewById(R.id.tv_add);
                onClick(tvMinus, tvAdd);
                count = view.findViewById(R.id.tv_count);
                goodsCount = view.findViewById(R.id.tv_goods_count);
                ll = view.findViewById(R.id.ll);

                setItemRadioButton(listBean, rb);
                Glide.with(holder.itemView.getContext()).load(listBean.getList_pic_url())
                        .into(iv);
                name.setText(listBean.getGoods_name());
                price.setText("￥ " + listBean.getMarket_price());
                goodsCount.setText("X" + listBean.getNumber());
                count.setText(listBean.getNumber() + "");
            }
        });
        rvShopCart.setAdapter(cartAdapter);
        if (rbShopChoice.isChecked() == true) {
            setCountAndPrice(list);
        }
    }

    private void setCountAndPrice(List<CartBean.DataBean.CartListBean> list) {
        int totalNum = 0;
        int totalPrice = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isCheck() == false) {
                int number = list.get(i).getNumber();
                int marketPrice = list.get(i).getMarket_price();
                totalPrice += marketPrice * number;
                totalNum += number;
            }
        }
        rbShopChoice.setText("全选" + "(" + totalNum + ")");
        tvTotalPrice.setText("￥" + totalPrice);
    }

    @OnClick({R.id.tv_shop_finish, R.id.tv_shop_del})
    public void onViewClicked(View view){
        switch (view.getId()){
            case R.id.tv_shop_finish:
                if (edit){
                    afterState=true;
                    setVisible(true);
                    tvShopFinish.setText("完成");
                    tvShopDel.setText("删除所选");
                    rbShopChoice.setChecked(false);
                    rbShopChoice.setText("全选(0)");
                    tvTotalPrice.setText("￥0元");
                    edit = false;
                }else {
                    tvShopFinish.setText("编辑");
                    tvShopDel.setText("下单");
                    setVisible(false);
                    edit = true;
                    //afterState = true;
                }
                break;
            case R.id.tv_shop_del:
                String trim = tvShopDel.getText().toString().trim();
                if (trim.equals("删除所选")) {
                    delete();
                    rbShopChoice.setChecked(false);
                    ((CartPresenter) presenter).delGoods(Constant.UID,productIds.substring(0,productIds.length()));
                } else {
                    return;
                }
                break;
        }
    }

    String productIds = "";
    private void delete() {
        for (int i = 0 ; i < list.size() ; i++) {
            CartBean.DataBean.CartListBean datasBean = list.get(i);
            boolean cbState = datasBean.isCheck();
            if (cbState==true) {
                productId = datasBean.getProduct_id();
                productIds += productId +",";
                list.remove(datasBean);
                i--;
            }
        }
        cartAdapter.notifyDataSetChanged();
    }

    //设置RadioButton选中状态
    private void setItemRadioButton(CartBean.DataBean.CartListBean listBean, RadioButton rb) {
        rb.setChecked(listBean.isCheck());
        if (state == true) {
            ll.setVisibility(View.VISIBLE);
            name.setVisibility(View.INVISIBLE);
            goodsCount.setVisibility(View.INVISIBLE);
            if (afterState = true) {
                rb.setChecked(false);
            } else {
                rb.setChecked(true);
            }
        } else {
            ll.setVisibility(View.INVISIBLE);
            name.setVisibility(View.VISIBLE);
            goodsCount.setVisibility(View.VISIBLE);
            rb.setChecked(true);
            if (afterState == true) {
                rb.setChecked(false);
            }
        }
        rb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    //afterState=false;
                    listBean.setCheck(true);
                } else {
                    listBean.setCheck(false);
                    if (rbShopChoice.isChecked() == true) {
                        setCountAndPrice(list);
                    }
                }
            }
        });
    }

    int num = 0;

    private void onClick(TextView tvMinus, TextView tvAdd) {
        tvMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.valueOf(count.getText().toString().trim());
                num -= 1;
                if (num >= 1) {
                    count.setText(num + "");
                } else {
                    return;
                }
                ((CartPresenter) presenter).updateGoods(Constant.UID, goodsId, productId, id, num);
            }
        });
        tvAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = Integer.valueOf(count.getText().toString().trim());
                num += 1;
                count.setText(num + "");
                ((CartPresenter) presenter).updateGoods(Constant.UID,goodsId,productId,id,num);
            }
        });
    }

    @Override
    public void showErrMsg(String err) {
        Toast.makeText(context, err, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked == true) {
            afterState = false;
            setVisible(false);
            setCountAndPrice(list);
        } else {
            rbShopChoice.setChecked(false);
            rbShopChoice.setText("全选(0)");
            tvTotalPrice.setText("￥0元");
        }
    }

    private void setVisible(boolean visible) {
        state = visible;
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setCheck(false);
        }
        cartAdapter.notifyDataSetChanged();
    }
}