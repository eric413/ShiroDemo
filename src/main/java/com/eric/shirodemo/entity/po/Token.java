package com.eric.shirodemo.entity.po;

/**
 * @ClassName Token
 * @Description: TODO ()
 * @Author 金晨
 * @Date 2020/8/23
 * @Package com.eric.shirodemo.entity.po
 * @Version V1.0
 **/
public class Token {
    // 接口访问凭证
    private String accessToken;
    // 凭证有效期，单位：秒
    private int expiresIn;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }
}
