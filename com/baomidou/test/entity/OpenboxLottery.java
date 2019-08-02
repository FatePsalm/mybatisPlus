package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 开宝箱中奖表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class OpenboxLottery extends Model<OpenboxLottery> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String userid;

    private LocalDateTime time;

    private LocalDateTime updatetime;

    /**
     * 中奖状态
     */
    private Integer state;

    /**
     * 是否开奖
     */
    private Integer isopen;

    /**
     * 是否开奖
     */
    private Integer openNum;

    /**
     * 是否开奖
     */
    private Integer noOpenNum;

    /**
     * 奖品名称
     */
    private String prizeName;

    /**
     * 奖品图片
     */
    private String prizeImg;

    /**
     * 是否兑奖
     */
    private Integer redeem;

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

    public LocalDateTime getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(LocalDateTime updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getIsopen() {
        return isopen;
    }

    public void setIsopen(Integer isopen) {
        this.isopen = isopen;
    }

    public Integer getOpenNum() {
        return openNum;
    }

    public void setOpenNum(Integer openNum) {
        this.openNum = openNum;
    }

    public Integer getNoOpenNum() {
        return noOpenNum;
    }

    public void setNoOpenNum(Integer noOpenNum) {
        this.noOpenNum = noOpenNum;
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public String getPrizeImg() {
        return prizeImg;
    }

    public void setPrizeImg(String prizeImg) {
        this.prizeImg = prizeImg;
    }

    public Integer getRedeem() {
        return redeem;
    }

    public void setRedeem(Integer redeem) {
        this.redeem = redeem;
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
        return "OpenboxLottery{" +
        "id=" + id +
        ", barid=" + barid +
        ", userid=" + userid +
        ", time=" + time +
        ", updatetime=" + updatetime +
        ", state=" + state +
        ", isopen=" + isopen +
        ", openNum=" + openNum +
        ", noOpenNum=" + noOpenNum +
        ", prizeName=" + prizeName +
        ", prizeImg=" + prizeImg +
        ", redeem=" + redeem +
        ", gameRound=" + gameRound +
        ", infoId=" + infoId +
        "}";
    }
}
