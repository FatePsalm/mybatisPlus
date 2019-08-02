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
public class Noticeinfor extends Model<Noticeinfor> {

    private static final long serialVersionUID = 1L;

    private String id;

    @TableField("adminId")
    private String adminId;

    private LocalDateTime time;

    @TableField("readBoolean")
    private Integer readBoolean;

    @TableField("sendDel")
    private Boolean sendDel;

    @TableField("checkDel")
    private Boolean checkDel;

    private String systeminfoid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getReadBoolean() {
        return readBoolean;
    }

    public void setReadBoolean(Integer readBoolean) {
        this.readBoolean = readBoolean;
    }

    public Boolean getSendDel() {
        return sendDel;
    }

    public void setSendDel(Boolean sendDel) {
        this.sendDel = sendDel;
    }

    public Boolean getCheckDel() {
        return checkDel;
    }

    public void setCheckDel(Boolean checkDel) {
        this.checkDel = checkDel;
    }

    public String getSysteminfoid() {
        return systeminfoid;
    }

    public void setSysteminfoid(String systeminfoid) {
        this.systeminfoid = systeminfoid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Noticeinfor{" +
        "id=" + id +
        ", adminId=" + adminId +
        ", time=" + time +
        ", readBoolean=" + readBoolean +
        ", sendDel=" + sendDel +
        ", checkDel=" + checkDel +
        ", systeminfoid=" + systeminfoid +
        "}";
    }
}
