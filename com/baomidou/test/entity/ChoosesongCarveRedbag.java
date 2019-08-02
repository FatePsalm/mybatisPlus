package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 点歌瓜分红包
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class ChoosesongCarveRedbag extends Model<ChoosesongCarveRedbag> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private String id;

    /**
     * 艺人ID
     */
    private String artistId;

    /**
     * 活动期间点歌数量
     */
    private Integer choosesongNumber;

    /**
     * 本期排行
     */
    private Integer ranking;

    /**
     * 本期瓜分金额
     */
    private BigDecimal carveMoney;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 瓜分红包期数
     */
    private String carvePeriod;

    /**
     * 是否已读
     */
    private Boolean ifread;

    /**
     * 是否提现
     */
    private Boolean ifwithdraw;

    /**
     * 是否中奖
     */
    private Boolean ifwinning;


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

    public Integer getChoosesongNumber() {
        return choosesongNumber;
    }

    public void setChoosesongNumber(Integer choosesongNumber) {
        this.choosesongNumber = choosesongNumber;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public BigDecimal getCarveMoney() {
        return carveMoney;
    }

    public void setCarveMoney(BigDecimal carveMoney) {
        this.carveMoney = carveMoney;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getCarvePeriod() {
        return carvePeriod;
    }

    public void setCarvePeriod(String carvePeriod) {
        this.carvePeriod = carvePeriod;
    }

    public Boolean getIfread() {
        return ifread;
    }

    public void setIfread(Boolean ifread) {
        this.ifread = ifread;
    }

    public Boolean getIfwithdraw() {
        return ifwithdraw;
    }

    public void setIfwithdraw(Boolean ifwithdraw) {
        this.ifwithdraw = ifwithdraw;
    }

    public Boolean getIfwinning() {
        return ifwinning;
    }

    public void setIfwinning(Boolean ifwinning) {
        this.ifwinning = ifwinning;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ChoosesongCarveRedbag{" +
        "id=" + id +
        ", artistId=" + artistId +
        ", choosesongNumber=" + choosesongNumber +
        ", ranking=" + ranking +
        ", carveMoney=" + carveMoney +
        ", createTime=" + createTime +
        ", carvePeriod=" + carvePeriod +
        ", ifread=" + ifread +
        ", ifwithdraw=" + ifwithdraw +
        ", ifwinning=" + ifwinning +
        "}";
    }
}
