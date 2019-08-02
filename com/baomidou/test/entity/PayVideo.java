package com.baomidou.test.entity;

import java.math.BigDecimal;
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
public class PayVideo extends Model<PayVideo> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 用户id
     */
    private String userid;

    /**
     * 视频id
     */
    private String vid;

    /**
     * 支付id
     */
    private String payid;

    /**
     * 支付金额
     */
    private BigDecimal price;

    /**
     * 酒吧id
     */
    private String barid;

    private String tid;


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

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "PayVideo{" +
        "id=" + id +
        ", userid=" + userid +
        ", vid=" + vid +
        ", payid=" + payid +
        ", price=" + price +
        ", barid=" + barid +
        ", tid=" + tid +
        "}";
    }
}
