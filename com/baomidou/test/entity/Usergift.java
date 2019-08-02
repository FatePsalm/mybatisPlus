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
public class Usergift extends Model<Usergift> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String touserid;

    /**
     * 礼物id
     */
    private String giftid;

    private String barid;

    private LocalDateTime time;

    private LocalDateTime paytime;

    private Integer paystate;

    private BigDecimal price;

    private Integer paytype;

    private String payid;

    private String transactionid;

    private String attach;

    private String msg;

    private BigDecimal mymoney;

    /**
     * 使用红包支付金额
     */
    private BigDecimal redbag;

    private BigDecimal cashbag;

    private Integer num;

    private String talkid;

    /**
     * 使用礼物库礼物数量
     */
    @TableField("libNum")
    private Integer libNum;

    /**
     * 1.来源微喵 2.来源电子桌牌
     */
    private Integer source;

    /**
     * 莱米支付莱米订单号
     */
    private String lamicTradeNo;


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

    public String getTouserid() {
        return touserid;
    }

    public void setTouserid(String touserid) {
        this.touserid = touserid;
    }

    public String getGiftid() {
        return giftid;
    }

    public void setGiftid(String giftid) {
        this.giftid = giftid;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public LocalDateTime getPaytime() {
        return paytime;
    }

    public void setPaytime(LocalDateTime paytime) {
        this.paytime = paytime;
    }

    public Integer getPaystate() {
        return paystate;
    }

    public void setPaystate(Integer paystate) {
        this.paystate = paystate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public BigDecimal getMymoney() {
        return mymoney;
    }

    public void setMymoney(BigDecimal mymoney) {
        this.mymoney = mymoney;
    }

    public BigDecimal getRedbag() {
        return redbag;
    }

    public void setRedbag(BigDecimal redbag) {
        this.redbag = redbag;
    }

    public BigDecimal getCashbag() {
        return cashbag;
    }

    public void setCashbag(BigDecimal cashbag) {
        this.cashbag = cashbag;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getTalkid() {
        return talkid;
    }

    public void setTalkid(String talkid) {
        this.talkid = talkid;
    }

    public Integer getLibNum() {
        return libNum;
    }

    public void setLibNum(Integer libNum) {
        this.libNum = libNum;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getLamicTradeNo() {
        return lamicTradeNo;
    }

    public void setLamicTradeNo(String lamicTradeNo) {
        this.lamicTradeNo = lamicTradeNo;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Usergift{" +
        "id=" + id +
        ", userid=" + userid +
        ", touserid=" + touserid +
        ", giftid=" + giftid +
        ", barid=" + barid +
        ", time=" + time +
        ", paytime=" + paytime +
        ", paystate=" + paystate +
        ", price=" + price +
        ", paytype=" + paytype +
        ", payid=" + payid +
        ", transactionid=" + transactionid +
        ", attach=" + attach +
        ", msg=" + msg +
        ", mymoney=" + mymoney +
        ", redbag=" + redbag +
        ", cashbag=" + cashbag +
        ", num=" + num +
        ", talkid=" + talkid +
        ", libNum=" + libNum +
        ", source=" + source +
        ", lamicTradeNo=" + lamicTradeNo +
        "}";
    }
}
