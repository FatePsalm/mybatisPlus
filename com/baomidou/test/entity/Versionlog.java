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
public class Versionlog extends Model<Versionlog> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String number;

    private String modification;

    private LocalDateTime createtime;

    private String adminid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModification() {
        return modification;
    }

    public void setModification(String modification) {
        this.modification = modification;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Versionlog{" +
        "id=" + id +
        ", number=" + number +
        ", modification=" + modification +
        ", createtime=" + createtime +
        ", adminid=" + adminid +
        "}";
    }
}
