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
public class Baractivity extends Model<Baractivity> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String title;

    private String content;

    private LocalDateTime time;

    private String barid;

    private LocalDateTime overtime;

    private Integer readtimes;

    private Integer replytimes;

    @TableField("womanNum")
    private Integer womanNum;

    @TableField("manNum")
    private Integer manNum;


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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public LocalDateTime getOvertime() {
        return overtime;
    }

    public void setOvertime(LocalDateTime overtime) {
        this.overtime = overtime;
    }

    public Integer getReadtimes() {
        return readtimes;
    }

    public void setReadtimes(Integer readtimes) {
        this.readtimes = readtimes;
    }

    public Integer getReplytimes() {
        return replytimes;
    }

    public void setReplytimes(Integer replytimes) {
        this.replytimes = replytimes;
    }

    public Integer getWomanNum() {
        return womanNum;
    }

    public void setWomanNum(Integer womanNum) {
        this.womanNum = womanNum;
    }

    public Integer getManNum() {
        return manNum;
    }

    public void setManNum(Integer manNum) {
        this.manNum = manNum;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Baractivity{" +
        "id=" + id +
        ", title=" + title +
        ", content=" + content +
        ", time=" + time +
        ", barid=" + barid +
        ", overtime=" + overtime +
        ", readtimes=" + readtimes +
        ", replytimes=" + replytimes +
        ", womanNum=" + womanNum +
        ", manNum=" + manNum +
        "}";
    }
}
