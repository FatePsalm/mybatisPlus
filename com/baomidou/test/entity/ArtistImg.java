package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 艺人相册
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class ArtistImg extends Model<ArtistImg> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 艺人id
     */
    private String artistid;

    /**
     * 1-图片 2-视频
     */
    private Integer type;

    /**
     * 排序
     */
    private Integer imgSort;

    /**
     * 链接地址
     */
    private String url;

    /**
     * 备注
     */
    private String note;

    /**
     * 图片分组
     */
    private Integer imgGroup;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArtistid() {
        return artistid;
    }

    public void setArtistid(String artistid) {
        this.artistid = artistid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getImgSort() {
        return imgSort;
    }

    public void setImgSort(Integer imgSort) {
        this.imgSort = imgSort;
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

    public Integer getImgGroup() {
        return imgGroup;
    }

    public void setImgGroup(Integer imgGroup) {
        this.imgGroup = imgGroup;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ArtistImg{" +
        "id=" + id +
        ", artistid=" + artistid +
        ", type=" + type +
        ", imgSort=" + imgSort +
        ", url=" + url +
        ", note=" + note +
        ", imgGroup=" + imgGroup +
        "}";
    }
}
