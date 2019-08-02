package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 开宝箱支付记录表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class OpenboxPay extends Model<OpenboxPay> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String userid;

    private LocalDateTime time;

    /**
     * 数量
     */
    private Integer number;

    /**
     * 单价
     */
    private Integer price;

    /**
     * 酒吧分成
     */
    private BigDecimal barDivid;

    /**
     * 游戏轮数
     */
    private String gameRound;

    /**
     * 游戏轮数id
     */
    private String infoId;


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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public BigDecimal getBarDivid() {
        return barDivid;
    }

    public void setBarDivid(BigDecimal barDivid) {
        this.barDivid = barDivid;
    }

    public String getGameRound() {
        return gameRound;
    }

    public void setGameRound(String gameRound) {
        this.gameRound = gameRound;
    }

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "OpenboxPay{" +
        "id=" + id +
        ", barid=" + barid +
        ", userid=" + userid +
        ", time=" + time +
        ", number=" + number +
        ", price=" + price +
        ", barDivid=" + barDivid +
        ", gameRound=" + gameRound +
        ", infoId=" + infoId +
        "}";
    }
}
