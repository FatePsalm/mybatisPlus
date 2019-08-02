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
public class BpTheme extends Model<BpTheme> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private Integer type;

    /**
     * 是否使用
     */
    private Boolean use;

    /**
     * 主题序号
     */
    @TableField("themeNum")
    private Integer themeNum;

    /**
     * 排序字段
     */
    @TableField("theLastTime")
    private Integer theLastTime;

    /**
     * 霸屏语
     */
    @TableField("themeWords")
    private String themeWords;

    /**
     * 主题关键字
     */
    @TableField("keyWords")
    private String keyWords;

    /**
     * 主题图片
     */
    @TableField("themeImage")
    private String themeImage;

    /**
     * 主题视频
     */
    @TableField("themeVideo")
    private String themeVideo;

    /**
     * 主题名
     */
    @TableField("themeName")
    private String themeName;

    /**
     * 主题上架时间
     */
    private LocalDateTime createTime;

    @TableField("isVip")
    private Integer isVip;

    /**
     * 是否付费主题
     */
    private BigDecimal price;

    /**
     * 是否启用
     */
    @TableField("isEnable")
    private Integer isEnable;

    /**
     * 是否为双人霸屏
     */
    @TableField("isTwoPersonBpTheme")
    private Integer isTwoPersonBpTheme;


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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getUse() {
        return use;
    }

    public void setUse(Boolean use) {
        this.use = use;
    }

    public Integer getThemeNum() {
        return themeNum;
    }

    public void setThemeNum(Integer themeNum) {
        this.themeNum = themeNum;
    }

    public Integer getTheLastTime() {
        return theLastTime;
    }

    public void setTheLastTime(Integer theLastTime) {
        this.theLastTime = theLastTime;
    }

    public String getThemeWords() {
        return themeWords;
    }

    public void setThemeWords(String themeWords) {
        this.themeWords = themeWords;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getThemeImage() {
        return themeImage;
    }

    public void setThemeImage(String themeImage) {
        this.themeImage = themeImage;
    }

    public String getThemeVideo() {
        return themeVideo;
    }

    public void setThemeVideo(String themeVideo) {
        this.themeVideo = themeVideo;
    }

    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getIsVip() {
        return isVip;
    }

    public void setIsVip(Integer isVip) {
        this.isVip = isVip;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public Integer getIsTwoPersonBpTheme() {
        return isTwoPersonBpTheme;
    }

    public void setIsTwoPersonBpTheme(Integer isTwoPersonBpTheme) {
        this.isTwoPersonBpTheme = isTwoPersonBpTheme;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BpTheme{" +
        "id=" + id +
        ", barid=" + barid +
        ", type=" + type +
        ", use=" + use +
        ", themeNum=" + themeNum +
        ", theLastTime=" + theLastTime +
        ", themeWords=" + themeWords +
        ", keyWords=" + keyWords +
        ", themeImage=" + themeImage +
        ", themeVideo=" + themeVideo +
        ", themeName=" + themeName +
        ", createTime=" + createTime +
        ", isVip=" + isVip +
        ", price=" + price +
        ", isEnable=" + isEnable +
        ", isTwoPersonBpTheme=" + isTwoPersonBpTheme +
        "}";
    }
}
