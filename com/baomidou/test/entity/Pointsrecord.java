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
public class Pointsrecord extends Model<Pointsrecord> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String senderid;

    private String acceptid;

    private Integer sendpoints;

    private LocalDateTime time;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenderid() {
        return senderid;
    }

    public void setSenderid(String senderid) {
        this.senderid = senderid;
    }

    public String getAcceptid() {
        return acceptid;
    }

    public void setAcceptid(String acceptid) {
        this.acceptid = acceptid;
    }

    public Integer getSendpoints() {
        return sendpoints;
    }

    public void setSendpoints(Integer sendpoints) {
        this.sendpoints = sendpoints;
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
        return "Pointsrecord{" +
        "id=" + id +
        ", senderid=" + senderid +
        ", acceptid=" + acceptid +
        ", sendpoints=" + sendpoints +
        ", time=" + time +
        "}";
    }
}
