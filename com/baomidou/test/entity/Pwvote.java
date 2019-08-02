package com.baomidou.test.entity;

import java.math.BigDecimal;
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
public class Pwvote extends Model<Pwvote> {

    private static final long serialVersionUID = 1L;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 投票主题
     */
    private String theme;

    /**
     * 投票单价
     */
    private BigDecimal unitprice;

    /**
     * 投票状态,开启状态:1,结束状态 0,默认开启
     */
    private Integer state;

    /**
     * 战队a的id
     */
    private String teamaId;

    /**
     * 战队b的id
     */
    private String teambId;

    /**
     * 比赛的id
     */
    private String matchId;

    /**
     * 创建时间
     */
    private LocalDateTime creattime;


    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getTeamaId() {
        return teamaId;
    }

    public void setTeamaId(String teamaId) {
        this.teamaId = teamaId;
    }

    public String getTeambId() {
        return teambId;
    }

    public void setTeambId(String teambId) {
        this.teambId = teambId;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public LocalDateTime getCreattime() {
        return creattime;
    }

    public void setCreattime(LocalDateTime creattime) {
        this.creattime = creattime;
    }

    @Override
    protected Serializable pkVal() {
        return this.barid;
    }

    @Override
    public String toString() {
        return "Pwvote{" +
        "barid=" + barid +
        ", theme=" + theme +
        ", unitprice=" + unitprice +
        ", state=" + state +
        ", teamaId=" + teamaId +
        ", teambId=" + teambId +
        ", matchId=" + matchId +
        ", creattime=" + creattime +
        "}";
    }
}
