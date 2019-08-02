package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class TStaticfile extends Model<TStaticfile> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String objid;

    private String domain;

    @TableField("basePath")
    private String basePath;

    private String name;

    private String ext;

    @TableField("TIME")
    private LocalDateTime time;

    private Integer type;

    private String remark;

    private Integer resultcut;

    private Integer width;

    private Integer height;

    private BigDecimal filesize;

    private Boolean allowdel;

    private Integer sort;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getResultcut() {
        return resultcut;
    }

    public void setResultcut(Integer resultcut) {
        this.resultcut = resultcut;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public BigDecimal getFilesize() {
        return filesize;
    }

    public void setFilesize(BigDecimal filesize) {
        this.filesize = filesize;
    }

    public Boolean getAllowdel() {
        return allowdel;
    }

    public void setAllowdel(Boolean allowdel) {
        this.allowdel = allowdel;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TStaticfile{" +
        "id=" + id +
        ", objid=" + objid +
        ", domain=" + domain +
        ", basePath=" + basePath +
        ", name=" + name +
        ", ext=" + ext +
        ", time=" + time +
        ", type=" + type +
        ", remark=" + remark +
        ", resultcut=" + resultcut +
        ", width=" + width +
        ", height=" + height +
        ", filesize=" + filesize +
        ", allowdel=" + allowdel +
        ", sort=" + sort +
        "}";
    }
}
