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
public class Usergiftlib extends Model<Usergiftlib> {

    private static final long serialVersionUID = 1L;

    private String id;

    @TableField("userId")
    private String userId;

    @TableField("giftId")
    private String giftId;

    @TableField("giftName")
    private String giftName;

    @TableField("giftImg")
    private String giftImg;

    @TableField("createTime")
    private LocalDateTime createTime;

    @TableField("reUserGiftId")
    private String reUserGiftId;

    @TableField("reSendTime")
    private LocalDateTime reSendTime;

    @TableField("payTime")
    private LocalDateTime payTime;

    @TableField("userGiftId")
    private String userGiftId;

    private Integer state;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGiftId() {
        return giftId;
    }

    public void setGiftId(String giftId) {
        this.giftId = giftId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getGiftImg() {
        return giftImg;
    }

    public void setGiftImg(String giftImg) {
        this.giftImg = giftImg;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getReUserGiftId() {
        return reUserGiftId;
    }

    public void setReUserGiftId(String reUserGiftId) {
        this.reUserGiftId = reUserGiftId;
    }

    public LocalDateTime getReSendTime() {
        return reSendTime;
    }

    public void setReSendTime(LocalDateTime reSendTime) {
        this.reSendTime = reSendTime;
    }

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    public String getUserGiftId() {
        return userGiftId;
    }

    public void setUserGiftId(String userGiftId) {
        this.userGiftId = userGiftId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Usergiftlib{" +
        "id=" + id +
        ", userId=" + userId +
        ", giftId=" + giftId +
        ", giftName=" + giftName +
        ", giftImg=" + giftImg +
        ", createTime=" + createTime +
        ", reUserGiftId=" + reUserGiftId +
        ", reSendTime=" + reSendTime +
        ", payTime=" + payTime +
        ", userGiftId=" + userGiftId +
        ", state=" + state +
        "}";
    }
}
