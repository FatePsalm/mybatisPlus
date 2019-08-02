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
public class Subprime extends Model<Subprime> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String abarteamid;

    private String bbarteamid;

    private Integer ascore;

    private Integer bscore;

    private LocalDateTime begintime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAbarteamid() {
        return abarteamid;
    }

    public void setAbarteamid(String abarteamid) {
        this.abarteamid = abarteamid;
    }

    public String getBbarteamid() {
        return bbarteamid;
    }

    public void setBbarteamid(String bbarteamid) {
        this.bbarteamid = bbarteamid;
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

    public LocalDateTime getBegintime() {
        return begintime;
    }

    public void setBegintime(LocalDateTime begintime) {
        this.begintime = begintime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Subprime{" +
        "id=" + id +
        ", abarteamid=" + abarteamid +
        ", bbarteamid=" + bbarteamid +
        ", ascore=" + ascore +
        ", bscore=" + bscore +
        ", begintime=" + begintime +
        "}";
    }
}
