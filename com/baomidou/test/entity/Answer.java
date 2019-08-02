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
public class Answer extends Model<Answer> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String queid;

    /**
     * 标题
     */
    private Boolean answer;

    /**
     * 是否抽奖
     */
    private Boolean raffle;

    /**
     * 答题时间
     */
    private LocalDateTime ansTime;

    /**
     * 中奖名称
     */
    private String gift;

    /**
     * 抽奖时间
     */
    private LocalDateTime rafferTime;

    /**
     * 电话
     */
    private String tel;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getQueid() {
        return queid;
    }

    public void setQueid(String queid) {
        this.queid = queid;
    }

    public Boolean getAnswer() {
        return answer;
    }

    public void setAnswer(Boolean answer) {
        this.answer = answer;
    }

    public Boolean getRaffle() {
        return raffle;
    }

    public void setRaffle(Boolean raffle) {
        this.raffle = raffle;
    }

    public LocalDateTime getAnsTime() {
        return ansTime;
    }

    public void setAnsTime(LocalDateTime ansTime) {
        this.ansTime = ansTime;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    public LocalDateTime getRafferTime() {
        return rafferTime;
    }

    public void setRafferTime(LocalDateTime rafferTime) {
        this.rafferTime = rafferTime;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Answer{" +
        "id=" + id +
        ", userid=" + userid +
        ", queid=" + queid +
        ", answer=" + answer +
        ", raffle=" + raffle +
        ", ansTime=" + ansTime +
        ", gift=" + gift +
        ", rafferTime=" + rafferTime +
        ", tel=" + tel +
        "}";
    }
}
