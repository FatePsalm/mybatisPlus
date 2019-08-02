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
public class UserDynamics extends Model<UserDynamics> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    @TableField("imgUrl")
    private String imgUrl;

    private String msg;

    private LocalDateTime time;

    @TableField("sortId")
    private Integer sortId;

    private String address;

    @TableField("videoUrl")
    private String videoUrl;


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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserDynamics{" +
        "id=" + id +
        ", userid=" + userid +
        ", imgUrl=" + imgUrl +
        ", msg=" + msg +
        ", time=" + time +
        ", sortId=" + sortId +
        ", address=" + address +
        ", videoUrl=" + videoUrl +
        "}";
    }
}
