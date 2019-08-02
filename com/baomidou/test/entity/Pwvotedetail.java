package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class Pwvotedetail extends Model<Pwvotedetail> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String vodid;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 用户id
     */
    private String userid;

    /**
     * 投票数量
     */
    private Integer nums;

    /**
     * 总价
     */
    private BigDecimal tprice;

    /**
     * 观战主题
     */
    private String theme;

    /**
     * 比赛主键
     */
    private String matchid;

    /**
     * 战队id
     */
    private String teamid;


    public String getVodid() {
        return vodid;
    }

    public void setVodid(String vodid) {
        this.vodid = vodid;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public BigDecimal getTprice() {
        return tprice;
    }

    public void setTprice(BigDecimal tprice) {
        this.tprice = tprice;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getMatchid() {
        return matchid;
    }

    public void setMatchid(String matchid) {
        this.matchid = matchid;
    }

    public String getTeamid() {
        return teamid;
    }

    public void setTeamid(String teamid) {
        this.teamid = teamid;
    }

    @Override
    protected Serializable pkVal() {
        return this.vodid;
    }

    @Override
    public String toString() {
        return "Pwvotedetail{" +
        "vodid=" + vodid +
        ", barid=" + barid +
        ", userid=" + userid +
        ", nums=" + nums +
        ", tprice=" + tprice +
        ", theme=" + theme +
        ", matchid=" + matchid +
        ", teamid=" + teamid +
        "}";
    }
}
