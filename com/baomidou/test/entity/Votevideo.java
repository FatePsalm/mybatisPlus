package com.baomidou.test.entity;

import java.math.BigDecimal;
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
public class Votevideo extends Model<Votevideo> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 投票或pk选手主题
     */
    private String tid;

    /**
     * 价格 默认10元
     */
    private BigDecimal price;

    private String barid;

    private String userid;

    /**
     * 视频缩略图
     */
    private String videoimage;

    /**
     * 视频地址
     */
    private String videosrc;

    private LocalDateTime time;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getVideoimage() {
        return videoimage;
    }

    public void setVideoimage(String videoimage) {
        this.videoimage = videoimage;
    }

    public String getVideosrc() {
        return videosrc;
    }

    public void setVideosrc(String videosrc) {
        this.videosrc = videosrc;
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
        return "Votevideo{" +
        "id=" + id +
        ", tid=" + tid +
        ", price=" + price +
        ", barid=" + barid +
        ", userid=" + userid +
        ", videoimage=" + videoimage +
        ", videosrc=" + videosrc +
        ", time=" + time +
        "}";
    }
}
