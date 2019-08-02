package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 用户好友表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class UserFrends extends Model<UserFrends> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 用户id1
     */
    private String userid;

    /**
     * 用户ID2
     */
    private String toUserid;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


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

    public String getToUserid() {
        return toUserid;
    }

    public void setToUserid(String toUserid) {
        this.toUserid = toUserid;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserFrends{" +
        "id=" + id +
        ", userid=" + userid +
        ", toUserid=" + toUserid +
        ", createTime=" + createTime +
        "}";
    }
}
