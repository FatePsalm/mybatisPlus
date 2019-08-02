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
public class UserMount extends Model<UserMount> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 座驾ID
     */
    private String mountid;

    /**
     * 用户id
     */
    private String userid;

    /**
     * 支付状态
     */
    private Integer paystate;

    /**
     * 天数
     */
    private Integer days;

    /**
     * 价格
     */
    private Double price;

    /**
     * 过期时间
     */
    private LocalDateTime expire;

    /**
     * 创建时间
     */
    private LocalDateTime time;

    /**
     * 状态（0：未过期，1：已过期）
     */
    private Integer state;

    private String orderid;

    /**
     * 0：购买； 1：续费
     */
    private Integer type;

    /**
     * 是否使用
     */
    private Boolean use;

    /**
     * 赠送者id
     */
    private String senderid;

    /**
     * 优惠券信息 520活动是graduationActivityid
     */
    private String couponsid;

    /**
     * 订单类型：0座驾，1表情包，2个性标签
     */
    @TableField("orderType")
    private Integer orderType;

    /**
     * 红包支付价格
     */
    private BigDecimal redbag;

    /**
     * 现金余额支付价格
     */
    private BigDecimal cashbag;

    /**
     * 支付来源
     */
    private String source;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMountid() {
        return mountid;
    }

    public void setMountid(String mountid) {
        this.mountid = mountid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getPaystate() {
        return paystate;
    }

    public void setPaystate(Integer paystate) {
        this.paystate = paystate;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDateTime getExpire() {
        return expire;
    }

    public void setExpire(LocalDateTime expire) {
        this.expire = expire;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getUse() {
        return use;
    }

    public void setUse(Boolean use) {
        this.use = use;
    }

    public String getSenderid() {
        return senderid;
    }

    public void setSenderid(String senderid) {
        this.senderid = senderid;
    }

    public String getCouponsid() {
        return couponsid;
    }

    public void setCouponsid(String couponsid) {
        this.couponsid = couponsid;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserMount{" +
        "id=" + id +
        ", mountid=" + mountid +
        ", userid=" + userid +
        ", paystate=" + paystate +
        ", days=" + days +
        ", price=" + price +
        ", expire=" + expire +
        ", time=" + time +
        ", state=" + state +
        ", orderid=" + orderid +
        ", type=" + type +
        ", use=" + use +
        ", senderid=" + senderid +
        ", couponsid=" + couponsid +
        ", orderType=" + orderType +
        ", redbag=" + redbag +
        ", cashbag=" + cashbag +
        ", source=" + source +
        "}";
    }
}
