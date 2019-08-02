package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 小程序弹幕记录
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class WangBulletScreen extends Model<WangBulletScreen> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * 发送弹幕者userID
     */
    private String sendUserId;

    /**
     * 弹幕接收用户userID
     */
    private String acceptUserId;

    /**
     * 弹幕发送时间
     */
    private LocalDateTime creationtime;

    /**
     * 弹幕类型 1-普通弹幕
     */
    private Integer type;

    /**
     * 弹幕内容
     */
    private String msg;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId;
    }

    public String getAcceptUserId() {
        return acceptUserId;
    }

    public void setAcceptUserId(String acceptUserId) {
        this.acceptUserId = acceptUserId;
    }

    public LocalDateTime getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(LocalDateTime creationtime) {
        this.creationtime = creationtime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "WangBulletScreen{" +
        "id=" + id +
        ", sendUserId=" + sendUserId +
        ", acceptUserId=" + acceptUserId +
        ", creationtime=" + creationtime +
        ", type=" + type +
        ", msg=" + msg +
        "}";
    }
}
