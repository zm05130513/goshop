package com.example.goshopkuang.model.bean.login;


public class UserBean {
    /**
     * errno : 0
     * errmsg :
     * data : {"code":200,"token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiN2I5NjU2NTYtNzBlYi00NzI2LWI0YTctYzUyMzY2ODYxNDg1IiwicmFuZG9tIjoiN2xweGtzeHV1OCIsImlhdCI6MTYwOTY1NDk1MH0.YKjLAx6PW4rbKLjcwSypqy-umjSN3GW0cZpmhMoPeCQ","userInfo":{"uid":"7b965656-70eb-4726-b4a7-c52366861485","username":"z1234","nickname":"李四1","gender":0,"avatar":"zxc","birthday":110022}}
     */

    private Integer errno;

    private String errmsg;

    private DataDTO data;


    public static class DataDTO {
        /**
         * code : 200
         * token : eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiN2I5NjU2NTYtNzBlYi00NzI2LWI0YTctYzUyMzY2ODYxNDg1IiwicmFuZG9tIjoiN2xweGtzeHV1OCIsImlhdCI6MTYwOTY1NDk1MH0.YKjLAx6PW4rbKLjcwSypqy-umjSN3GW0cZpmhMoPeCQ
         * userInfo : {"uid":"7b965656-70eb-4726-b4a7-c52366861485","username":"z1234","nickname":"李四1","gender":0,"avatar":"zxc","birthday":110022}
         */


        private Integer code;

        private String token;

        private DataDTO.UserInfoDTO userInfo;


        public static class UserInfoDTO {
            /**
             * uid : 7b965656-70eb-4726-b4a7-c52366861485
             * username : z1234
             * nickname : 李四1
             * gender : 0
             * avatar : zxc
             * birthday : 110022
             */
            private String uid;

            private String username;

            private String nickname;

            private Integer gender;

            private String avatar;

            private Integer birthday;

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public Integer getGender() {
                return gender;
            }

            public void setGender(Integer gender) {
                this.gender = gender;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public Integer getBirthday() {
                return birthday;
            }

            public void setBirthday(Integer birthday) {
                this.birthday = birthday;
            }
        }

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public UserInfoDTO getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfoDTO userInfo) {
            this.userInfo = userInfo;
        }
    }

    public Integer getErrno() {
        return errno;
    }

    public void setErrno(Integer errno) {
        this.errno = errno;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }
}
