package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Lovenight extends Model<Lovenight> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "lid", type = IdType.AUTO)
    private Integer lid;

    /**
     * 用户userid
     */
    private String userid;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 真实用户头像
     */
    private String realhead;

    /**
     * 微信号
     */
    private String wxnumber;

    private LocalDateTime time;

    /**
     * 喜欢的性别
     */
    private Boolean lovesex;

    /**
     * 参与价格
     */
    private BigDecimal price;


    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getRealhead() {
        return realhead;
    }

    public void setRealhead(String realhead) {
        this.realhead = realhead;
    }

    public String getWxnumber() {
        return wxnumber;
    }

    public void setWxnumber(String wxnumber) {
        this.wxnumber = wxnumber;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Boolean getLovesex() {
        return lovesex;
    }

    public void setLovesex(Boolean lovesex) {
        this.lovesex = lovesex;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    protected Serializable pkVal() {
        return this.lid;
    }

    @Override
    public String toString() {
        return "Lovenight{" +
        "lid=" + lid +
        ", userid=" + userid +
        ", barid=" + barid +
        ", realhead=" + realhead +
        ", wxnumber=" + wxnumber +
        ", time=" + time +
        ", lovesex=" + lovesex +
        ", price=" + price +
        "}";
    }
}
