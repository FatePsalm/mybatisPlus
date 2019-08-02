package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 聊啦消息记录表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class TalkRecord extends Model<TalkRecord> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 消息发送方userid
     */
    private String senduserid;

    /**
     * 消息接收方userid
     */
    private String acceptuserid;

    /**
     * 消息内容
     */
    private String message;

    /**
     * 消息类型：1.系统消息(显示酒吧名字)2.普通消息内容
     */
    private Integer type;

    /**
     * 消息发送时间
     */
    private LocalDateTime time;

    /**
     * 是否已读
     */
    private Boolean read;

    /**
     * 消息内容图片地址
     */
    private String imgsrc;

    private String talkongroup;

    private String userdel;

    /**
     * 喇叭图片
     */
    private String pic;

    /**
     * 视频地址
     */
    private String videosrc;

    /**
     * 时长
     */
    private Integer duration;

    /**
     * 支付状态
     */
    @TableField("payState")
    private Integer payState;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenduserid() {
        return senduserid;
    }

    public void setSenduserid(String senduserid) {
        this.senduserid = senduserid;
    }

    public String getAcceptuserid() {
        return acceptuserid;
    }

    public void setAcceptuserid(String acceptuserid) {
        this.acceptuserid = acceptuserid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getTalkongroup() {
        return talkongroup;
    }

    public void setTalkongroup(String talkongroup) {
        this.talkongroup = talkongroup;
    }

    public String getUserdel() {
        return userdel;
    }

    public void setUserdel(String userdel) {
        this.userdel = userdel;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getVideosrc() {
        return videosrc;
    }

    public void setVideosrc(String videosrc) {
        this.videosrc = videosrc;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getPayState() {
        return payState;
    }

    public void setPayState(Integer payState) {
        this.payState = payState;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TalkRecord{" +
        "id=" + id +
        ", senduserid=" + senduserid +
        ", acceptuserid=" + acceptuserid +
        ", message=" + message +
        ", type=" + type +
        ", time=" + time +
        ", read=" + read +
        ", imgsrc=" + imgsrc +
        ", talkongroup=" + talkongroup +
        ", userdel=" + userdel +
        ", pic=" + pic +
        ", videosrc=" + videosrc +
        ", duration=" + duration +
        ", payState=" + payState +
        "}";
    }
}
