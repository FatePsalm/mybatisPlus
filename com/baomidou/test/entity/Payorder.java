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
public class Payorder extends Model<Payorder> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private String id;

    /**
     * 用户id
     */
    @TableField("userId")
    private String userId;

    /**
     * 吧酒id
     */
    @TableField("barId")
    private String barId;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 酒吧分成金额
     */
    private BigDecimal barmoney;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 订单号
     */
    @TableField("payId")
    private String payId;

    /**
     * 微信订单号
     */
    @TableField("transactionId")
    private String transactionId;

    /**
     * 支付状态：0待支付，1已经支付
     */
    private Integer paystate;

    /**
     * 支付时间
     */
    @TableField("payTime")
    private LocalDateTime payTime;

    /**
     * 随机字符串
     */
    private String attach;

    /**
     * 订单类型
     */
    private Integer type;

    /**
     * 莱米支付id
     */
    @TableField("lamicId")
    private String lamicId;

    /**
     * 莱米支付莱米订单号，2018年12月24日之后莱米支付数据按此字段为准
     */
    private String lamicTradeNo;

    /**
     * 支付类型
     */
    private Integer paytype;

    private BigDecimal wxpaymoney;

    private BigDecimal miaopaymoney;

    private BigDecimal cashpaymoney;

    /**
     * 信用币金额
     */
    @TableField("currencyMoney")
    private BigDecimal currencyMoney;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBarId() {
        return barId;
    }

    public void setBarId(String barId) {
        this.barId = barId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getBarmoney() {
        return barmoney;
    }

    public void setBarmoney(BigDecimal barmoney) {
        this.barmoney = barmoney;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getPaystate() {
        return paystate;
    }

    public void setPaystate(Integer paystate) {
        this.paystate = paystate;
    }

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLamicId() {
        return lamicId;
    }

    public void setLamicId(String lamicId) {
        this.lamicId = lamicId;
    }

    public String getLamicTradeNo() {
        return lamicTradeNo;
    }

    public void setLamicTradeNo(String lamicTradeNo) {
        this.lamicTradeNo = lamicTradeNo;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public BigDecimal getWxpaymoney() {
        return wxpaymoney;
    }

    public void setWxpaymoney(BigDecimal wxpaymoney) {
        this.wxpaymoney = wxpaymoney;
    }

    public BigDecimal getMiaopaymoney() {
        return miaopaymoney;
    }

    public void setMiaopaymoney(BigDecimal miaopaymoney) {
        this.miaopaymoney = miaopaymoney;
    }

    public BigDecimal getCashpaymoney() {
        return cashpaymoney;
    }

    public void setCashpaymoney(BigDecimal cashpaymoney) {
        this.cashpaymoney = cashpaymoney;
    }

    public BigDecimal getCurrencyMoney() {
        return currencyMoney;
    }

    public void setCurrencyMoney(BigDecimal currencyMoney) {
        this.currencyMoney = currencyMoney;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Payorder{" +
        "id=" + id +
        ", userId=" + userId +
        ", barId=" + barId +
        ", price=" + price +
        ", barmoney=" + barmoney +
        ", createTime=" + createTime +
        ", payId=" + payId +
        ", transactionId=" + transactionId +
        ", paystate=" + paystate +
        ", payTime=" + payTime +
        ", attach=" + attach +
        ", type=" + type +
        ", lamicId=" + lamicId +
        ", lamicTradeNo=" + lamicTradeNo +
        ", paytype=" + paytype +
        ", wxpaymoney=" + wxpaymoney +
        ", miaopaymoney=" + miaopaymoney +
        ", cashpaymoney=" + cashpaymoney +
        ", currencyMoney=" + currencyMoney +
        "}";
    }
}
