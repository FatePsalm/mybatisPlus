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
public class Topic extends Model<Topic> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 话题名称
     */
    private String topname;

    /**
     * 话题内容
     */
    private String topdetail;

    private Integer topstatus;

    private LocalDateTime startdate;

    private LocalDateTime enddate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTopname() {
        return topname;
    }

    public void setTopname(String topname) {
        this.topname = topname;
    }

    public String getTopdetail() {
        return topdetail;
    }

    public void setTopdetail(String topdetail) {
        this.topdetail = topdetail;
    }

    public Integer getTopstatus() {
        return topstatus;
    }

    public void setTopstatus(Integer topstatus) {
        this.topstatus = topstatus;
    }

    public LocalDateTime getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDateTime startdate) {
        this.startdate = startdate;
    }

    public LocalDateTime getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDateTime enddate) {
        this.enddate = enddate;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Topic{" +
        "id=" + id +
        ", topname=" + topname +
        ", topdetail=" + topdetail +
        ", topstatus=" + topstatus +
        ", startdate=" + startdate +
        ", enddate=" + enddate +
        "}";
    }
}
