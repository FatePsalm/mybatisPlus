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
public class Linkindexewm extends Model<Linkindexewm> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String desknum;

    private String barid;

    private LocalDateTime loadtime;

    private String userid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesknum() {
        return desknum;
    }

    public void setDesknum(String desknum) {
        this.desknum = desknum;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public LocalDateTime getLoadtime() {
        return loadtime;
    }

    public void setLoadtime(LocalDateTime loadtime) {
        this.loadtime = loadtime;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Linkindexewm{" +
        "id=" + id +
        ", desknum=" + desknum +
        ", barid=" + barid +
        ", loadtime=" + loadtime +
        ", userid=" + userid +
        "}";
    }
}
