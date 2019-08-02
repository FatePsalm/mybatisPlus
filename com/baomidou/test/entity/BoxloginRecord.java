package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 盒子登陆记录表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class BoxloginRecord extends Model<BoxloginRecord> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private LocalDateTime time;

    @TableField("loginType")
    private String loginType;


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

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BoxloginRecord{" +
        "id=" + id +
        ", barid=" + barid +
        ", time=" + time +
        ", loginType=" + loginType +
        "}";
    }
}
