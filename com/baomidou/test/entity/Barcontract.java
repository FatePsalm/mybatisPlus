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
public class Barcontract extends Model<Barcontract> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private String id;

    /**
     * 酒吧ID
     */
    private String barid;

    /**
     * 审核状态：0、待审核；1、审核中；2、审核通过；3、审核失败
     */
    private Integer state;

    /**
     * 合同地址
     */
    private String contract;

    /**
     * 收款账户名
     */
    private String accountName;

    /**
     * 收款银行名称
     */
    private String bankName;

    /**
     * 银行卡号
     */
    private String bankCard;

    /**
     * 支行名称
     */
    private String bankBranches;

    /**
     * 旧收款账户名
     */
    private String accountNameOld;

    /**
     * 旧收款银行名称
     */
    private String bankNameOld;

    /**
     * 旧银行卡号
     */
    private String bankCardOld;

    /**
     * 旧支行名称
     */
    private String bankBranchesOld;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 操作时间
     */
    private LocalDateTime operateTime;

    /**
     * 备注信息：审核失败则为失败原因
     */
    private String remark;

    /**
     * 操作员
     */
    private String operater;


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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getBankBranches() {
        return bankBranches;
    }

    public void setBankBranches(String bankBranches) {
        this.bankBranches = bankBranches;
    }

    public String getAccountNameOld() {
        return accountNameOld;
    }

    public void setAccountNameOld(String accountNameOld) {
        this.accountNameOld = accountNameOld;
    }

    public String getBankNameOld() {
        return bankNameOld;
    }

    public void setBankNameOld(String bankNameOld) {
        this.bankNameOld = bankNameOld;
    }

    public String getBankCardOld() {
        return bankCardOld;
    }

    public void setBankCardOld(String bankCardOld) {
        this.bankCardOld = bankCardOld;
    }

    public String getBankBranchesOld() {
        return bankBranchesOld;
    }

    public void setBankBranchesOld(String bankBranchesOld) {
        this.bankBranchesOld = bankBranchesOld;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(LocalDateTime operateTime) {
        this.operateTime = operateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Barcontract{" +
        "id=" + id +
        ", barid=" + barid +
        ", state=" + state +
        ", contract=" + contract +
        ", accountName=" + accountName +
        ", bankName=" + bankName +
        ", bankCard=" + bankCard +
        ", bankBranches=" + bankBranches +
        ", accountNameOld=" + accountNameOld +
        ", bankNameOld=" + bankNameOld +
        ", bankCardOld=" + bankCardOld +
        ", bankBranchesOld=" + bankBranchesOld +
        ", createTime=" + createTime +
        ", operateTime=" + operateTime +
        ", remark=" + remark +
        ", operater=" + operater +
        "}";
    }
}
