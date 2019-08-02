package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 用户关注表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class UserAttention extends Model<UserAttention> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String toUserid;

    private LocalDateTime createTime;

    /**
     * 距离
     */
    private BigDecimal distance;

    /**
     * 类型
     */
    private Integer type;


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

    public BigDecimal getDistance() {
        return distance;
    }

    public void setDistance(BigDecimal distance) {
        this.distance = distance;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserAttention{" +
        "id=" + id +
        ", userid=" + userid +
        ", toUserid=" + toUserid +
        ", createTime=" + createTime +
        ", distance=" + distance +
        ", type=" + type +
        "}";
    }
}
