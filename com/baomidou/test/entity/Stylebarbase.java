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
public class Stylebarbase extends Model<Stylebarbase> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String styleid;

    private String barid;

    private String backgroundimgurl;

    private Boolean select;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStyleid() {
        return styleid;
    }

    public void setStyleid(String styleid) {
        this.styleid = styleid;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getBackgroundimgurl() {
        return backgroundimgurl;
    }

    public void setBackgroundimgurl(String backgroundimgurl) {
        this.backgroundimgurl = backgroundimgurl;
    }

    public Boolean getSelect() {
        return select;
    }

    public void setSelect(Boolean select) {
        this.select = select;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Stylebarbase{" +
        "id=" + id +
        ", styleid=" + styleid +
        ", barid=" + barid +
        ", backgroundimgurl=" + backgroundimgurl +
        ", select=" + select +
        "}";
    }
}
