package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 流水统计表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class Dayrecord extends Model<Dayrecord> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 日期
     */
    private LocalDate date;

    /**
     * 流水
     */
    private BigDecimal money;

    /**
     * 总流水
     */
    @TableField("allMoney")
    private BigDecimal allMoney;

    /**
     * 霸屏流水
     */
    private BigDecimal bpmoney;

    /**
     * 打赏流水
     */
    private BigDecimal dsmoney;

    /**
     * 投票流水
     */
    private BigDecimal tpmoney;

    /**
     * 夺宝流水
     */
    private BigDecimal dbmoney;

    /**
     * 今夜不回家
     */
    private BigDecimal lovemoney;

    /**
     * 12生肖总流水
     */
    @TableField("sxAllMoney")
    private BigDecimal sxAllMoney;

    /**
     * 12生肖流水
     */
    private BigDecimal sxmoney;

    /**
     * 包红
     */
    private BigDecimal redmoney;

    /**
     * 红包总分成金额
     */
    @TableField("redAllDivid")
    private BigDecimal redAllDivid;

    /**
     * 夺宝总流水
     */
    @TableField("dbAllMoney")
    private BigDecimal dbAllMoney;

    /**
     * 当日可提现余额
     */
    @TableField("usableMoney")
    private BigDecimal usableMoney;

    /**
     * 申请提现金额
     */
    @TableField("applyMoney")
    private BigDecimal applyMoney;

    /**
     * 当日已结算金额
     */
    @TableField("transferMoney")
    private BigDecimal transferMoney;

    /**
     * 当日退款金额
     */
    @TableField("refundMoney")
    private BigDecimal refundMoney;

    /**
     * 点歌分成流水
     */
    private BigDecimal songmoney;

    /**
     * 点歌总流水
     */
    @TableField("songAllMoney")
    private BigDecimal songAllMoney;

    /**
     * 点舞总流水
     */
    @TableField("danceAllmoney")
    private BigDecimal danceAllmoney;

    /**
     * 全民观战总流水
     */
    private BigDecimal watchmoney;

    /**
     * 结算状态 ：0、待结算；1、结算中；2、已结算
     */
    private Integer state;

    /**
     * 购买等级总流水
     */
    @TableField("levelAllMoney")
    private BigDecimal levelAllMoney;

    /**
     * 整蛊霸屏流水
     */
    @TableField("zgAllMoney")
    private BigDecimal zgAllMoney;

    /**
     * 开宝箱流水
     */
    @TableField("openBoxAllMoney")
    private BigDecimal openBoxAllMoney;

    /**
     * PK总流水
     */
    @TableField("pkAllMoney")
    private BigDecimal pkAllMoney;

    /**
     * 电子桌牌送酒总流水
     */
    @TableField("sendWineMoney")
    private BigDecimal sendWineMoney;

    /**
     * 电子桌牌霸灯总流水
     */
    @TableField("playLightMoney")
    private BigDecimal playLightMoney;

    @TableField("showCarAllMoney")
    private BigDecimal showCarAllMoney;

    /**
     * 乐观锁版本号
     */
    private Integer version;

    /**
     * 拍马屁收入
     */
    @TableField("bootlickAllMoney")
    private BigDecimal bootlickAllMoney;

    /**
     * 付费主题霸屏
     */
    @TableField("payBpThemeMoney")
    private BigDecimal payBpThemeMoney;

    /**
     * 插队霸屏总流失
     */
    @TableField("jumpBpMoney")
    private BigDecimal jumpBpMoney;

    /**
     * 小喇叭总流水
     */
    @TableField("trumpetMoney")
    private BigDecimal trumpetMoney;

    @TableField("carRaceMoney")
    private BigDecimal carRaceMoney;

    /**
     * 每月活动流水
     */
    @TableField("activityMoney")
    private BigDecimal activityMoney;

    @TableField("enjoyMoney")
    private BigDecimal enjoyMoney;

    /**
     * 砸金蛋
     */
    @TableField("smashEggMoney")
    private BigDecimal smashEggMoney;

    @TableField("giftMoney")
    private BigDecimal giftMoney;

    @TableField("mountMoney")
    private BigDecimal mountMoney;

    @TableField("emoMoney")
    private BigDecimal emoMoney;

    @TableField("flagMoney")
    private BigDecimal flagMoney;

    @TableField("vipMoney")
    private BigDecimal vipMoney;

    @TableField("headDecorMoney")
    private BigDecimal headDecorMoney;

    @TableField("chickenGameMoney")
    private BigDecimal chickenGameMoney;

    /**
     * 抵扣金额
     */
    @TableField("deductionCash")
    private BigDecimal deductionCash;

    /**
     * 拼歌流水
     */
    @TableField("spellSongMoney")
    private BigDecimal spellSongMoney;

    /**
     * 颜值打分流水
     */
    @TableField("userFaceMoney")
    private BigDecimal userFaceMoney;

    /**
     * 互动玩法流水
     */
    @TableField("interactPlayMoney")
    private BigDecimal interactPlayMoney;

    /**
     * 喵币充值流水
     */
    @TableField("rechargeWemewCornMoney")
    private BigDecimal rechargeWemewCornMoney;

    @TableField("comeInAnimatMoney")
    private BigDecimal comeInAnimatMoney;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(BigDecimal allMoney) {
        this.allMoney = allMoney;
    }

    public BigDecimal getBpmoney() {
        return bpmoney;
    }

    public void setBpmoney(BigDecimal bpmoney) {
        this.bpmoney = bpmoney;
    }

    public BigDecimal getDsmoney() {
        return dsmoney;
    }

    public void setDsmoney(BigDecimal dsmoney) {
        this.dsmoney = dsmoney;
    }

    public BigDecimal getTpmoney() {
        return tpmoney;
    }

    public void setTpmoney(BigDecimal tpmoney) {
        this.tpmoney = tpmoney;
    }

    public BigDecimal getDbmoney() {
        return dbmoney;
    }

    public void setDbmoney(BigDecimal dbmoney) {
        this.dbmoney = dbmoney;
    }

    public BigDecimal getLovemoney() {
        return lovemoney;
    }

    public void setLovemoney(BigDecimal lovemoney) {
        this.lovemoney = lovemoney;
    }

    public BigDecimal getSxAllMoney() {
        return sxAllMoney;
    }

    public void setSxAllMoney(BigDecimal sxAllMoney) {
        this.sxAllMoney = sxAllMoney;
    }

    public BigDecimal getSxmoney() {
        return sxmoney;
    }

    public void setSxmoney(BigDecimal sxmoney) {
        this.sxmoney = sxmoney;
    }

    public BigDecimal getRedmoney() {
        return redmoney;
    }

    public void setRedmoney(BigDecimal redmoney) {
        this.redmoney = redmoney;
    }

    public BigDecimal getRedAllDivid() {
        return redAllDivid;
    }

    public void setRedAllDivid(BigDecimal redAllDivid) {
        this.redAllDivid = redAllDivid;
    }

    public BigDecimal getDbAllMoney() {
        return dbAllMoney;
    }

    public void setDbAllMoney(BigDecimal dbAllMoney) {
        this.dbAllMoney = dbAllMoney;
    }

    public BigDecimal getUsableMoney() {
        return usableMoney;
    }

    public void setUsableMoney(BigDecimal usableMoney) {
        this.usableMoney = usableMoney;
    }

    public BigDecimal getApplyMoney() {
        return applyMoney;
    }

    public void setApplyMoney(BigDecimal applyMoney) {
        this.applyMoney = applyMoney;
    }

    public BigDecimal getTransferMoney() {
        return transferMoney;
    }

    public void setTransferMoney(BigDecimal transferMoney) {
        this.transferMoney = transferMoney;
    }

    public BigDecimal getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(BigDecimal refundMoney) {
        this.refundMoney = refundMoney;
    }

    public BigDecimal getSongmoney() {
        return songmoney;
    }

    public void setSongmoney(BigDecimal songmoney) {
        this.songmoney = songmoney;
    }

    public BigDecimal getSongAllMoney() {
        return songAllMoney;
    }

    public void setSongAllMoney(BigDecimal songAllMoney) {
        this.songAllMoney = songAllMoney;
    }

    public BigDecimal getDanceAllmoney() {
        return danceAllmoney;
    }

    public void setDanceAllmoney(BigDecimal danceAllmoney) {
        this.danceAllmoney = danceAllmoney;
    }

    public BigDecimal getWatchmoney() {
        return watchmoney;
    }

    public void setWatchmoney(BigDecimal watchmoney) {
        this.watchmoney = watchmoney;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public BigDecimal getLevelAllMoney() {
        return levelAllMoney;
    }

    public void setLevelAllMoney(BigDecimal levelAllMoney) {
        this.levelAllMoney = levelAllMoney;
    }

    public BigDecimal getZgAllMoney() {
        return zgAllMoney;
    }

    public void setZgAllMoney(BigDecimal zgAllMoney) {
        this.zgAllMoney = zgAllMoney;
    }

    public BigDecimal getOpenBoxAllMoney() {
        return openBoxAllMoney;
    }

    public void setOpenBoxAllMoney(BigDecimal openBoxAllMoney) {
        this.openBoxAllMoney = openBoxAllMoney;
    }

    public BigDecimal getPkAllMoney() {
        return pkAllMoney;
    }

    public void setPkAllMoney(BigDecimal pkAllMoney) {
        this.pkAllMoney = pkAllMoney;
    }

    public BigDecimal getSendWineMoney() {
        return sendWineMoney;
    }

    public void setSendWineMoney(BigDecimal sendWineMoney) {
        this.sendWineMoney = sendWineMoney;
    }

    public BigDecimal getPlayLightMoney() {
        return playLightMoney;
    }

    public void setPlayLightMoney(BigDecimal playLightMoney) {
        this.playLightMoney = playLightMoney;
    }

    public BigDecimal getShowCarAllMoney() {
        return showCarAllMoney;
    }

    public void setShowCarAllMoney(BigDecimal showCarAllMoney) {
        this.showCarAllMoney = showCarAllMoney;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BigDecimal getBootlickAllMoney() {
        return bootlickAllMoney;
    }

    public void setBootlickAllMoney(BigDecimal bootlickAllMoney) {
        this.bootlickAllMoney = bootlickAllMoney;
    }

    public BigDecimal getPayBpThemeMoney() {
        return payBpThemeMoney;
    }

    public void setPayBpThemeMoney(BigDecimal payBpThemeMoney) {
        this.payBpThemeMoney = payBpThemeMoney;
    }

    public BigDecimal getJumpBpMoney() {
        return jumpBpMoney;
    }

    public void setJumpBpMoney(BigDecimal jumpBpMoney) {
        this.jumpBpMoney = jumpBpMoney;
    }

    public BigDecimal getTrumpetMoney() {
        return trumpetMoney;
    }

    public void setTrumpetMoney(BigDecimal trumpetMoney) {
        this.trumpetMoney = trumpetMoney;
    }

    public BigDecimal getCarRaceMoney() {
        return carRaceMoney;
    }

    public void setCarRaceMoney(BigDecimal carRaceMoney) {
        this.carRaceMoney = carRaceMoney;
    }

    public BigDecimal getActivityMoney() {
        return activityMoney;
    }

    public void setActivityMoney(BigDecimal activityMoney) {
        this.activityMoney = activityMoney;
    }

    public BigDecimal getEnjoyMoney() {
        return enjoyMoney;
    }

    public void setEnjoyMoney(BigDecimal enjoyMoney) {
        this.enjoyMoney = enjoyMoney;
    }

    public BigDecimal getSmashEggMoney() {
        return smashEggMoney;
    }

    public void setSmashEggMoney(BigDecimal smashEggMoney) {
        this.smashEggMoney = smashEggMoney;
    }

    public BigDecimal getGiftMoney() {
        return giftMoney;
    }

    public void setGiftMoney(BigDecimal giftMoney) {
        this.giftMoney = giftMoney;
    }

    public BigDecimal getMountMoney() {
        return mountMoney;
    }

    public void setMountMoney(BigDecimal mountMoney) {
        this.mountMoney = mountMoney;
    }

    public BigDecimal getEmoMoney() {
        return emoMoney;
    }

    public void setEmoMoney(BigDecimal emoMoney) {
        this.emoMoney = emoMoney;
    }

    public BigDecimal getFlagMoney() {
        return flagMoney;
    }

    public void setFlagMoney(BigDecimal flagMoney) {
        this.flagMoney = flagMoney;
    }

    public BigDecimal getVipMoney() {
        return vipMoney;
    }

    public void setVipMoney(BigDecimal vipMoney) {
        this.vipMoney = vipMoney;
    }

    public BigDecimal getHeadDecorMoney() {
        return headDecorMoney;
    }

    public void setHeadDecorMoney(BigDecimal headDecorMoney) {
        this.headDecorMoney = headDecorMoney;
    }

    public BigDecimal getChickenGameMoney() {
        return chickenGameMoney;
    }

    public void setChickenGameMoney(BigDecimal chickenGameMoney) {
        this.chickenGameMoney = chickenGameMoney;
    }

    public BigDecimal getDeductionCash() {
        return deductionCash;
    }

    public void setDeductionCash(BigDecimal deductionCash) {
        this.deductionCash = deductionCash;
    }

    public BigDecimal getSpellSongMoney() {
        return spellSongMoney;
    }

    public void setSpellSongMoney(BigDecimal spellSongMoney) {
        this.spellSongMoney = spellSongMoney;
    }

    public BigDecimal getUserFaceMoney() {
        return userFaceMoney;
    }

    public void setUserFaceMoney(BigDecimal userFaceMoney) {
        this.userFaceMoney = userFaceMoney;
    }

    public BigDecimal getInteractPlayMoney() {
        return interactPlayMoney;
    }

    public void setInteractPlayMoney(BigDecimal interactPlayMoney) {
        this.interactPlayMoney = interactPlayMoney;
    }

    public BigDecimal getRechargeWemewCornMoney() {
        return rechargeWemewCornMoney;
    }

    public void setRechargeWemewCornMoney(BigDecimal rechargeWemewCornMoney) {
        this.rechargeWemewCornMoney = rechargeWemewCornMoney;
    }

    public BigDecimal getComeInAnimatMoney() {
        return comeInAnimatMoney;
    }

    public void setComeInAnimatMoney(BigDecimal comeInAnimatMoney) {
        this.comeInAnimatMoney = comeInAnimatMoney;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Dayrecord{" +
        "id=" + id +
        ", barid=" + barid +
        ", date=" + date +
        ", money=" + money +
        ", allMoney=" + allMoney +
        ", bpmoney=" + bpmoney +
        ", dsmoney=" + dsmoney +
        ", tpmoney=" + tpmoney +
        ", dbmoney=" + dbmoney +
        ", lovemoney=" + lovemoney +
        ", sxAllMoney=" + sxAllMoney +
        ", sxmoney=" + sxmoney +
        ", redmoney=" + redmoney +
        ", redAllDivid=" + redAllDivid +
        ", dbAllMoney=" + dbAllMoney +
        ", usableMoney=" + usableMoney +
        ", applyMoney=" + applyMoney +
        ", transferMoney=" + transferMoney +
        ", refundMoney=" + refundMoney +
        ", songmoney=" + songmoney +
        ", songAllMoney=" + songAllMoney +
        ", danceAllmoney=" + danceAllmoney +
        ", watchmoney=" + watchmoney +
        ", state=" + state +
        ", levelAllMoney=" + levelAllMoney +
        ", zgAllMoney=" + zgAllMoney +
        ", openBoxAllMoney=" + openBoxAllMoney +
        ", pkAllMoney=" + pkAllMoney +
        ", sendWineMoney=" + sendWineMoney +
        ", playLightMoney=" + playLightMoney +
        ", showCarAllMoney=" + showCarAllMoney +
        ", version=" + version +
        ", bootlickAllMoney=" + bootlickAllMoney +
        ", payBpThemeMoney=" + payBpThemeMoney +
        ", jumpBpMoney=" + jumpBpMoney +
        ", trumpetMoney=" + trumpetMoney +
        ", carRaceMoney=" + carRaceMoney +
        ", activityMoney=" + activityMoney +
        ", enjoyMoney=" + enjoyMoney +
        ", smashEggMoney=" + smashEggMoney +
        ", giftMoney=" + giftMoney +
        ", mountMoney=" + mountMoney +
        ", emoMoney=" + emoMoney +
        ", flagMoney=" + flagMoney +
        ", vipMoney=" + vipMoney +
        ", headDecorMoney=" + headDecorMoney +
        ", chickenGameMoney=" + chickenGameMoney +
        ", deductionCash=" + deductionCash +
        ", spellSongMoney=" + spellSongMoney +
        ", userFaceMoney=" + userFaceMoney +
        ", interactPlayMoney=" + interactPlayMoney +
        ", rechargeWemewCornMoney=" + rechargeWemewCornMoney +
        ", comeInAnimatMoney=" + comeInAnimatMoney +
        "}";
    }
}
