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
public class Barcabinet extends Model<Barcabinet> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String cabinetid;

    private String imgid;

    private String name;

    private String alcoholic;

    private String price;

    private String introduce;

    private LocalDateTime time;


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

    public String getCabinetid() {
        return cabinetid;
    }

    public void setCabinetid(String cabinetid) {
        this.cabinetid = cabinetid;
    }

    public String getImgid() {
        return imgid;
    }

    public void setImgid(String imgid) {
        this.imgid = imgid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(String alcoholic) {
        this.alcoholic = alcoholic;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
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
        return "Barcabinet{" +
        "id=" + id +
        ", barid=" + barid +
        ", cabinetid=" + cabinetid +
        ", imgid=" + imgid +
        ", name=" + name +
        ", alcoholic=" + alcoholic +
        ", price=" + price +
        ", introduce=" + introduce +
        ", time=" + time +
        "}";
    }
}
