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
public class BapascreenAllot extends Model<BapascreenAllot> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String barid;

    /**
     * 税后收入
     */
    private BigDecimal money;

    /**
     * 税前收入
     */
    private BigDecimal pretax;

    /**
     * 订单id
     */
    private String pid;

    private String waitername;

    private LocalDateTime time;

    /**
     * 消费者id
     */
    private String customerid;


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

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getPretax() {
        return pretax;
    }

    public void setPretax(BigDecimal pretax) {
        this.pretax = pretax;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getWaitername() {
        return waitername;
    }

    public void setWaitername(String waitername) {
        this.waitername = waitername;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BapascreenAllot{" +
        "id=" + id +
        ", userid=" + userid +
        ", barid=" + barid +
        ", money=" + money +
        ", pretax=" + pretax +
        ", pid=" + pid +
        ", waitername=" + waitername +
        ", time=" + time +
        ", customerid=" + customerid +
        "}";
    }
}
