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
public class Bandnice extends Model<Bandnice> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String staticfileid;

    private String userid;

    private String barid;

    private LocalDateTime time;

    private String remark;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStaticfileid() {
        return staticfileid;
    }

    public void setStaticfileid(String staticfileid) {
        this.staticfileid = staticfileid;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Bandnice{" +
        "id=" + id +
        ", staticfileid=" + staticfileid +
        ", userid=" + userid +
        ", barid=" + barid +
        ", time=" + time +
        ", remark=" + remark +
        "}";
    }
}
