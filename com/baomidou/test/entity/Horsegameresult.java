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
public class Horsegameresult extends Model<Horsegameresult> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String horsegametimesid;

    private String userid;

    private LocalDateTime time;

    private Integer ranking;

    private Integer type;

    /**
     * 选择的生肖
     */
    private String animals;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHorsegametimesid() {
        return horsegametimesid;
    }

    public void setHorsegametimesid(String horsegametimesid) {
        this.horsegametimesid = horsegametimesid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAnimals() {
        return animals;
    }

    public void setAnimals(String animals) {
        this.animals = animals;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Horsegameresult{" +
        "id=" + id +
        ", horsegametimesid=" + horsegametimesid +
        ", userid=" + userid +
        ", time=" + time +
        ", ranking=" + ranking +
        ", type=" + type +
        ", animals=" + animals +
        "}";
    }
}
