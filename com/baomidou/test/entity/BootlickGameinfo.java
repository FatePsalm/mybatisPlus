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
public class BootlickGameinfo extends Model<BootlickGameinfo> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private LocalDateTime time;

    /**
     * 本局游戏状态
     */
    private Integer state;

    /**
     * 酒吧彩头数量
     */
    private Integer barNum;

    /**
     * 用户押注总数量
     */
    private Integer userNum;

    /**
     * 游戏单价
     */
    private BigDecimal price;

    /**
     * 是否退款
     */
    private Integer isRefund;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
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

    public Integer getBarNum() {
        return barNum;
    }

    public void setBarNum(Integer barNum) {
        this.barNum = barNum;
    }

    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getIsRefund() {
        return isRefund;
    }

    public void setIsRefund(Integer isRefund) {
        this.isRefund = isRefund;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BootlickGameinfo{" +
        "id=" + id +
        ", barid=" + barid +
        ", time=" + time +
        ", state=" + state +
        ", barNum=" + barNum +
        ", userNum=" + userNum +
        ", price=" + price +
        ", isRefund=" + isRefund +
        "}";
    }
}
