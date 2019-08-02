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
public class Payapply extends Model<Payapply> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String adminid;

    private String name;

    private String tel;

    private LocalDateTime applytime;

    private Boolean dispose;

    private String remark;

    private LocalDateTime disposetime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public LocalDateTime getApplytime() {
        return applytime;
    }

    public void setApplytime(LocalDateTime applytime) {
        this.applytime = applytime;
    }

    public Boolean getDispose() {
        return dispose;
    }

    public void setDispose(Boolean dispose) {
        this.dispose = dispose;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getDisposetime() {
        return disposetime;
    }

    public void setDisposetime(LocalDateTime disposetime) {
        this.disposetime = disposetime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Payapply{" +
        "id=" + id +
        ", adminid=" + adminid +
        ", name=" + name +
        ", tel=" + tel +
        ", applytime=" + applytime +
        ", dispose=" + dispose +
        ", remark=" + remark +
        ", disposetime=" + disposetime +
        "}";
    }
}
