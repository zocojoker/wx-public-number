package com.zc.wx.message.response;

/**
 * 响应文本实体类
 *
 * @author zoco
 * @creat 2018-04-20-15:43
 */
public class TextMessage extends BaseMessage {
    // 回复的消息内容
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
