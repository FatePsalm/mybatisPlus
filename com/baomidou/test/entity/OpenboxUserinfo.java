package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 用户购买宝箱表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class OpenboxUserinfo extends Model<OpenboxUserinfo> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String userid;

    private LocalDateTime time;

    /**
     * 购买宝箱数量
     */
    private Integer paysum;

    /**
     * 开宝箱数量
     */
    private Integer opennum;

    /**
     * 未开宝箱数量
     */
    private Integer surplusnum;

    /**
     * 用户每轮记录的id
     */
    private String infoId;


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

    public Integer getPaysum() {
        return paysum;
    }

    public void setPaysum(Integer paysum) {
        this.paysum = paysum;
    }

    public Integer getOpennum() {
        return opennum;
    }

    public void setOpennum(Integer opennum) {
        this.opennum = opennum;
    }

    public Integer getSurplusnum() {
        return surplusnum;
    }

    public void setSurplusnum(Integer surplusnum) {
        this.surplusnum = surplusnum;
    }

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "OpenboxUserinfo{" +
        "id=" + id +
        ", barid=" + barid +
        ", userid=" + userid +
        ", time=" + time +
        ", paysum=" + paysum +
        ", opennum=" + opennum +
        ", surplusnum=" + surplusnum +
        ", infoId=" + infoId +
        "}";
    }
}
