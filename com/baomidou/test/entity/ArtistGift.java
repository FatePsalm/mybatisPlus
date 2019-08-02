package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 艺人礼物打赏记录
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class ArtistGift extends Model<ArtistGift> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 接收人的ID
     */
    private String userid;

    /**
     * 礼物名字
     */
    private String giftName;

    /**
     * 礼物图片名字
     */
    private String icon;

    /**
     * 礼物数量
     */
    private Integer num;

    /**
     * 创建时间
     */
    private LocalDateTime creationTime;

    /**
     * 备注
     */
    private String note;

    /**
     * 发送者
     */
    private String sendUserid;


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

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSendUserid() {
        return sendUserid;
    }

    public void setSendUserid(String sendUserid) {
        this.sendUserid = sendUserid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ArtistGift{" +
        "id=" + id +
        ", userid=" + userid +
        ", giftName=" + giftName +
        ", icon=" + icon +
        ", num=" + num +
        ", creationTime=" + creationTime +
        ", note=" + note +
        ", sendUserid=" + sendUserid +
        "}";
    }
}
