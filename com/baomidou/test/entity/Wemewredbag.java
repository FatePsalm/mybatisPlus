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
public class Wemewredbag extends Model<Wemewredbag> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 用户id
     */
    private String userid;

    /**
     * 红包剩余金额
     */
    private BigDecimal redbag;

    @TableField("totalRedbag")
    private BigDecimal totalRedbag;

    private LocalDateTime time;

    /**
     * 金现红包剩余金额
     */
    @TableField("cashRed")
    private BigDecimal cashRed;

    /**
     * 操作者分成收入金额
     */
    @TableField("operatorCash")
    private BigDecimal operatorCash;

    /**
     * 现金红包总额
     */
    @TableField("cashTotalRed")
    private BigDecimal cashTotalRed;

    /**
     * 乐观锁版本号
     */
    private Integer version;


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

    public BigDecimal getRedbag() {
        return redbag;
    }

    public void setRedbag(BigDecimal redbag) {
        this.redbag = redbag;
    }

    public BigDecimal getTotalRedbag() {
        return totalRedbag;
    }

    public void setTotalRedbag(BigDecimal totalRedbag) {
        this.totalRedbag = totalRedbag;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public BigDecimal getCashRed() {
        return cashRed;
    }

    public void setCashRed(BigDecimal cashRed) {
        this.cashRed = cashRed;
    }

    public BigDecimal getOperatorCash() {
        return operatorCash;
    }

    public void setOperatorCash(BigDecimal operatorCash) {
        this.operatorCash = operatorCash;
    }

    public BigDecimal getCashTotalRed() {
        return cashTotalRed;
    }

    public void setCashTotalRed(BigDecimal cashTotalRed) {
        this.cashTotalRed = cashTotalRed;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Wemewredbag{" +
        "id=" + id +
        ", userid=" + userid +
        ", redbag=" + redbag +
        ", totalRedbag=" + totalRedbag +
        ", time=" + time +
        ", cashRed=" + cashRed +
        ", operatorCash=" + operatorCash +
        ", cashTotalRed=" + cashTotalRed +
        ", version=" + version +
        "}";
    }
}
