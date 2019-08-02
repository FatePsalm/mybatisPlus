package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
public class Userclickstatistics6 extends Model<Userclickstatistics6> {

    private static final long serialVersionUID = 1L;

    private String id;

    @TableField("userId")
    private String userId;

    @TableField("barId")
    private String barId;

    @TableField("clickTime")
    private LocalDate clickTime;

    private String type;

    @TableField("secondaryType")
    private String secondaryType;

    private Integer frequency;


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

    public LocalDate getClickTime() {
        return clickTime;
    }

    public void setClickTime(LocalDate clickTime) {
        this.clickTime = clickTime;
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

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Userclickstatistics6{" +
        "id=" + id +
        ", userId=" + userId +
        ", barId=" + barId +
        ", clickTime=" + clickTime +
        ", type=" + type +
        ", secondaryType=" + secondaryType +
        ", frequency=" + frequency +
        "}";
    }
}
