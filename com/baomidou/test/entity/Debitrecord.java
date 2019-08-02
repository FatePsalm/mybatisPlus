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
public class Debitrecord extends Model<Debitrecord> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private BigDecimal money;

    private Integer carnumber;

    private LocalDateTime time;

    private String barid;

    private Integer type;

    private String operatorid;


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

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(Integer carnumber) {
        this.carnumber = carnumber;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Debitrecord{" +
        "id=" + id +
        ", userid=" + userid +
        ", money=" + money +
        ", carnumber=" + carnumber +
        ", time=" + time +
        ", barid=" + barid +
        ", type=" + type +
        ", operatorid=" + operatorid +
        "}";
    }
}
