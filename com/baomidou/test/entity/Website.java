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
public class Website extends Model<Website> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String staticfileid;

    private LocalDateTime time;

    private Boolean used;

    private String word;

    private Integer nums;

    private Integer type;

    @TableField("beginTime")
    private LocalDateTime beginTime;

    @TableField("endTime")
    private LocalDateTime endTime;

    /**
     * banner跳转url
     */
    private String url;

    /**
     * banner背景色
     */
    private String color;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStaticfileid() {
        return staticfileid;
    }

    public void setStaticfileid(String staticfileid) {
        this.staticfileid = staticfileid;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Website{" +
        "id=" + id +
        ", staticfileid=" + staticfileid +
        ", time=" + time +
        ", used=" + used +
        ", word=" + word +
        ", nums=" + nums +
        ", type=" + type +
        ", beginTime=" + beginTime +
        ", endTime=" + endTime +
        ", url=" + url +
        ", color=" + color +
        "}";
    }
}
