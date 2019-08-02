package com.baomidou.test.entity;

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
public class Userprize extends Model<Userprize> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String prizename;

    private String barid;

    private LocalDateTime time;

    private Boolean use;

    private Integer type;

    private String imgurl;

    private Integer lev;

    private LocalDateTime overtime;

    @TableField("randomCode")
    private String randomCode;

    private String waiterid;

    private LocalDateTime starttime;


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

    public String getPrizename() {
        return prizename;
    }

    public void setPrizename(String prizename) {
        this.prizename = prizename;
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

    public Boolean getUse() {
        return use;
    }

    public void setUse(Boolean use) {
        this.use = use;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Integer getLev() {
        return lev;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    public LocalDateTime getOvertime() {
        return overtime;
    }

    public void setOvertime(LocalDateTime overtime) {
        this.overtime = overtime;
    }

    public String getRandomCode() {
        return randomCode;
    }

    public void setRandomCode(String randomCode) {
        this.randomCode = randomCode;
    }

    public String getWaiterid() {
        return waiterid;
    }

    public void setWaiterid(String waiterid) {
        this.waiterid = waiterid;
    }

    public LocalDateTime getStarttime() {
        return starttime;
    }

    public void setStarttime(LocalDateTime starttime) {
        this.starttime = starttime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Userprize{" +
        "id=" + id +
        ", userid=" + userid +
        ", prizename=" + prizename +
        ", barid=" + barid +
        ", time=" + time +
        ", use=" + use +
        ", type=" + type +
        ", imgurl=" + imgurl +
        ", lev=" + lev +
        ", overtime=" + overtime +
        ", randomCode=" + randomCode +
        ", waiterid=" + waiterid +
        ", starttime=" + starttime +
        "}";
    }
}
