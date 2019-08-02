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
public class Programwinner extends Model<Programwinner> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String userid;

    private String ewmurl;

    private String ewmid;

    private Boolean exchange;

    private LocalDateTime time;

    private LocalDateTime djtime;

    private String proname;


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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getEwmurl() {
        return ewmurl;
    }

    public void setEwmurl(String ewmurl) {
        this.ewmurl = ewmurl;
    }

    public String getEwmid() {
        return ewmid;
    }

    public void setEwmid(String ewmid) {
        this.ewmid = ewmid;
    }

    public Boolean getExchange() {
        return exchange;
    }

    public void setExchange(Boolean exchange) {
        this.exchange = exchange;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public LocalDateTime getDjtime() {
        return djtime;
    }

    public void setDjtime(LocalDateTime djtime) {
        this.djtime = djtime;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Programwinner{" +
        "id=" + id +
        ", barid=" + barid +
        ", userid=" + userid +
        ", ewmurl=" + ewmurl +
        ", ewmid=" + ewmid +
        ", exchange=" + exchange +
        ", time=" + time +
        ", djtime=" + djtime +
        ", proname=" + proname +
        "}";
    }
}
