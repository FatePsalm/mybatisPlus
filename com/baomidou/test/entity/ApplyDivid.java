package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 分成申请表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class ApplyDivid extends Model<ApplyDivid> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 申请的集团分成
     */
    @TableField("groupDivid")
    private BigDecimal groupDivid;

    /**
     * 申请的代理分成
     */
    @TableField("agentDivid")
    private BigDecimal agentDivid;

    /**
     * 申请的酒吧分成
     */
    @TableField("barbaseDivid")
    private BigDecimal barbaseDivid;

    /**
     * 申请的微喵分成
     */
    @TableField("wemewDivid")
    private BigDecimal wemewDivid;

    /**
     * 申请状态
     */
    private Integer status;

    /**
     * 申请时间
     */
    private LocalDateTime time;

    /**
     * 申请的现场管理里者json数据
     */
    private String waiterdatajson;

    /**
     * 申请人id
     */
    private String adminid;

    /**
     * 代理id
     */
    @TableField("agentId")
    private String agentId;

    /**
     * 类型 0代理 1集团 2市场专员
     */
    private Integer type;

    /**
     * 0绑定1分成
     */
    private Integer isb;

    @TableField("companyId")
    private String companyId;


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

    public BigDecimal getGroupDivid() {
        return groupDivid;
    }

    public void setGroupDivid(BigDecimal groupDivid) {
        this.groupDivid = groupDivid;
    }

    public BigDecimal getAgentDivid() {
        return agentDivid;
    }

    public void setAgentDivid(BigDecimal agentDivid) {
        this.agentDivid = agentDivid;
    }

    public BigDecimal getBarbaseDivid() {
        return barbaseDivid;
    }

    public void setBarbaseDivid(BigDecimal barbaseDivid) {
        this.barbaseDivid = barbaseDivid;
    }

    public BigDecimal getWemewDivid() {
        return wemewDivid;
    }

    public void setWemewDivid(BigDecimal wemewDivid) {
        this.wemewDivid = wemewDivid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getWaiterdatajson() {
        return waiterdatajson;
    }

    public void setWaiterdatajson(String waiterdatajson) {
        this.waiterdatajson = waiterdatajson;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIsb() {
        return isb;
    }

    public void setIsb(Integer isb) {
        this.isb = isb;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ApplyDivid{" +
        "id=" + id +
        ", barid=" + barid +
        ", groupDivid=" + groupDivid +
        ", agentDivid=" + agentDivid +
        ", barbaseDivid=" + barbaseDivid +
        ", wemewDivid=" + wemewDivid +
        ", status=" + status +
        ", time=" + time +
        ", waiterdatajson=" + waiterdatajson +
        ", adminid=" + adminid +
        ", agentId=" + agentId +
        ", type=" + type +
        ", isb=" + isb +
        ", companyId=" + companyId +
        "}";
    }
}
