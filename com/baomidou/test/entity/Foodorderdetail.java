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
public class Foodorderdetail extends Model<Foodorderdetail> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String foodorderid;

    private String fooddetailid;

    private Integer num;

    private BigDecimal money;

    private LocalDateTime time;

    private String userid;

    private String jgpj;

    private String fwpj;

    private String wdpj;

    private LocalDateTime pjtime;

    private Boolean sfpj;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoodorderid() {
        return foodorderid;
    }

    public void setFoodorderid(String foodorderid) {
        this.foodorderid = foodorderid;
    }

    public String getFooddetailid() {
        return fooddetailid;
    }

    public void setFooddetailid(String fooddetailid) {
        this.fooddetailid = fooddetailid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getJgpj() {
        return jgpj;
    }

    public void setJgpj(String jgpj) {
        this.jgpj = jgpj;
    }

    public String getFwpj() {
        return fwpj;
    }

    public void setFwpj(String fwpj) {
        this.fwpj = fwpj;
    }

    public String getWdpj() {
        return wdpj;
    }

    public void setWdpj(String wdpj) {
        this.wdpj = wdpj;
    }

    public LocalDateTime getPjtime() {
        return pjtime;
    }

    public void setPjtime(LocalDateTime pjtime) {
        this.pjtime = pjtime;
    }

    public Boolean getSfpj() {
        return sfpj;
    }

    public void setSfpj(Boolean sfpj) {
        this.sfpj = sfpj;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Foodorderdetail{" +
        "id=" + id +
        ", foodorderid=" + foodorderid +
        ", fooddetailid=" + fooddetailid +
        ", num=" + num +
        ", money=" + money +
        ", time=" + time +
        ", userid=" + userid +
        ", jgpj=" + jgpj +
        ", fwpj=" + fwpj +
        ", wdpj=" + wdpj +
        ", pjtime=" + pjtime +
        ", sfpj=" + sfpj +
        "}";
    }
}
