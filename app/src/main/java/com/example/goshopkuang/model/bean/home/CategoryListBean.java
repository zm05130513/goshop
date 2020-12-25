package com.example.goshopkuang.model.bean.home;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class CategoryListBean implements Parcelable {
    /**
     * id : 1005000
     * name : 居家
     * goodsList : [{"id":1009024,"name":"日式和风懒人沙发","list_pic_url":"http://yanxuan
     * .nosdn.127.net/149dfa87a7324e184c5526ead81de9ad.png","retail_price":"599.00"},
     * {"id":1015007,"name":"典雅美式全棉刺绣抱枕","list_pic_url":"http://yanxuan
     * .nosdn.127.net/a2045004de8a6225289376ad54317fc8.png","retail_price":"59.00"},
     * {"id":1020000,"name":"升级款记忆绵护椎腰靠","list_pic_url":"http://yanxuan
     * .nosdn.127.net/819fdf1f635a694166bcfdd426416e8c.png","retail_price":"79.00"},
     * {"id":1030001,"name":"160*230羊毛手工地毯","list_pic_url":"http://yanxuan
     * .nosdn.127.net/88dc5d80c6f84102f003ecd69c86e1cf.png","retail_price":"969.00"},
     * {"id":1030002,"name":"160*230羊毛圈绒枪刺地毯","list_pic_url":"http://yanxuan
     * .nosdn.127.net/8b9328496990357033d4259fda250679.png","retail_price":"899.00"},
     * {"id":1030003,"name":"160*230羊毛手工几何地毯","list_pic_url":"http://yanxuan
     * .nosdn.127.net/1d1ab099dc0e254c15e57302e78e200b.png","retail_price":"1469.00"},
     * {"id":1035006,"name":"全棉单面割绒浴室地垫","list_pic_url":"http://yanxuan
     * .nosdn.127.net/ee92704f3b8323905b51fc647823e6e5.png","retail_price":"56.00"}]
     */

    private int id;
    private String name;
    private List<GoodsListBean> goodsList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GoodsListBean> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<GoodsListBean> goodsList) {
        this.goodsList = goodsList;
    }

    public static class GoodsListBean implements Parcelable {
        /**
         * id : 1009024
         * name : 日式和风懒人沙发
         * list_pic_url : http://yanxuan.nosdn.127.net/149dfa87a7324e184c5526ead81de9ad.png
         * retail_price : 599.00
         */

        private int id;
        private String name;
        private String list_pic_url;
        private String retail_price;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getList_pic_url() {
            return list_pic_url;
        }

        public void setList_pic_url(String list_pic_url) {
            this.list_pic_url = list_pic_url;
        }

        public String getRetail_price() {
            return retail_price;
        }

        public void setRetail_price(String retail_price) {
            this.retail_price = retail_price;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.id);
            dest.writeString(this.name);
            dest.writeString(this.list_pic_url);
            dest.writeString(this.retail_price);
        }

        public GoodsListBean() {
        }

        protected GoodsListBean(Parcel in) {
            this.id = in.readInt();
            this.name = in.readString();
            this.list_pic_url = in.readString();
            this.retail_price = in.readString();
        }

        public static final Creator<GoodsListBean> CREATOR = new Creator<GoodsListBean>() {
            @Override
            public GoodsListBean createFromParcel(Parcel source) {
                return new GoodsListBean(source);
            }

            @Override
            public GoodsListBean[] newArray(int size) {
                return new GoodsListBean[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeList(this.goodsList);
    }

    public CategoryListBean() {
    }

    protected CategoryListBean(Parcel in) {
        this.id = in.readInt();
        this.name = in.readString();
        this.goodsList = new ArrayList<GoodsListBean>();
        in.readList(this.goodsList, GoodsListBean.class.getClassLoader());
    }

    public static final Creator<CategoryListBean> CREATOR = new Creator<CategoryListBean>() {
        @Override
        public CategoryListBean createFromParcel(Parcel source) {
            return new CategoryListBean(source);
        }

        @Override
        public CategoryListBean[] newArray(int size) {
            return new CategoryListBean[size];
        }
    };
}