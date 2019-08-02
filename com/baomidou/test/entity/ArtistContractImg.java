package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 签约艺人相册
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class ArtistContractImg extends Model<ArtistContractImg> {

    private static final long serialVersionUID = 1L;

    /**
     * 相册ID
     */
    private String id;

    /**
     * 签约艺人ID
     */
    private String artistCId;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 图片分组
     */
    private String imgGroup;

    /**
     * 链接地址
     */
    private String url;

    /**
     * 注释
     */
    private String note;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArtistCId() {
        return artistCId;
    }

    public void setArtistCId(String artistCId) {
        this.artistCId = artistCId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getImgGroup() {
        return imgGroup;
    }

    public void setImgGroup(String imgGroup) {
        this.imgGroup = imgGroup;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ArtistContractImg{" +
        "id=" + id +
        ", artistCId=" + artistCId +
        ", type=" + type +
        ", sort=" + sort +
        ", createTime=" + createTime +
        ", imgGroup=" + imgGroup +
        ", url=" + url +
        ", note=" + note +
        "}";
    }
}
