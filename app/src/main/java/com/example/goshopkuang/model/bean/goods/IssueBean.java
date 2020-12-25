package com.example.goshopkuang.model.bean.goods;

public class IssueBean {
            /**
             * id : 1
             * goods_id : 1127052
             * question : 购买运费如何收取？
             * answer : 单笔订单金额（不含运费）满88元免邮费；不满88元，每单收取10元运费。
             (港澳台地区需满
             */

            private int id;
            private String goods_id;
            private String question;
            private String answer;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getGoods_id() {
                return goods_id;
            }

            public void setGoods_id(String goods_id) {
                this.goods_id = goods_id;
            }

            public String getQuestion() {
                return question;
            }

            public void setQuestion(String question) {
                this.question = question;
            }

            public String getAnswer() {
                return answer;
            }

            public void setAnswer(String answer) {
                this.answer = answer;
            }
        }