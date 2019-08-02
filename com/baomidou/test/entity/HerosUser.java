package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 龙战于野海选选手报名
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class HerosUser extends Model<HerosUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 姓名
     */
    private String myName;

    /**
     * 性别  0-男  1-女
     */
    private Boolean sex;

    /**
     * 电话号码
     */
    private String tel;

    /**
     * 胸围
     */
    private String bust;

    /**
     * 腰围
     */
    private String waist;

    /**
     * 臀围
     */
    private String hip;

    /**
     * 体重
     */
    private String weight;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String district;

    /**
     * 生活照
     */
    private String lifePhoto;

    /**
     * 艺术照
     */
    private String artisticPhoto;

    /**
     * 参赛视频
     */
    private String playVideo;

    /**
     * 0-未审核通过  1-审核通过
     */
    private Boolean audit;

    /**
     * 报名时间
     */
    private LocalDateTime creationTime;

    /**
     * 编号
     */
    private Integer serialNumber;

    /**
     * 得票
     */
    private Integer poll;

    /**
     * 免费票
     */
    private Integer freeTicket;

    /**
     * 付费票
     */
    private Integer payForTicket;

    /**
     * 折扣票
     */
    private Integer discountTicket;

    /**
     * 酒吧ID
     */
    private String barId;

    /**
     * 平台
     */
    private String platform;

    /**
     * 平台ID
     */
    private String platformId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getBust() {
        return bust;
    }

    public void setBust(String bust) {
        this.bust = bust;
    }

    public String getWaist() {
        return waist;
    }

    public void setWaist(String waist) {
        this.waist = waist;
    }

    public String getHip() {
        return hip;
    }

    public void setHip(String hip) {
        this.hip = hip;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getLifePhoto() {
        return lifePhoto;
    }

    public void setLifePhoto(String lifePhoto) {
        this.lifePhoto = lifePhoto;
    }

    public String getArtisticPhoto() {
        return artisticPhoto;
    }

    public void setArtisticPhoto(String artisticPhoto) {
        this.artisticPhoto = artisticPhoto;
    }

    public String getPlayVideo() {
        return playVideo;
    }

    public void setPlayVideo(String playVideo) {
        this.playVideo = playVideo;
    }

    public Boolean getAudit() {
        return audit;
    }

    public void setAudit(Boolean audit) {
        this.audit = audit;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getPoll() {
        return poll;
    }

    public void setPoll(Integer poll) {
        this.poll = poll;
    }

    public Integer getFreeTicket() {
        return freeTicket;
    }

    public void setFreeTicket(Integer freeTicket) {
        this.freeTicket = freeTicket;
    }

    public Integer getPayForTicket() {
        return payForTicket;
    }

    public void setPayForTicket(Integer payForTicket) {
        this.payForTicket = payForTicket;
    }

    public Integer getDiscountTicket() {
        return discountTicket;
    }

    public void setDiscountTicket(Integer discountTicket) {
        this.discountTicket = discountTicket;
    }

    public String getBarId() {
        return barId;
    }

    public void setBarId(String barId) {
        this.barId = barId;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "HerosUser{" +
        "id=" + id +
        ", myName=" + myName +
        ", sex=" + sex +
        ", tel=" + tel +
        ", bust=" + bust +
        ", waist=" + waist +
        ", hip=" + hip +
        ", weight=" + weight +
        ", province=" + province +
        ", city=" + city +
        ", district=" + district +
        ", lifePhoto=" + lifePhoto +
        ", artisticPhoto=" + artisticPhoto +
        ", playVideo=" + playVideo +
        ", audit=" + audit +
        ", creationTime=" + creationTime +
        ", serialNumber=" + serialNumber +
        ", poll=" + poll +
        ", freeTicket=" + freeTicket +
        ", payForTicket=" + payForTicket +
        ", discountTicket=" + discountTicket +
        ", barId=" + barId +
        ", platform=" + platform +
        ", platformId=" + platformId +
        "}";
    }
}
