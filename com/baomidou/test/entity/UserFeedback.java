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
public class UserFeedback extends Model<UserFeedback> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
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
     * 反馈信息
     */
    private String feedback;

    /**
     * 联系方式
     */
    private String contact;

    /**
     * 图片地址，多个图片用,分隔
     */
    private String imgurl;

    /**
     * 创建时间
     */
    private LocalDateTime createtime;


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

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserFeedback{" +
        "id=" + id +
        ", barid=" + barid +
        ", userid=" + userid +
        ", feedback=" + feedback +
        ", contact=" + contact +
        ", imgurl=" + imgurl +
        ", createtime=" + createtime +
        "}";
    }
}
