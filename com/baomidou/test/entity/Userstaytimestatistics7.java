package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
public class Userstaytimestatistics7 extends Model<Userstaytimestatistics7> {

    private static final long serialVersionUID = 1L;

    private String id;

    @TableField("userId")
    private String userId;

    @TableField("barId")
    private String barId;

    private String type;

    @TableField("secondaryType")
    private String secondaryType;

    @TableField("todayDate")
    private LocalDate todayDate;

    @TableField("startTime")
    private LocalDateTime startTime;

    @TableField("endTime")
    private LocalDateTime endTime;

    @TableField("stayTime")
    private BigDecimal stayTime;

    @TableField("firstClick")
    private String firstClick;

    @TableField("firstClickStayTime")
    private BigDecimal firstClickStayTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBarId() {
        return barId;
    }

    public void setBarId(String barId) {
        this.barId = barId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSecondaryType() {
        return secondaryType;
    }

    public void setSecondaryType(String secondaryType) {
        this.secondaryType = secondaryType;
    }

    public LocalDate getTodayDate() {
        return todayDate;
    }

    public void setTodayDate(LocalDate todayDate) {
        this.todayDate = todayDate;
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

    public BigDecimal getStayTime() {
        return stayTime;
    }

    public void setStayTime(BigDecimal stayTime) {
        this.stayTime = stayTime;
    }

    public String getFirstClick() {
        return firstClick;
    }

    public void setFirstClick(String firstClick) {
        this.firstClick = firstClick;
    }

    public BigDecimal getFirstClickStayTime() {
        return firstClickStayTime;
    }

    public void setFirstClickStayTime(BigDecimal firstClickStayTime) {
        this.firstClickStayTime = firstClickStayTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Userstaytimestatistics7{" +
        "id=" + id +
        ", userId=" + userId +
        ", barId=" + barId +
        ", type=" + type +
        ", secondaryType=" + secondaryType +
        ", todayDate=" + todayDate +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", stayTime=" + stayTime +
        ", firstClick=" + firstClick +
        ", firstClickStayTime=" + firstClickStayTime +
        "}";
    }
}
