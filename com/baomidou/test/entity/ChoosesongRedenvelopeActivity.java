package com.baomidou.test.entity;

import java.math.BigDecimal;
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
public class ChoosesongRedenvelopeActivity extends Model<ChoosesongRedenvelopeActivity> {

    private static final long serialVersionUID = 1L;

    /**
     * 点歌红包主键
     */
    private String id;

    /**
     * 活动期数
     */
    private Integer issue;

    /**
     * 红包总个数
     */
    @TableField("totalNumber")
    private Integer totalNumber;

    /**
     * 当前个数
     */
    @TableField("currentNumber")
    private Integer currentNumber;

    /**
     * 奖励金额
     */
    @TableField("rewardAmount")
    private BigDecimal rewardAmount;

    /**
     * 活动开启时间
     */
    @TableField("openingTime")
    private LocalDateTime openingTime;

    /**
     * 活动结束时间
     */
    @TableField("endTime")
    private LocalDateTime endTime;

    /**
     * 创建时间
     */
    @TableField("creationTime")
    private LocalDateTime creationTime;

    /**
     * 阶段
     */
    private Integer stage;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIssue() {
        return issue;
    }

    public void setIssue(Integer issue) {
        this.issue = issue;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Integer getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(Integer currentNumber) {
        this.currentNumber = currentNumber;
    }

    public BigDecimal getRewardAmount() {
        return rewardAmount;
    }

    public void setRewardAmount(BigDecimal rewardAmount) {
        this.rewardAmount = rewardAmount;
    }

    public LocalDateTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalDateTime openingTime) {
        this.openingTime = openingTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ChoosesongRedenvelopeActivity{" +
        "id=" + id +
        ", issue=" + issue +
        ", totalNumber=" + totalNumber +
        ", currentNumber=" + currentNumber +
        ", rewardAmount=" + rewardAmount +
        ", openingTime=" + openingTime +
        ", endTime=" + endTime +
        ", creationTime=" + creationTime +
        ", stage=" + stage +
        "}";
    }
}
