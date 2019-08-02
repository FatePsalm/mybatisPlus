package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 歌曲列表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class Choosesong extends Model<Choosesong> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 酒吧ID
     */
    @TableField("barId")
    private String barId;

    /**
     * 歌曲名
     */
    @TableField("songName")
    private String songName;

    /**
     * 原唱
     */
    private String singer;

    /**
     * 被点次数
     */
    @TableField("isHot")
    private Integer isHot;

    /**
     * 删除状态
     */
    @TableField("isDelete")
    private Boolean delete;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 单曲价格
     */
    private BigDecimal price;

    /**
     * 启动或不启动
     */
    @TableField("isUsed")
    private Boolean used;

    /**
     * 艺人id
     */
    private String artistId;

    /**
     * 艺人姓名
     */
    private String artistName;

    private String catname;

    private Integer maxnum;

    /**
     * 推荐歌曲记录信息
     */
    private String recommend;

    /**
     * 歌曲排序
     */
    private Integer sorts;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBarId() {
        return barId;
    }

    public void setBarId(String barId) {
        this.barId = barId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

    public Integer getMaxnum() {
        return maxnum;
    }

    public void setMaxnum(Integer maxnum) {
        this.maxnum = maxnum;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public Integer getSorts() {
        return sorts;
    }

    public void setSorts(Integer sorts) {
        this.sorts = sorts;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Choosesong{" +
        "id=" + id +
        ", barId=" + barId +
        ", songName=" + songName +
        ", singer=" + singer +
        ", isHot=" + isHot +
        ", delete=" + delete +
        ", createTime=" + createTime +
        ", remark=" + remark +
        ", price=" + price +
        ", used=" + used +
        ", artistId=" + artistId +
        ", artistName=" + artistName +
        ", catname=" + catname +
        ", maxnum=" + maxnum +
        ", recommend=" + recommend +
        ", sorts=" + sorts +
        "}";
    }
}
