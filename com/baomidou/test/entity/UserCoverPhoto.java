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
public class UserCoverPhoto extends Model<UserCoverPhoto> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userId;

    private String imgUrl;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    /**
     * 顺序
     */
    private Integer orderSeq;


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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getOrderSeq() {
        return orderSeq;
    }

    public void setOrderSeq(Integer orderSeq) {
        this.orderSeq = orderSeq;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserCoverPhoto{" +
        "id=" + id +
        ", userId=" + userId +
        ", imgUrl=" + imgUrl +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", orderSeq=" + orderSeq +
        "}";
    }
}
