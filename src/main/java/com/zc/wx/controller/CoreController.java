package com.zc.wx.controller;

import com.zc.wx.service.ICoreService;
import com.zc.wx.service.impl.CoreServiceImpl;
import com.zc.wx.util.SignUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 核心controller
 *
 * @author zoco
 * @creat 2018-04-20-16:26
 */
@Controller
@RequestMapping(value = "/core")
public class CoreController {
    @Autowired
    private ICoreService service;

    /**
     * 验证是否来自微信服务器
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping(value = "/confirm.do", method = RequestMethod.GET)
    public void ConfirmSource(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 微信加密签名
        String signature = request.getParameter("signature");
        // 时间戳
        String timestamp = request.getParameter("timestamp");
        // 随机数
        String nonce = request.getParameter("nonce");
        // 随机字符串
        String echostr = request.getParameter("echostr");

        PrintWriter out = response.getWriter();

        // 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
        if (SignUtil.checkSignature(signature, timestamp, nonce)) {
            out.print(echostr);
        }
        out.close();
        out = null;
    }

    /**
     * 微信消息核心处理方法
     *
     * @param request
     * @param response
     */
    @RequestMapping(value = "/msg.do", method = RequestMethod.POST)
    public void DealMessage(HttpServletRequest request, HttpServletResponse response) {
        PrintWriter out = null;
        String respXml = null;
        // 响应消息
        try {
            // 消息的接收、处理、响应
            // 将请求、响应的编码均设置为UTF-8（防止中文乱码）
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            // 调用核心业务类接收消息、处理消息
            respXml = service.processRequest(request);
            out = response.getWriter();
            out.print(respXml);
        } catch (Exception e) {
            System.out.println("具体异常：" + e.getMessage());
        } finally {
            out.close();
        }

    }
}
