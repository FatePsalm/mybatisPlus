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
public class Marquee extends Model<Marquee> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String content;

    private LocalDateTime time;

    /**
     * 1：跑马灯；2：抽奖说明
     */
    private Integer type;

    private Boolean use;

    private Boolean sys;

    /**
     * 使用对象id，单个酒吧多个项目id
     */
    private String object;

    /**
     * 排序字段
     */
    private Integer sort;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getUse() {
        return use;
    }

    public void setUse(Boolean use) {
        this.use = use;
    }

    public Boolean getSys() {
        return sys;
    }

    public void setSys(Boolean sys) {
        this.sys = sys;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Marquee{" +
        "id=" + id +
        ", barid=" + barid +
        ", content=" + content +
        ", time=" + time +
        ", type=" + type +
        ", use=" + use +
        ", sys=" + sys +
        ", object=" + object +
        ", sort=" + sort +
        "}";
    }
}
