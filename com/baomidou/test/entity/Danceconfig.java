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
public class Danceconfig extends Model<Danceconfig> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 酒吧ID
     */
    @TableField("barId")
    private String barId;

    /**
     * 是否是系统配置, 1:系统配置, 0:艺人配置
     */
    @TableField("isSysConfig")
    private Boolean sysConfig;

    /**
     * 艺人id, 如果是系统配置则为null
     */
    @TableField("artistId")
    private String artistId;

    /**
     * 趴数
     */
    @TableField("paNum")
    private Integer paNum;

    /**
     * 时长(min)
     */
    private Integer time;

    /**
     * 价格
     */
    private Double price;

    /**
     * 描述
     */
    private String description;


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

    public Boolean getSysConfig() {
        return sysConfig;
    }

    public void setSysConfig(Boolean sysConfig) {
        this.sysConfig = sysConfig;
    }

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public Integer getPaNum() {
        return paNum;
    }

    public void setPaNum(Integer paNum) {
        this.paNum = paNum;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Danceconfig{" +
        "id=" + id +
        ", barId=" + barId +
        ", sysConfig=" + sysConfig +
        ", artistId=" + artistId +
        ", paNum=" + paNum +
        ", time=" + time +
        ", price=" + price +
        ", description=" + description +
        "}";
    }
}
