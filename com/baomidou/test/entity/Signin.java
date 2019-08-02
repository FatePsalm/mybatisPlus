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
public class Signin extends Model<Signin> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String barid;

    private LocalDateTime time;

    /**
     * 0：签到；1：签退
     */
    private Boolean type;

    /**
     * 赠送积分
     */
    private Integer score;

    /**
     * 签到批次号
     */
    private Long unionkey;


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

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Long getUnionkey() {
        return unionkey;
    }

    public void setUnionkey(Long unionkey) {
        this.unionkey = unionkey;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Signin{" +
        "id=" + id +
        ", userid=" + userid +
        ", barid=" + barid +
        ", time=" + time +
        ", type=" + type +
        ", score=" + score +
        ", unionkey=" + unionkey +
        "}";
    }
}
