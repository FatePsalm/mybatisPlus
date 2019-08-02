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
public class Pwteam extends Model<Pwteam> {

    private static final long serialVersionUID = 1L;

    /**
     * 战队id
     */
    private String teamid;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 战队名字
     */
    private String teamname;

    /**
     * 创建战队时间
     */
    private LocalDateTime creattime;


    public String getTeamid() {
        return teamid;
    }

    public void setTeamid(String teamid) {
        this.teamid = teamid;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public LocalDateTime getCreattime() {
        return creattime;
    }

    public void setCreattime(LocalDateTime creattime) {
        this.creattime = creattime;
    }

    @Override
    protected Serializable pkVal() {
        return this.teamid;
    }

    @Override
    public String toString() {
        return "Pwteam{" +
        "teamid=" + teamid +
        ", barid=" + barid +
        ", teamname=" + teamname +
        ", creattime=" + creattime +
        "}";
    }
}
