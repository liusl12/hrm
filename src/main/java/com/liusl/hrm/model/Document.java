package com.liusl.hrm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * created by l1 on 2017/12/25.
 */
public class Document implements Serializable {
    private Integer id;                 //id
    private String title;               //标题
    private String filename;            //文件名
    private String remark;              //详细内容
    private Date createDate;            //创建时间
    private User user;                  //创建人对象
    public Document(){
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

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
