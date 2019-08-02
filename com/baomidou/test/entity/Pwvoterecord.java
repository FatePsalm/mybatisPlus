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
public class Pwvoterecord extends Model<Pwvoterecord> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String matchid;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 胜利战队的id
     */
    private String winteamid;

    /**
     * 抽奖时间
     */
    private LocalDateTime raffertime;

    /**
     * 抽奖人数
     */
    private Integer usernums;

    /**
     * 幸运观众
     */
    private String luckusers;

    /**
     * 投票主题
     */
    private String theme;

    /**
     * 比赛创建时间
     */
    private LocalDateTime creattime;

    /**
     * 结束时间
     */
    private LocalDateTime endtime;


    public String getMatchid() {
        return matchid;
    }

    public void setMatchid(String matchid) {
        this.matchid = matchid;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getWinteamid() {
        return winteamid;
    }

    public void setWinteamid(String winteamid) {
        this.winteamid = winteamid;
    }

    public LocalDateTime getRaffertime() {
        return raffertime;
    }

    public void setRaffertime(LocalDateTime raffertime) {
        this.raffertime = raffertime;
    }

    public Integer getUsernums() {
        return usernums;
    }

    public void setUsernums(Integer usernums) {
        this.usernums = usernums;
    }

    public String getLuckusers() {
        return luckusers;
    }

    public void setLuckusers(String luckusers) {
        this.luckusers = luckusers;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public LocalDateTime getCreattime() {
        return creattime;
    }

    public void setCreattime(LocalDateTime creattime) {
        this.creattime = creattime;
    }

    public LocalDateTime getEndtime() {
        return endtime;
    }

    public void setEndtime(LocalDateTime endtime) {
        this.endtime = endtime;
    }

    @Override
    protected Serializable pkVal() {
        return this.matchid;
    }

    @Override
    public String toString() {
        return "Pwvoterecord{" +
        "matchid=" + matchid +
        ", barid=" + barid +
        ", winteamid=" + winteamid +
        ", raffertime=" + raffertime +
        ", usernums=" + usernums +
        ", luckusers=" + luckusers +
        ", theme=" + theme +
        ", creattime=" + creattime +
        ", endtime=" + endtime +
        "}";
    }
}
