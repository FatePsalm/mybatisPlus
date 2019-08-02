package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class Setlocation extends Model<Setlocation> {

    private static final long serialVersionUID = 1L;

    private String id;

    private Boolean open;

    private String messageid;

    private Integer settime;

    private String barid;

    private String endtime;

    private Boolean supportadmin;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid;
    }

    public Integer getSettime() {
        return settime;
    }

    public void setSettime(Integer settime) {
        this.settime = settime;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public Boolean getSupportadmin() {
        return supportadmin;
    }

    public void setSupportadmin(Boolean supportadmin) {
        this.supportadmin = supportadmin;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Setlocation{" +
        "id=" + id +
        ", open=" + open +
        ", messageid=" + messageid +
        ", settime=" + settime +
        ", barid=" + barid +
        ", endtime=" + endtime +
        ", supportadmin=" + supportadmin +
        "}";
    }
}
