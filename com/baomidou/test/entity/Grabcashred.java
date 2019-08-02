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
public class Grabcashred extends Model<Grabcashred> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private String id;

    /**
     * 金现红包id
     */
    @TableField("cashRedId")
    private String cashRedId;

    /**
     * 户用di
     */
    @TableField("userId")
    private String userId;

    /**
     * 用户抢到的红包金额
     */
    @TableField("cashRed")
    private BigDecimal cashRed;

    /**
     * 抢到红包的时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 酒吧id
     */
    private String barid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCashRedId() {
        return cashRedId;
    }

    public void setCashRedId(String cashRedId) {
        this.cashRedId = cashRedId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public BigDecimal getCashRed() {
        return cashRed;
    }

    public void setCashRed(BigDecimal cashRed) {
        this.cashRed = cashRed;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Grabcashred{" +
        "id=" + id +
        ", cashRedId=" + cashRedId +
        ", userId=" + userId +
        ", cashRed=" + cashRed +
        ", createTime=" + createTime +
        ", barid=" + barid +
        "}";
    }
}
