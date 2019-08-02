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
public class Barborderstart extends Model<Barborderstart> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String borderid;

    private String userid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBorderid() {
        return borderid;
    }

    public void setBorderid(String borderid) {
        this.borderid = borderid;
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
        return "Barborderstart{" +
        "id=" + id +
        ", borderid=" + borderid +
        ", userid=" + userid +
        "}";
    }
}
