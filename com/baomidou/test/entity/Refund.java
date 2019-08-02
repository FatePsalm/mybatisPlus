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
public class Refund extends Model<Refund> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String objid;

    private Integer type;

    private LocalDateTime time;

    private String outRefundNo;

    private String refundNo;

    private String barid;

    private BigDecimal money;

    /**
     * 酒吧分成后的退款金额
     */
    private BigDecimal barmoney;

    private Boolean refundstate;

    private String remark;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getOutRefundNo() {
        return outRefundNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    public String getRefundNo() {
        return refundNo;
    }

    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getBarmoney() {
        return barmoney;
    }

    public void setBarmoney(BigDecimal barmoney) {
        this.barmoney = barmoney;
    }

    public Boolean getRefundstate() {
        return refundstate;
    }

    public void setRefundstate(Boolean refundstate) {
        this.refundstate = refundstate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Refund{" +
        "id=" + id +
        ", objid=" + objid +
        ", type=" + type +
        ", time=" + time +
        ", outRefundNo=" + outRefundNo +
        ", refundNo=" + refundNo +
        ", barid=" + barid +
        ", money=" + money +
        ", barmoney=" + barmoney +
        ", refundstate=" + refundstate +
        ", remark=" + remark +
        "}";
    }
}
