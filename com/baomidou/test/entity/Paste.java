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
public class Paste extends Model<Paste> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String title;

    private String subtitle;

    private String content;

    private String barid;

    private String imgurl;

    private LocalDateTime time;

    @TableField("spreadNum")
    private Integer spreadNum;


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

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getSpreadNum() {
        return spreadNum;
    }

    public void setSpreadNum(Integer spreadNum) {
        this.spreadNum = spreadNum;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Paste{" +
        "id=" + id +
        ", title=" + title +
        ", subtitle=" + subtitle +
        ", content=" + content +
        ", barid=" + barid +
        ", imgurl=" + imgurl +
        ", time=" + time +
        ", spreadNum=" + spreadNum +
        "}";
    }
}
