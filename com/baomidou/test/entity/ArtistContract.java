package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 签约艺人
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class ArtistContract extends Model<ArtistContract> {

    private static final long serialVersionUID = 1L;

    /**
     * 平台艺人ID
     */
    private String id;

    /**
     * 艺人ID
     */
    private String artistId;

    /**
     * 微信号
     */
    private String wechatId;

    /**
     * 出生日期
     */
    private LocalDateTime birth;

    /**
     * 身高
     */
    private BigDecimal tall;

    /**
     * 体重
     */
    private BigDecimal weight;

    /**
     * 三围
     */
    private String bwh;

    /**
     * 城市
     */
    private String city;

    /**
     * 平台艺人类型
     */
    private String artistType;

    /**
     * 是否删除
     */
    private Boolean del;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 期望薪资最低
     */
    private BigDecimal salaryMin;

    /**
     * 期望薪资-最高
     */
    private BigDecimal salaryMax;

    /**
     * 档期状态
     */
    private Integer freeState;

    /**
     * 档期时间
     */
    private LocalDateTime freeTime;

    /**
     * 平台艺人职业
     */
    private String contractType;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getWechatId() {
        return wechatId;
    }

    public void setWechatId(String wechatId) {
        this.wechatId = wechatId;
    }

    public LocalDateTime getBirth() {
        return birth;
    }

    public void setBirth(LocalDateTime birth) {
        this.birth = birth;
    }

    public BigDecimal getTall() {
        return tall;
    }

    public void setTall(BigDecimal tall) {
        this.tall = tall;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getBwh() {
        return bwh;
    }

    public void setBwh(String bwh) {
        this.bwh = bwh;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArtistType() {
        return artistType;
    }

    public void setArtistType(String artistType) {
        this.artistType = artistType;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getSalaryMin() {
        return salaryMin;
    }

    public void setSalaryMin(BigDecimal salaryMin) {
        this.salaryMin = salaryMin;
    }

    public BigDecimal getSalaryMax() {
        return salaryMax;
    }

    public void setSalaryMax(BigDecimal salaryMax) {
        this.salaryMax = salaryMax;
    }

    public Integer getFreeState() {
        return freeState;
    }

    public void setFreeState(Integer freeState) {
        this.freeState = freeState;
    }

    public LocalDateTime getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(LocalDateTime freeTime) {
        this.freeTime = freeTime;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ArtistContract{" +
        "id=" + id +
        ", artistId=" + artistId +
        ", wechatId=" + wechatId +
        ", birth=" + birth +
        ", tall=" + tall +
        ", weight=" + weight +
        ", bwh=" + bwh +
        ", city=" + city +
        ", artistType=" + artistType +
        ", del=" + del +
        ", state=" + state +
        ", createTime=" + createTime +
        ", salaryMin=" + salaryMin +
        ", salaryMax=" + salaryMax +
        ", freeState=" + freeState +
        ", freeTime=" + freeTime +
        ", contractType=" + contractType +
        "}";
    }
}
