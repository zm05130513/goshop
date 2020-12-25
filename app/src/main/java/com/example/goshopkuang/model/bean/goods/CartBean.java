package com.example.goshopkuang.model.bean.goods;

import java.util.List;

public class CartBean {

    /**
     * errno : 0
     * errmsg :
     * data : {"cartList":[{"id":183,"user_id":32,"session_id":"1","goods_id":1009024,
     * "goods_sn":"1009024","product_id":16,"goods_name":"日式和风懒人沙发","market_price":599,
     * "retail_price":599,"number":8,"goods_specifition_name_value":"",
     * "goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan
     * .nosdn.127.net/149dfa87a7324e184c5526ead81de9ad.png"},{"id":185,"user_id":32,
     * "session_id":"1","goods_id":1138000,"goods_sn":"1138000","product_id":217,
     * "goods_name":"日式蓬软太鼓抱枕","market_price":29,"retail_price":29,"number":1,
     * "goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/ad953e16ad8c33b714e7af941ce8cd56.png"},
     * {"id":193,"user_id":32,"session_id":"1","goods_id":1134030,"goods_sn":"1134030",
     * "product_id":198,"goods_name":"简约知性记忆棉坐垫","market_price":46,"retail_price":46,"number":4,
     * "goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/aa49dfe878becf768eddc4c1636643a6.png"},
     * {"id":194,"user_id":32,"session_id":"1","goods_id":1134032,"goods_sn":"1134032",
     * "product_id":199,"goods_name":"趣味粉彩系列记忆棉坐垫","market_price":49,"retail_price":49,
     * "number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/8b30eeb17c831eba08b97bdcb4c46a8e.png"},
     * {"id":195,"user_id":32,"session_id":"1","goods_id":1116011,"goods_sn":"1116011",
     * "product_id":167,"goods_name":"蔓越莓曲奇 200克","market_price":36,"retail_price":36,
     * "number":28,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/767b370d07f3973500db54900bcbd2a7.png"},
     * {"id":196,"user_id":32,"session_id":"1","goods_id":1181000,"goods_sn":"Y100300",
     * "product_id":1,"goods_name":"母亲节礼物-舒适安睡组合","market_price":999,"retail_price":999,
     * "number":6,"goods_specifition_name_value":"1.5m床垫*1+枕头*2;浅杏粉",
     * "goods_specifition_ids":"1_3","checked":1,"list_pic_url":"http://yanxuan
     * .nosdn.127.net/1f67b1970ee20fd572b7202da0ff705d.png"},{"id":197,"user_id":32,
     * "session_id":"1","goods_id":1073008,"goods_sn":"1073008","product_id":91,
     * "goods_name":"铸铁珐琅牛排煎锅","market_price":149,"retail_price":149,"number":1,
     * "goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/619e46411ccd62e5c0f16692ee1a85a0.png"},
     * {"id":198,"user_id":32,"session_id":"1","goods_id":1051003,"goods_sn":"1051003",
     * "product_id":66,"goods_name":"Carat钻石奶锅18cm","market_price":148,"retail_price":148,
     * "number":2,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/6a54ccc389afb2459b163245bbb2c978.png"},
     * {"id":199,"user_id":32,"session_id":"1","goods_id":1155015,"goods_sn":"1155015",
     * "product_id":242,"goods_name":"绿豆糕 80克（4枚入）","market_price":12.9,"retail_price":12.9,
     * "number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/66b9f1638c0517d179262f14ed1345f9.png"},
     * {"id":200,"user_id":32,"session_id":"1","goods_id":1156006,"goods_sn":"1156006",
     * "product_id":243,"goods_name":"20寸 全铝镁合金登机箱","market_price":699,"retail_price":699,
     * "number":2,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/ea5b0a572b35089446fba491db7fbbc3.png"},
     * {"id":201,"user_id":32,"session_id":"1","goods_id":1143018,"goods_sn":"1143018",
     * "product_id":222,"goods_name":"粽情乡思端午粽礼盒 640克","market_price":68,"retail_price":68,
     * "number":3,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/d1fd69cee4990f4de1109baef30efeeb.png"},
     * {"id":202,"user_id":32,"session_id":"1","goods_id":1181000,"goods_sn":"Y200400",
     * "product_id":5,"goods_name":"母亲节礼物-舒适安睡组合","market_price":2000,"retail_price":2000,
     * "number":15,"goods_specifition_name_value":"1.8m床垫*1+枕头*2;玛瑙红",
     * "goods_specifition_ids":"2_4","checked":1,"list_pic_url":"http://yanxuan
     * .nosdn.127.net/1f67b1970ee20fd572b7202da0ff705d.png"},{"id":203,"user_id":32,
     * "session_id":"1","goods_id":1147048,"goods_sn":"1147048","product_id":228,
     * "goods_name":"简约知性系列居家地毯 蓝灰格","market_price":559,"retail_price":559,"number":122,
     * "goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/fd7920a2eadd10fa10c0c03959a2abe0.png"},
     * {"id":204,"user_id":32,"session_id":"1","goods_id":1125017,"goods_sn":"1125017",
     * "product_id":175,"goods_name":"天鹅船创意摆件","market_price":99,"retail_price":99,"number":2,
     * "goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/ae63fed274187e3e572043c53fefd836.png"},
     * {"id":205,"user_id":32,"session_id":"1","goods_id":1181000,"goods_sn":"Y200500",
     * "product_id":6,"goods_name":"母亲节礼物-舒适安睡组合","market_price":3000,"retail_price":3000,
     * "number":3,"goods_specifition_name_value":"1.8m床垫*1+枕头*2;烟白灰",
     * "goods_specifition_ids":"2_5","checked":1,"list_pic_url":"http://yanxuan
     * .nosdn.127.net/1f67b1970ee20fd572b7202da0ff705d.png"},{"id":206,"user_id":32,
     * "session_id":"1","goods_id":1116032,"goods_sn":"1116032","product_id":170,
     * "goods_name":"怀抱休闲椅组合","market_price":3499,"retail_price":3499,"number":8,
     * "goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/45176a783387751fc07a07f5031dd62c.png"},
     * {"id":207,"user_id":32,"session_id":"1","goods_id":1135050,"goods_sn":"1135050",
     * "product_id":205,"goods_name":"多功能封闭式环保除菌猫砂盆","market_price":179,"retail_price":179,
     * "number":3,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/366f3f3f0e8971c8cf871e2b55b74ff2.png"},
     * {"id":208,"user_id":32,"session_id":"1","goods_id":1116030,"goods_sn":"1116030",
     * "product_id":168,"goods_name":"罗马假日 永生花","market_price":439,"retail_price":439,"number":1,
     * "goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/9d59a22b5aff348b5aba5fc7e451ea4d.png"},
     * {"id":209,"user_id":32,"session_id":"1","goods_id":1155000,"goods_sn":"1155000",
     * "product_id":241,"goods_name":"清新趣粉全棉四件套 条纹绿格","market_price":399,"retail_price":399,
     * "number":154,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/d7d6ef1f1865991077384761b4521dce.png"},
     * {"id":210,"user_id":32,"session_id":"1","goods_id":1143020,"goods_sn":"1143020",
     * "product_id":224,"goods_name":"粽横四海端午粽礼盒 800克","market_price":168,"retail_price":168,
     * "number":2,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/200d4d59763af9a0781cca4a06175de7.png"},
     * {"id":211,"user_id":32,"session_id":"1","goods_id":1181000,"goods_sn":"Y100400",
     * "product_id":2,"goods_name":"母亲节礼物-舒适安睡组合","market_price":1500,"retail_price":1500,
     * "number":4,"goods_specifition_name_value":"1.5m床垫*1+枕头*2;玛瑙红",
     * "goods_specifition_ids":"1_4","checked":1,"list_pic_url":"http://yanxuan
     * .nosdn.127.net/1f67b1970ee20fd572b7202da0ff705d.png"},{"id":214,"user_id":32,
     * "session_id":"1","goods_id":1127047,"goods_sn":"1127047","product_id":182,
     * "goods_name":"趣味粉彩系列笔记本","market_price":29,"retail_price":29,"number":74,
     * "goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/6c03ca93d8fe404faa266ea86f3f1e43.png"},
     * {"id":215,"user_id":32,"session_id":"1","goods_id":1006013,"goods_sn":"1006013",
     * "product_id":10,"goods_name":"双宫茧桑蚕丝被 空调被","market_price":699,"retail_price":699,
     * "number":5,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/583812520c68ca7995b6fac4c67ae2c7.png"},
     * {"id":216,"user_id":32,"session_id":"1","goods_id":1030001,"goods_sn":"1030001",
     * "product_id":40,"goods_name":"160*230羊毛手工地毯","market_price":969,"retail_price":969,
     * "number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/88dc5d80c6f84102f003ecd69c86e1cf.png"},
     * {"id":217,"user_id":32,"session_id":"1","goods_id":1115028,"goods_sn":"1115028",
     * "product_id":161,"goods_name":"日式色织水洗棉条纹四件套","market_price":299,"retail_price":299,
     * "number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/3d0045e8f43439c7004fae052b2162ed.png"},
     * {"id":218,"user_id":32,"session_id":"1","goods_id":1127003,"goods_sn":"1127003",
     * "product_id":177,"goods_name":"AB面独立弹簧床垫 进口乳胶","market_price":2599,"retail_price":2599,
     * "number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/6ad1813d123f7a80f84c2cfa5f8c7caf.png"},
     * {"id":219,"user_id":32,"session_id":"1","goods_id":1166008,"goods_sn":"1166008",
     * "product_id":244,"goods_name":"Carat钻石 不粘厨具组合","market_price":459,"retail_price":459,
     * "number":4,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/615a16e899e01efb780c488df4233f48.png"},
     * {"id":220,"user_id":32,"session_id":"1","goods_id":1147045,"goods_sn":"1147045",
     * "product_id":225,"goods_name":"清新趣粉系列居家地毯 灰黄条纹","market_price":599,"retail_price":599,
     * "number":15,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/5cda4a0c4c4ff9728d03186bd053c9ca.png"},
     * {"id":221,"user_id":32,"session_id":"1","goods_id":1035006,"goods_sn":"1035006",
     * "product_id":47,"goods_name":"全棉单面割绒浴室地垫","market_price":56,"retail_price":56,"number":16,
     * "goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/ee92704f3b8323905b51fc647823e6e5.png"},
     * {"id":222,"user_id":32,"session_id":"1","goods_id":1152161,"goods_sn":"1152161",
     * "product_id":239,"goods_name":"竹语丝麻印花四件套","market_price":459,"retail_price":459,
     * "number":2,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/977401e75113f7c8334c4fb5b4bf6215.png"},
     * {"id":223,"user_id":32,"session_id":"1","goods_id":1135072,"goods_sn":"1135072",
     * "product_id":215,"goods_name":"经典海魂纹水手裙（婴童）","market_price":69,"retail_price":69,
     * "number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/43e57d4208cdc78ac9c088f9b3e798f5.png"},
     * {"id":224,"user_id":32,"session_id":"1","goods_id":1181000,"goods_sn":"Y100500",
     * "product_id":3,"goods_name":"母亲节礼物-舒适安睡组合","market_price":1000,"retail_price":1000,
     * "number":3,"goods_specifition_name_value":"1.5m床垫*1+枕头*2;烟白灰",
     * "goods_specifition_ids":"1_5","checked":1,"list_pic_url":"http://yanxuan
     * .nosdn.127.net/1f67b1970ee20fd572b7202da0ff705d.png"},{"id":225,"user_id":32,
     * "session_id":"1","goods_id":1086052,"goods_sn":"1086052","product_id":108,
     * "goods_name":"20寸 铝镁合金登机箱","market_price":859,"retail_price":859,"number":3,
     * "goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
     * "list_pic_url":"http://yanxuan.nosdn.127.net/93171a281c4ed272c007a050816e6f6c.png"}],
     * "cartTotal":{"goodsCount":497,"goodsAmount":246050.9,"checkedGoodsCount":497,
     * "checkedGoodsAmount":246050.9}}
     */

