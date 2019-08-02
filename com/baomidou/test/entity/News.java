package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class News extends Model<News> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String title;

    private String thumbMediaId;

    private Boolean showCoverPic;

    private String author;

    private String digest;

    private String content;

    private String url;

    private String contentSourceUrl;

    private LocalDateTime time;

    private String itemid;

    private String coverUrl;

    private String barid;

    private String wxCoverUrl;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId;
    }

    public Boolean getShowCoverPic() {
        return showCoverPic;
    }

    public void setShowCoverPic(Boolean showCoverPic) {
        this.showCoverPic = showCoverPic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContentSourceUrl() {
        return contentSourceUrl;
    }

    public void setContentSourceUrl(String contentSourceUrl) {
        this.contentSourceUrl = contentSourceUrl;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getWxCoverUrl() {
        return wxCoverUrl;
    }

    public void setWxCoverUrl(String wxCoverUrl) {
        this.wxCoverUrl = wxCoverUrl;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "News{" +
        "id=" + id +
        ", title=" + title +
        ", thumbMediaId=" + thumbMediaId +
        ", showCoverPic=" + showCoverPic +
        ", author=" + author +
        ", digest=" + digest +
        ", content=" + content +
        ", url=" + url +
        ", contentSourceUrl=" + contentSourceUrl +
        ", time=" + time +
        ", itemid=" + itemid +
        ", coverUrl=" + coverUrl +
        ", barid=" + barid +
        ", wxCoverUrl=" + wxCoverUrl +
        "}";
    }
}
