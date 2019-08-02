package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 互动游戏活动库
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
@TableName("Interact_play")
public class InteractPlay extends Model<InteractPlay> {

    private static final long serialVersionUID = 1L;

    /**
     * 互动游戏活动ID
     */
    private String id;

    /**
     * 创建时间
     */
    private LocalDateTime creationTime;

    /**
     * 图片地址
     */
    private String interactImg;

    /**
     * 玩法名字
     */
    private String interactName;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 规则说明
     */
    private String rulesText;

    /**
     * 是否开启
     */
    private Boolean open;

    /**
     * 是否删除
     */
    private Boolean del;

    /**
     * 酒吧ID
     */
    private String barid;

    /**
     * 类型
     */
    private Integer interactType;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public String getInteractImg() {
        return interactImg;
    }

    public void setInteractImg(String interactImg) {
        this.interactImg = interactImg;
    }

    public String getInteractName() {
        return interactName;
    }

    public void setInteractName(String interactName) {
        this.interactName = interactName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getRulesText() {
        return rulesText;
    }

    public void setRulesText(String rulesText) {
        this.rulesText = rulesText;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Integer getInteractType() {
        return interactType;
    }

    public void setInteractType(Integer interactType) {
        this.interactType = interactType;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "InteractPlay{" +
        "id=" + id +
        ", creationTime=" + creationTime +
        ", interactImg=" + interactImg +
        ", interactName=" + interactName +
        ", price=" + price +
        ", rulesText=" + rulesText +
        ", open=" + open +
        ", del=" + del +
        ", barid=" + barid +
        ", interactType=" + interactType +
        "}";
    }
}
