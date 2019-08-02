package com.baomidou.test.entity;

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
public class Dance extends Model<Dance> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 酒吧ID
     */
    @TableField("barId")
    private String barId;

    /**
     * 舞曲名
     */
    @TableField("danceName")
    private String danceName;

    /**
     * 热度(被点次数)
     */
    private Integer hot;

    /**
     * 删除状态 1:已删除 0:未删除
     */
    @TableField("isDelete")
    private Boolean delete;

    /**
     * 是否是系统舞曲, 1: 系统舞曲 0: 非系统舞曲
     */
    @TableField("isSysDance")
    private Boolean sysDance;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 创建人ID
     */
    @TableField("createUserId")
    private String createUserId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 启动或不启动 1:启动 0:未启动
     */
    @TableField("isUsed")
    private Boolean used;

    /**
     * 艺人id
     */
    @TableField("artistId")
    private String artistId;

    /**
     * 艺人姓名
     */
    @TableField("artistName")
    private String artistName;

    /**
     * 分类类型
     */
    @TableField("typeName")
    private String typeName;

    /**
     * 舞曲视频链接
     */
    @TableField("videoUrl")
    private String videoUrl;

    /**
     * 舞曲缩略图链接
     */
    @TableField("cutImgUrl")
    private String cutImgUrl;


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

    public String getDanceName() {
        return danceName;
    }

    public void setDanceName(String danceName) {
        this.danceName = danceName;
    }

    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    public Boolean getSysDance() {
        return sysDance;
    }

    public void setSysDance(Boolean sysDance) {
        this.sysDance = sysDance;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getCutImgUrl() {
        return cutImgUrl;
    }

    public void setCutImgUrl(String cutImgUrl) {
        this.cutImgUrl = cutImgUrl;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Dance{" +
        "id=" + id +
        ", barId=" + barId +
        ", danceName=" + danceName +
        ", hot=" + hot +
        ", delete=" + delete +
        ", sysDance=" + sysDance +
        ", createTime=" + createTime +
        ", createUserId=" + createUserId +
        ", remark=" + remark +
        ", used=" + used +
        ", artistId=" + artistId +
        ", artistName=" + artistName +
        ", typeName=" + typeName +
        ", videoUrl=" + videoUrl +
        ", cutImgUrl=" + cutImgUrl +
        "}";
    }
}
