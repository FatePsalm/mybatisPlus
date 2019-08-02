package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class Config extends Model<Config> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String appid;

    private String appscrity;

    private String url;

    private String barid;

    private String accesstoken;

    private String microsignal;

    private String micropassword;

    private Integer isservicenumber;

    private String username;

    private String password;

    private Boolean authentication;

    private Boolean serverauth;

    @TableField("isAuthorization")
    private Boolean authorization;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppscrity() {
        return appscrity;
    }

    public void setAppscrity(String appscrity) {
        this.appscrity = appscrity;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getAccesstoken() {
        return accesstoken;
    }

    public void setAccesstoken(String accesstoken) {
        this.accesstoken = accesstoken;
    }

    public String getMicrosignal() {
        return microsignal;
    }

    public void setMicrosignal(String microsignal) {
        this.microsignal = microsignal;
    }

    public String getMicropassword() {
        return micropassword;
    }

    public void setMicropassword(String micropassword) {
        this.micropassword = micropassword;
    }

    public Integer getIsservicenumber() {
        return isservicenumber;
    }

    public void setIsservicenumber(Integer isservicenumber) {
        this.isservicenumber = isservicenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Boolean authentication) {
        this.authentication = authentication;
    }

    public Boolean getServerauth() {
        return serverauth;
    }

    public void setServerauth(Boolean serverauth) {
        this.serverauth = serverauth;
    }

    public Boolean getAuthorization() {
        return authorization;
    }

    public void setAuthorization(Boolean authorization) {
        this.authorization = authorization;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Config{" +
        "id=" + id +
        ", appid=" + appid +
        ", appscrity=" + appscrity +
        ", url=" + url +
        ", barid=" + barid +
        ", accesstoken=" + accesstoken +
        ", microsignal=" + microsignal +
        ", micropassword=" + micropassword +
        ", isservicenumber=" + isservicenumber +
        ", username=" + username +
        ", password=" + password +
        ", authentication=" + authentication +
        ", serverauth=" + serverauth +
        ", authorization=" + authorization +
        "}";
    }
}
