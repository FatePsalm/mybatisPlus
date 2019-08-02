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
public class Points extends Model<Points> {

    private static final long serialVersionUID = 1L;

    private String id;

    private Integer points;

    private String upperid;

    private String vipcardid;

    private String barid;

    private String userid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getUpperid() {
        return upperid;
    }

    public void setUpperid(String upperid) {
        this.upperid = upperid;
    }

    public String getVipcardid() {
        return vipcardid;
    }

    public void setVipcardid(String vipcardid) {
        this.vipcardid = vipcardid;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Points{" +
        "id=" + id +
        ", points=" + points +
        ", upperid=" + upperid +
        ", vipcardid=" + vipcardid +
        ", barid=" + barid +
        ", userid=" + userid +
        "}";
    }
}
