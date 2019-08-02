package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 群聊表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class GroupTalk extends Model<GroupTalk> {

    private static final long serialVersionUID = 1L;

    /**
     * 群聊主键
     */
    private String id;

    /**
     * 发送者id
     */
    private String senduserid;

    /**
     * 群聊组id
     */
    private String grouptalkid;

    /**
     * 发送时间
     */
    private LocalDateTime creationtime;

    /**
     * 内容
     */
    private String msg;

    /**
     * 消息类型 1-普通消息 2-送礼消息 3-送酒消息 4-霸灯消息 5-系统消息
     */
    private Integer type;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenduserid() {
        return senduserid;
    }

    public void setSenduserid(String senduserid) {
        this.senduserid = senduserid;
    }

    public String getGrouptalkid() {
        return grouptalkid;
    }

    public void setGrouptalkid(String grouptalkid) {
        this.grouptalkid = grouptalkid;
    }

    public LocalDateTime getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(LocalDateTime creationtime) {
        this.creationtime = creationtime;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "GroupTalk{" +
        "id=" + id +
        ", senduserid=" + senduserid +
        ", grouptalkid=" + grouptalkid +
        ", creationtime=" + creationtime +
        ", msg=" + msg +
        ", type=" + type +
        "}";
    }
}
