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
public class Cashred extends Model<Cashred> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private String id;

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
     * 红包总额
     */
    @TableField("totalRed")
    private BigDecimal totalRed;

    /**
     * 红包剩余金额
     */
    @TableField("remaAmount")
    private BigDecimal remaAmount;

    /**
     * 红包总个数
     */
    @TableField("totalNumber")
    private Integer totalNumber;

    /**
     * 红包剩余个数
     */
    @TableField("remaNumber")
    private Integer remaNumber;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 留言
     */
    private String msg;

    /**
     * 订单表id
     */
    @TableField("payOrderId")
    private String payOrderId;

    /**
     * 红包类型 0 普通红包 1 消息红包
     */
    private Integer type;

    /**
     * 能抢红包的性别 0 所有 1 男性 2 女性
     */
    private Integer sex;


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

    public BigDecimal getTotalRed() {
        return totalRed;
    }

    public void setTotalRed(BigDecimal totalRed) {
        this.totalRed = totalRed;
    }

    public BigDecimal getRemaAmount() {
        return remaAmount;
    }

    public void setRemaAmount(BigDecimal remaAmount) {
        this.remaAmount = remaAmount;
    }

    public Integer getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    public Integer getRemaNumber() {
        return remaNumber;
    }

    public void setRemaNumber(Integer remaNumber) {
        this.remaNumber = remaNumber;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getPayOrderId() {
        return payOrderId;
    }

    public void setPayOrderId(String payOrderId) {
        this.payOrderId = payOrderId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Cashred{" +
        "id=" + id +
        ", userId=" + userId +
        ", barId=" + barId +
        ", totalRed=" + totalRed +
        ", remaAmount=" + remaAmount +
        ", totalNumber=" + totalNumber +
        ", remaNumber=" + remaNumber +
        ", createTime=" + createTime +
        ", msg=" + msg +
        ", payOrderId=" + payOrderId +
        ", type=" + type +
        ", sex=" + sex +
        "}";
    }
}
