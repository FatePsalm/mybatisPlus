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
public class Lotteryconfig extends Model<Lotteryconfig> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private LocalDateTime time;

    /**
     * 抽奖活动标题
     */
    private String title;

    private String pcbg;

    private String telbg;

    /**
     * 中奖人数
     */
    private Integer num;

    /**
     * 当天酒吧第几次抽奖
     */
    private Integer round;

    /**
     * 一等奖最大人数
     */
    @TableField("firstAwardnum")
    private Integer firstAwardnum;

    /**
     * 二等奖最大人数
     */
    @TableField("secondAwardnum")
    private Integer secondAwardnum;

    @TableField("thirdAwardnum")
    private Integer thirdAwardnum;

    /**
     * 参与奖最大人数
     */
    @TableField("joinAwardnum")
    private Integer joinAwardnum;

    /**
     * 是否开启定位签到
     */
    @TableField("needPos")
    private Boolean needPos;


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

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPcbg() {
        return pcbg;
    }

    public void setPcbg(String pcbg) {
        this.pcbg = pcbg;
    }

    public String getTelbg() {
        return telbg;
    }

    public void setTelbg(String telbg) {
        this.telbg = telbg;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public Integer getFirstAwardnum() {
        return firstAwardnum;
    }

    public void setFirstAwardnum(Integer firstAwardnum) {
        this.firstAwardnum = firstAwardnum;
    }

    public Integer getSecondAwardnum() {
        return secondAwardnum;
    }

    public void setSecondAwardnum(Integer secondAwardnum) {
        this.secondAwardnum = secondAwardnum;
    }

    public Integer getThirdAwardnum() {
        return thirdAwardnum;
    }

    public void setThirdAwardnum(Integer thirdAwardnum) {
        this.thirdAwardnum = thirdAwardnum;
    }

    public Integer getJoinAwardnum() {
        return joinAwardnum;
    }

    public void setJoinAwardnum(Integer joinAwardnum) {
        this.joinAwardnum = joinAwardnum;
    }

    public Boolean getNeedPos() {
        return needPos;
    }

    public void setNeedPos(Boolean needPos) {
        this.needPos = needPos;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Lotteryconfig{" +
        "id=" + id +
        ", barid=" + barid +
        ", time=" + time +
        ", title=" + title +
        ", pcbg=" + pcbg +
        ", telbg=" + telbg +
        ", num=" + num +
        ", round=" + round +
        ", firstAwardnum=" + firstAwardnum +
        ", secondAwardnum=" + secondAwardnum +
        ", thirdAwardnum=" + thirdAwardnum +
        ", joinAwardnum=" + joinAwardnum +
        ", needPos=" + needPos +
        "}";
    }
}
