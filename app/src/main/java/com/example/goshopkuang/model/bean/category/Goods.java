package com.example.goshopkuang.model.bean.category;

import java.util.List;

public class Goods {

    /**
     * errno : 0
     * errmsg :
     * data : {"count":39,"totalPages":4,"pageSize":10,"currentPage":1,"data":[{"id":1147048,
     * "name":"简约知性系列居家地毯 蓝灰格","list_pic_url":"http://yanxuan
     * .nosdn.127.net/fd7920a2eadd10fa10c0c03959a2abe0.png","retail_price":559},{"id":1147047,
     * "name":"简约知性系列居家地毯 蓝粉拼接","list_pic_url":"http://yanxuan
     * .nosdn.127.net/bda805b0a2464b6ec33c18981565e50e.png","retail_price":559},{"id":1147046,
     * "name":"清新趣粉系列居家地毯 条纹间粉","list_pic_url":"http://yanxuan
     * .nosdn.127.net/655d718df8107f8e7fd1dc6140e29039.png","retail_price":599},{"id":1147045,
     * "name":"清新趣粉系列居家地毯 灰黄条纹","list_pic_url":"http://yanxuan
     * .nosdn.127.net/5cda4a0c4c4ff9728d03186bd053c9ca.png","retail_price":599},{"id":1138001,
     * "name":"北欧简约山形纹绣花抱枕","list_pic_url":"http://yanxuan
     * .nosdn.127.net/dbc5b25b824c3b3d7ff43b56ca35eee9.png","retail_price":79},{"id":1138000,
     * "name":"日式蓬软太鼓抱枕","list_pic_url":"http://yanxuan
     * .nosdn.127.net/ad953e16ad8c33b714e7af941ce8cd56.png","retail_price":29},{"id":1135058,
     * "name":"日式多功能手卷午睡枕坐垫","list_pic_url":"http://yanxuan
     * .nosdn.127.net/37bc0fa3524a904ac740340fa92bd515.png","retail_price":79},{"id":1135057,
     * "name":"梦幻系简约轻透莹白纱帘","list_pic_url":"http://yanxuan
     * .nosdn.127.net/98c5e80b8e328687ce9c949314ebc41d.png","retail_price":199},{"id":1135056,
     * "name":"糖果色凹凸条纹儿童房窗帘","list_pic_url":"http://yanxuan
     * .nosdn.127.net/536246ca4adb77274a94b18bb2f91f47.png","retail_price":259},{"id":1135055,
     * "name":"北欧印象几何条纹混色窗帘","list_pic_url":"http://yanxuan
     * .nosdn.127.net/87b6a608b99279ebf1764682e9e5fcec.png","retail_price":399}],
     * "filterCategory":[{"id":0,"name":"全部","checked":false},{"id":1005000,"name":"居家",
     * "checked":false},{"id":1005001,"name":"餐厨","checked":false},{"id":1008000,"name":"配件",
     * "checked":false},{"id":1010000,"name":"服装","checked":false},{"id":1013001,"name":"洗护",
     * "checked":false},{"id":1011000,"name":"婴童","checked":false},{"id":1012000,"name":"杂货",
     * "checked":false},{"id":1005002,"name":"饮食","checked":false},{"id":1019000,"name":"志趣",
     * "checked":false}],"goodsList":[{"id":1147048,"name":"简约知性系列居家地毯 蓝灰格",
     * "list_pic_url":"http://yanxuan.nosdn.127.net/fd7920a2eadd10fa10c0c03959a2abe0.png",
     * "retail_price":559},{"id":1147047,"name":"简约知性系列居家地毯 蓝粉拼接","list_pic_url":"http://yanxuan
     * .nosdn.127.net/bda805b0a2464b6ec33c18981565e50e.png","retail_price":559},{"id":1147046,
     * "name":"清新趣粉系列居家地毯 条纹间粉","list_pic_url":"http://yanxuan
     * .nosdn.127.net/655d718df8107f8e7fd1dc6140e29039.png","retail_price":599},{"id":1147045,
     * "name":"清新趣粉系列居家地毯 灰黄条纹","list_pic_url":"http://yanxuan
     * .nosdn.127.net/5cda4a0c4c4ff9728d03186bd053c9ca.png","retail_price":599},{"id":1138001,
     * "name":"北欧简约山形纹绣花抱枕","list_pic_url":"http://yanxuan
     * .nosdn.127.net/dbc5b25b824c3b3d7ff43b56ca35eee9.png","retail_price":79},{"id":1138000,
     * "name":"日式蓬软太鼓抱枕","list_pic_url":"http://yanxuan
     * .nosdn.127.net/ad953e16ad8c33b714e7af941ce8cd56.png","retail_price":29},{"id":1135058,
     * "name":"日式多功能手卷午睡枕坐垫","list_pic_url":"http://yanxuan
     * .nosdn.127.net/37bc0fa3524a904ac740340fa92bd515.png","retail_price":79},{"id":1135057,
     * "name":"梦幻系简约轻透莹白纱帘","list_pic_url":"http://yanxuan
     * .nosdn.127.net/98c5e80b8e328687ce9c949314ebc41d.png","retail_price":199},{"id":1135056,
     * "name":"糖果色凹凸条纹儿童房窗帘","list_pic_url":"http://yanxuan
     * .nosdn.127.net/536246ca4adb77274a94b18bb2f91f47.png","retail_price":259},{"id":1135055,
     * "name":"北欧印象几何条纹混色窗帘","list_pic_url":"http://yanxuan
     * .nosdn.127.net/87b6a608b99279ebf1764682e9e5fcec.png","retail_price":399}]}
     */

