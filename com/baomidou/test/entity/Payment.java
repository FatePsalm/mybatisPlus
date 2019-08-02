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
public class Payment extends Model<Payment> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private LocalDateTime paytime;

    private Integer paytype;

    private BigDecimal paymoney;

    private LocalDateTime vipbegintime;

    private LocalDateTime vipendtime;

    private BigDecimal monthprice;

    @TableField("MONTH")
    private Integer month;

    private Integer givemonth;


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

    public LocalDateTime getPaytime() {
        return paytime;
    }

    public void setPaytime(LocalDateTime paytime) {
        this.paytime = paytime;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public BigDecimal getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(BigDecimal paymoney) {
        this.paymoney = paymoney;
    }

    public LocalDateTime getVipbegintime() {
        return vipbegintime;
    }

    public void setVipbegintime(LocalDateTime vipbegintime) {
        this.vipbegintime = vipbegintime;
    }

    public LocalDateTime getVipendtime() {
        return vipendtime;
    }

    public void setVipendtime(LocalDateTime vipendtime) {
        this.vipendtime = vipendtime;
    }

    public BigDecimal getMonthprice() {
        return monthprice;
    }

    public void setMonthprice(BigDecimal monthprice) {
        this.monthprice = monthprice;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getGivemonth() {
        return givemonth;
    }

    public void setGivemonth(Integer givemonth) {
        this.givemonth = givemonth;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Payment{" +
        "id=" + id +
        ", barid=" + barid +
        ", paytime=" + paytime +
        ", paytype=" + paytype +
        ", paymoney=" + paymoney +
        ", vipbegintime=" + vipbegintime +
        ", vipendtime=" + vipendtime +
        ", monthprice=" + monthprice +
        ", month=" + month +
        ", givemonth=" + givemonth +
        "}";
    }
}
