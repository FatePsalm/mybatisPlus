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
public class Userset extends Model<Userset> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String setname;

    private LocalDateTime time;

    private String remark;

    private String barid;

    private String tel;

    private Integer usenum;

    private String name;

    private String payid;

    private LocalDateTime paytime;

    private String attach;

    private String transactionId;

    private Boolean paystate;

    private Boolean refund;

    private String password;

    private BigDecimal money;

    private LocalDateTime createtime;

    private String operatorid;

    private Boolean wemew;


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

    public String getSetname() {
        return setname;
    }

    public void setSetname(String setname) {
        this.setname = setname;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getUsenum() {
        return usenum;
    }

    public void setUsenum(Integer usenum) {
        this.usenum = usenum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid;
    }

    public LocalDateTime getPaytime() {
        return paytime;
    }

    public void setPaytime(LocalDateTime paytime) {
        this.paytime = paytime;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Boolean getPaystate() {
        return paystate;
    }

    public void setPaystate(Boolean paystate) {
        this.paystate = paystate;
    }

    public Boolean getRefund() {
        return refund;
    }

    public void setRefund(Boolean refund) {
        this.refund = refund;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public Boolean getWemew() {
        return wemew;
    }

    public void setWemew(Boolean wemew) {
        this.wemew = wemew;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Userset{" +
        "id=" + id +
        ", userid=" + userid +
        ", setname=" + setname +
        ", time=" + time +
        ", remark=" + remark +
        ", barid=" + barid +
        ", tel=" + tel +
        ", usenum=" + usenum +
        ", name=" + name +
        ", payid=" + payid +
        ", paytime=" + paytime +
        ", attach=" + attach +
        ", transactionId=" + transactionId +
        ", paystate=" + paystate +
        ", refund=" + refund +
        ", password=" + password +
        ", money=" + money +
        ", createtime=" + createtime +
        ", operatorid=" + operatorid +
        ", wemew=" + wemew +
        "}";
    }
}
