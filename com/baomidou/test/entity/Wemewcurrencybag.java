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
public class Wemewcurrencybag extends Model<Wemewcurrencybag> {

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
     * 时间
     */
    private LocalDateTime time;

    /**
     * 乐观锁版本号
     */
    private Integer version;

    /**
     * 定向币余额
     */
    @TableField("currencyMoney")
    private BigDecimal currencyMoney;

    /**
     * 定向币总额
     */
    @TableField("totalCurrencyMoney")
    private BigDecimal totalCurrencyMoney;

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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BigDecimal getCurrencyMoney() {
        return currencyMoney;
    }

    public void setCurrencyMoney(BigDecimal currencyMoney) {
        this.currencyMoney = currencyMoney;
    }

    public BigDecimal getTotalCurrencyMoney() {
        return totalCurrencyMoney;
    }

    public void setTotalCurrencyMoney(BigDecimal totalCurrencyMoney) {
        this.totalCurrencyMoney = totalCurrencyMoney;
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
        return "Wemewcurrencybag{" +
        "id=" + id +
        ", userid=" + userid +
        ", time=" + time +
        ", version=" + version +
        ", currencyMoney=" + currencyMoney +
        ", totalCurrencyMoney=" + totalCurrencyMoney +
        ", barid=" + barid +
        "}";
    }
}
