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
public class Trend extends Model<Trend> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String adminid;

    private String content;

    private LocalDateTime createtime;

    private Integer photonum;

    private String title;


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

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public Integer getPhotonum() {
        return photonum;
    }

    public void setPhotonum(Integer photonum) {
        this.photonum = photonum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Trend{" +
        "id=" + id +
        ", barid=" + barid +
        ", adminid=" + adminid +
        ", content=" + content +
        ", createtime=" + createtime +
        ", photonum=" + photonum +
        ", title=" + title +
        "}";
    }
}
