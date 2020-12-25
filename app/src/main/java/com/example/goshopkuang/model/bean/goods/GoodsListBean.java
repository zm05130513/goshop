package com.example.goshopkuang.model.bean.goods;

public class GoodsListBean {
            /**
             * id : 1045000
             * name : 绿茶蛋黄酥 200克/4枚入
             * list_pic_url : http://yanxuan.nosdn.127.net/b2adc3fd9b84a289a1be03e8ee400e61.png
             * retail_price : 28
             */

            private int id;
            private String name;
            private String list_pic_url;
            private int retail_price;

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

            public int getRetail_price() {
                return retail_price;
            }

            public void setRetail_price(int retail_price) {
                this.retail_price = retail_price;
            }
        }