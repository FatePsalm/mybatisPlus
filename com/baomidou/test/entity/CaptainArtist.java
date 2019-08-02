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
public class CaptainArtist extends Model<CaptainArtist> {

    private static final long serialVersionUID = 1L;

    private String id;

    @TableField("barId")
    private String barId;

    @TableField("artistId")
    private String artistId;

    @TableField("captainId")
    private String captainId;

    private Double divid;

    private Integer type;

    private LocalDateTime time;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBarId() {
        return barId;
    }

    public void setBarId(String barId) {
        this.barId = barId;
    }

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getCaptainId() {
        return captainId;
    }

    public void setCaptainId(String captainId) {
        this.captainId = captainId;
    }

    public Double getDivid() {
        return divid;
    }

    public void setDivid(Double divid) {
        this.divid = divid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "CaptainArtist{" +
        "id=" + id +
        ", barId=" + barId +
        ", artistId=" + artistId +
        ", captainId=" + captainId +
        ", divid=" + divid +
        ", type=" + type +
        ", time=" + time +
        "}";
    }
}
