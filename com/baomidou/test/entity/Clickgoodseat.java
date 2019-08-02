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
public class Clickgoodseat extends Model<Clickgoodseat> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String viewuserid;

    private Boolean clickgood;

    private LocalDateTime clickgoodtime;

    private Boolean seecontact;

    private LocalDateTime seecontacttime;


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

    public String getViewuserid() {
        return viewuserid;
    }

    public void setViewuserid(String viewuserid) {
        this.viewuserid = viewuserid;
    }

    public Boolean getClickgood() {
        return clickgood;
    }

    public void setClickgood(Boolean clickgood) {
        this.clickgood = clickgood;
    }

    public LocalDateTime getClickgoodtime() {
        return clickgoodtime;
    }

    public void setClickgoodtime(LocalDateTime clickgoodtime) {
        this.clickgoodtime = clickgoodtime;
    }

    public Boolean getSeecontact() {
        return seecontact;
    }

    public void setSeecontact(Boolean seecontact) {
        this.seecontact = seecontact;
    }

    public LocalDateTime getSeecontacttime() {
        return seecontacttime;
    }

    public void setSeecontacttime(LocalDateTime seecontacttime) {
        this.seecontacttime = seecontacttime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Clickgoodseat{" +
        "id=" + id +
        ", userid=" + userid +
        ", viewuserid=" + viewuserid +
        ", clickgood=" + clickgood +
        ", clickgoodtime=" + clickgoodtime +
        ", seecontact=" + seecontact +
        ", seecontacttime=" + seecontacttime +
        "}";
    }
}
