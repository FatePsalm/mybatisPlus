package com.baomidou.test.entity;

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
public class Wxmsg extends Model<Wxmsg> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String content;

    private String signType;

    private String inputCharset;

    @TableField("SIGN")
    private String sign;

    private String tradeMode;

    private String tradeState;

    private String partner;

    private String bankType;

    private String bankBillno;

    private String totalFee;

    private String feeType;

    private String notifyId;

    private String transactionId;

    private String outTradeNo;

    private String attach;

    private String timeEnd;

    private String transportFee;

    private String productFee;

    private String discount;

    private LocalDateTime time;

    /**
     * 订单类型；0、微喵微信支付；1、微喵小程序支付；2、亚拉拉特支付
     */
    private Integer type;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getInputCharset() {
        return inputCharset;
    }

    public void setInputCharset(String inputCharset) {
        this.inputCharset = inputCharset;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTradeMode() {
        return tradeMode;
    }

    public void setTradeMode(String tradeMode) {
        this.tradeMode = tradeMode;
    }

    public String getTradeState() {
        return tradeState;
    }

    public void setTradeState(String tradeState) {
        this.tradeState = tradeState;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getBankBillno() {
        return bankBillno;
    }

    public void setBankBillno(String bankBillno) {
        this.bankBillno = bankBillno;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(String notifyId) {
        this.notifyId = notifyId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getTransportFee() {
        return transportFee;
    }

    public void setTransportFee(String transportFee) {
        this.transportFee = transportFee;
    }

    public String getProductFee() {
        return productFee;
    }

    public void setProductFee(String productFee) {
        this.productFee = productFee;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
        return "Wxmsg{" +
        "id=" + id +
        ", content=" + content +
        ", signType=" + signType +
        ", inputCharset=" + inputCharset +
        ", sign=" + sign +
        ", tradeMode=" + tradeMode +
        ", tradeState=" + tradeState +
        ", partner=" + partner +
        ", bankType=" + bankType +
        ", bankBillno=" + bankBillno +
        ", totalFee=" + totalFee +
        ", feeType=" + feeType +
        ", notifyId=" + notifyId +
        ", transactionId=" + transactionId +
        ", outTradeNo=" + outTradeNo +
        ", attach=" + attach +
        ", timeEnd=" + timeEnd +
        ", transportFee=" + transportFee +
        ", productFee=" + productFee +
        ", discount=" + discount +
        ", time=" + time +
        ", type=" + type +
        ", lamicTradeNo=" + lamicTradeNo +
        "}";
    }
}
