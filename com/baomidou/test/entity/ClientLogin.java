package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class ClientLogin extends Model<ClientLogin> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 酒吧id
     */
    private String userName;

    /**
     * 软件版本号
     */
    private String version;

    /**
     * 没有记住密码0,记住密码1
     */
    private Boolean remeberPassword;

    /**
     * 是否自动登录 0 否, 1是
     */
    private Boolean autoLogin;

    /**
     * 点击登录 
     */
    private Boolean clickLogin;

    /**
     * 点击时间
     */
    @TableField("clickTime")
    private LocalDateTime clickTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getRemeberPassword() {
        return remeberPassword;
    }

    public void setRemeberPassword(Boolean remeberPassword) {
        this.remeberPassword = remeberPassword;
    }

    public Boolean getAutoLogin() {
        return autoLogin;
    }

    public void setAutoLogin(Boolean autoLogin) {
        this.autoLogin = autoLogin;
    }

    public Boolean getClickLogin() {
        return clickLogin;
    }

    public void setClickLogin(Boolean clickLogin) {
        this.clickLogin = clickLogin;
    }

    public LocalDateTime getClickTime() {
        return clickTime;
    }

    public void setClickTime(LocalDateTime clickTime) {
        this.clickTime = clickTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ClientLogin{" +
        "id=" + id +
        ", userName=" + userName +
        ", version=" + version +
        ", remeberPassword=" + remeberPassword +
        ", autoLogin=" + autoLogin +
        ", clickLogin=" + clickLogin +
        ", clickTime=" + clickTime +
        "}";
    }
}
