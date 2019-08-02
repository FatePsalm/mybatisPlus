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
public class Gamerecord extends Model<Gamerecord> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String subprimeid;

    private String barid;

    private Integer ascore;

    private Integer bscore;

    private Integer result;

    private LocalDateTime time;

    private Boolean use;


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

    public String getSubprimeid() {
        return subprimeid;
    }

    public void setSubprimeid(String subprimeid) {
        this.subprimeid = subprimeid;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Integer getAscore() {
        return ascore;
    }

    public void setAscore(Integer ascore) {
        this.ascore = ascore;
    }

    public Integer getBscore() {
        return bscore;
    }

    public void setBscore(Integer bscore) {
        this.bscore = bscore;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Boolean getUse() {
        return use;
    }

    public void setUse(Boolean use) {
        this.use = use;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Gamerecord{" +
        "id=" + id +
        ", userid=" + userid +
        ", subprimeid=" + subprimeid +
        ", barid=" + barid +
        ", ascore=" + ascore +
        ", bscore=" + bscore +
        ", result=" + result +
        ", time=" + time +
        ", use=" + use +
        "}";
    }
}
