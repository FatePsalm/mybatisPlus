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
public class Usercash extends Model<Usercash> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String orderid;

    /**
     * 提现金额
     */
    private Integer dmoney;

    /**
     * 提现时间
     */
    private LocalDateTime dtime;

    private Integer status;

    private String mchbillno;

    /**
     * 体现类型：0：表示发红包提现，1：表示企业付款提现
     */
    private Integer type;

    /**
     * 订单信息：如果提现失败，则存储失败 原因；
     */
    private String message;

    /**
     * 提现来源
     */
    private Integer sourceType;

    /**
     * 提现手续费
     */
    private BigDecimal fee;


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

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public Integer getDmoney() {
        return dmoney;
    }

    public void setDmoney(Integer dmoney) {
        this.dmoney = dmoney;
    }

    public LocalDateTime getDtime() {
        return dtime;
    }

    public void setDtime(LocalDateTime dtime) {
        this.dtime = dtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMchbillno() {
        return mchbillno;
    }

    public void setMchbillno(String mchbillno) {
        this.mchbillno = mchbillno;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Usercash{" +
        "id=" + id +
        ", userid=" + userid +
        ", orderid=" + orderid +
        ", dmoney=" + dmoney +
        ", dtime=" + dtime +
        ", status=" + status +
        ", mchbillno=" + mchbillno +
        ", type=" + type +
        ", message=" + message +
        ", sourceType=" + sourceType +
        ", fee=" + fee +
        "}";
    }
}
