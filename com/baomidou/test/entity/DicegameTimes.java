package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class DicegameTimes extends Model<DicegameTimes> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String userid;

    /**
     * 比赛场次id
     */
    private String matchid;

    /**
     * 用户姓名
     */
    private String username;

    /**
     * 点数
     */
    private Integer number;

    /**
     * 获得点数的时间
     */
    private Long time;


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

    public String getMatchid() {
        return matchid;
    }

    public void setMatchid(String matchid) {
        this.matchid = matchid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "DicegameTimes{" +
        "id=" + id +
        ", barid=" + barid +
        ", userid=" + userid +
        ", matchid=" + matchid +
        ", username=" + username +
        ", number=" + number +
        ", time=" + time +
        "}";
    }
}
