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
public class UserInvite extends Model<UserInvite> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 用户id
     */
    private String userid;

    /**
     * 邀请人id
     */
    private String superiorid;

    /**
     * 邀请时间
     */
    @TableField("inviteTime")
    private LocalDateTime inviteTime;

    /**
     * 新手奖励是否领取
     */
    private Boolean get;

    /**
     * 是否完成任务
     */
    @TableField("isPerform")
    private Boolean perform;

    /**
     * 完成任务时间
     */
    @TableField("performTime")
    private LocalDateTime performTime;

    /**
     * 邀请奖励
     */
    @TableField("inviteGift")
    private String inviteGift;

    /**
     * 被邀请人排名
     */
    @TableField("inviteNums")
    private Integer inviteNums;

    /**
     * 领取奖励的时间
     */
    @TableField("awardTime")
    private LocalDateTime awardTime;

    /**
     * 邀请人是否领取奖励
     */
    @TableField("giveInviteGift")
    private Boolean giveInviteGift;

    /**
     * 完成任务的次数
     */
    private Integer invitecount;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getSuperiorid() {
        return superiorid;
    }

    public void setSuperiorid(String superiorid) {
        this.superiorid = superiorid;
    }

    public LocalDateTime getInviteTime() {
        return inviteTime;
    }

    public void setInviteTime(LocalDateTime inviteTime) {
        this.inviteTime = inviteTime;
    }

    public Boolean getGet() {
        return get;
    }

    public void setGet(Boolean get) {
        this.get = get;
    }

    public Boolean getPerform() {
        return perform;
    }

    public void setPerform(Boolean perform) {
        this.perform = perform;
    }

    public LocalDateTime getPerformTime() {
        return performTime;
    }

    public void setPerformTime(LocalDateTime performTime) {
        this.performTime = performTime;
    }

    public String getInviteGift() {
        return inviteGift;
    }

    public void setInviteGift(String inviteGift) {
        this.inviteGift = inviteGift;
    }

    public Integer getInviteNums() {
        return inviteNums;
    }

    public void setInviteNums(Integer inviteNums) {
        this.inviteNums = inviteNums;
    }

    public LocalDateTime getAwardTime() {
        return awardTime;
    }

    public void setAwardTime(LocalDateTime awardTime) {
        this.awardTime = awardTime;
    }

    public Boolean getGiveInviteGift() {
        return giveInviteGift;
    }

    public void setGiveInviteGift(Boolean giveInviteGift) {
        this.giveInviteGift = giveInviteGift;
    }

    public Integer getInvitecount() {
        return invitecount;
    }

    public void setInvitecount(Integer invitecount) {
        this.invitecount = invitecount;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserInvite{" +
        "id=" + id +
        ", userid=" + userid +
        ", superiorid=" + superiorid +
        ", inviteTime=" + inviteTime +
        ", get=" + get +
        ", perform=" + perform +
        ", performTime=" + performTime +
        ", inviteGift=" + inviteGift +
        ", inviteNums=" + inviteNums +
        ", awardTime=" + awardTime +
        ", giveInviteGift=" + giveInviteGift +
        ", invitecount=" + invitecount +
        "}";
    }
}
