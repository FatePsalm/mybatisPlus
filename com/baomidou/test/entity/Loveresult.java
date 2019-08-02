package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class Loveresult extends Model<Loveresult> {

    private static final long serialVersionUID = 1L;

    /**
     * 被喜欢用户id，即为主键
     */
    private Integer uid;

    /**
     * 喜欢的用户id
     */
    private Integer tid;

    /**
     * 是否互相喜欢
     */
    private Boolean love;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Boolean getLove() {
        return love;
    }

    public void setLove(Boolean love) {
        this.love = love;
    }

    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

    @Override
    public String toString() {
        return "Loveresult{" +
        "uid=" + uid +
        ", tid=" + tid +
        ", love=" + love +
        "}";
    }
}
