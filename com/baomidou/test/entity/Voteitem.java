package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 投票选项表：用户提交对应资料参与投票活动。
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class Voteitem extends Model<Voteitem> {

    private static final long serialVersionUID = 1L;

    /**
     * 选项主键
     */
    private String tid;

    /**
     * 投票主键id
     */
    private String cid;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 参与投票用户id
     */
    private String userid;

    /**
     * 标题
     */
    private String title;

    private String picture;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private LocalDateTime time;

    /**
     * 票数
     */
    private Integer votes;

    /**
     * 急速拉票票数
     */
    private Integer speedvotes;

    /**
     * 投票选项编号
     */
    private Integer number;

    /**
     * 是否审核:0、待审核；1、审核通过；2、审核通过.
     */
    private Integer ischeck;

    /**
     * 投票视频链接
     */
    @TableField("videoSrc")
    private String videoSrc;

    /**
     * 投票视频缩略图
     */
    private String thumbnail;

    /**
     * 投票手机用户的联系方式
     */
    private String contact;

    /**
     * pk选手二维码连接
     */
    private String pkurl;

    /**
     * 投票选手是否使用
     */
    private Integer isuse;

    /**
     * 所属组
     */
    private String groupmsg;

    /**
     * pk队长id
     */
    private String captainid;

    private BigDecimal captaindivid;

    private BigDecimal pkuserdivid;

    /**
     * 选手背景图
     */
    private String backimage;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * 微信号
     */
    private String wxCode;

    /**
     * 审核拒绝说明
     */
    @TableField("verifyTxt")
    private String verifyTxt;

    /**
     * 预修改资料
     */
    @TableField("updateInfo")
    private String updateInfo;

    /**
     * 资料修改审核状态
     */
    @TableField("updateCheck")
    private Integer updateCheck;


    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    public Integer getSpeedvotes() {
        return speedvotes;
    }

    public void setSpeedvotes(Integer speedvotes) {
        this.speedvotes = speedvotes;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getIscheck() {
        return ischeck;
    }

    public void setIscheck(Integer ischeck) {
        this.ischeck = ischeck;
    }

    public String getVideoSrc() {
        return videoSrc;
    }

    public void setVideoSrc(String videoSrc) {
        this.videoSrc = videoSrc;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPkurl() {
        return pkurl;
    }

    public void setPkurl(String pkurl) {
        this.pkurl = pkurl;
    }

    public Integer getIsuse() {
        return isuse;
    }

    public void setIsuse(Integer isuse) {
        this.isuse = isuse;
    }

    public String getGroupmsg() {
        return groupmsg;
    }

    public void setGroupmsg(String groupmsg) {
        this.groupmsg = groupmsg;
    }

    public String getCaptainid() {
        return captainid;
    }

    public void setCaptainid(String captainid) {
        this.captainid = captainid;
    }

    public BigDecimal getCaptaindivid() {
        return captaindivid;
    }

    public void setCaptaindivid(BigDecimal captaindivid) {
        this.captaindivid = captaindivid;
    }

    public BigDecimal getPkuserdivid() {
        return pkuserdivid;
    }

    public void setPkuserdivid(BigDecimal pkuserdivid) {
        this.pkuserdivid = pkuserdivid;
    }

    public String getBackimage() {
        return backimage;
    }

    public void setBackimage(String backimage) {
        this.backimage = backimage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWxCode() {
        return wxCode;
    }

    public void setWxCode(String wxCode) {
        this.wxCode = wxCode;
    }

    public String getVerifyTxt() {
        return verifyTxt;
    }

    public void setVerifyTxt(String verifyTxt) {
        this.verifyTxt = verifyTxt;
    }

    public String getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(String updateInfo) {
        this.updateInfo = updateInfo;
    }

    public Integer getUpdateCheck() {
        return updateCheck;
    }

    public void setUpdateCheck(Integer updateCheck) {
        this.updateCheck = updateCheck;
    }

    @Override
    protected Serializable pkVal() {
        return this.tid;
    }

    @Override
    public String toString() {
        return "Voteitem{" +
        "tid=" + tid +
        ", cid=" + cid +
        ", barid=" + barid +
        ", userid=" + userid +
        ", title=" + title +
        ", picture=" + picture +
        ", description=" + description +
        ", time=" + time +
        ", votes=" + votes +
        ", speedvotes=" + speedvotes +
        ", number=" + number +
        ", ischeck=" + ischeck +
        ", videoSrc=" + videoSrc +
        ", thumbnail=" + thumbnail +
        ", contact=" + contact +
        ", pkurl=" + pkurl +
        ", isuse=" + isuse +
        ", groupmsg=" + groupmsg +
        ", captainid=" + captainid +
        ", captaindivid=" + captaindivid +
        ", pkuserdivid=" + pkuserdivid +
        ", backimage=" + backimage +
        ", name=" + name +
        ", wxCode=" + wxCode +
        ", verifyTxt=" + verifyTxt +
        ", updateInfo=" + updateInfo +
        ", updateCheck=" + updateCheck +
        "}";
    }
}
