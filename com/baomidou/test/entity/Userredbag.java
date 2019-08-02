package com.baomidou.test.entity;

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
public class Userredbag extends Model<Userredbag> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private Double money;

    private String barid;

    private LocalDateTime time;

    private LocalDateTime overtime;


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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
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

    public LocalDateTime getOvertime() {
        return overtime;
    }

    public void setOvertime(LocalDateTime overtime) {
        this.overtime = overtime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Userredbag{" +
        "id=" + id +
        ", userid=" + userid +
        ", money=" + money +
        ", barid=" + barid +
        ", time=" + time +
        ", overtime=" + overtime +
        "}";
    }
}
