package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 酒吧奖励金数据表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class BarBounty extends Model<BarBounty> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 酒吧ID
     */
    private String barid;

    /**
     * 月份
     */
    private String month;

    /**
     * 月流水
     */
    private BigDecimal money;

    /**
     * 奖励金
     */
    private BigDecimal bounty;

    /**
     * 1、待结算；2、已结算；
     */
    private Integer state;

    /**
     * 发送类型：1、奖金；2、送礼；3、废弃
     */
    private Integer sendType;

    /**
     * 发放时间
     */
    private String giveMoneyDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getBounty() {
        return bounty;
    }

    public void setBounty(BigDecimal bounty) {
        this.bounty = bounty;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getSendType() {
        return sendType;
    }

    public void setSendType(Integer sendType) {
        this.sendType = sendType;
    }

    public String getGiveMoneyDate() {
        return giveMoneyDate;
    }

    public void setGiveMoneyDate(String giveMoneyDate) {
        this.giveMoneyDate = giveMoneyDate;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BarBounty{" +
        "id=" + id +
        ", barid=" + barid +
        ", month=" + month +
        ", money=" + money +
        ", bounty=" + bounty +
        ", state=" + state +
        ", sendType=" + sendType +
        ", giveMoneyDate=" + giveMoneyDate +
        "}";
    }
}
