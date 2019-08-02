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
public class Refundrecord extends Model<Refundrecord> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private String id;

    /**
     * 退款金额
     */
    private BigDecimal money;

    /**
     * 用户id
     */
    @TableField("userId")
    private String userId;

    /**
     * 酒吧id
     */
    @TableField("barId")
    private String barId;

    /**
     * 退款时间
     */
    @TableField("refundTime")
    private LocalDateTime refundTime;

    /**
     * 红包id
     */
    @TableField("objId")
    private String objId;

    /**
     * 退款类型
     */
    private Integer type;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
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

    public LocalDateTime getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(LocalDateTime refundTime) {
        this.refundTime = refundTime;
    }

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Refundrecord{" +
        "id=" + id +
        ", money=" + money +
        ", userId=" + userId +
        ", barId=" + barId +
        ", refundTime=" + refundTime +
        ", objId=" + objId +
        ", type=" + type +
        "}";
    }
}
