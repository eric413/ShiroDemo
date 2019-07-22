package com.eric.shirodemo.util;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/**
 * @author 辜勇胜
 * @Title: MD5Util
 * @Package com.scjy.core.util
 * @Description: TODO(带盐加密MD5)
 * @date 2019/4/9 11:16
 * Copyright (c) ©1994-2019 Scjydz.com All Rights Reserved.
 */
public class MD5Util {
	// 加盐参数
    public final static String hashAlgorithmName = "MD5";

    // 循环次数
    public final static int hashIterations = 1024;

    /**
     * @Title: md5 
     * @Description: TODO(shiro密码加密工具类) 
     * @param credentials 密码
     * @param saltSource	密码盐
     * @return String    返回类型
     */
    public static String md5(String credentials, String saltSource) {
       // ByteSource salt = new Md5Hash(saltSource);
        ByteSource salt = ByteSource.Util.bytes(saltSource);
        return new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations).toString();
    }
    
    /**
     * @Title: getRandomString 
     * @Description: TODO(获取一个随机字符串，用于生成用户盐) 
     * @param length
     * @return String    返回类型
     */
    public static String getRandomString(int length) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    /**
     * slh 2019-5-6
     * @Title: getRandomNum
     * @Description: TODO(获取一个随机数字串，用于生成用户盐)
     * @param length
     * @return String    返回类型
     */
    public static String getRandomNum(int length) {
        String base = "0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }
    /**
     *
     * @param plainText
     * @return
     */
    //静态方法，便于作为工具类
    public static String getMd5(String plainText) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte[] b = md.digest();

            int i;

            StringBuffer buf = new StringBuffer();
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            //32位加密
            return buf.toString();
            // 16位的加密
            //return buf.toString().substring(8, 24);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args){
       System.out.println( md5("eux65!" +
               "_2fopzlsjf","4ds8a"));
    }
}
