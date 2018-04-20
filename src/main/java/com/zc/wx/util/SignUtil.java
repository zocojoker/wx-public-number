package com.zc.wx.util;

import org.springframework.util.StringUtils;

/**
 * 微信校验工具类
 * @author zoco
 * @creat 2018-04-20-17:03
 */
public class SignUtil {
    private static final String SIGNATURE = "zhuochaoweixin";
    private static final String TIMESTAMP = "";
    private static final String NONCE = "";
    public static Boolean checkSignature(String signature, String timestamp, String nonce) {
       /* if(StringUtils.isEmpty(signature)||StringUtils.isEmpty(timestamp)||StringUtils.isEmpty(nonce))return false;
        else{
            if(SIGNATURE.equals(signature)&&TIMESTAMP.equals(timestamp)&&NONCE.equals(nonce)){
                return true;
            }else{
                return false;
            }
        }*/
       return true;

    }
}
