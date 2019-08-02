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
public class Giveflower extends Model<Giveflower> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String userid;

    private BigDecimal wxpaymoney;

    private String leavemsg;

    private Boolean paystate;

    private LocalDateTime paytime;

    private String payid;


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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public BigDecimal getWxpaymoney() {
        return wxpaymoney;
    }

    public void setWxpaymoney(BigDecimal wxpaymoney) {
        this.wxpaymoney = wxpaymoney;
    }

    public String getLeavemsg() {
        return leavemsg;
    }

    public void setLeavemsg(String leavemsg) {
        this.leavemsg = leavemsg;
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

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Giveflower{" +
        "id=" + id +
        ", barid=" + barid +
        ", userid=" + userid +
        ", wxpaymoney=" + wxpaymoney +
        ", leavemsg=" + leavemsg +
        ", paystate=" + paystate +
        ", paytime=" + paytime +
        ", payid=" + payid +
        "}";
    }
}
