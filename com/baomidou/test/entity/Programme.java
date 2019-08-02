package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class Programme extends Model<Programme> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String imgurl;

    private String description;

    private String barid;

    private LocalDateTime time;

    private Boolean del;

    /**
     * 是否系统默认
     */
    private Boolean default;

    /**
     * 是否启动当前节目
     */
    private Boolean use;

    @TableField("artistType")
    private String artistType;

    @TableField("artObj")
    private String artObj;

    private BigDecimal persent;

    /**
     * 艺人分组id
     */
    private String groupid;

    /**
     * 艺人排序
     */
    private Integer artistSort;

    /**
     * 歌曲价格
     */
    private BigDecimal songPrice;

    /**
     * 登录状态
     */
    private Integer signType;

    /**
     * 登录时间
     */
    private LocalDateTime signTime;

    /**
     * 签出时间
     */
    private LocalDateTime outTime;

    /**
     * 点歌艺人分成
     */
    private BigDecimal songPersent;

    /**
     * 备注
     */
    private String remark;

    /**
     * 艺人是否通过审核,0审核中,1已通过,2未通过
     */
    private Integer ischeck;

    /**
     * 已处理 1 ,未处理 0
     */
    private Integer dispose;

    /**
     * 艺人点舞分成
     */
    @TableField("dancePercent")
    private BigDecimal dancePercent;

    /**
     * 作为系统舞单的艺人分成
     */
    @TableField("sysDancePercent")
    private BigDecimal sysDancePercent;

    /**
     * 是否是系统模拟舞者配置(也就是系统舞单配置) 1:系统舞单配置  0:非系统舞单配置
     */
    @TableField("sysDancePro")
    private Boolean sysDancePro;

    /**
     * 舞者展示视频id
     */
    @TableField("showVideoId")
    private String showVideoId;

    /**
     * 舞者被点舞次数
     */
    @TableField("danceTimes")
    private Integer danceTimes;

    /**
     * 打赏新模式分成比例
     */
    private Double playShowPercent;

    /**
     * 互动游戏分成
     */
    private BigDecimal interactPlayPercent;

    /**
     * 是否开启自定义艺人歌单
     */
    private Boolean customArtistSong;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    public Boolean getDefault() {
        return default;
    }

    public void setDefault(Boolean default) {
        this.default = default;
    }

    public Boolean getUse() {
        return use;
    }

    public void setUse(Boolean use) {
        this.use = use;
    }

    public String getArtistType() {
        return artistType;
    }

    public void setArtistType(String artistType) {
        this.artistType = artistType;
    }

    public String getArtObj() {
        return artObj;
    }

    public void setArtObj(String artObj) {
        this.artObj = artObj;
    }

    public BigDecimal getPersent() {
        return persent;
    }

    public void setPersent(BigDecimal persent) {
        this.persent = persent;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public Integer getArtistSort() {
        return artistSort;
    }

    public void setArtistSort(Integer artistSort) {
        this.artistSort = artistSort;
    }

    public BigDecimal getSongPrice() {
        return songPrice;
    }

    public void setSongPrice(BigDecimal songPrice) {
        this.songPrice = songPrice;
    }

    public Integer getSignType() {
        return signType;
    }

    public void setSignType(Integer signType) {
        this.signType = signType;
    }

    public LocalDateTime getSignTime() {
        return signTime;
    }

    public void setSignTime(LocalDateTime signTime) {
        this.signTime = signTime;
    }

    public LocalDateTime getOutTime() {
        return outTime;
    }

    public void setOutTime(LocalDateTime outTime) {
        this.outTime = outTime;
    }

    public BigDecimal getSongPersent() {
        return songPersent;
    }

    public void setSongPersent(BigDecimal songPersent) {
        this.songPersent = songPersent;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIscheck() {
        return ischeck;
    }

    public void setIscheck(Integer ischeck) {
        this.ischeck = ischeck;
    }

    public Integer getDispose() {
        return dispose;
    }

    public void setDispose(Integer dispose) {
        this.dispose = dispose;
    }

    public BigDecimal getDancePercent() {
        return dancePercent;
    }

    public void setDancePercent(BigDecimal dancePercent) {
        this.dancePercent = dancePercent;
    }

    public BigDecimal getSysDancePercent() {
        return sysDancePercent;
    }

    public void setSysDancePercent(BigDecimal sysDancePercent) {
        this.sysDancePercent = sysDancePercent;
    }

    public Boolean getSysDancePro() {
        return sysDancePro;
    }

    public void setSysDancePro(Boolean sysDancePro) {
        this.sysDancePro = sysDancePro;
    }

    public String getShowVideoId() {
        return showVideoId;
    }

    public void setShowVideoId(String showVideoId) {
        this.showVideoId = showVideoId;
    }

    public Integer getDanceTimes() {
        return danceTimes;
    }

    public void setDanceTimes(Integer danceTimes) {
        this.danceTimes = danceTimes;
    }

    public Double getPlayShowPercent() {
        return playShowPercent;
    }

    public void setPlayShowPercent(Double playShowPercent) {
        this.playShowPercent = playShowPercent;
    }

    public BigDecimal getInteractPlayPercent() {
        return interactPlayPercent;
    }

    public void setInteractPlayPercent(BigDecimal interactPlayPercent) {
        this.interactPlayPercent = interactPlayPercent;
    }

    public Boolean getCustomArtistSong() {
        return customArtistSong;
    }

    public void setCustomArtistSong(Boolean customArtistSong) {
        this.customArtistSong = customArtistSong;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Programme{" +
        "id=" + id +
        ", name=" + name +
        ", imgurl=" + imgurl +
        ", description=" + description +
        ", barid=" + barid +
        ", time=" + time +
        ", del=" + del +
        ", default=" + default +
        ", use=" + use +
        ", artistType=" + artistType +
        ", artObj=" + artObj +
        ", persent=" + persent +
        ", groupid=" + groupid +
        ", artistSort=" + artistSort +
        ", songPrice=" + songPrice +
        ", signType=" + signType +
        ", signTime=" + signTime +
        ", outTime=" + outTime +
        ", songPersent=" + songPersent +
        ", remark=" + remark +
        ", ischeck=" + ischeck +
        ", dispose=" + dispose +
        ", dancePercent=" + dancePercent +
        ", sysDancePercent=" + sysDancePercent +
        ", sysDancePro=" + sysDancePro +
        ", showVideoId=" + showVideoId +
        ", danceTimes=" + danceTimes +
        ", playShowPercent=" + playShowPercent +
        ", interactPlayPercent=" + interactPlayPercent +
        ", customArtistSong=" + customArtistSong +
        "}";
    }
}
