package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 酒水预存-兑换记录
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class VoteDrinksRecord extends Model<VoteDrinksRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 酒吧ID
     */
    private String bid;

    /**
     * 主题ID
     */
    private String cid;

    /**
     * 用户ID
     */
    private String uid;

    /**
     * 套餐ID,如果是多个套餐中间已","分割
     */
    private String vdcid;

    /**
     * 套餐名字 中间","隔开
     */
    private String vdcnote;

    /**
     * 花费积分
     */
    private Integer count;

    /**
     * 0-未兑换  1-已兑换  
     */
    private Boolean exchange;

    /**
     * 创建时间
     */
    private LocalDateTime creationTime;

    /**
     * 兑换时间
     */
    private LocalDateTime exchangeTime;

    /**
     * 兑换码
     */
    private String winningCode;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getVdcid() {
        return vdcid;
    }

    public void setVdcid(String vdcid) {
        this.vdcid = vdcid;
    }

    public String getVdcnote() {
        return vdcnote;
    }

    public void setVdcnote(String vdcnote) {
        this.vdcnote = vdcnote;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Boolean getExchange() {
        return exchange;
    }

    public void setExchange(Boolean exchange) {
        this.exchange = exchange;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public LocalDateTime getExchangeTime() {
        return exchangeTime;
    }

    public void setExchangeTime(LocalDateTime exchangeTime) {
        this.exchangeTime = exchangeTime;
    }

    public String getWinningCode() {
        return winningCode;
    }

    public void setWinningCode(String winningCode) {
        this.winningCode = winningCode;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "VoteDrinksRecord{" +
        "id=" + id +
        ", bid=" + bid +
        ", cid=" + cid +
        ", uid=" + uid +
        ", vdcid=" + vdcid +
        ", vdcnote=" + vdcnote +
        ", count=" + count +
        ", exchange=" + exchange +
        ", creationTime=" + creationTime +
        ", exchangeTime=" + exchangeTime +
        ", winningCode=" + winningCode +
        "}";
    }
}
