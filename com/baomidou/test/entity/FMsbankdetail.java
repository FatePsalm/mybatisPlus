package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 民生银行交易明细表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class FMsbankdetail extends Model<FMsbankdetail> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 交易流水号
     */
    @TableField("svrId")
    private String svrId;

    /**
     * 账号
     */
    @TableField("acntNo")
    private String acntNo;

    /**
     * 名称
     */
    @TableField("acntName")
    private String acntName;

    /**
     * 类型：1-借方（支出)；2-贷方（收入）
     */
    private Integer type;

    /**
     * 入帐日期
     */
    @TableField("actDate")
    private LocalDate actDate;

    /**
     * 起息日期
     */
    @TableField("intrDate")
    private LocalDate intrDate;

    /**
     * 凭证号
     */
    @TableField("chequeNum")
    private String chequeNum;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 帐号
     */
    @TableField("opAcntNo")
    private String opAcntNo;

    /**
     * 名称
     */
    @TableField("opAcntName")
    private String opAcntName;

    /**
     * 开户行名称
     */
    @TableField("opBankName")
    private String opBankName;

    /**
     * 开户行地址
     */
    @TableField("opBankAddr")
    private String opBankAddr;

    /**
     * 地区编码
     */
    @TableField("opAreaCode")
    private String opAreaCode;

    /**
     * 用途/摘要
     */
    private String explain;

    /**
     * 余额
     */
    private BigDecimal balance;

    /**
     * 传票组内序号
     */
    private String recseq;

    /**
     * 时间戳
     */
    private String timestamp;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSvrId() {
        return svrId;
    }

    public void setSvrId(String svrId) {
        this.svrId = svrId;
    }

    public String getAcntNo() {
        return acntNo;
    }

    public void setAcntNo(String acntNo) {
        this.acntNo = acntNo;
    }

    public String getAcntName() {
        return acntName;
    }

    public void setAcntName(String acntName) {
        this.acntName = acntName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDate getActDate() {
        return actDate;
    }

    public void setActDate(LocalDate actDate) {
        this.actDate = actDate;
    }

    public LocalDate getIntrDate() {
        return intrDate;
    }

    public void setIntrDate(LocalDate intrDate) {
        this.intrDate = intrDate;
    }

    public String getChequeNum() {
        return chequeNum;
    }

    public void setChequeNum(String chequeNum) {
        this.chequeNum = chequeNum;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getOpAcntNo() {
        return opAcntNo;
    }

    public void setOpAcntNo(String opAcntNo) {
        this.opAcntNo = opAcntNo;
    }

    public String getOpAcntName() {
        return opAcntName;
    }

    public void setOpAcntName(String opAcntName) {
        this.opAcntName = opAcntName;
    }

    public String getOpBankName() {
        return opBankName;
    }

    public void setOpBankName(String opBankName) {
        this.opBankName = opBankName;
    }

    public String getOpBankAddr() {
        return opBankAddr;
    }

    public void setOpBankAddr(String opBankAddr) {
        this.opBankAddr = opBankAddr;
    }

    public String getOpAreaCode() {
        return opAreaCode;
    }

    public void setOpAreaCode(String opAreaCode) {
        this.opAreaCode = opAreaCode;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getRecseq() {
        return recseq;
    }

    public void setRecseq(String recseq) {
        this.recseq = recseq;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "FMsbankdetail{" +
        "id=" + id +
        ", svrId=" + svrId +
        ", acntNo=" + acntNo +
        ", acntName=" + acntName +
        ", type=" + type +
        ", actDate=" + actDate +
        ", intrDate=" + intrDate +
        ", chequeNum=" + chequeNum +
        ", amount=" + amount +
        ", opAcntNo=" + opAcntNo +
        ", opAcntName=" + opAcntName +
        ", opBankName=" + opBankName +
        ", opBankAddr=" + opBankAddr +
        ", opAreaCode=" + opAreaCode +
        ", explain=" + explain +
        ", balance=" + balance +
        ", recseq=" + recseq +
        ", timestamp=" + timestamp +
        "}";
    }
}
