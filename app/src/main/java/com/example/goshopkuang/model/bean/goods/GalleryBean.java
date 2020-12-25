package com.example.goshopkuang.model.bean.goods;

public class GalleryBean {
            /**
             * id : 13
             * goods_id : 1006013
             * img_url : http://yanxuan.nosdn.127.net/d83cbd9ec177276ba2582ee393eff3db.jpg
             * img_desc :
             * sort_order : 5
             */

            private int id;
            private int goods_id;
            private String img_url;
            private String img_desc;
            private int sort_order;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getGoods_id() {
                return goods_id;
            }

            public void setGoods_id(int goods_id) {
                this.goods_id = goods_id;
            }

            public String getImg_url() {
                return img_url;
            }

            public void setImg_url(String img_url) {
                this.img_url = img_url;
            }

            public String getImg_desc() {
                return img_desc;
            }

            public void setImg_desc(String img_desc) {
                this.img_desc = img_desc;
            }

            public int getSort_order() {
                return sort_order;
            }

            public void setSort_order(int sort_order) {
                this.sort_order = sort_order;
            }
        }