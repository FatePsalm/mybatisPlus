package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class Danceorderrecord extends Model<Danceorderrecord> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 节目id
     */
    @TableField("proId")
    private String proId;

    /**
     * 支付订单的id
     */
    @TableField("pascreenId")
    private String pascreenId;

    /**
     * 酒吧id
     */
    @TableField("barId")
    private String barId;

    /**
     * 支付状态,未支付(0),已支付(1),待退款(2),已退款(3)
     */
    @TableField("payState")
    private Integer payState;

    /**
     * 舞曲视频id
     */
    @TableField("videoId")
    private String videoId;

    /**
     * 舞曲规格id
     */
    @TableField("danceConfigId")
    private String danceConfigId;

    /**
     * 艺人id
     */
    @TableField("artId")
    private String artId;

    /**
     * 艺人名称
     */
    @TableField("artName")
    private String artName;

    /**
     * 趴数
     */
    @TableField("paNum")
    private Integer paNum;

    /**
     * 点舞时长
     */
    @TableField("danceTime")
    private Integer danceTime;

    /**
     * 总价
     */
    private BigDecimal price;

    /**
     * 用户id
     */
    @TableField("userId")
    private String userId;

    /**
     * 用户昵称
     */
    @TableField("userName")
    private String userName;

    /**
     * 座位号
     */
    @TableField("seatNum")
    private String seatNum;

    /**
     * 支付方式
     */
    @TableField("payType")
    private Integer payType;

    /**
     * 支付时间
     */
    private LocalDateTime time;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getPascreenId() {
        return pascreenId;
    }

    public void setPascreenId(String pascreenId) {
        this.pascreenId = pascreenId;
    }

    public String getBarId() {
        return barId;
    }

    public void setBarId(String barId) {
        this.barId = barId;
    }

    public Integer getPayState() {
        return payState;
    }

    public void setPayState(Integer payState) {
        this.payState = payState;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getDanceConfigId() {
        return danceConfigId;
    }

    public void setDanceConfigId(String danceConfigId) {
        this.danceConfigId = danceConfigId;
    }

    public String getArtId() {
        return artId;
    }

    public void setArtId(String artId) {
        this.artId = artId;
    }

    public String getArtName() {
        return artName;
    }

    public void setArtName(String artName) {
        this.artName = artName;
    }

    public Integer getPaNum() {
        return paNum;
    }

    public void setPaNum(Integer paNum) {
        this.paNum = paNum;
    }

    public Integer getDanceTime() {
        return danceTime;
    }

    public void setDanceTime(Integer danceTime) {
        this.danceTime = danceTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(String seatNum) {
        this.seatNum = seatNum;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Danceorderrecord{" +
        "id=" + id +
        ", proId=" + proId +
        ", pascreenId=" + pascreenId +
        ", barId=" + barId +
        ", payState=" + payState +
        ", videoId=" + videoId +
        ", danceConfigId=" + danceConfigId +
        ", artId=" + artId +
        ", artName=" + artName +
        ", paNum=" + paNum +
        ", danceTime=" + danceTime +
        ", price=" + price +
        ", userId=" + userId +
        ", userName=" + userName +
        ", seatNum=" + seatNum +
        ", payType=" + payType +
        ", time=" + time +
        "}";
    }
}
