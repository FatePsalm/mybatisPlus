package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 酒吧提现记录表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class Presentrecord extends Model<Presentrecord> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 提现金额
     */
    private BigDecimal money;

    /**
     * 创建时间
     */
    private LocalDateTime time;

    /**
     * 提现卡号
     */
    private String bankcard;

    /**
     * 提现姓名
     */
    private String name;

    /**
     * 提现银行账户类型，默认为支付宝
     */
    private String banktype;

    /**
     * 是否是代理商的结算
     */
    private Boolean agent;

    /**
     * 转账备注
     */
    private String remark;

    /**
     * 结算类型： 0、微喵手动结算；1、微喵自动结算
     */
    private Integer type;

    /**
     * 提现手续费
     */
    private BigDecimal fee;


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

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBanktype() {
        return banktype;
    }

    public void setBanktype(String banktype) {
        this.banktype = banktype;
    }

    public Boolean getAgent() {
        return agent;
    }

    public void setAgent(Boolean agent) {
        this.agent = agent;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Presentrecord{" +
        "id=" + id +
        ", barid=" + barid +
        ", money=" + money +
        ", time=" + time +
        ", bankcard=" + bankcard +
        ", name=" + name +
        ", banktype=" + banktype +
        ", agent=" + agent +
        ", remark=" + remark +
        ", type=" + type +
        ", fee=" + fee +
        "}";
    }
}
