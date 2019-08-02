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
public class Newyeargoods extends Model<Newyeargoods> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * 礼物名称
     */
    private String name;

    /**
     * 枚举下标
     */
    private Integer suffix;

    /**
     * 奖品数量
     */
    private Integer num;

    /**
     * 奖品类型 1到15 对应每天的奖品
     */
    private Integer type;

    /**
     * 活动时间
     */
    private LocalDateTime activitydate;

    /**
     * 奖品类型
     */
    private Integer awardtype;


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

    public Integer getSuffix() {
        return suffix;
    }

    public void setSuffix(Integer suffix) {
        this.suffix = suffix;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDateTime getActivitydate() {
        return activitydate;
    }

    public void setActivitydate(LocalDateTime activitydate) {
        this.activitydate = activitydate;
    }

    public Integer getAwardtype() {
        return awardtype;
    }

    public void setAwardtype(Integer awardtype) {
        this.awardtype = awardtype;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Newyeargoods{" +
        "id=" + id +
        ", name=" + name +
        ", suffix=" + suffix +
        ", num=" + num +
        ", type=" + type +
        ", activitydate=" + activitydate +
        ", awardtype=" + awardtype +
        "}";
    }
}
