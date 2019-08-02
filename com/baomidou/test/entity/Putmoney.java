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
public class Putmoney extends Model<Putmoney> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String userid;

    private String payid;

    private LocalDateTime applytime;

    private LocalDateTime paytime;

    private Boolean paystate;

    private BigDecimal paymoney;

    private BigDecimal fakemoney;

    private String attach;

    private String transactionId;

    private Integer paytype;

    private Boolean del;

    private Boolean wemew;

    private String wxerrormsg;


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

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid;
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

    public Boolean getPaystate() {
        return paystate;
    }

    public void setPaystate(Boolean paystate) {
        this.paystate = paystate;
    }

    public BigDecimal getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(BigDecimal paymoney) {
        this.paymoney = paymoney;
    }

    public BigDecimal getFakemoney() {
        return fakemoney;
    }

    public void setFakemoney(BigDecimal fakemoney) {
        this.fakemoney = fakemoney;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    public Boolean getWemew() {
        return wemew;
    }

    public void setWemew(Boolean wemew) {
        this.wemew = wemew;
    }

    public String getWxerrormsg() {
        return wxerrormsg;
    }

    public void setWxerrormsg(String wxerrormsg) {
        this.wxerrormsg = wxerrormsg;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Putmoney{" +
        "id=" + id +
        ", barid=" + barid +
        ", userid=" + userid +
        ", payid=" + payid +
        ", applytime=" + applytime +
        ", paytime=" + paytime +
        ", paystate=" + paystate +
        ", paymoney=" + paymoney +
        ", fakemoney=" + fakemoney +
        ", attach=" + attach +
        ", transactionId=" + transactionId +
        ", paytype=" + paytype +
        ", del=" + del +
        ", wemew=" + wemew +
        ", wxerrormsg=" + wxerrormsg +
        "}";
    }
}
