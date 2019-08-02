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
public class AutoPascreen extends Model<AutoPascreen> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String username;

    private String picurl;

    private String shead;

    private String videourl;

    private String msg;

    private LocalDateTime time;

    private Integer pasecond;

    private String barid;

    private Integer delay;

    private Boolean turnon;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String getShead() {
        return shead;
    }

    public void setShead(String shead) {
        this.shead = shead;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getPasecond() {
        return pasecond;
    }

    public void setPasecond(Integer pasecond) {
        this.pasecond = pasecond;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public Boolean getTurnon() {
        return turnon;
    }

    public void setTurnon(Boolean turnon) {
        this.turnon = turnon;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "AutoPascreen{" +
        "id=" + id +
        ", username=" + username +
        ", picurl=" + picurl +
        ", shead=" + shead +
        ", videourl=" + videourl +
        ", msg=" + msg +
        ", time=" + time +
        ", pasecond=" + pasecond +
        ", barid=" + barid +
        ", delay=" + delay +
        ", turnon=" + turnon +
        "}";
    }
}
