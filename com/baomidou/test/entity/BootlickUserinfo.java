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
public class BootlickUserinfo extends Model<BootlickUserinfo> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String userid;

    /**
     * 本局游戏id
     */
    private String infoid;

    private LocalDateTime time;

    /**
     * 押注数量
     */
    private Integer buyNum;

    /**
     * 押注马的号数
     */
    private Integer horseNum;

    /**
     * 是否中奖
     */
    private Integer isWin;

    /**
     * 中奖数量
     */
    private Integer winNum;

    /**
     * 用户桌号
     */
    private String tableNum;

    /**
     * 是否兑奖
     */
    private Integer state;

    /**
     * 支付价格
     */
    private BigDecimal money;

    /**
     * 酒吧分成
     */
    private BigDecimal barMoney;

    /**
     * 订单id
     */
    private String payId;


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

    public String getInfoid() {
        return infoid;
    }

    public void setInfoid(String infoid) {
        this.infoid = infoid;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public Integer getHorseNum() {
        return horseNum;
    }

    public void setHorseNum(Integer horseNum) {
        this.horseNum = horseNum;
    }

    public Integer getIsWin() {
        return isWin;
    }

    public void setIsWin(Integer isWin) {
        this.isWin = isWin;
    }

    public Integer getWinNum() {
        return winNum;
    }

    public void setWinNum(Integer winNum) {
        this.winNum = winNum;
    }

    public String getTableNum() {
        return tableNum;
    }

    public void setTableNum(String tableNum) {
        this.tableNum = tableNum;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getBarMoney() {
        return barMoney;
    }

    public void setBarMoney(BigDecimal barMoney) {
        this.barMoney = barMoney;
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BootlickUserinfo{" +
        "id=" + id +
        ", barid=" + barid +
        ", userid=" + userid +
        ", infoid=" + infoid +
        ", time=" + time +
        ", buyNum=" + buyNum +
        ", horseNum=" + horseNum +
        ", isWin=" + isWin +
        ", winNum=" + winNum +
        ", tableNum=" + tableNum +
        ", state=" + state +
        ", money=" + money +
        ", barMoney=" + barMoney +
        ", payId=" + payId +
        "}";
    }
}
