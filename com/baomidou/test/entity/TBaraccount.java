package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class TBaraccount extends Model<TBaraccount> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private BigDecimal money;

    private BigDecimal totalmoney;

    private String accountname;

    private String company;

    private String bankcard;

    private String alipayaccount;

    private String alipayname;

    private Boolean agent;

    private String tel;

    private String remark;

    @TableField("averageMoney")
    private BigDecimal averageMoney;

    @TableField("weeklyRatio")
    private BigDecimal weeklyRatio;

    @TableField("allMoney")
    private BigDecimal allMoney;

    private String bankbranches;

    /**
     * 是否是代理账号
     */
    @TableField("isGroup")
    private Boolean group;

    /**
     * 产生流水日期
     */
    private LocalDateTime time;

    /**
     * 乐观锁版本号
     */
    private Integer version;

    /**
     * 审核状态：0、待审核；1、审核中；2、审核通过；3、审核失败
     */
    private Integer state;

    /**
     * 当前可用额度(定向币)
     */
    @TableField("availableCurrency")
    private BigDecimal availableCurrency;

    /**
     * 总的定向币额度
     */
    @TableField("initAvailableCurrency")
    private BigDecimal initAvailableCurrency;

    /**
     * 抵用的余额
     */
    @TableField("deductionCash")
    private BigDecimal deductionCash;

    /**
     * 是否申请喵boss提现：0、未申请；1、已申请
     */
    private Boolean applyTransfer;

    /**
     * 喵boss申请提现金额
     */
    private BigDecimal applyMoney;

    /**
     * 结算方式： 0、手动结算;1、自动结算;2、申请结算
     */
    private Integer transferType;


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

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(BigDecimal totalmoney) {
        this.totalmoney = totalmoney;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard;
    }

    public String getAlipayaccount() {
        return alipayaccount;
    }

    public void setAlipayaccount(String alipayaccount) {
        this.alipayaccount = alipayaccount;
    }

    public String getAlipayname() {
        return alipayname;
    }

    public void setAlipayname(String alipayname) {
        this.alipayname = alipayname;
    }

    public Boolean getAgent() {
        return agent;
    }

    public void setAgent(Boolean agent) {
        this.agent = agent;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getAverageMoney() {
        return averageMoney;
    }

    public void setAverageMoney(BigDecimal averageMoney) {
        this.averageMoney = averageMoney;
    }

    public BigDecimal getWeeklyRatio() {
        return weeklyRatio;
    }

    public void setWeeklyRatio(BigDecimal weeklyRatio) {
        this.weeklyRatio = weeklyRatio;
    }

    public BigDecimal getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(BigDecimal allMoney) {
        this.allMoney = allMoney;
    }

    public String getBankbranches() {
        return bankbranches;
    }

    public void setBankbranches(String bankbranches) {
        this.bankbranches = bankbranches;
    }

    public Boolean getGroup() {
        return group;
    }

    public void setGroup(Boolean group) {
        this.group = group;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public BigDecimal getAvailableCurrency() {
        return availableCurrency;
    }

    public void setAvailableCurrency(BigDecimal availableCurrency) {
        this.availableCurrency = availableCurrency;
    }

    public BigDecimal getInitAvailableCurrency() {
        return initAvailableCurrency;
    }

    public void setInitAvailableCurrency(BigDecimal initAvailableCurrency) {
        this.initAvailableCurrency = initAvailableCurrency;
    }

    public BigDecimal getDeductionCash() {
        return deductionCash;
    }

    public void setDeductionCash(BigDecimal deductionCash) {
        this.deductionCash = deductionCash;
    }

    public Boolean getApplyTransfer() {
        return applyTransfer;
    }

    public void setApplyTransfer(Boolean applyTransfer) {
        this.applyTransfer = applyTransfer;
    }

    public BigDecimal getApplyMoney() {
        return applyMoney;
    }

    public void setApplyMoney(BigDecimal applyMoney) {
        this.applyMoney = applyMoney;
    }

    public Integer getTransferType() {
        return transferType;
    }

    public void setTransferType(Integer transferType) {
        this.transferType = transferType;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TBaraccount{" +
        "id=" + id +
        ", barid=" + barid +
        ", money=" + money +
        ", totalmoney=" + totalmoney +
        ", accountname=" + accountname +
        ", company=" + company +
        ", bankcard=" + bankcard +
        ", alipayaccount=" + alipayaccount +
        ", alipayname=" + alipayname +
        ", agent=" + agent +
        ", tel=" + tel +
        ", remark=" + remark +
        ", averageMoney=" + averageMoney +
        ", weeklyRatio=" + weeklyRatio +
        ", allMoney=" + allMoney +
        ", bankbranches=" + bankbranches +
        ", group=" + group +
        ", time=" + time +
        ", version=" + version +
        ", state=" + state +
        ", availableCurrency=" + availableCurrency +
        ", initAvailableCurrency=" + initAvailableCurrency +
        ", deductionCash=" + deductionCash +
        ", applyTransfer=" + applyTransfer +
        ", applyMoney=" + applyMoney +
        ", transferType=" + transferType +
        "}";
    }
}
