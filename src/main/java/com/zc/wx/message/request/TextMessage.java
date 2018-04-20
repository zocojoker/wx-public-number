package com.zc.wx.message.request;

/**
 * 请求文本消息实体类
 *
 * @author zoco
 * @creat 2018-04-20-15:26
 */
public class TextMessage extends BaseMessage {
    // 消息内容
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
