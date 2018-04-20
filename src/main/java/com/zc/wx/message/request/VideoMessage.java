package com.zc.wx.message.request;

/**
 * 请求视频消息实体类
 *
 * @author zoco
 * @creat 2018-04-20-15:31
 */
public class VideoMessage extends BaseMessage {
    // 媒体ID
    private String MediaId;
    // 视频格式
    private String ThumbMediaId;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getThumbMediaId() {
        return ThumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }
}
