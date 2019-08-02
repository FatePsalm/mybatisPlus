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
public class UserAwardPoint extends Model<UserAwardPoint> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private LocalDateTime time;

    /**
     * 用户剩余抽奖点数
     */
    private Integer point;


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

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserAwardPoint{" +
        "id=" + id +
        ", userid=" + userid +
        ", time=" + time +
        ", point=" + point +
        "}";
    }
}
