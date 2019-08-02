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
public class Foodorder extends Model<Foodorder> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String userid;

    private BigDecimal totalmoney;

    private BigDecimal redmoney;

    private BigDecimal vipcardmoney;

    private BigDecimal wxpaymoney;

    private String desknum;

    private String remark;

    private Boolean paystate;

    @TableField("isCash")
    private Boolean cash;

    private LocalDateTime time;

    private String payid;

    private Boolean pstype;

    private String tel;

    private String address;

    private String explainmsg;

    private Boolean refund;

    private String operatorid;

    private Integer fromfn;

    private String userwaiterid;

    private Boolean wemew;


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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public BigDecimal getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(BigDecimal totalmoney) {
        this.totalmoney = totalmoney;
    }

    public BigDecimal getRedmoney() {
        return redmoney;
    }

    public void setRedmoney(BigDecimal redmoney) {
        this.redmoney = redmoney;
    }

    public BigDecimal getVipcardmoney() {
        return vipcardmoney;
    }

    public void setVipcardmoney(BigDecimal vipcardmoney) {
        this.vipcardmoney = vipcardmoney;
    }

    public BigDecimal getWxpaymoney() {
        return wxpaymoney;
    }

    public void setWxpaymoney(BigDecimal wxpaymoney) {
        this.wxpaymoney = wxpaymoney;
    }

    public String getDesknum() {
        return desknum;
    }

    public void setDesknum(String desknum) {
        this.desknum = desknum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getPaystate() {
        return paystate;
    }

    public void setPaystate(Boolean paystate) {
        this.paystate = paystate;
    }

    public Boolean getCash() {
        return cash;
    }

    public void setCash(Boolean cash) {
        this.cash = cash;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid;
    }

    public Boolean getPstype() {
        return pstype;
    }

    public void setPstype(Boolean pstype) {
        this.pstype = pstype;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getExplainmsg() {
        return explainmsg;
    }

    public void setExplainmsg(String explainmsg) {
        this.explainmsg = explainmsg;
    }

    public Boolean getRefund() {
        return refund;
    }

    public void setRefund(Boolean refund) {
        this.refund = refund;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    public Integer getFromfn() {
        return fromfn;
    }

    public void setFromfn(Integer fromfn) {
        this.fromfn = fromfn;
    }

    public String getUserwaiterid() {
        return userwaiterid;
    }

    public void setUserwaiterid(String userwaiterid) {
        this.userwaiterid = userwaiterid;
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
        return "Foodorder{" +
        "id=" + id +
        ", barid=" + barid +
        ", userid=" + userid +
        ", totalmoney=" + totalmoney +
        ", redmoney=" + redmoney +
        ", vipcardmoney=" + vipcardmoney +
        ", wxpaymoney=" + wxpaymoney +
        ", desknum=" + desknum +
        ", remark=" + remark +
        ", paystate=" + paystate +
        ", cash=" + cash +
        ", time=" + time +
        ", payid=" + payid +
        ", pstype=" + pstype +
        ", tel=" + tel +
        ", address=" + address +
        ", explainmsg=" + explainmsg +
        ", refund=" + refund +
        ", operatorid=" + operatorid +
        ", fromfn=" + fromfn +
        ", userwaiterid=" + userwaiterid +
        ", wemew=" + wemew +
        "}";
    }
}
