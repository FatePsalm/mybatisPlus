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
public class Viptcbag extends Model<Viptcbag> {

    private static final long serialVersionUID = 1L;

    private String id;

    private BigDecimal paymoney;

    private BigDecimal givemoney;

    private LocalDateTime time;

    private String barid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(BigDecimal paymoney) {
        this.paymoney = paymoney;
    }

    public BigDecimal getGivemoney() {
        return givemoney;
    }

    public void setGivemoney(BigDecimal givemoney) {
        this.givemoney = givemoney;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
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
        return "Viptcbag{" +
        "id=" + id +
        ", paymoney=" + paymoney +
        ", givemoney=" + givemoney +
        ", time=" + time +
        ", barid=" + barid +
        "}";
    }
}
