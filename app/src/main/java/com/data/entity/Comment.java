package com.data.entity;

import com.base.BaseBean;
import com.data.Pointer;

/**
 * Created by baixiaokang on 16/5/4.
 */

public class Comment extends BaseBean {

    public Pointer article;
    public String content;
    public Pointer creater;

    public Comment(Pointer article, String content, Pointer creater) {
        this.article = article;
        this.content = content;
        this.creater = creater;
    }
}
