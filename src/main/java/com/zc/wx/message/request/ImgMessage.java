package com.zc.wx.message.request;

/**
 * 请求图片消息实体类
 *
 * @author zoco
 * @creat 2018-04-20-15:27
 */
public class ImgMessage extends BaseMessage{
    // 图片链接
    private String PicUrl;
    private String MediaId;

    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
