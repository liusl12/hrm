package com.liusl.hrm.model;

import java.io.Serializable;
import java.util.Date;

/**
 * created by l1 on 2017/12/25.
 * 用户实体类
 */
public class User implements Serializable{
    private Integer id;
    private String loginname;
    private String password;
    private Integer status;
    private Date createDate;
    private String username;

    //无参构造方法
    public User(){
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
