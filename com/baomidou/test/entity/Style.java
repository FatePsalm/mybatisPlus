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
public class Style extends Model<Style> {

    private static final long serialVersionUID = 1L;

    private String id;

    private Integer sub;

    private String stylename;

    private String page;

    private Boolean background;

    private String jsppage;

    private String modelpage;

    private LocalDateTime time;

    private Boolean servicenomodule;

    private Integer homebgtype;

    private Boolean vipstyle;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSub() {
        return sub;
    }

    public void setSub(Integer sub) {
        this.sub = sub;
    }

    public String getStylename() {
        return stylename;
    }

    public void setStylename(String stylename) {
        this.stylename = stylename;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public Boolean getBackground() {
        return background;
    }

    public void setBackground(Boolean background) {
        this.background = background;
    }

    public String getJsppage() {
        return jsppage;
    }

    public void setJsppage(String jsppage) {
        this.jsppage = jsppage;
    }

    public String getModelpage() {
        return modelpage;
    }

    public void setModelpage(String modelpage) {
        this.modelpage = modelpage;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Boolean getServicenomodule() {
        return servicenomodule;
    }

    public void setServicenomodule(Boolean servicenomodule) {
        this.servicenomodule = servicenomodule;
    }

    public Integer getHomebgtype() {
        return homebgtype;
    }

    public void setHomebgtype(Integer homebgtype) {
        this.homebgtype = homebgtype;
    }

    public Boolean getVipstyle() {
        return vipstyle;
    }

    public void setVipstyle(Boolean vipstyle) {
        this.vipstyle = vipstyle;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Style{" +
        "id=" + id +
        ", sub=" + sub +
        ", stylename=" + stylename +
        ", page=" + page +
        ", background=" + background +
        ", jsppage=" + jsppage +
        ", modelpage=" + modelpage +
        ", time=" + time +
        ", servicenomodule=" + servicenomodule +
        ", homebgtype=" + homebgtype +
        ", vipstyle=" + vipstyle +
        "}";
    }
}
