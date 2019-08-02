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
public class TDatewine extends Model<TDatewine> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String tmealorderid;

    private String description;

    private Integer payway;

    private LocalDateTime createtime;

    private Integer signupnum;

    private String barid;

    private Integer datewineobj;


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

    public String getTmealorderid() {
        return tmealorderid;
    }

    public void setTmealorderid(String tmealorderid) {
        this.tmealorderid = tmealorderid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPayway() {
        return payway;
    }

    public void setPayway(Integer payway) {
        this.payway = payway;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public Integer getSignupnum() {
        return signupnum;
    }

    public void setSignupnum(Integer signupnum) {
        this.signupnum = signupnum;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Integer getDatewineobj() {
        return datewineobj;
    }

    public void setDatewineobj(Integer datewineobj) {
        this.datewineobj = datewineobj;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TDatewine{" +
        "id=" + id +
        ", userid=" + userid +
        ", tmealorderid=" + tmealorderid +
        ", description=" + description +
        ", payway=" + payway +
        ", createtime=" + createtime +
        ", signupnum=" + signupnum +
        ", barid=" + barid +
        ", datewineobj=" + datewineobj +
        "}";
    }
}
