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
public class Weionwalluser extends Model<Weionwalluser> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String weionwallid;

    private Integer opensq;

    private LocalDateTime time;

    private Boolean lottery;


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

    public String getWeionwallid() {
        return weionwallid;
    }

    public void setWeionwallid(String weionwallid) {
        this.weionwallid = weionwallid;
    }

    public Integer getOpensq() {
        return opensq;
    }

    public void setOpensq(Integer opensq) {
        this.opensq = opensq;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Boolean getLottery() {
        return lottery;
    }

    public void setLottery(Boolean lottery) {
        this.lottery = lottery;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Weionwalluser{" +
        "id=" + id +
        ", userid=" + userid +
        ", weionwallid=" + weionwallid +
        ", opensq=" + opensq +
        ", time=" + time +
        ", lottery=" + lottery +
        "}";
    }
}
