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
public class BarEnjoymentOrder extends Model<BarEnjoymentOrder> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 酒吧ID
     */
    @TableField("barId")
    private String barId;

    /**
     * 用户ID
     */
    private String userid;

    /**
     * 支付状态
     */
    private Integer paystate;

    /**
     * 购买天数
     */
    private Integer days;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 过期时间
     */
    private LocalDateTime expire;

    /**
     * 创建时间
     */
    private LocalDateTime time;

    /**
     * 状态（0：正常，1：过期）
     */
    private Integer state;

    /**
     * payorder表ID
     */
    @TableField("payOrderId")
    private String payOrderId;

    /**
     * 类型
     */
    private Integer type;

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

    public String getBarId() {
        return barId;
    }

    public void setBarId(String barId) {
        this.barId = barId;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
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

    public String getPayOrderId() {
        return payOrderId;
    }

    public void setPayOrderId(String payOrderId) {
        this.payOrderId = payOrderId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
        return "BarEnjoymentOrder{" +
        "id=" + id +
        ", barId=" + barId +
        ", userid=" + userid +
        ", paystate=" + paystate +
        ", days=" + days +
        ", price=" + price +
        ", expire=" + expire +
        ", time=" + time +
        ", state=" + state +
        ", payOrderId=" + payOrderId +
        ", type=" + type +
        ", source=" + source +
        "}";
    }
}
