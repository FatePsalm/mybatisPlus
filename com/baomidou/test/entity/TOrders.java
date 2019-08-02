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
public class TOrders extends Model<TOrders> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String barid;

    private String suitid;

    private LocalDateTime createtime;

    private String orderproof;

    private LocalDateTime expensetime;

    private String waiterid;

    private BigDecimal money;

    private String nums;

    private Integer states;

    private LocalDateTime paytime;

    private Boolean paystate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getSuitid() {
        return suitid;
    }

    public void setSuitid(String suitid) {
        this.suitid = suitid;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public String getOrderproof() {
        return orderproof;
    }

    public void setOrderproof(String orderproof) {
        this.orderproof = orderproof;
    }

    public LocalDateTime getExpensetime() {
        return expensetime;
    }

    public void setExpensetime(LocalDateTime expensetime) {
        this.expensetime = expensetime;
    }

    public String getWaiterid() {
        return waiterid;
    }

    public void setWaiterid(String waiterid) {
        this.waiterid = waiterid;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getNums() {
        return nums;
    }

    public void setNums(String nums) {
        this.nums = nums;
    }

    public Integer getStates() {
        return states;
    }

    public void setStates(Integer states) {
        this.states = states;
    }

    public LocalDateTime getPaytime() {
        return paytime;
    }

    public void setPaytime(LocalDateTime paytime) {
        this.paytime = paytime;
    }

    public Boolean getPaystate() {
        return paystate;
    }

    public void setPaystate(Boolean paystate) {
        this.paystate = paystate;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TOrders{" +
        "id=" + id +
        ", userid=" + userid +
        ", barid=" + barid +
        ", suitid=" + suitid +
        ", createtime=" + createtime +
        ", orderproof=" + orderproof +
        ", expensetime=" + expensetime +
        ", waiterid=" + waiterid +
        ", money=" + money +
        ", nums=" + nums +
        ", states=" + states +
        ", paytime=" + paytime +
        ", paystate=" + paystate +
        "}";
    }
}
