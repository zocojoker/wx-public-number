package com.zc.wx.test;

import com.zc.wx.entity.Token;
import com.zc.wx.util.CommonUtil;
import com.zc.wx.util.MyX509TrustManager;
import org.junit.Test;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * token获取测试
 *
 * @author zoco
 * @creat 2018-04-23-19:52
 */
public class TokenTest {
    public static void main(String[] args) throws Exception {
        //修改appID，secret
        String tokenUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
        //建立连接
        URL url = new URL(tokenUrl);
        HttpsURLConnection httpUrlConn = (HttpsURLConnection) url.openConnection();

        // 创建SSLContext对象，并使用我们指定的信任管理器初始化
        TrustManager[] tm = {new MyX509TrustManager()};
        SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
        sslContext.init(null, tm, new java.security.SecureRandom());
        // 从上述SSLContext对象中得到SSLSocketFactory对象
        SSLSocketFactory ssf = sslContext.getSocketFactory();

        httpUrlConn.setSSLSocketFactory(ssf);
        httpUrlConn.setDoOutput(true);
        httpUrlConn.setDoInput(true);

        // 设置请求方式（GET/POST）
        httpUrlConn.setRequestMethod("GET");

        // 取得输入流
        InputStream inputStream = httpUrlConn.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //读取响应内容
        StringBuffer buffer = new StringBuffer();
        String str = null;
        while ((str = bufferedReader.readLine()) != null) {
            buffer.append(str);
        }
        bufferedReader.close();
        inputStreamReader.close();
        // 释放资源
        inputStream.close();
        httpUrlConn.disconnect();
        //输出返回结果
        System.out.println(buffer);
    }
    @Test
    public void testGetToken2() {
        Token token = CommonUtil.getToken("appID","appsecret");
        System.out.println("access_token:"+token.getAccessToken());
        System.out.println("expires_in:"+token.getExpiresIn());
    }
}