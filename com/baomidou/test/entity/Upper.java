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
public class Upper extends Model<Upper> {

    private static final long serialVersionUID = 1L;

    private String id;

    private Integer tdpointsup;

    private Integer tdpltimes;

    private Integer tdfxtimes;

    private Integer tdlogintimes;

    private Integer tdjztimes;

    private Integer tdnewatimes;

    private Integer tdcwinetimes;

    private String vipcarid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTdpointsup() {
        return tdpointsup;
    }

    public void setTdpointsup(Integer tdpointsup) {
        this.tdpointsup = tdpointsup;
    }

    public Integer getTdpltimes() {
        return tdpltimes;
    }

    public void setTdpltimes(Integer tdpltimes) {
        this.tdpltimes = tdpltimes;
    }

    public Integer getTdfxtimes() {
        return tdfxtimes;
    }

    public void setTdfxtimes(Integer tdfxtimes) {
        this.tdfxtimes = tdfxtimes;
    }

    public Integer getTdlogintimes() {
        return tdlogintimes;
    }

    public void setTdlogintimes(Integer tdlogintimes) {
        this.tdlogintimes = tdlogintimes;
    }

    public Integer getTdjztimes() {
        return tdjztimes;
    }

    public void setTdjztimes(Integer tdjztimes) {
        this.tdjztimes = tdjztimes;
    }

    public Integer getTdnewatimes() {
        return tdnewatimes;
    }

    public void setTdnewatimes(Integer tdnewatimes) {
        this.tdnewatimes = tdnewatimes;
    }

    public Integer getTdcwinetimes() {
        return tdcwinetimes;
    }

    public void setTdcwinetimes(Integer tdcwinetimes) {
        this.tdcwinetimes = tdcwinetimes;
    }

    public String getVipcarid() {
        return vipcarid;
    }

    public void setVipcarid(String vipcarid) {
        this.vipcarid = vipcarid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Upper{" +
        "id=" + id +
        ", tdpointsup=" + tdpointsup +
        ", tdpltimes=" + tdpltimes +
        ", tdfxtimes=" + tdfxtimes +
        ", tdlogintimes=" + tdlogintimes +
        ", tdjztimes=" + tdjztimes +
        ", tdnewatimes=" + tdnewatimes +
        ", tdcwinetimes=" + tdcwinetimes +
        ", vipcarid=" + vipcarid +
        "}";
    }
}
