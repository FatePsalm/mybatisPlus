package com.baomidou.test.entity;

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
public class Modulebarbase extends Model<Modulebarbase> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String moduleid;

    private String modulerename;

    private Integer sort;

    private String url;

    private LocalDateTime date;

    private Integer pv;

    private String imgurl;

    @TableField("isMove")
    private Boolean move;

    private Integer step;


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

    public String getModuleid() {
        return moduleid;
    }

    public void setModuleid(String moduleid) {
        this.moduleid = moduleid;
    }

    public String getModulerename() {
        return modulerename;
    }

    public void setModulerename(String modulerename) {
        this.modulerename = modulerename;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Boolean getMove() {
        return move;
    }

    public void setMove(Boolean move) {
        this.move = move;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Modulebarbase{" +
        "id=" + id +
        ", barid=" + barid +
        ", moduleid=" + moduleid +
        ", modulerename=" + modulerename +
        ", sort=" + sort +
        ", url=" + url +
        ", date=" + date +
        ", pv=" + pv +
        ", imgurl=" + imgurl +
        ", move=" + move +
        ", step=" + step +
        "}";
    }
}
