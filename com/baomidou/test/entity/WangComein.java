package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 用户扫码进入旺小宝记录
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class WangComein extends Model<WangComein> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String barid;

    private String sitnum;

    private LocalDateTime time;


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

    public String getSitnum() {
        return sitnum;
    }

    public void setSitnum(String sitnum) {
        this.sitnum = sitnum;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "WangComein{" +
        "id=" + id +
        ", userid=" + userid +
        ", barid=" + barid +
        ", sitnum=" + sitnum +
        ", time=" + time +
        "}";
    }
}
