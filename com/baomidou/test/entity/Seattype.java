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
public class Seattype extends Model<Seattype> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String name;

    private BigDecimal money;

    private LocalDateTime time;

    private Integer beginnum;

    private Integer endnum;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getBeginnum() {
        return beginnum;
    }

    public void setBeginnum(Integer beginnum) {
        this.beginnum = beginnum;
    }

    public Integer getEndnum() {
        return endnum;
    }

    public void setEndnum(Integer endnum) {
        this.endnum = endnum;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Seattype{" +
        "id=" + id +
        ", barid=" + barid +
        ", name=" + name +
        ", money=" + money +
        ", time=" + time +
        ", beginnum=" + beginnum +
        ", endnum=" + endnum +
        "}";
    }
}
