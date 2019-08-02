package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class Defaultpost extends Model<Defaultpost> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String title;

    private String subtitle;

    private String content;

    private String imgurl;

    private String op;

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

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
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
        return "Defaultpost{" +
        "id=" + id +
        ", title=" + title +
        ", subtitle=" + subtitle +
        ", content=" + content +
        ", imgurl=" + imgurl +
        ", op=" + op +
        ", spreadNum=" + spreadNum +
        "}";
    }
}
