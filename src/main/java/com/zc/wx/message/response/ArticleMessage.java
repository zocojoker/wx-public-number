package com.zc.wx.message.response;

import java.util.List;

/**
 * 响应图文实体类
 *
 * @author zoco
 * @creat 2018-04-20-15:50
 */
public class ArticleMessage extends BaseMessage{
    // 图文消息个数，限制为10条以内
    private int ArticleCount;
    // 多条图文消息信息，默认第一个item为大图
    private List<Article> Articles;

    public int getArticleCount() {
        return ArticleCount;
    }

    public void setArticleCount(int articleCount) {
        ArticleCount = articleCount;
    }

    public List<Article> getArticles() {
        return Articles;
    }

    public void setArticles(List<Article> articles) {
        Articles = articles;
    }
}
