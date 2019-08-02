package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 旺小宝里面喜欢和不喜欢的记录表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class WangLikeuser extends Model<WangLikeuser> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String fromuserid;

    private String likeuserid;

    private LocalDateTime time;

    private Integer likeaction;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFromuserid() {
        return fromuserid;
    }

    public void setFromuserid(String fromuserid) {
        this.fromuserid = fromuserid;
    }

    public String getLikeuserid() {
        return likeuserid;
    }

    public void setLikeuserid(String likeuserid) {
        this.likeuserid = likeuserid;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getLikeaction() {
        return likeaction;
    }

    public void setLikeaction(Integer likeaction) {
        this.likeaction = likeaction;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "WangLikeuser{" +
        "id=" + id +
        ", fromuserid=" + fromuserid +
        ", likeuserid=" + likeuserid +
        ", time=" + time +
        ", likeaction=" + likeaction +
        "}";
    }
}
