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
public class Fanscount extends Model<Fanscount> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private LocalDateTime time;

    @TableField("fansNumByDay")
    private Integer fansNumByDay;

    @TableField("notFansNum")
    private Integer notFansNum;


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

    public Integer getFansNumByDay() {
        return fansNumByDay;
    }

    public void setFansNumByDay(Integer fansNumByDay) {
        this.fansNumByDay = fansNumByDay;
    }

    public Integer getNotFansNum() {
        return notFansNum;
    }

    public void setNotFansNum(Integer notFansNum) {
        this.notFansNum = notFansNum;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Fanscount{" +
        "id=" + id +
        ", barid=" + barid +
        ", time=" + time +
        ", fansNumByDay=" + fansNumByDay +
        ", notFansNum=" + notFansNum +
        "}";
    }
}
