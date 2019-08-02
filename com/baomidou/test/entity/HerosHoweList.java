package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 支持者豪榜
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class HerosHoweList extends Model<HerosHoweList> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private String id;

    /**
     * 投票数
     */
    private Integer poll;

    /**
     * 免费票
     */
    private Integer freeTicket;

    /**
     * 付费票
     */
    private Integer payForTicket;

    /**
     * 折扣票
     */
    private Integer discountTicket;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPoll() {
        return poll;
    }

    public void setPoll(Integer poll) {
        this.poll = poll;
    }

    public Integer getFreeTicket() {
        return freeTicket;
    }

    public void setFreeTicket(Integer freeTicket) {
        this.freeTicket = freeTicket;
    }

    public Integer getPayForTicket() {
        return payForTicket;
    }

    public void setPayForTicket(Integer payForTicket) {
        this.payForTicket = payForTicket;
    }

    public Integer getDiscountTicket() {
        return discountTicket;
    }

    public void setDiscountTicket(Integer discountTicket) {
        this.discountTicket = discountTicket;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "HerosHoweList{" +
        "id=" + id +
        ", poll=" + poll +
        ", freeTicket=" + freeTicket +
        ", payForTicket=" + payForTicket +
        ", discountTicket=" + discountTicket +
        "}";
    }
}
