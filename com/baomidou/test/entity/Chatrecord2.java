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
public class Chatrecord2 extends Model<Chatrecord2> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String content;

    private LocalDateTime time;

    private String acceptid;

    private Boolean read;

    private String senderid;

    @TableField("isClear")
    private Boolean clear;

    private String imgurl;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getAcceptid() {
        return acceptid;
    }

    public void setAcceptid(String acceptid) {
        this.acceptid = acceptid;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    public String getSenderid() {
        return senderid;
    }

    public void setSenderid(String senderid) {
        this.senderid = senderid;
    }

    public Boolean getClear() {
        return clear;
    }

    public void setClear(Boolean clear) {
        this.clear = clear;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Chatrecord2{" +
        "id=" + id +
        ", content=" + content +
        ", time=" + time +
        ", acceptid=" + acceptid +
        ", read=" + read +
        ", senderid=" + senderid +
        ", clear=" + clear +
        ", imgurl=" + imgurl +
        "}";
    }
}
