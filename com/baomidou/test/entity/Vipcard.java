package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
public class Vipcard extends Model<Vipcard> {

    private static final long serialVersionUID = 1L;

    private String id;

    private LocalDateTime time;

    private Integer number;

    private String barid;

    private String userid;

    private BigDecimal money;

    private Integer points;

    private String ewmurl;

    private String remark;

    private Boolean del;

    /**
     * 会员类型
     */
    private Boolean type;

    /**
     * 生日
     */
    private LocalDate birthday;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getEwmurl() {
        return ewmurl;
    }

    public void setEwmurl(String ewmurl) {
        this.ewmurl = ewmurl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Vipcard{" +
        "id=" + id +
        ", time=" + time +
        ", number=" + number +
        ", barid=" + barid +
        ", userid=" + userid +
        ", money=" + money +
        ", points=" + points +
        ", ewmurl=" + ewmurl +
        ", remark=" + remark +
        ", del=" + del +
        ", type=" + type +
        ", birthday=" + birthday +
        "}";
    }
}
