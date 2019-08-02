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
public class UserBanned extends Model<UserBanned> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户是否被系统禁言
     */
    private String id;

    /**
     * 用户被禁言的到期时间
     */
    private LocalDateTime msgTime;

    /**
     * 用户被限制抢红包的到期时间
     */
    private LocalDateTime redTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getMsgTime() {
        return msgTime;
    }

    public void setMsgTime(LocalDateTime msgTime) {
        this.msgTime = msgTime;
    }

    public LocalDateTime getRedTime() {
        return redTime;
    }

    public void setRedTime(LocalDateTime redTime) {
        this.redTime = redTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserBanned{" +
        "id=" + id +
        ", msgTime=" + msgTime +
        ", redTime=" + redTime +
        "}";
    }
}
