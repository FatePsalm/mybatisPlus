package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 全场召唤令
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class HouseCall extends Model<HouseCall> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * 全场召唤令类型  1-约酒 2-蹦迪 3-陪聊
     */
    private Integer type;

    /**
     * 召唤词
     */
    private String msg;

    /**
     * 原价
     */
    private Double original;

    /**
     * 折扣价
     */
    private Double discount;

    /**
     * 发布时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 订单id
     */
    private String payid;

    /**
     * 支付识别码
     */
    private String attach;

    /**
     * userid
     */
    private String userid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Double getOriginal() {
        return original;
    }

    public void setOriginal(Double original) {
        this.original = original;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "HouseCall{" +
        "id=" + id +
        ", type=" + type +
        ", msg=" + msg +
        ", original=" + original +
        ", discount=" + discount +
        ", createTime=" + createTime +
        ", barid=" + barid +
        ", payid=" + payid +
        ", attach=" + attach +
        ", userid=" + userid +
        "}";
    }
}
