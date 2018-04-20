package com.zc.wx.message.response;

/**
 * 响应视频实体类
 *
 * @author zoco
 * @creat 2018-04-20-15:47
 */
public class VideoMessage extends BaseMessage{
    // 视频
    private Video Video;

    public Video getVideo() {
        return Video;
    }

    public void setVideo(Video video) {
        Video = video;
    }
}
