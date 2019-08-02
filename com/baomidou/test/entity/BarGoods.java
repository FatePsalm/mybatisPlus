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
public class BarGoods extends Model<BarGoods> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private BigDecimal price;

    private BigDecimal realprice;

    private LocalDateTime time;

    private String pic;

    private Integer ordershow;

    private String barid;

    private String unit;

    @TableField("asDel")
    private Boolean asDel;

    @TableField("asUsed")
    private Boolean asUsed;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public BigDecimal getRealprice() {
        return realprice;
    }

    public void setRealprice(BigDecimal realprice) {
        this.realprice = realprice;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getOrdershow() {
        return ordershow;
    }

    public void setOrdershow(Integer ordershow) {
        this.ordershow = ordershow;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Boolean getAsDel() {
        return asDel;
    }

    public void setAsDel(Boolean asDel) {
        this.asDel = asDel;
    }

    public Boolean getAsUsed() {
        return asUsed;
    }

    public void setAsUsed(Boolean asUsed) {
        this.asUsed = asUsed;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BarGoods{" +
        "id=" + id +
        ", name=" + name +
        ", price=" + price +
        ", realprice=" + realprice +
        ", time=" + time +
        ", pic=" + pic +
        ", ordershow=" + ordershow +
        ", barid=" + barid +
        ", unit=" + unit +
        ", asDel=" + asDel +
        ", asUsed=" + asUsed +
        "}";
    }
}
