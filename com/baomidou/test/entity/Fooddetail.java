package com.baomidou.test.entity;

import java.math.BigDecimal;
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
public class Fooddetail extends Model<Fooddetail> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String typeid;

    private String name;

    private BigDecimal price;

    private String imgid;

    private String remark;

    private String barid;

    private Boolean del;

    private LocalDateTime time;

    private Integer allin;

    private Integer partin;

    private Integer maxordernum;

    @TableField("isInteractfood")
    private Boolean interactfood;

    /**
     * 增加微喵点单商品图片
     */
    private String imgsrc;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImgid() {
        return imgid;
    }

    public void setImgid(String imgid) {
        this.imgid = imgid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
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

    public Integer getAllin() {
        return allin;
    }

    public void setAllin(Integer allin) {
        this.allin = allin;
    }

    public Integer getPartin() {
        return partin;
    }

    public void setPartin(Integer partin) {
        this.partin = partin;
    }

    public Integer getMaxordernum() {
        return maxordernum;
    }

    public void setMaxordernum(Integer maxordernum) {
        this.maxordernum = maxordernum;
    }

    public Boolean getInteractfood() {
        return interactfood;
    }

    public void setInteractfood(Boolean interactfood) {
        this.interactfood = interactfood;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Fooddetail{" +
        "id=" + id +
        ", typeid=" + typeid +
        ", name=" + name +
        ", price=" + price +
        ", imgid=" + imgid +
        ", remark=" + remark +
        ", barid=" + barid +
        ", del=" + del +
        ", time=" + time +
        ", allin=" + allin +
        ", partin=" + partin +
        ", maxordernum=" + maxordernum +
        ", interactfood=" + interactfood +
        ", imgsrc=" + imgsrc +
        "}";
    }
}
