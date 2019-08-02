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
public class SpellSong extends Model<SpellSong> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 歌曲ID
     */
    @TableField("songId")
    private String songId;

    /**
     * 拼歌成员上限
     */
    @TableField("songRange")
    private Integer songRange;

    /**
     * 当前成员数
     */
    @TableField("memberNumber")
    private Integer memberNumber;

    /**
     * 拼团状态：1：待组团 2：完成 3：组团失败
     */
    @TableField("memberState")
    private Integer memberState;

    /**
     * 开始时间
     */
    @TableField("startTime")
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    @TableField("endTime")
    private LocalDateTime endTime;

    /**
     * 酒吧ID
     */
    @TableField("barId")
    private String barId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public Integer getSongRange() {
        return songRange;
    }

    public void setSongRange(Integer songRange) {
        this.songRange = songRange;
    }

    public Integer getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(Integer memberNumber) {
        this.memberNumber = memberNumber;
    }

    public Integer getMemberState() {
        return memberState;
    }

    public void setMemberState(Integer memberState) {
        this.memberState = memberState;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getBarId() {
        return barId;
    }

    public void setBarId(String barId) {
        this.barId = barId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SpellSong{" +
        "id=" + id +
        ", songId=" + songId +
        ", songRange=" + songRange +
        ", memberNumber=" + memberNumber +
        ", memberState=" + memberState +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", barId=" + barId +
        "}";
    }
}
