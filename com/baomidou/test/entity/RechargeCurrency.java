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
public class RechargeCurrency extends Model<RechargeCurrency> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 操作人id
     */
    private String operatorId;

    /**
     * 被充值人id
     */
    private String operatedUserId;

    /**
     * 定向币金额
     */
    private Double money;

    /**
     * 类型(充值与冲抵)
     */
    private String type;

    /**
     * 创建时间
     */
    private LocalDateTime createtime;

    /**
     * 更新时间
     */
    private LocalDateTime updatetime;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 总的充值金额
     */
    private Double allMoney;

    /**
     * 酒吧扣除金额
     */
    private Double deductBalanceMoney;


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

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatedUserId() {
        return operatedUserId;
    }

    public void setOperatedUserId(String operatedUserId) {
        this.operatedUserId = operatedUserId;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public LocalDateTime getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(LocalDateTime updatetime) {
        this.updatetime = updatetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Double getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(Double allMoney) {
        this.allMoney = allMoney;
    }

    public Double getDeductBalanceMoney() {
        return deductBalanceMoney;
    }

    public void setDeductBalanceMoney(Double deductBalanceMoney) {
        this.deductBalanceMoney = deductBalanceMoney;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "RechargeCurrency{" +
        "id=" + id +
        ", barid=" + barid +
        ", operatorId=" + operatorId +
        ", operatedUserId=" + operatedUserId +
        ", money=" + money +
        ", type=" + type +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", remark=" + remark +
        ", allMoney=" + allMoney +
        ", deductBalanceMoney=" + deductBalanceMoney +
        "}";
    }
}