    private int errno;
    private String errmsg;
    private DataBeanX data;

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public static class DataBeanX {
        /**
         * count : 39
         * totalPages : 4
         * pageSize : 10
         * currentPage : 1
         * data : [{"id":1147048,"name":"简约知性系列居家地毯 蓝灰格","list_pic_url":"http://yanxuan
         * .nosdn.127.net/fd7920a2eadd10fa10c0c03959a2abe0.png","retail_price":559},
         * {"id":1147047,"name":"简约知性系列居家地毯 蓝粉拼接","list_pic_url":"http://yanxuan
         * .nosdn.127.net/bda805b0a2464b6ec33c18981565e50e.png","retail_price":559},
         * {"id":1147046,"name":"清新趣粉系列居家地毯 条纹间粉","list_pic_url":"http://yanxuan
         * .nosdn.127.net/655d718df8107f8e7fd1dc6140e29039.png","retail_price":599},
         * {"id":1147045,"name":"清新趣粉系列居家地毯 灰黄条纹","list_pic_url":"http://yanxuan
         * .nosdn.127.net/5cda4a0c4c4ff9728d03186bd053c9ca.png","retail_price":599},
         * {"id":1138001,"name":"北欧简约山形纹绣花抱枕","list_pic_url":"http://yanxuan
         * .nosdn.127.net/dbc5b25b824c3b3d7ff43b56ca35eee9.png","retail_price":79},{"id":1138000,
         * "name":"日式蓬软太鼓抱枕","list_pic_url":"http://yanxuan
         * .nosdn.127.net/ad953e16ad8c33b714e7af941ce8cd56.png","retail_price":29},{"id":1135058,
         * "name":"日式多功能手卷午睡枕坐垫","list_pic_url":"http://yanxuan
         * .nosdn.127.net/37bc0fa3524a904ac740340fa92bd515.png","retail_price":79},{"id":1135057,
         * "name":"梦幻系简约轻透莹白纱帘","list_pic_url":"http://yanxuan
         * .nosdn.127.net/98c5e80b8e328687ce9c949314ebc41d.png","retail_price":199},
         * {"id":1135056,"name":"糖果色凹凸条纹儿童房窗帘","list_pic_url":"http://yanxuan
         * .nosdn.127.net/536246ca4adb77274a94b18bb2f91f47.png","retail_price":259},
         * {"id":1135055,"name":"北欧印象几何条纹混色窗帘","list_pic_url":"http://yanxuan
         * .nosdn.127.net/87b6a608b99279ebf1764682e9e5fcec.png","retail_price":399}]
         * filterCategory : [{"id":0,"name":"全部","checked":false},{"id":1005000,"name":"居家",
         * "checked":false},{"id":1005001,"name":"餐厨","checked":false},{"id":1008000,"name":"配件",
         * "checked":false},{"id":1010000,"name":"服装","checked":false},{"id":1013001,"name":"洗护",
         * "checked":false},{"id":1011000,"name":"婴童","checked":false},{"id":1012000,"name":"杂货",
         * "checked":false},{"id":1005002,"name":"饮食","checked":false},{"id":1019000,"name":"志趣",
         * "checked":false}]
         * goodsList : [{"id":1147048,"name":"简约知性系列居家地毯 蓝灰格","list_pic_url":"http://yanxuan
         * .nosdn.127.net/fd7920a2eadd10fa10c0c03959a2abe0.png","retail_price":559},
         * {"id":1147047,"name":"简约知性系列居家地毯 蓝粉拼接","list_pic_url":"http://yanxuan
         * .nosdn.127.net/bda805b0a2464b6ec33c18981565e50e.png","retail_price":559},
         * {"id":1147046,"name":"清新趣粉系列居家地毯 条纹间粉","list_pic_url":"http://yanxuan
         * .nosdn.127.net/655d718df8107f8e7fd1dc6140e29039.png","retail_price":599},
         * {"id":1147045,"name":"清新趣粉系列居家地毯 灰黄条纹","list_pic_url":"http://yanxuan
         * .nosdn.127.net/5cda4a0c4c4ff9728d03186bd053c9ca.png","retail_price":599},
         * {"id":1138001,"name":"北欧简约山形纹绣花抱枕","list_pic_url":"http://yanxuan
         * .nosdn.127.net/dbc5b25b824c3b3d7ff43b56ca35eee9.png","retail_price":79},{"id":1138000,
         * "name":"日式蓬软太鼓抱枕","list_pic_url":"http://yanxuan
         * .nosdn.127.net/ad953e16ad8c33b714e7af941ce8cd56.png","retail_price":29},{"id":1135058,
         * "name":"日式多功能手卷午睡枕坐垫","list_pic_url":"http://yanxuan
         * .nosdn.127.net/37bc0fa3524a904ac740340fa92bd515.png","retail_price":79},{"id":1135057,
         * "name":"梦幻系简约轻透莹白纱帘","list_pic_url":"http://yanxuan
         * .nosdn.127.net/98c5e80b8e328687ce9c949314ebc41d.png","retail_price":199},
         * {"id":1135056,"name":"糖果色凹凸条纹儿童房窗帘","list_pic_url":"http://yanxuan
         * .nosdn.127.net/536246ca4adb77274a94b18bb2f91f47.png","retail_price":259},
         * {"id":1135055,"name":"北欧印象几何条纹混色窗帘","list_pic_url":"http://yanxuan
         * .nosdn.127.net/87b6a608b99279ebf1764682e9e5fcec.png","retail_price":399}]
         */

        private int count;
        private int totalPages;
        private int pageSize;
        private int currentPage;
        private List<DataBean> data;
        private List<FilterCategoryBean> filterCategory;
        private List<GoodsListBean> goodsList;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(int totalPages) {
            this.totalPages = totalPages;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public List<FilterCategoryBean> getFilterCategory() {
            return filterCategory;
        }

        public void setFilterCategory(List<FilterCategoryBean> filterCategory) {
            this.filterCategory = filterCategory;
        }

        public List<GoodsListBean> getGoodsList() {
            return goodsList;
        }

        public void setGoodsList(List<GoodsListBean> goodsList) {
            this.goodsList = goodsList;
        }

        public static class DataBean {
            /**
             * id : 1147048
             * name : 简约知性系列居家地毯 蓝灰格
             * list_pic_url : http://yanxuan.nosdn.127.net/fd7920a2eadd10fa10c0c03959a2abe0.png
             * retail_price : 559
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

        public static class FilterCategoryBean {
            /**
             * id : 0
             * name : 全部
             * checked : false
             */

            private int id;
            private String name;
            private boolean checked;

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

            public boolean isChecked() {
                return checked;
            }

            public void setChecked(boolean checked) {
                this.checked = checked;
            }
        }

        public static class GoodsListBean {
            /**
             * id : 1147048
             * name : 简约知性系列居家地毯 蓝灰格
             * list_pic_url : http://yanxuan.nosdn.127.net/fd7920a2eadd10fa10c0c03959a2abe0.png
             * retail_price : 559
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
    }
}
