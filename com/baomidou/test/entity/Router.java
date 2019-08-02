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
public class Router extends Model<Router> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    @TableField("onlineNum")
    private Integer onlineNum;

    private String tel;

    @TableField("twoCodeurl")
    private String twoCodeurl;

    @TableField("adminId")
    private String adminId;

    @TableField("createTime")
    private LocalDateTime createTime;

    private Integer status;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Integer getOnlineNum() {
        return onlineNum;
    }

    public void setOnlineNum(Integer onlineNum) {
        this.onlineNum = onlineNum;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTwoCodeurl() {
        return twoCodeurl;
    }

    public void setTwoCodeurl(String twoCodeurl) {
        this.twoCodeurl = twoCodeurl;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Router{" +
        "id=" + id +
        ", barid=" + barid +
        ", onlineNum=" + onlineNum +
        ", tel=" + tel +
        ", twoCodeurl=" + twoCodeurl +
        ", adminId=" + adminId +
        ", createTime=" + createTime +
        ", status=" + status +
        "}";
    }
}