    private int errno;
    private String errmsg;
    private DataBean data;

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

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * cartList : [{"id":183,"user_id":32,"session_id":"1","goods_id":1009024,
         * "goods_sn":"1009024","product_id":16,"goods_name":"日式和风懒人沙发","market_price":599,
         * "retail_price":599,"number":8,"goods_specifition_name_value":"",
         * "goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan
         * .nosdn.127.net/149dfa87a7324e184c5526ead81de9ad.png"},{"id":185,"user_id":32,
         * "session_id":"1","goods_id":1138000,"goods_sn":"1138000","product_id":217,
         * "goods_name":"日式蓬软太鼓抱枕","market_price":29,"retail_price":29,"number":1,
         * "goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/ad953e16ad8c33b714e7af941ce8cd56.png"},
         * {"id":193,"user_id":32,"session_id":"1","goods_id":1134030,"goods_sn":"1134030",
         * "product_id":198,"goods_name":"简约知性记忆棉坐垫","market_price":46,"retail_price":46,
         * "number":4,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/aa49dfe878becf768eddc4c1636643a6.png"},
         * {"id":194,"user_id":32,"session_id":"1","goods_id":1134032,"goods_sn":"1134032",
         * "product_id":199,"goods_name":"趣味粉彩系列记忆棉坐垫","market_price":49,"retail_price":49,
         * "number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/8b30eeb17c831eba08b97bdcb4c46a8e.png"},
         * {"id":195,"user_id":32,"session_id":"1","goods_id":1116011,"goods_sn":"1116011",
         * "product_id":167,"goods_name":"蔓越莓曲奇 200克","market_price":36,"retail_price":36,
         * "number":28,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/767b370d07f3973500db54900bcbd2a7.png"},
         * {"id":196,"user_id":32,"session_id":"1","goods_id":1181000,"goods_sn":"Y100300",
         * "product_id":1,"goods_name":"母亲节礼物-舒适安睡组合","market_price":999,"retail_price":999,
         * "number":6,"goods_specifition_name_value":"1.5m床垫*1+枕头*2;浅杏粉",
         * "goods_specifition_ids":"1_3","checked":1,"list_pic_url":"http://yanxuan
         * .nosdn.127.net/1f67b1970ee20fd572b7202da0ff705d.png"},{"id":197,"user_id":32,
         * "session_id":"1","goods_id":1073008,"goods_sn":"1073008","product_id":91,
         * "goods_name":"铸铁珐琅牛排煎锅","market_price":149,"retail_price":149,"number":1,
         * "goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/619e46411ccd62e5c0f16692ee1a85a0.png"},
         * {"id":198,"user_id":32,"session_id":"1","goods_id":1051003,"goods_sn":"1051003",
         * "product_id":66,"goods_name":"Carat钻石奶锅18cm","market_price":148,"retail_price":148,
         * "number":2,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/6a54ccc389afb2459b163245bbb2c978.png"},
         * {"id":199,"user_id":32,"session_id":"1","goods_id":1155015,"goods_sn":"1155015",
         * "product_id":242,"goods_name":"绿豆糕 80克（4枚入）","market_price":12.9,"retail_price":12.9,
         * "number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/66b9f1638c0517d179262f14ed1345f9.png"},
         * {"id":200,"user_id":32,"session_id":"1","goods_id":1156006,"goods_sn":"1156006",
         * "product_id":243,"goods_name":"20寸 全铝镁合金登机箱","market_price":699,"retail_price":699,
         * "number":2,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/ea5b0a572b35089446fba491db7fbbc3.png"},
         * {"id":201,"user_id":32,"session_id":"1","goods_id":1143018,"goods_sn":"1143018",
         * "product_id":222,"goods_name":"粽情乡思端午粽礼盒 640克","market_price":68,"retail_price":68,
         * "number":3,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/d1fd69cee4990f4de1109baef30efeeb.png"},
         * {"id":202,"user_id":32,"session_id":"1","goods_id":1181000,"goods_sn":"Y200400",
         * "product_id":5,"goods_name":"母亲节礼物-舒适安睡组合","market_price":2000,"retail_price":2000,
         * "number":15,"goods_specifition_name_value":"1.8m床垫*1+枕头*2;玛瑙红",
         * "goods_specifition_ids":"2_4","checked":1,"list_pic_url":"http://yanxuan
         * .nosdn.127.net/1f67b1970ee20fd572b7202da0ff705d.png"},{"id":203,"user_id":32,
         * "session_id":"1","goods_id":1147048,"goods_sn":"1147048","product_id":228,
         * "goods_name":"简约知性系列居家地毯 蓝灰格","market_price":559,"retail_price":559,"number":122,
         * "goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/fd7920a2eadd10fa10c0c03959a2abe0.png"},
         * {"id":204,"user_id":32,"session_id":"1","goods_id":1125017,"goods_sn":"1125017",
         * "product_id":175,"goods_name":"天鹅船创意摆件","market_price":99,"retail_price":99,
         * "number":2,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/ae63fed274187e3e572043c53fefd836.png"},
         * {"id":205,"user_id":32,"session_id":"1","goods_id":1181000,"goods_sn":"Y200500",
         * "product_id":6,"goods_name":"母亲节礼物-舒适安睡组合","market_price":3000,"retail_price":3000,
         * "number":3,"goods_specifition_name_value":"1.8m床垫*1+枕头*2;烟白灰",
         * "goods_specifition_ids":"2_5","checked":1,"list_pic_url":"http://yanxuan
         * .nosdn.127.net/1f67b1970ee20fd572b7202da0ff705d.png"},{"id":206,"user_id":32,
         * "session_id":"1","goods_id":1116032,"goods_sn":"1116032","product_id":170,
         * "goods_name":"怀抱休闲椅组合","market_price":3499,"retail_price":3499,"number":8,
         * "goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/45176a783387751fc07a07f5031dd62c.png"},
         * {"id":207,"user_id":32,"session_id":"1","goods_id":1135050,"goods_sn":"1135050",
         * "product_id":205,"goods_name":"多功能封闭式环保除菌猫砂盆","market_price":179,"retail_price":179,
         * "number":3,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/366f3f3f0e8971c8cf871e2b55b74ff2.png"},
         * {"id":208,"user_id":32,"session_id":"1","goods_id":1116030,"goods_sn":"1116030",
         * "product_id":168,"goods_name":"罗马假日 永生花","market_price":439,"retail_price":439,
         * "number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/9d59a22b5aff348b5aba5fc7e451ea4d.png"},
         * {"id":209,"user_id":32,"session_id":"1","goods_id":1155000,"goods_sn":"1155000",
         * "product_id":241,"goods_name":"清新趣粉全棉四件套 条纹绿格","market_price":399,"retail_price":399,
         * "number":154,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/d7d6ef1f1865991077384761b4521dce.png"},
         * {"id":210,"user_id":32,"session_id":"1","goods_id":1143020,"goods_sn":"1143020",
         * "product_id":224,"goods_name":"粽横四海端午粽礼盒 800克","market_price":168,"retail_price":168,
         * "number":2,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/200d4d59763af9a0781cca4a06175de7.png"},
         * {"id":211,"user_id":32,"session_id":"1","goods_id":1181000,"goods_sn":"Y100400",
         * "product_id":2,"goods_name":"母亲节礼物-舒适安睡组合","market_price":1500,"retail_price":1500,
         * "number":4,"goods_specifition_name_value":"1.5m床垫*1+枕头*2;玛瑙红",
         * "goods_specifition_ids":"1_4","checked":1,"list_pic_url":"http://yanxuan
         * .nosdn.127.net/1f67b1970ee20fd572b7202da0ff705d.png"},{"id":214,"user_id":32,
         * "session_id":"1","goods_id":1127047,"goods_sn":"1127047","product_id":182,
         * "goods_name":"趣味粉彩系列笔记本","market_price":29,"retail_price":29,"number":74,
         * "goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/6c03ca93d8fe404faa266ea86f3f1e43.png"},
         * {"id":215,"user_id":32,"session_id":"1","goods_id":1006013,"goods_sn":"1006013",
         * "product_id":10,"goods_name":"双宫茧桑蚕丝被 空调被","market_price":699,"retail_price":699,
         * "number":5,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/583812520c68ca7995b6fac4c67ae2c7.png"},
         * {"id":216,"user_id":32,"session_id":"1","goods_id":1030001,"goods_sn":"1030001",
         * "product_id":40,"goods_name":"160*230羊毛手工地毯","market_price":969,"retail_price":969,
         * "number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/88dc5d80c6f84102f003ecd69c86e1cf.png"},
         * {"id":217,"user_id":32,"session_id":"1","goods_id":1115028,"goods_sn":"1115028",
         * "product_id":161,"goods_name":"日式色织水洗棉条纹四件套","market_price":299,"retail_price":299,
         * "number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/3d0045e8f43439c7004fae052b2162ed.png"},
         * {"id":218,"user_id":32,"session_id":"1","goods_id":1127003,"goods_sn":"1127003",
         * "product_id":177,"goods_name":"AB面独立弹簧床垫 进口乳胶","market_price":2599,
         * "retail_price":2599,"number":1,"goods_specifition_name_value":"",
         * "goods_specifition_ids":"","checked":1,"list_pic_url":"http://yanxuan
         * .nosdn.127.net/6ad1813d123f7a80f84c2cfa5f8c7caf.png"},{"id":219,"user_id":32,
         * "session_id":"1","goods_id":1166008,"goods_sn":"1166008","product_id":244,
         * "goods_name":"Carat钻石 不粘厨具组合","market_price":459,"retail_price":459,"number":4,
         * "goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/615a16e899e01efb780c488df4233f48.png"},
         * {"id":220,"user_id":32,"session_id":"1","goods_id":1147045,"goods_sn":"1147045",
         * "product_id":225,"goods_name":"清新趣粉系列居家地毯 灰黄条纹","market_price":599,"retail_price":599,
         * "number":15,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/5cda4a0c4c4ff9728d03186bd053c9ca.png"},
         * {"id":221,"user_id":32,"session_id":"1","goods_id":1035006,"goods_sn":"1035006",
         * "product_id":47,"goods_name":"全棉单面割绒浴室地垫","market_price":56,"retail_price":56,
         * "number":16,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/ee92704f3b8323905b51fc647823e6e5.png"},
         * {"id":222,"user_id":32,"session_id":"1","goods_id":1152161,"goods_sn":"1152161",
         * "product_id":239,"goods_name":"竹语丝麻印花四件套","market_price":459,"retail_price":459,
         * "number":2,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/977401e75113f7c8334c4fb5b4bf6215.png"},
         * {"id":223,"user_id":32,"session_id":"1","goods_id":1135072,"goods_sn":"1135072",
         * "product_id":215,"goods_name":"经典海魂纹水手裙（婴童）","market_price":69,"retail_price":69,
         * "number":1,"goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/43e57d4208cdc78ac9c088f9b3e798f5.png"},
         * {"id":224,"user_id":32,"session_id":"1","goods_id":1181000,"goods_sn":"Y100500",
         * "product_id":3,"goods_name":"母亲节礼物-舒适安睡组合","market_price":1000,"retail_price":1000,
         * "number":3,"goods_specifition_name_value":"1.5m床垫*1+枕头*2;烟白灰",
         * "goods_specifition_ids":"1_5","checked":1,"list_pic_url":"http://yanxuan
         * .nosdn.127.net/1f67b1970ee20fd572b7202da0ff705d.png"},{"id":225,"user_id":32,
         * "session_id":"1","goods_id":1086052,"goods_sn":"1086052","product_id":108,
         * "goods_name":"20寸 铝镁合金登机箱","market_price":859,"retail_price":859,"number":3,
         * "goods_specifition_name_value":"","goods_specifition_ids":"","checked":1,
         * "list_pic_url":"http://yanxuan.nosdn.127.net/93171a281c4ed272c007a050816e6f6c.png"}]
         * cartTotal : {"goodsCount":497,"goodsAmount":246050.9,"checkedGoodsCount":497,
         * "checkedGoodsAmount":246050.9}
         */

        private CartTotalBean cartTotal;
        private List<CartListBean> cartList;

        public CartTotalBean getCartTotal() {
            return cartTotal;
        }

        public void setCartTotal(CartTotalBean cartTotal) {
            this.cartTotal = cartTotal;
        }

        public List<CartListBean> getCartList() {
            return cartList;
        }

        public void setCartList(List<CartListBean> cartList) {
            this.cartList = cartList;
        }

        public static class CartTotalBean {
            /**
             * goodsCount : 497
             * goodsAmount : 246050.9
             * checkedGoodsCount : 497
             * checkedGoodsAmount : 246050.9
             */

            private int goodsCount;
            private double goodsAmount;
            private int checkedGoodsCount;
            private double checkedGoodsAmount;

            public int getGoodsCount() {
                return goodsCount;
            }

            public void setGoodsCount(int goodsCount) {
                this.goodsCount = goodsCount;
            }

            public double getGoodsAmount() {
                return goodsAmount;
            }

            public void setGoodsAmount(double goodsAmount) {
                this.goodsAmount = goodsAmount;
            }

            public int getCheckedGoodsCount() {
                return checkedGoodsCount;
            }

            public void setCheckedGoodsCount(int checkedGoodsCount) {
                this.checkedGoodsCount = checkedGoodsCount;
            }

            public double getCheckedGoodsAmount() {
                return checkedGoodsAmount;
            }

            public void setCheckedGoodsAmount(double checkedGoodsAmount) {
                this.checkedGoodsAmount = checkedGoodsAmount;
            }
        }

        public static class CartListBean {
            /**
             * id : 183
             * user_id : 32
             * session_id : 1
             * goods_id : 1009024
             * goods_sn : 1009024
             * product_id : 16
             * goods_name : 日式和风懒人沙发
             * market_price : 599
             * retail_price : 599
             * number : 8
             * goods_specifition_name_value :
             * goods_specifition_ids :
             * checked : 1
             * list_pic_url : http://yanxuan.nosdn.127.net/149dfa87a7324e184c5526ead81de9ad.png
             */

            private int id;
            private int user_id;
            private String session_id;
            private int goods_id;
            private String goods_sn;
            private int product_id;
            private String goods_name;
            private int market_price;
            private int retail_price;
            private int number;
            private String goods_specifition_name_value;
            private String goods_specifition_ids;
            private int checked;
            private String list_pic_url;
            private boolean isCheck;

            public boolean isCheck() {
                return isCheck;
            }

            public void setCheck(boolean check) {
                isCheck = check;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public String getSession_id() {
                return session_id;
            }

            public void setSession_id(String session_id) {
                this.session_id = session_id;
            }

            public int getGoods_id() {
                return goods_id;
            }

            public void setGoods_id(int goods_id) {
                this.goods_id = goods_id;
            }

            public String getGoods_sn() {
                return goods_sn;
            }

            public void setGoods_sn(String goods_sn) {
                this.goods_sn = goods_sn;
            }

            public int getProduct_id() {
                return product_id;
            }

            public void setProduct_id(int product_id) {
                this.product_id = product_id;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public int getMarket_price() {
                return market_price;
            }

            public void setMarket_price(int market_price) {
                this.market_price = market_price;
            }

            public int getRetail_price() {
                return retail_price;
            }

            public void setRetail_price(int retail_price) {
                this.retail_price = retail_price;
            }

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public String getGoods_specifition_name_value() {
                return goods_specifition_name_value;
            }

            public void setGoods_specifition_name_value(String goods_specifition_name_value) {
                this.goods_specifition_name_value = goods_specifition_name_value;
            }

            public String getGoods_specifition_ids() {
                return goods_specifition_ids;
            }

            public void setGoods_specifition_ids(String goods_specifition_ids) {
                this.goods_specifition_ids = goods_specifition_ids;
            }

            public int getChecked() {
                return checked;
            }

            public void setChecked(int checked) {
                this.checked = checked;
            }

            public String getList_pic_url() {
                return list_pic_url;
            }

            public void setList_pic_url(String list_pic_url) {
                this.list_pic_url = list_pic_url;
            }
        }
    }
}
