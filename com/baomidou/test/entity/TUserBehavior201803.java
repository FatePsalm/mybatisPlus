package com.baomidou.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 用户行为数据表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class TUserBehavior201803 extends Model<TUserBehavior201803> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 日期
     */
    private LocalDate date;

    /**
     * 用户id
     */
    private String userid;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 类型：0、用户登录情况；1、用户访问酒吧情况
     */
    private Integer type;

    /**
     * 进入私信页面次数
     */
    private Integer enterLetterTime;

    /**
     * 使用私信次数
     */
    private Integer useLetterTime;

    /**
     * 点击送礼次数
     */
    private Integer clickGiftTime;

    /**
     * 使用送礼次数
     */
    private Integer useGiftTime;

    /**
     * 是否支付
     */
    private Boolean pay;

    /**
     * 点击点歌按钮次数
     */
    private Integer clickSongTime;

    /**
     * 点歌次数
     */
    private Integer buySongTime;

    /**
     * 点击霸屏按钮次数
     */
    private Integer clickBpTime;

    /**
     * 购买霸屏次数
     */
    private Integer buyBpTime;

    /**
     * 点击打赏按钮次数
     */
    private Integer clickDsTime;

    /**
     * 购买打赏次数
     */
    private Integer buyDsTime;

    /**
     * 发送普通消息次数
     */
    private Integer normalMsgNum;

    /**
     * 双旦活动戳蛋次数
     */
    private Integer clickEggTime;

    /**
     * 用户每日请求次数
     */
    private Integer requestTime;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    private Integer homeAttention;

    private Integer homeSendgift;

    private Integer homeTalk;

    /**
     * 用户在微上墙时长
     */
    private Integer atOnwallTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getEnterLetterTime() {
        return enterLetterTime;
    }

    public void setEnterLetterTime(Integer enterLetterTime) {
        this.enterLetterTime = enterLetterTime;
    }

    public Integer getUseLetterTime() {
        return useLetterTime;
    }

    public void setUseLetterTime(Integer useLetterTime) {
        this.useLetterTime = useLetterTime;
    }

    public Integer getClickGiftTime() {
        return clickGiftTime;
    }

    public void setClickGiftTime(Integer clickGiftTime) {
        this.clickGiftTime = clickGiftTime;
    }

    public Integer getUseGiftTime() {
        return useGiftTime;
    }

    public void setUseGiftTime(Integer useGiftTime) {
        this.useGiftTime = useGiftTime;
    }

    public Boolean getPay() {
        return pay;
    }

    public void setPay(Boolean pay) {
        this.pay = pay;
    }

    public Integer getClickSongTime() {
        return clickSongTime;
    }

    public void setClickSongTime(Integer clickSongTime) {
        this.clickSongTime = clickSongTime;
    }

    public Integer getBuySongTime() {
        return buySongTime;
    }

    public void setBuySongTime(Integer buySongTime) {
        this.buySongTime = buySongTime;
    }

    public Integer getClickBpTime() {
        return clickBpTime;
    }

    public void setClickBpTime(Integer clickBpTime) {
        this.clickBpTime = clickBpTime;
    }

    public Integer getBuyBpTime() {
        return buyBpTime;
    }

    public void setBuyBpTime(Integer buyBpTime) {
        this.buyBpTime = buyBpTime;
    }

    public Integer getClickDsTime() {
        return clickDsTime;
    }

    public void setClickDsTime(Integer clickDsTime) {
        this.clickDsTime = clickDsTime;
    }

    public Integer getBuyDsTime() {
        return buyDsTime;
    }

    public void setBuyDsTime(Integer buyDsTime) {
        this.buyDsTime = buyDsTime;
    }

    public Integer getNormalMsgNum() {
        return normalMsgNum;
    }

    public void setNormalMsgNum(Integer normalMsgNum) {
        this.normalMsgNum = normalMsgNum;
    }

    public Integer getClickEggTime() {
        return clickEggTime;
    }

    public void setClickEggTime(Integer clickEggTime) {
        this.clickEggTime = clickEggTime;
    }

    public Integer getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Integer requestTime) {
        this.requestTime = requestTime;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getHomeAttention() {
        return homeAttention;
    }

    public void setHomeAttention(Integer homeAttention) {
        this.homeAttention = homeAttention;
    }

    public Integer getHomeSendgift() {
        return homeSendgift;
    }

    public void setHomeSendgift(Integer homeSendgift) {
        this.homeSendgift = homeSendgift;
    }

    public Integer getHomeTalk() {
        return homeTalk;
    }

    public void setHomeTalk(Integer homeTalk) {
        this.homeTalk = homeTalk;
    }

    public Integer getAtOnwallTime() {
        return atOnwallTime;
    }

    public void setAtOnwallTime(Integer atOnwallTime) {
        this.atOnwallTime = atOnwallTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TUserBehavior201803{" +
        "id=" + id +
        ", date=" + date +
        ", userid=" + userid +
        ", barid=" + barid +
        ", type=" + type +
        ", enterLetterTime=" + enterLetterTime +
        ", useLetterTime=" + useLetterTime +
        ", clickGiftTime=" + clickGiftTime +
        ", useGiftTime=" + useGiftTime +
        ", pay=" + pay +
        ", clickSongTime=" + clickSongTime +
        ", buySongTime=" + buySongTime +
        ", clickBpTime=" + clickBpTime +
        ", buyBpTime=" + buyBpTime +
        ", clickDsTime=" + clickDsTime +
        ", buyDsTime=" + buyDsTime +
        ", normalMsgNum=" + normalMsgNum +
        ", clickEggTime=" + clickEggTime +
        ", requestTime=" + requestTime +
        ", longitude=" + longitude +
        ", latitude=" + latitude +
        ", homeAttention=" + homeAttention +
        ", homeSendgift=" + homeSendgift +
        ", homeTalk=" + homeTalk +
        ", atOnwallTime=" + atOnwallTime +
        "}";
    }
}
