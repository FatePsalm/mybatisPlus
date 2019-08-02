package com.baomidou.test.entity;

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
public class ApplyOutblack extends Model<ApplyOutblack> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 用户id
     */
    private String userid;

    /**
     * 申请时间
     */
    private LocalDateTime applytime;

    /**
     * 酒吧名称
     */
    private String barname;

    /**
     * y用户名称
     */
    private String username;

    /**
     * 用户头像
     */
    private String userhead;

    /**
     * 申请消息
     */
    @TableField("applyMsg")
    private String applyMsg;

    /**
     * 是否通过
     */
    @TableField("isPass")
    private Integer isPass;

    /**
     * 申请次数
     */
    @TableField("applyNums")
    private Integer applyNums;

    /**
     * 客服拒绝理由
     */
    @TableField("kfMsg")
    private String kfMsg;

    /**
     * 拉黑类型
     */
    private Integer type;

    /**
     * 拉黑三天黑名单过期
     */
    private LocalDateTime blacktime;


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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public LocalDateTime getApplytime() {
        return applytime;
    }

    public void setApplytime(LocalDateTime applytime) {
        this.applytime = applytime;
    }

    public String getBarname() {
        return barname;
    }

    public void setBarname(String barname) {
        this.barname = barname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserhead() {
        return userhead;
    }

    public void setUserhead(String userhead) {
        this.userhead = userhead;
    }

    public String getApplyMsg() {
        return applyMsg;
    }

    public void setApplyMsg(String applyMsg) {
        this.applyMsg = applyMsg;
    }

    public Integer getIsPass() {
        return isPass;
    }

    public void setIsPass(Integer isPass) {
        this.isPass = isPass;
    }

    public Integer getApplyNums() {
        return applyNums;
    }

    public void setApplyNums(Integer applyNums) {
        this.applyNums = applyNums;
    }

    public String getKfMsg() {
        return kfMsg;
    }

    public void setKfMsg(String kfMsg) {
        this.kfMsg = kfMsg;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDateTime getBlacktime() {
        return blacktime;
    }

    public void setBlacktime(LocalDateTime blacktime) {
        this.blacktime = blacktime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ApplyOutblack{" +
        "id=" + id +
        ", barid=" + barid +
        ", userid=" + userid +
        ", applytime=" + applytime +
        ", barname=" + barname +
        ", username=" + username +
        ", userhead=" + userhead +
        ", applyMsg=" + applyMsg +
        ", isPass=" + isPass +
        ", applyNums=" + applyNums +
        ", kfMsg=" + kfMsg +
        ", type=" + type +
        ", blacktime=" + blacktime +
        "}";
    }
}
