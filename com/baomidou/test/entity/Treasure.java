package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 酒吧功能在线夺宝配置
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class Treasure extends Model<Treasure> {

    private static final long serialVersionUID = 1L;

    private String tid;

    /**
     * 对应酒吧id
     */
    private String barid;

    /**
     * 当前宝贝每份价格
     */
    private BigDecimal unitprice;

    /**
     * 购买的最低份数
     */
    private Integer limitnum;

    /**
     * 创建时间
     */
    private LocalDateTime time;

    /**
     * 当前夺宝进度：1、进行中；2、已结束；3、已关闭；
     */
    private Integer process;

    /**
     * 此次夺宝参与人数
     */
    private Integer usernums;

    /**
     * 当前成功夺取此宝贝的用户
     */
    private String winner;


    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getLimitnum() {
        return limitnum;
    }

    public void setLimitnum(Integer limitnum) {
        this.limitnum = limitnum;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getProcess() {
        return process;
    }

    public void setProcess(Integer process) {
        this.process = process;
    }

    public Integer getUsernums() {
        return usernums;
    }

    public void setUsernums(Integer usernums) {
        this.usernums = usernums;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    @Override
    protected Serializable pkVal() {
        return this.tid;
    }

    @Override
    public String toString() {
        return "Treasure{" +
        "tid=" + tid +
        ", barid=" + barid +
        ", unitprice=" + unitprice +
        ", limitnum=" + limitnum +
        ", time=" + time +
        ", process=" + process +
        ", usernums=" + usernums +
        ", winner=" + winner +
        "}";
    }
}
