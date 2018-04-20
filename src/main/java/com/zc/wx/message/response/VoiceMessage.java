package com.zc.wx.message.response;

/**
 * 响应语音实体类
 *
 * @author zoco
 * @creat 2018-04-20-15:46
 */
public class VoiceMessage extends BaseMessage{
    // 语音
    private Voice Voice;

    public Voice getVoice() {
        return Voice;
    }

    public void setVoice(Voice voice) {
        Voice = voice;
    }
}
