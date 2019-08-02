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
public class UserbpProcess extends Model<UserbpProcess> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String barid;

    /**
     * 过程id
     */
    private String processid;

    private String stype;

    private Integer mcount;

    @TableField("isAdmin")
    private Boolean admin;

    /**
     * 时间
     */
    private LocalDateTime time;

    private String type;

    /**
     * 霸屏行为开始或结束
     */
    private String processtype;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getProcessid() {
        return processid;
    }

    public void setProcessid(String processid) {
        this.processid = processid;
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }

    public Integer getMcount() {
        return mcount;
    }

    public void setMcount(Integer mcount) {
        this.mcount = mcount;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProcesstype() {
        return processtype;
    }

    public void setProcesstype(String processtype) {
        this.processtype = processtype;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserbpProcess{" +
        "id=" + id +
        ", userid=" + userid +
        ", barid=" + barid +
        ", processid=" + processid +
        ", stype=" + stype +
        ", mcount=" + mcount +
        ", admin=" + admin +
        ", time=" + time +
        ", type=" + type +
        ", processtype=" + processtype +
        "}";
    }
}
