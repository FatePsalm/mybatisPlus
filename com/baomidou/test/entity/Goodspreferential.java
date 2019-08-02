package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class Goodspreferential extends Model<Goodspreferential> {

    private static final long serialVersionUID = 1L;

    private String id;

    @TableField("goodsId")
    private String goodsId;

    @TableField("startTime")
    private String startTime;

    @TableField("endTime")
    private String endTime;

    private Double discount;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Goodspreferential{" +
        "id=" + id +
        ", goodsId=" + goodsId +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", discount=" + discount +
        "}";
    }
}
