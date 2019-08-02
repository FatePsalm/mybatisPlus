package com.baomidou.test.entity;

import java.math.BigDecimal;
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
public class TMeal extends Model<TMeal> {

    private static final long serialVersionUID = 1L;

    private String tId;

    private String tName;

    private String details;

    private BigDecimal price;

    private Integer description;

    private String barid;

    private LocalDateTime createtime;

    private Integer headcount;

    private Integer salesvolume;

    private String cover;

    private Boolean shelves;


    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getDescription() {
        return description;
    }

    public void setDescription(Integer description) {
        this.description = description;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public Integer getHeadcount() {
        return headcount;
    }

    public void setHeadcount(Integer headcount) {
        this.headcount = headcount;
    }

    public Integer getSalesvolume() {
        return salesvolume;
    }

    public void setSalesvolume(Integer salesvolume) {
        this.salesvolume = salesvolume;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Boolean getShelves() {
        return shelves;
    }

    public void setShelves(Boolean shelves) {
        this.shelves = shelves;
    }

    @Override
    protected Serializable pkVal() {
        return this.tId;
    }

    @Override
    public String toString() {
        return "TMeal{" +
        "tId=" + tId +
        ", tName=" + tName +
        ", details=" + details +
        ", price=" + price +
        ", description=" + description +
        ", barid=" + barid +
        ", createtime=" + createtime +
        ", headcount=" + headcount +
        ", salesvolume=" + salesvolume +
        ", cover=" + cover +
        ", shelves=" + shelves +
        "}";
    }
}
