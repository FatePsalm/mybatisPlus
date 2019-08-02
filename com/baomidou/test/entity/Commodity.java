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
public class Commodity extends Model<Commodity> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String title;

    private String imgurl;

    private Integer needpoints;

    private Integer commnum;

    private Boolean del;

    private LocalDateTime time;

    private String barid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Integer getNeedpoints() {
        return needpoints;
    }

    public void setNeedpoints(Integer needpoints) {
        this.needpoints = needpoints;
    }

    public Integer getCommnum() {
        return commnum;
    }

    public void setCommnum(Integer commnum) {
        this.commnum = commnum;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Commodity{" +
        "id=" + id +
        ", title=" + title +
        ", imgurl=" + imgurl +
        ", needpoints=" + needpoints +
        ", commnum=" + commnum +
        ", del=" + del +
        ", time=" + time +
        ", barid=" + barid +
        "}";
    }
}
