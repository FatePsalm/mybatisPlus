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
public class WangPlayLight extends Model<WangPlayLight> {

    private static final long serialVersionUID = 1L;

    private String id;

    @TableField("eqId")
    private String eqId;

    private String userid;

    private LocalDateTime time;

    private String sitnum;

    private String barid;

    private Integer source;

    private Integer status;

    private Integer theme;

    private String orderid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEqId() {
        return eqId;
    }

    public void setEqId(String eqId) {
        this.eqId = eqId;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getSitnum() {
        return sitnum;
    }

    public void setSitnum(String sitnum) {
        this.sitnum = sitnum;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTheme() {
        return theme;
    }

    public void setTheme(Integer theme) {
        this.theme = theme;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "WangPlayLight{" +
        "id=" + id +
        ", eqId=" + eqId +
        ", userid=" + userid +
        ", time=" + time +
        ", sitnum=" + sitnum +
        ", barid=" + barid +
        ", source=" + source +
        ", status=" + status +
        ", theme=" + theme +
        ", orderid=" + orderid +
        "}";
    }
}
