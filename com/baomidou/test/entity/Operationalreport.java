package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 运营日报表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class Operationalreport extends Model<Operationalreport> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * 日期
     */
    private LocalDate date;

    /**
     * 酒吧数量
     */
    @TableField("barNum")
    private Integer barNum;

    /**
     * 流水
     */
    private BigDecimal money;

    /**
     * 新增酒吧数
     */
    @TableField("addBarNum")
    private Integer addBarNum;

    /**
     * 活跃酒吧数
     */
    @TableField("activeNum")
    private Integer activeNum;

    /**
     * 开屏酒吧数
     */
    @TableField("openBpBarNum")
    private Integer openBpBarNum;

    /**
     * 支付酒吧数
     */
    @TableField("payBarNum")
    private Integer payBarNum;

    /**
     * 付费用户数
     */
    @TableField("payUserNum")
    private Integer payUserNum;

    /**
     * 付费次数(付费订单数)
     */
    @TableField("payUserTime")
    private Integer payUserTime;

    /**
     * 代理酒吧流水
     */
    @TableField("agentBarMoney")
    private BigDecimal agentBarMoney;

    /**
     * 使用人数
     */
    @TableField("useUserNum")
    private Integer useUserNum;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getBarNum() {
        return barNum;
    }

    public void setBarNum(Integer barNum) {
        this.barNum = barNum;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getAddBarNum() {
        return addBarNum;
    }

    public void setAddBarNum(Integer addBarNum) {
        this.addBarNum = addBarNum;
    }

    public Integer getActiveNum() {
        return activeNum;
    }

    public void setActiveNum(Integer activeNum) {
        this.activeNum = activeNum;
    }

    public Integer getOpenBpBarNum() {
        return openBpBarNum;
    }

    public void setOpenBpBarNum(Integer openBpBarNum) {
        this.openBpBarNum = openBpBarNum;
    }

    public Integer getPayBarNum() {
        return payBarNum;
    }

    public void setPayBarNum(Integer payBarNum) {
        this.payBarNum = payBarNum;
    }

    public Integer getPayUserNum() {
        return payUserNum;
    }

    public void setPayUserNum(Integer payUserNum) {
        this.payUserNum = payUserNum;
    }

    public Integer getPayUserTime() {
        return payUserTime;
    }

    public void setPayUserTime(Integer payUserTime) {
        this.payUserTime = payUserTime;
    }

    public BigDecimal getAgentBarMoney() {
        return agentBarMoney;
    }

    public void setAgentBarMoney(BigDecimal agentBarMoney) {
        this.agentBarMoney = agentBarMoney;
    }

    public Integer getUseUserNum() {
        return useUserNum;
    }

    public void setUseUserNum(Integer useUserNum) {
        this.useUserNum = useUserNum;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Operationalreport{" +
        "id=" + id +
        ", province=" + province +
        ", city=" + city +
        ", date=" + date +
        ", barNum=" + barNum +
        ", money=" + money +
        ", addBarNum=" + addBarNum +
        ", activeNum=" + activeNum +
        ", openBpBarNum=" + openBpBarNum +
        ", payBarNum=" + payBarNum +
        ", payUserNum=" + payUserNum +
        ", payUserTime=" + payUserTime +
        ", agentBarMoney=" + agentBarMoney +
        ", useUserNum=" + useUserNum +
        "}";
    }
}
