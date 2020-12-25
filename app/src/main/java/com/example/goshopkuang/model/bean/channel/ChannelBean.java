package com.example.goshopkuang.model.bean.channel;

public class ChannelBean {
            /**
             * id : 1
             * name : 居家
             * url : /pages/category/category?id=1005000
             * icon_url : http://ac-3yr0g9cz.clouddn.com/c031ea3cf575f885cd1c.png
             * sort_order : 1
             * categoryid : 1005000
             */

            private int id;
            private String name;
            private String url;
            private String icon_url;
            private int sort_order;
            private int categoryid;

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

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getIcon_url() {
                return icon_url;
            }

            public void setIcon_url(String icon_url) {
                this.icon_url = icon_url;
            }

            public int getSort_order() {
                return sort_order;
            }

            public void setSort_order(int sort_order) {
                this.sort_order = sort_order;
            }

            public int getCategoryid() {
                return categoryid;
            }

            public void setCategoryid(int categoryid) {
                this.categoryid = categoryid;
            }
        }