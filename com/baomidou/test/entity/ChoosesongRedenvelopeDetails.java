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
public class ChoosesongRedenvelopeDetails extends Model<ChoosesongRedenvelopeDetails> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 用户ID
     */
    @TableField("userId")
    private String userId;

    /**
     * 订单ID
     */
    @TableField("pascreenId")
    private String pascreenId;

    /**
     * 点歌红包活动id
     */
    @TableField("choosesongRedenvelopeId")
    private String choosesongRedenvelopeId;

    /**
     * 状态：1待完成 , 2已完成
     */
    private Integer state;

    /**
     * 1 未阅读  2 已阅读
     */
    @TableField("popupState")
    private Integer popupState;

    /**
     * 创建时间
     */
    @TableField("creationTime")
    private LocalDateTime creationTime;

    /**
     * 1 为红包  2为首参
     */
    private Integer type;

    /**
     * 酒吧ID
     */
    @TableField("barId")
    private String barId;

    /**
     * 0 未领取  1 领取
     */
    private Boolean ifopen;


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

    public String getPascreenId() {
        return pascreenId;
    }

    public void setPascreenId(String pascreenId) {
        this.pascreenId = pascreenId;
    }

    public String getChoosesongRedenvelopeId() {
        return choosesongRedenvelopeId;
    }

    public void setChoosesongRedenvelopeId(String choosesongRedenvelopeId) {
        this.choosesongRedenvelopeId = choosesongRedenvelopeId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getPopupState() {
        return popupState;
    }

    public void setPopupState(Integer popupState) {
        this.popupState = popupState;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getBarId() {
        return barId;
    }

    public void setBarId(String barId) {
        this.barId = barId;
    }

    public Boolean getIfopen() {
        return ifopen;
    }

    public void setIfopen(Boolean ifopen) {
        this.ifopen = ifopen;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ChoosesongRedenvelopeDetails{" +
        "id=" + id +
        ", userId=" + userId +
        ", pascreenId=" + pascreenId +
        ", choosesongRedenvelopeId=" + choosesongRedenvelopeId +
        ", state=" + state +
        ", popupState=" + popupState +
        ", creationTime=" + creationTime +
        ", type=" + type +
        ", barId=" + barId +
        ", ifopen=" + ifopen +
        "}";
    }
}
