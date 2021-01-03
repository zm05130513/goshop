package com.example.goshopkuang.adapter.goods;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.goshopkuang.R;
import com.example.goshopkuang.base.adapter.BaseAdapter;
import com.example.goshopkuang.model.bean.goods.GoodsDetail;

import java.util.List;

public class CommentPicsAdapter extends BaseAdapter {

    public CommentPicsAdapter(List mDatas) {
        super(mDatas);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_comment_pics_list;
    }

    @Override
    protected void bindData(BaseViewHolder holder, int position, Object o) {
        GoodsDetail.DataBeanX.CommentBean.DataBean.PicListBean pics = (GoodsDetail.DataBeanX.CommentBean.DataBean.PicListBean) mDatas.get(position);
        ImageView header = (ImageView) holder.getView(R.id.iv_pic_comment);
        Glide.with(header.getContext()).load(pics.getPic_url()).into(header);
    }

}
