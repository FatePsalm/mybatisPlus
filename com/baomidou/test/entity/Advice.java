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
public class Advice extends Model<Advice> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String adminid;

    private String content;

    @TableField("TIME")
    private LocalDateTime time;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 举报人
     */
    private String ruid;

    /**
     * 被举报人id
     */
    private String rduid;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 模板消息发送时间
     */
    private LocalDateTime sendTime;

    /**
     * 发送粉丝数量
     */
    private Integer fansNum;


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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getRuid() {
        return ruid;
    }

    public void setRuid(String ruid) {
        this.ruid = ruid;
    }

    public String getRduid() {
        return rduid;
    }

    public void setRduid(String rduid) {
        this.rduid = rduid;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getFansNum() {
        return fansNum;
    }

    public void setFansNum(Integer fansNum) {
        this.fansNum = fansNum;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Advice{" +
        "id=" + id +
        ", adminid=" + adminid +
        ", content=" + content +
        ", time=" + time +
        ", remarks=" + remarks +
        ", ruid=" + ruid +
        ", rduid=" + rduid +
        ", barid=" + barid +
        ", type=" + type +
        ", sendTime=" + sendTime +
        ", fansNum=" + fansNum +
        "}";
    }
}
