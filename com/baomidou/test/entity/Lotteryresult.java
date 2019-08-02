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
public class Lotteryresult extends Model<Lotteryresult> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String rid;

    /**
     * 是否领奖
     */
    private Boolean accept;

    private Integer rank;


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

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public Boolean getAccept() {
        return accept;
    }

    public void setAccept(Boolean accept) {
        this.accept = accept;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Lotteryresult{" +
        "id=" + id +
        ", userid=" + userid +
        ", rid=" + rid +
        ", accept=" + accept +
        ", rank=" + rank +
        "}";
    }
}
