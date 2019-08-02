package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 艺人分组表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class ArtistGroup extends Model<ArtistGroup> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 分组的名字
     */
    private String name;

    /**
     * 分组创建的时间
     */
    private LocalDateTime time;

    /**
     * 酒吧id
     */
    private String barid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ArtistGroup{" +
        "id=" + id +
        ", name=" + name +
        ", time=" + time +
        ", barid=" + barid +
        "}";
    }
}
