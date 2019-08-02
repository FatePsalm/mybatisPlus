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
public class BuyLevelRecord extends Model<BuyLevelRecord> {

    private static final long serialVersionUID = 1L;

    private String id;

    private Integer buylevel;

    private BigDecimal singleprice;

    private BigDecimal price;

    private LocalDateTime time;

    private String userid;

    private Integer status;

    private String payid;

    private Integer num;

    /**
     * 时间类型 1.周 2.月
     */
    private Integer timetype;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getBuylevel() {
        return buylevel;
    }

    public void setBuylevel(Integer buylevel) {
        this.buylevel = buylevel;
    }

    public BigDecimal getSingleprice() {
        return singleprice;
    }

    public void setSingleprice(BigDecimal singleprice) {
        this.singleprice = singleprice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getTimetype() {
        return timetype;
    }

    public void setTimetype(Integer timetype) {
        this.timetype = timetype;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BuyLevelRecord{" +
        "id=" + id +
        ", buylevel=" + buylevel +
        ", singleprice=" + singleprice +
        ", price=" + price +
        ", time=" + time +
        ", userid=" + userid +
        ", status=" + status +
        ", payid=" + payid +
        ", num=" + num +
        ", timetype=" + timetype +
        "}";
    }
}
