package com.liusl.hrm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * created by l1 on 2017/12/25.
 */
public class Notice implements Serializable{

    private Integer id;             //id
    private String title;           //标题
    private String content;         //内容
    private Date createDate;        //创建时间
    private User user;              //创建人对象
    public Notice(){
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
