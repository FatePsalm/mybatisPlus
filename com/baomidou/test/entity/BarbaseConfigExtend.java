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
public class BarbaseConfigExtend extends Model<BarbaseConfigExtend> {

    private static final long serialVersionUID = 1L;

    private String id;

    @TableField("barId")
    private String barId;

    /**
     * 砸金蛋活动名称
     */
    @TableField("smashEggName")
    private String smashEggName;

    /**
     * 砸金蛋数量
     */
    @TableField("smashEggNumber")
    private Integer smashEggNumber;

    /**
     * 砸金蛋价格
     */
    @TableField("smashEggPrice")
    private Double smashEggPrice;

    /**
     * 砸金蛋状态
     */
    @TableField("smashEggState")
    private Integer smashEggState;

    /**
     * 是否开启砸金蛋游戏
     */
    @TableField("isSmashEgg")
    private Boolean smashEgg;

    /**
     * 数据类型
     */
    private Integer type;

    /**
     * 是否开启自动打赏动画
     */
    @TableField("isRewardAnimation")
    private Integer isRewardAnimation;


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

    public String getSmashEggName() {
        return smashEggName;
    }

    public void setSmashEggName(String smashEggName) {
        this.smashEggName = smashEggName;
    }

    public Integer getSmashEggNumber() {
        return smashEggNumber;
    }

    public void setSmashEggNumber(Integer smashEggNumber) {
        this.smashEggNumber = smashEggNumber;
    }

    public Double getSmashEggPrice() {
        return smashEggPrice;
    }

    public void setSmashEggPrice(Double smashEggPrice) {
        this.smashEggPrice = smashEggPrice;
    }

    public Integer getSmashEggState() {
        return smashEggState;
    }

    public void setSmashEggState(Integer smashEggState) {
        this.smashEggState = smashEggState;
    }

    public Boolean getSmashEgg() {
        return smashEgg;
    }

    public void setSmashEgg(Boolean smashEgg) {
        this.smashEgg = smashEgg;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIsRewardAnimation() {
        return isRewardAnimation;
    }

    public void setIsRewardAnimation(Integer isRewardAnimation) {
        this.isRewardAnimation = isRewardAnimation;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BarbaseConfigExtend{" +
        "id=" + id +
        ", barId=" + barId +
        ", smashEggName=" + smashEggName +
        ", smashEggNumber=" + smashEggNumber +
        ", smashEggPrice=" + smashEggPrice +
        ", smashEggState=" + smashEggState +
        ", smashEgg=" + smashEgg +
        ", type=" + type +
        ", isRewardAnimation=" + isRewardAnimation +
        "}";
    }
}
