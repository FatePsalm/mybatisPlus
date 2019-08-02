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
public class THotbarbase extends Model<THotbarbase> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private Integer hot;

    private Integer totalpv;

    /**
     * 今日人气
     */
    private Integer todaypv;


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

    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    public Integer getTotalpv() {
        return totalpv;
    }

    public void setTotalpv(Integer totalpv) {
        this.totalpv = totalpv;
    }

    public Integer getTodaypv() {
        return todaypv;
    }

    public void setTodaypv(Integer todaypv) {
        this.todaypv = todaypv;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "THotbarbase{" +
        "id=" + id +
        ", barid=" + barid +
        ", hot=" + hot +
        ", totalpv=" + totalpv +
        ", todaypv=" + todaypv +
        "}";
    }
}
