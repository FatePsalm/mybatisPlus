package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class Redbag extends Model<Redbag> {

    private static final long serialVersionUID = 1L;

    private String id;

    private Double money;

    private Integer total;

    private Integer begin;

    private Integer end;

    private Integer surplusnum;

    private String barid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getBegin() {
        return begin;
    }

    public void setBegin(Integer begin) {
        this.begin = begin;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public Integer getSurplusnum() {
        return surplusnum;
    }

    public void setSurplusnum(Integer surplusnum) {
        this.surplusnum = surplusnum;
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
        return "Redbag{" +
        "id=" + id +
        ", money=" + money +
        ", total=" + total +
        ", begin=" + begin +
        ", end=" + end +
        ", surplusnum=" + surplusnum +
        ", barid=" + barid +
        "}";
    }
}
