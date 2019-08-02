package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class Alipayorder extends Model<Alipayorder> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private LocalDateTime applytime;

    private BigDecimal paymoney;

    private Boolean paystate;

    private LocalDateTime paytime;

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

    public LocalDateTime getApplytime() {
        return applytime;
    }

    public void setApplytime(LocalDateTime applytime) {
        this.applytime = applytime;
    }

    public BigDecimal getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(BigDecimal paymoney) {
        this.paymoney = paymoney;
    }

    public Boolean getPaystate() {
        return paystate;
    }

    public void setPaystate(Boolean paystate) {
        this.paystate = paystate;
    }

    public LocalDateTime getPaytime() {
        return paytime;
    }

    public void setPaytime(LocalDateTime paytime) {
        this.paytime = paytime;
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
        return "Alipayorder{" +
        "id=" + id +
        ", barid=" + barid +
        ", applytime=" + applytime +
        ", paymoney=" + paymoney +
        ", paystate=" + paystate +
        ", paytime=" + paytime +
        ", month=" + month +
        ", givemonth=" + givemonth +
        "}";
    }
}
