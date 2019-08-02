package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 商品表：打赏礼物商品价格表；
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class Goods extends Model<Goods> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 商品类型
     */
    private Integer type;

    /**
     * 显示时间:霸屏或打赏显示时间
     */
    private Integer time;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 显示次数
     */
    @TableField("showNum")
    private Integer showNum;

    /**
     * 礼物自定义的别名
     */
    private String nickname;

    private String image;

    /**
     * 礼物排序序号.倒序
     */
    private Integer sort;

    /**
     * 是否选中
     */
    private Integer isCheck;

    /**
     * 礼物索引
     */
    @TableField("giftIndex")
    private Integer giftIndex;


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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Integer getShowNum() {
        return showNum;
    }

    public void setShowNum(Integer showNum) {
        this.showNum = showNum;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
    }

    public Integer getGiftIndex() {
        return giftIndex;
    }

    public void setGiftIndex(Integer giftIndex) {
        this.giftIndex = giftIndex;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Goods{" +
        "id=" + id +
        ", name=" + name +
        ", price=" + price +
        ", type=" + type +
        ", time=" + time +
        ", barid=" + barid +
        ", showNum=" + showNum +
        ", nickname=" + nickname +
        ", image=" + image +
        ", sort=" + sort +
        ", isCheck=" + isCheck +
        ", giftIndex=" + giftIndex +
        "}";
    }
}
