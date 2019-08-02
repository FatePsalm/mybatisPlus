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
public class Hornmsg extends Model<Hornmsg> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private String id;

    /**
     * 用户id
     */
    @TableField("userId")
    private String userId;

    /**
     * 酒吧id
     */
    @TableField("barId")
    private String barId;

    /**
     * 订单id
     */
    private String objid;

    /**
     * 功能,1小喇叭
     */
    private Integer type;

    /**
     * 消息类型
     */
    private Integer msgType;

    private LocalDateTime createTime;

    /**
     * 消息内容
     */
    private String msg;

    /**
     * 图片地址
     */
    private String imgsrc;

    /**
     * 视频图片
     */
    private String videoimgsrc;

    /**
     * 视频地址
     */
    private String videosrc;

    /**
     * 接收人数
     */
    private Integer acceptnum;

    /**
     * 0 未审核 1 审核通过 2 未通过
     */
    private Integer ischeck;

    /**
     * 视频是否违规 1:违规 0:不违规
     */
    private Boolean del;


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

    public String getBarId() {
        return barId;
    }

    public void setBarId(String barId) {
        this.barId = barId;
    }

    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getMsgType() {
        return msgType;
    }

    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getVideoimgsrc() {
        return videoimgsrc;
    }

    public void setVideoimgsrc(String videoimgsrc) {
        this.videoimgsrc = videoimgsrc;
    }

    public String getVideosrc() {
        return videosrc;
    }

    public void setVideosrc(String videosrc) {
        this.videosrc = videosrc;
    }

    public Integer getAcceptnum() {
        return acceptnum;
    }

    public void setAcceptnum(Integer acceptnum) {
        this.acceptnum = acceptnum;
    }

    public Integer getIscheck() {
        return ischeck;
    }

    public void setIscheck(Integer ischeck) {
        this.ischeck = ischeck;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Hornmsg{" +
        "id=" + id +
        ", userId=" + userId +
        ", barId=" + barId +
        ", objid=" + objid +
        ", type=" + type +
        ", msgType=" + msgType +
        ", createTime=" + createTime +
        ", msg=" + msg +
        ", imgsrc=" + imgsrc +
        ", videoimgsrc=" + videoimgsrc +
        ", videosrc=" + videosrc +
        ", acceptnum=" + acceptnum +
        ", ischeck=" + ischeck +
        ", del=" + del +
        "}";
    }
}
