package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class UserWechatInfo extends Model<UserWechatInfo> {

    private static final long serialVersionUID = 1L;

    private String userid;

    /**
     * 约酒小程序openid
     */
    private String miniOpenid;

    private LocalDateTime createTime;

    /**
     * 喵boss小程序openid
     */
    private String bossOpenid;

    /**
     * 微信带区号手机号
     */
    private String phoneNumber;

    /**
     * 微信不带区号手机号
     */
    private String purePhoneNumber;

    /**
     * 国家代号
     */
    private String countryCode;

    /**
     * 喵star小程序openid
     */
    private String starOpenid;

    /**
     * 天府银行openid
     */
    private String tianfuOpenid;


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getMiniOpenid() {
        return miniOpenid;
    }

    public void setMiniOpenid(String miniOpenid) {
        this.miniOpenid = miniOpenid;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getBossOpenid() {
        return bossOpenid;
    }

    public void setBossOpenid(String bossOpenid) {
        this.bossOpenid = bossOpenid;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPurePhoneNumber() {
        return purePhoneNumber;
    }

    public void setPurePhoneNumber(String purePhoneNumber) {
        this.purePhoneNumber = purePhoneNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getStarOpenid() {
        return starOpenid;
    }

    public void setStarOpenid(String starOpenid) {
        this.starOpenid = starOpenid;
    }

    public String getTianfuOpenid() {
        return tianfuOpenid;
    }

    public void setTianfuOpenid(String tianfuOpenid) {
        this.tianfuOpenid = tianfuOpenid;
    }

    @Override
    protected Serializable pkVal() {
        return this.userid;
    }

    @Override
    public String toString() {
        return "UserWechatInfo{" +
        "userid=" + userid +
        ", miniOpenid=" + miniOpenid +
        ", createTime=" + createTime +
        ", bossOpenid=" + bossOpenid +
        ", phoneNumber=" + phoneNumber +
        ", purePhoneNumber=" + purePhoneNumber +
        ", countryCode=" + countryCode +
        ", starOpenid=" + starOpenid +
        ", tianfuOpenid=" + tianfuOpenid +
        "}";
    }
}
