package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 龙战于野海选抽奖记录
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class HerosAward extends Model<HerosAward> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private String id;

    /**
     * 抽奖者UserId
     */
    private String userId;

    /**
     * 礼物ID
     */
    private String goodsId;

    /**
     * 姓名
     */
    private String myName;

    /**
     * 联系电话
     */
    private String tel;

    /**
     * 邮寄地址
     */
    private String address;

    /**
     * 活动类型
     */
    private Integer activityType;

    /**
     * 奖品类型 1-实物奖品 2-虚拟奖品
     */
    private Integer type;

    /**
     * 兑奖码
     */
    private String claimAPrize;

    /**
     * 是否中奖 0-未中奖 1-中奖
     */
    private Boolean award;

    /**
     * 是否兑换
     */
    private Boolean exchange;

    /**
     * 抽奖时间
     */
    private LocalDateTime creationTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getClaimAPrize() {
        return claimAPrize;
    }

    public void setClaimAPrize(String claimAPrize) {
        this.claimAPrize = claimAPrize;
    }

    public Boolean getAward() {
        return award;
    }

    public void setAward(Boolean award) {
        this.award = award;
    }

    public Boolean getExchange() {
        return exchange;
    }

    public void setExchange(Boolean exchange) {
        this.exchange = exchange;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "HerosAward{" +
        "id=" + id +
        ", userId=" + userId +
        ", goodsId=" + goodsId +
        ", myName=" + myName +
        ", tel=" + tel +
        ", address=" + address +
        ", activityType=" + activityType +
        ", type=" + type +
        ", claimAPrize=" + claimAPrize +
        ", award=" + award +
        ", exchange=" + exchange +
        ", creationTime=" + creationTime +
        "}";
    }
}
