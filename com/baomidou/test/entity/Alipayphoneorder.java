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
public class Alipayphoneorder extends Model<Alipayphoneorder> {

    private static final long serialVersionUID = 1L;

    private String id;

    private BigDecimal paymoney;

    private String phonenum;

    private Boolean paystate;

    private LocalDateTime applytime;

    private LocalDateTime paytime;

    private String type;

    private String name;

    private String address;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(BigDecimal paymoney) {
        this.paymoney = paymoney;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public Boolean getPaystate() {
        return paystate;
    }

    public void setPaystate(Boolean paystate) {
        this.paystate = paystate;
    }

    public LocalDateTime getApplytime() {
        return applytime;
    }

    public void setApplytime(LocalDateTime applytime) {
        this.applytime = applytime;
    }

    public LocalDateTime getPaytime() {
        return paytime;
    }

    public void setPaytime(LocalDateTime paytime) {
        this.paytime = paytime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Alipayphoneorder{" +
        "id=" + id +
        ", paymoney=" + paymoney +
        ", phonenum=" + phonenum +
        ", paystate=" + paystate +
        ", applytime=" + applytime +
        ", paytime=" + paytime +
        ", type=" + type +
        ", name=" + name +
        ", address=" + address +
        "}";
    }
}
