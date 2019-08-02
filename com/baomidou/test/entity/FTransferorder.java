package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class FTransferorder extends Model<FTransferorder> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private String id;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 订单号
     */
    @TableField("orderId")
    private String orderId;

    /**
     * 凭证号
     */
    @TableField("voucherId")
    private String voucherId;

    /**
     * 交易类型：0、单笔转账；1、批量转账
     */
    @TableField("insType")
    private Integer insType;

    /**
     * 转账订单流水号
     */
    @TableField("svrId")
    private String svrId;

    /**
     * 酒吧名称
     */
    @TableField("barName")
    private String barName;

    /**
     * 酒吧手机号
     */
    @TableField("barTel")
    private String barTel;

    /**
     * 转账金额
     */
    private BigDecimal money;

    /**
     * 银行名称
     */
    @TableField("bankName")
    private String bankName;

    /**
     * 开户行网点
     */
    @TableField("bankBranches")
    private String bankBranches;

    /**
     * 银行卡号
     */
    @TableField("bankCard")
    private String bankCard;

    /**
     * 开户名或者公司
     */
    @TableField("accountName")
    private String accountName;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private LocalDate createTime;

    /**
     * 操作时间
     */
    @TableField("operateTime")
    private LocalDateTime operateTime;

    /**
     * 微喵账号类型：0、代理商账号；2、酒吧账号；5、集团账号
     */
    private Integer role;

    /**
     * 订单状态：0、待转账；1、转账中；2、转账失败
     */
    private Integer state;

    /**
     * 订单消息：转账成功：success；转账失败：失败原因
     */
    private String msg;

    /**
     * 备注
     */
    private String remarks;


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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public Integer getInsType() {
        return insType;
    }

    public void setInsType(Integer insType) {
        this.insType = insType;
    }

    public String getSvrId() {
        return svrId;
    }

    public void setSvrId(String svrId) {
        this.svrId = svrId;
    }

    public String getBarName() {
        return barName;
    }

    public void setBarName(String barName) {
        this.barName = barName;
    }

    public String getBarTel() {
        return barTel;
    }

    public void setBarTel(String barTel) {
        this.barTel = barTel;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranches() {
        return bankBranches;
    }

    public void setBankBranches(String bankBranches) {
        this.bankBranches = bankBranches;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(LocalDateTime operateTime) {
        this.operateTime = operateTime;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "FTransferorder{" +
        "id=" + id +
        ", barid=" + barid +
        ", orderId=" + orderId +
        ", voucherId=" + voucherId +
        ", insType=" + insType +
        ", svrId=" + svrId +
        ", barName=" + barName +
        ", barTel=" + barTel +
        ", money=" + money +
        ", bankName=" + bankName +
        ", bankBranches=" + bankBranches +
        ", bankCard=" + bankCard +
        ", accountName=" + accountName +
        ", createTime=" + createTime +
        ", operateTime=" + operateTime +
        ", role=" + role +
        ", state=" + state +
        ", msg=" + msg +
        ", remarks=" + remarks +
        "}";
    }
}
