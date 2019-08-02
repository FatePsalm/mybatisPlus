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
public class Shakegameresult extends Model<Shakegameresult> {

    private static final long serialVersionUID = 1L;

    @TableField("shakeId")
    private String shakeId;

    private String id;

    @TableField("uId")
    private String uId;

    private LocalDateTime time;

    private Integer ranking;

    private Integer num;

    private String name;


    public String getShakeId() {
        return shakeId;
    }

    public void setShakeId(String shakeId) {
        this.shakeId = shakeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Shakegameresult{" +
        "shakeId=" + shakeId +
        ", id=" + id +
        ", uId=" + uId +
        ", time=" + time +
        ", ranking=" + ranking +
        ", num=" + num +
        ", name=" + name +
        "}";
    }
}
