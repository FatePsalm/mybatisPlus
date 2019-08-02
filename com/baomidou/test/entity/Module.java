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
public class Module extends Model<Module> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String modulename;

    private Boolean open;

    private String description;

    private String imgurl;

    private Boolean change;

    private String classname;

    private String linkurl;

    private String adminlinkurl;

    private String indexlinkurl;

    private Boolean servicenumber;

    private Boolean vipmodule;

    private Boolean svipmodule;

    private Integer step;

    private Integer type;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Boolean getChange() {
        return change;
    }

    public void setChange(Boolean change) {
        this.change = change;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getLinkurl() {
        return linkurl;
    }

    public void setLinkurl(String linkurl) {
        this.linkurl = linkurl;
    }

    public String getAdminlinkurl() {
        return adminlinkurl;
    }

    public void setAdminlinkurl(String adminlinkurl) {
        this.adminlinkurl = adminlinkurl;
    }

    public String getIndexlinkurl() {
        return indexlinkurl;
    }

    public void setIndexlinkurl(String indexlinkurl) {
        this.indexlinkurl = indexlinkurl;
    }

    public Boolean getServicenumber() {
        return servicenumber;
    }

    public void setServicenumber(Boolean servicenumber) {
        this.servicenumber = servicenumber;
    }

    public Boolean getVipmodule() {
        return vipmodule;
    }

    public void setVipmodule(Boolean vipmodule) {
        this.vipmodule = vipmodule;
    }

    public Boolean getSvipmodule() {
        return svipmodule;
    }

    public void setSvipmodule(Boolean svipmodule) {
        this.svipmodule = svipmodule;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Module{" +
        "id=" + id +
        ", modulename=" + modulename +
        ", open=" + open +
        ", description=" + description +
        ", imgurl=" + imgurl +
        ", change=" + change +
        ", classname=" + classname +
        ", linkurl=" + linkurl +
        ", adminlinkurl=" + adminlinkurl +
        ", indexlinkurl=" + indexlinkurl +
        ", servicenumber=" + servicenumber +
        ", vipmodule=" + vipmodule +
        ", svipmodule=" + svipmodule +
        ", step=" + step +
        ", type=" + type +
        "}";
    }
}
