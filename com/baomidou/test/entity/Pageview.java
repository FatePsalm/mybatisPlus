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
public class Pageview extends Model<Pageview> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    @TableField("PVNumber")
    private Integer PVNumber;

    private LocalDateTime time;


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

    public Integer getPVNumber() {
        return PVNumber;
    }

    public void setPVNumber(Integer PVNumber) {
        this.PVNumber = PVNumber;
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
        return "Pageview{" +
        "id=" + id +
        ", barid=" + barid +
        ", PVNumber=" + PVNumber +
        ", time=" + time +
        "}";
    }
}
