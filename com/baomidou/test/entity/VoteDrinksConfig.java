package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 酒水预存-套餐配置 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class VoteDrinksConfig extends Model<VoteDrinksConfig> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 酒吧ID
     */
    private String bid;

    /**
     * 主题ID
     */
    private String cid;

    /**
     * 酒水预存图片地址
     */
    private String dringkImg;

    /**
     * 酒水预存说明
     */
    private String dringkNote;

    /**
     * 酒水预存积分
     */
    private Integer dringkNumber;

    /**
     * 创建时间
     */
    private LocalDateTime creationTime;

    /**
     * 0-关闭  1-开启
     */
    private Boolean state;

    /**
     * 开始时间
     */
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getDringkImg() {
        return dringkImg;
    }

    public void setDringkImg(String dringkImg) {
        this.dringkImg = dringkImg;
    }

    public String getDringkNote() {
        return dringkNote;
    }

    public void setDringkNote(String dringkNote) {
        this.dringkNote = dringkNote;
    }

    public Integer getDringkNumber() {
        return dringkNumber;
    }

    public void setDringkNumber(Integer dringkNumber) {
        this.dringkNumber = dringkNumber;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "VoteDrinksConfig{" +
        "id=" + id +
        ", bid=" + bid +
        ", cid=" + cid +
        ", dringkImg=" + dringkImg +
        ", dringkNote=" + dringkNote +
        ", dringkNumber=" + dringkNumber +
        ", creationTime=" + creationTime +
        ", state=" + state +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        "}";
    }
}
