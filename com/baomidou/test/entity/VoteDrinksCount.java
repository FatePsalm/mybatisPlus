package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 酒水预存-票数统计 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class VoteDrinksCount extends Model<VoteDrinksCount> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private String id;

    /**
     * 总计
     */
    private Integer total;

    /**
     * 已使用
     */
    private Integer used;

    /**
     * 剩余
     */
    private Integer balance;

    /**
     * 用户ID
     */
    private String uid;

    /**
     * 酒吧ID
     */
    private String bid;

    /**
     * 主题ID
     */
    private String cid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "VoteDrinksCount{" +
        "id=" + id +
        ", total=" + total +
        ", used=" + used +
        ", balance=" + balance +
        ", uid=" + uid +
        ", bid=" + bid +
        ", cid=" + cid +
        "}";
    }
}
