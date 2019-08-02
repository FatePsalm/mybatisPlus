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
public class Usersetdetails extends Model<Usersetdetails> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String usersetid;

    private String seatname;

    private String seattype;

    private LocalDateTime time;

    private String bartableid;

    private String barid;

    private Boolean paystate;

    private LocalDateTime createtime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsersetid() {
        return usersetid;
    }

    public void setUsersetid(String usersetid) {
        this.usersetid = usersetid;
    }

    public String getSeatname() {
        return seatname;
    }

    public void setSeatname(String seatname) {
        this.seatname = seatname;
    }

    public String getSeattype() {
        return seattype;
    }

    public void setSeattype(String seattype) {
        this.seattype = seattype;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getBartableid() {
        return bartableid;
    }

    public void setBartableid(String bartableid) {
        this.bartableid = bartableid;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Boolean getPaystate() {
        return paystate;
    }

    public void setPaystate(Boolean paystate) {
        this.paystate = paystate;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Usersetdetails{" +
        "id=" + id +
        ", usersetid=" + usersetid +
        ", seatname=" + seatname +
        ", seattype=" + seattype +
        ", time=" + time +
        ", bartableid=" + bartableid +
        ", barid=" + barid +
        ", paystate=" + paystate +
        ", createtime=" + createtime +
        "}";
    }
}
