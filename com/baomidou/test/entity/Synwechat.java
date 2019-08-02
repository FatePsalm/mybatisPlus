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
public class Synwechat extends Model<Synwechat> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String nextopenid;

    private Integer getfens;

    private Integer getmaterial;

    private Integer mass;

    private Boolean access;


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

    public String getNextopenid() {
        return nextopenid;
    }

    public void setNextopenid(String nextopenid) {
        this.nextopenid = nextopenid;
    }

    public Integer getGetfens() {
        return getfens;
    }

    public void setGetfens(Integer getfens) {
        this.getfens = getfens;
    }

    public Integer getGetmaterial() {
        return getmaterial;
    }

    public void setGetmaterial(Integer getmaterial) {
        this.getmaterial = getmaterial;
    }

    public Integer getMass() {
        return mass;
    }

    public void setMass(Integer mass) {
        this.mass = mass;
    }

    public Boolean getAccess() {
        return access;
    }

    public void setAccess(Boolean access) {
        this.access = access;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Synwechat{" +
        "id=" + id +
        ", barid=" + barid +
        ", nextopenid=" + nextopenid +
        ", getfens=" + getfens +
        ", getmaterial=" + getmaterial +
        ", mass=" + mass +
        ", access=" + access +
        "}";
    }
}
