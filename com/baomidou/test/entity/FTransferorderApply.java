package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 结算申请表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class FTransferorderApply extends Model<FTransferorderApply> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 酒吧ID
     */
    private String barid;

    /**
     * 申请时间
     */
    private LocalDateTime createTime;

    /**
     * 申请提现金额
     */
    private BigDecimal money;

    /**
     * 手续费
     */
    private BigDecimal fee;

    /**
     * 申请结算退款金额
     */
    private BigDecimal refundMoney;

    /**
     * 申请用户ID
     */
    private String userid;

    /**
     * 0、待结算；1、结算中；2、已结算；3、结算失败
     */
    private Integer state;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 结算备注：成功SUCCESS；失败为失败原因
     */
    private String remark;


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

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(BigDecimal refundMoney) {
        this.refundMoney = refundMoney;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
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
        return "FTransferorderApply{" +
        "id=" + id +
        ", barid=" + barid +
        ", createTime=" + createTime +
        ", money=" + money +
        ", fee=" + fee +
        ", refundMoney=" + refundMoney +
        ", userid=" + userid +
        ", state=" + state +
        ", updateTime=" + updateTime +
        ", remark=" + remark +
        "}";
    }
}
