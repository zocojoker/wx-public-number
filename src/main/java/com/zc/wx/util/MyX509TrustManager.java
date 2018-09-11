package com.zc.wx.util;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * 信任证书管理器(HTTPS需要一个信任管理器)
 *
 * @author zoco
 * @creat 2018-04-23-19:41
 */
public class MyX509TrustManager implements X509TrustManager{

    /**
     * 检查客户端证书
     * @param x509Certificates
     * @param s
     * @throws CertificateException
     */
    @Override
    public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

    }

    /**
     * 检查服务端证书
     * @param x509Certificates
     * @param s
     * @throws CertificateException
     */
    @Override
    public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {

    }

    /**
     * 返回受信任的X509证书数组
     * @return
     */
    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
