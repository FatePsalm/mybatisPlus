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
public class ActiveCustomer extends Model<ActiveCustomer> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String oneGift;

    /**
     * 是否赠送
     */
    private Boolean oneSend;

    /**
     * 第一次是否使用
     */
    private Boolean oneUse;

    /**
     * 首次赠送开始日期
     */
    private LocalDateTime oneTime;

    /**
     * 首次赠送结束日期
     */
    private LocalDateTime oneOverTime;

    private String bpGift;

    /**
     * 霸屏是否赠送
     */
    private Boolean bpSend;

    /**
     * 霸屏是否使用
     */
    private Boolean bpUse;

    /**
     * 霸屏赠送日期
     */
    private LocalDateTime bpTime;

    /**
     * 霸屏赠送结束日期
     */
    private LocalDateTime bpOverTime;

    /**
     * 用户类型
     */
    private String type;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 电话
     */
    private String telPhone;


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

    public String getOneGift() {
        return oneGift;
    }

    public void setOneGift(String oneGift) {
        this.oneGift = oneGift;
    }

    public Boolean getOneSend() {
        return oneSend;
    }

    public void setOneSend(Boolean oneSend) {
        this.oneSend = oneSend;
    }

    public Boolean getOneUse() {
        return oneUse;
    }

    public void setOneUse(Boolean oneUse) {
        this.oneUse = oneUse;
    }

    public LocalDateTime getOneTime() {
        return oneTime;
    }

    public void setOneTime(LocalDateTime oneTime) {
        this.oneTime = oneTime;
    }

    public LocalDateTime getOneOverTime() {
        return oneOverTime;
    }

    public void setOneOverTime(LocalDateTime oneOverTime) {
        this.oneOverTime = oneOverTime;
    }

    public String getBpGift() {
        return bpGift;
    }

    public void setBpGift(String bpGift) {
        this.bpGift = bpGift;
    }

    public Boolean getBpSend() {
        return bpSend;
    }

    public void setBpSend(Boolean bpSend) {
        this.bpSend = bpSend;
    }

    public Boolean getBpUse() {
        return bpUse;
    }

    public void setBpUse(Boolean bpUse) {
        this.bpUse = bpUse;
    }

    public LocalDateTime getBpTime() {
        return bpTime;
    }

    public void setBpTime(LocalDateTime bpTime) {
        this.bpTime = bpTime;
    }

    public LocalDateTime getBpOverTime() {
        return bpOverTime;
    }

    public void setBpOverTime(LocalDateTime bpOverTime) {
        this.bpOverTime = bpOverTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ActiveCustomer{" +
        "id=" + id +
        ", barid=" + barid +
        ", oneGift=" + oneGift +
        ", oneSend=" + oneSend +
        ", oneUse=" + oneUse +
        ", oneTime=" + oneTime +
        ", oneOverTime=" + oneOverTime +
        ", bpGift=" + bpGift +
        ", bpSend=" + bpSend +
        ", bpUse=" + bpUse +
        ", bpTime=" + bpTime +
        ", bpOverTime=" + bpOverTime +
        ", type=" + type +
        ", realName=" + realName +
        ", telPhone=" + telPhone +
        "}";
    }
}
