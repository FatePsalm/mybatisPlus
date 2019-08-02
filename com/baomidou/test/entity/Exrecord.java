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
public class Exrecord extends Model<Exrecord> {

    private static final long serialVersionUID = 1L;

    private String id;

    private LocalDateTime time;

    private String vipcardid;

    private String commid;

    private Integer delexrecord;

    private String barid;

    private String operatorid;

    private String goodsname;

    private String imgurl;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getVipcardid() {
        return vipcardid;
    }

    public void setVipcardid(String vipcardid) {
        this.vipcardid = vipcardid;
    }

    public String getCommid() {
        return commid;
    }

    public void setCommid(String commid) {
        this.commid = commid;
    }

    public Integer getDelexrecord() {
        return delexrecord;
    }

    public void setDelexrecord(Integer delexrecord) {
        this.delexrecord = delexrecord;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Exrecord{" +
        "id=" + id +
        ", time=" + time +
        ", vipcardid=" + vipcardid +
        ", commid=" + commid +
        ", delexrecord=" + delexrecord +
        ", barid=" + barid +
        ", operatorid=" + operatorid +
        ", goodsname=" + goodsname +
        ", imgurl=" + imgurl +
        "}";
    }
}
