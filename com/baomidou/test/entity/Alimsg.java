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
public class Alimsg extends Model<Alimsg> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String outtradeno;

    private String tradeno;

    private String tradestatus;

    private LocalDateTime sendtime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOuttradeno() {
        return outtradeno;
    }

    public void setOuttradeno(String outtradeno) {
        this.outtradeno = outtradeno;
    }

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    public String getTradestatus() {
        return tradestatus;
    }

    public void setTradestatus(String tradestatus) {
        this.tradestatus = tradestatus;
    }

    public LocalDateTime getSendtime() {
        return sendtime;
    }

    public void setSendtime(LocalDateTime sendtime) {
        this.sendtime = sendtime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Alimsg{" +
        "id=" + id +
        ", outtradeno=" + outtradeno +
        ", tradeno=" + tradeno +
        ", tradestatus=" + tradestatus +
        ", sendtime=" + sendtime +
        "}";
    }
}
