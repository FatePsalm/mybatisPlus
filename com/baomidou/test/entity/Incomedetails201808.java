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
public class Incomedetails201808 extends Model<Incomedetails201808> {

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
     * 某笔交易的主键id
     */
    @TableField("objId")
    private String objId;

    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 本次税前收入
     */
    private BigDecimal pretax;

    /**
     * 税额
     */
    private BigDecimal se;


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

    public String getObjId() {
        return objId;
    }

    public void setObjId(String objId) {
        this.objId = objId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getPretax() {
        return pretax;
    }

    public void setPretax(BigDecimal pretax) {
        this.pretax = pretax;
    }

    public BigDecimal getSe() {
        return se;
    }

    public void setSe(BigDecimal se) {
        this.se = se;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Incomedetails201808{" +
        "id=" + id +
        ", userId=" + userId +
        ", barId=" + barId +
        ", objId=" + objId +
        ", money=" + money +
        ", createTime=" + createTime +
        ", type=" + type +
        ", pretax=" + pretax +
        ", se=" + se +
        "}";
    }
}
