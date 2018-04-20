package com.zc.wx.message.response;

/**
 * 响应图片实体类
 *
 * @author zoco
 * @creat 2018-04-20-15:45
 */
public class ImageMessage extends BaseMessage {
    private Image Image;

    public Image getImage() {
        return Image;
    }

    public void setImage(Image image) {
        Image = image;
    }
}
