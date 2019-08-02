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
public class Managerecord extends Model<Managerecord> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 维护内容
     */
    private String content;

    /**
     * 客户酒吧id
     */
    private String barid;

    /**
     * 维护酒吧id
     */
    private String mybarid;

    /**
     * 维护时间
     */
    private LocalDateTime time;

    /**
     * 维护方式
     */
    private Integer type;

    /**
     * 提成收入
     */
    private BigDecimal income;

    /**
     * 维护期间总流水
     */
    private BigDecimal totlemoney;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getMybarid() {
        return mybarid;
    }

    public void setMybarid(String mybarid) {
        this.mybarid = mybarid;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public BigDecimal getTotlemoney() {
        return totlemoney;
    }

    public void setTotlemoney(BigDecimal totlemoney) {
        this.totlemoney = totlemoney;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Managerecord{" +
        "id=" + id +
        ", content=" + content +
        ", barid=" + barid +
        ", mybarid=" + mybarid +
        ", time=" + time +
        ", type=" + type +
        ", income=" + income +
        ", totlemoney=" + totlemoney +
        "}";
    }
}
