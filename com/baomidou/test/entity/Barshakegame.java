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
public class Barshakegame extends Model<Barshakegame> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String waiterid;

    private LocalDateTime begintime;

    @TableField("manNum")
    private Integer manNum;

    @TableField("womanNum")
    private Integer womanNum;


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

    public String getWaiterid() {
        return waiterid;
    }

    public void setWaiterid(String waiterid) {
        this.waiterid = waiterid;
    }

    public LocalDateTime getBegintime() {
        return begintime;
    }

    public void setBegintime(LocalDateTime begintime) {
        this.begintime = begintime;
    }

    public Integer getManNum() {
        return manNum;
    }

    public void setManNum(Integer manNum) {
        this.manNum = manNum;
    }

    public Integer getWomanNum() {
        return womanNum;
    }

    public void setWomanNum(Integer womanNum) {
        this.womanNum = womanNum;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Barshakegame{" +
        "id=" + id +
        ", barid=" + barid +
        ", waiterid=" + waiterid +
        ", begintime=" + begintime +
        ", manNum=" + manNum +
        ", womanNum=" + womanNum +
        "}";
    }
}
