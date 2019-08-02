package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 互动游戏和艺人绑定表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class InteractArtist extends Model<InteractArtist> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private String id;

    /**
     * 互动游戏ID
     */
    private String intId;

    /**
     * 艺人ID
     */
    private String artistId;

    /**
     * 创建时间
     */
    private LocalDateTime creationTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIntId() {
        return intId;
    }

    public void setIntId(String intId) {
        this.intId = intId;
    }

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "InteractArtist{" +
        "id=" + id +
        ", intId=" + intId +
        ", artistId=" + artistId +
        ", creationTime=" + creationTime +
        "}";
    }
}
