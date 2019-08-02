package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 开宝箱游戏记录表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class OpenboxInfo extends Model<OpenboxInfo> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private LocalDateTime starttime;

    /**
     * 结束时间
     */
    private LocalDateTime endtime;

    /**
     * 宝箱数量
     */
    private Integer number;

    /**
     * 未开宝箱数量
     */
    private Integer surplusnum;

    /**
     * 宝箱单价
     */
    private Integer price;

    /**
     * 游戏状态
     */
    private Integer state;

    /**
     * 宝箱游戏名称
     */
    private String name;

    /**
     * 游戏轮数
     */
    private String gameRound;


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

    public LocalDateTime getStarttime() {
        return starttime;
    }

    public void setStarttime(LocalDateTime starttime) {
        this.starttime = starttime;
    }

    public LocalDateTime getEndtime() {
        return endtime;
    }

    public void setEndtime(LocalDateTime endtime) {
        this.endtime = endtime;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getSurplusnum() {
        return surplusnum;
    }

    public void setSurplusnum(Integer surplusnum) {
        this.surplusnum = surplusnum;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGameRound() {
        return gameRound;
    }

    public void setGameRound(String gameRound) {
        this.gameRound = gameRound;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "OpenboxInfo{" +
        "id=" + id +
        ", barid=" + barid +
        ", starttime=" + starttime +
        ", endtime=" + endtime +
        ", number=" + number +
        ", surplusnum=" + surplusnum +
        ", price=" + price +
        ", state=" + state +
        ", name=" + name +
        ", gameRound=" + gameRound +
        "}";
    }
}
