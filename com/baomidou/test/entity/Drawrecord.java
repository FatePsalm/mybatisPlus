package com.baomidou.test.entity;

import java.math.BigDecimal;
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
public class Drawrecord extends Model<Drawrecord> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String objid;

    private Integer times;

    private LocalDateTime time;

    private Integer type;

    /**
     * 投票主题id
     */
    private String cid;

    /**
     * 票数 一元等于一票
     */
    private BigDecimal price;

    /**
     * 送的礼物
     */
    private String godid;

    /**
     * 是否免费霸屏
     */
    private Boolean freepk;

    /**
     * 记录pk免费打赏的酒吧id
     */
    private String barid;


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

    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
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

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getGodid() {
        return godid;
    }

    public void setGodid(String godid) {
        this.godid = godid;
    }

    public Boolean getFreepk() {
        return freepk;
    }

    public void setFreepk(Boolean freepk) {
        this.freepk = freepk;
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
        return "Drawrecord{" +
        "id=" + id +
        ", userid=" + userid +
        ", objid=" + objid +
        ", times=" + times +
        ", time=" + time +
        ", type=" + type +
        ", cid=" + cid +
        ", price=" + price +
        ", godid=" + godid +
        ", freepk=" + freepk +
        ", barid=" + barid +
        "}";
    }
}
