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
public class DynamicsComment extends Model<DynamicsComment> {

    private static final long serialVersionUID = 1L;

    private String id;

    @TableField("dynamicsId")
    private String dynamicsId;

    private String userid;

    private Integer type;

    private String msg;

    private LocalDateTime time;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDynamicsId() {
        return dynamicsId;
    }

    public void setDynamicsId(String dynamicsId) {
        this.dynamicsId = dynamicsId;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "DynamicsComment{" +
        "id=" + id +
        ", dynamicsId=" + dynamicsId +
        ", userid=" + userid +
        ", type=" + type +
        ", msg=" + msg +
        ", time=" + time +
        "}";
    }
}
