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
public class TMealorder extends Model<TMealorder> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String barid;

    private BigDecimal price;

    private Boolean paystate;

    private Integer headcount;

    private LocalDateTime paytime;

    private String payid;

    private LocalDateTime createtime;

    private String code;

    private String mealname;

    private String mealdetails;

    private Integer mealdescription;

    private String attach;

    private String transactionId;

    private Boolean used;

    private Integer type;

    private Boolean refund;

    private Integer version;

    private String tmealid;

    private String tel;

    private String sitnum;

    private String mealconver;

    private String operatorid;


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

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getPaystate() {
        return paystate;
    }

    public void setPaystate(Boolean paystate) {
        this.paystate = paystate;
    }

    public Integer getHeadcount() {
        return headcount;
    }

    public void setHeadcount(Integer headcount) {
        this.headcount = headcount;
    }

    public LocalDateTime getPaytime() {
        return paytime;
    }

    public void setPaytime(LocalDateTime paytime) {
        this.paytime = paytime;
    }

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMealname() {
        return mealname;
    }

    public void setMealname(String mealname) {
        this.mealname = mealname;
    }

    public String getMealdetails() {
        return mealdetails;
    }

    public void setMealdetails(String mealdetails) {
        this.mealdetails = mealdetails;
    }

    public Integer getMealdescription() {
        return mealdescription;
    }

    public void setMealdescription(Integer mealdescription) {
        this.mealdescription = mealdescription;
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

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getRefund() {
        return refund;
    }

    public void setRefund(Boolean refund) {
        this.refund = refund;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getTmealid() {
        return tmealid;
    }

    public void setTmealid(String tmealid) {
        this.tmealid = tmealid;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSitnum() {
        return sitnum;
    }

    public void setSitnum(String sitnum) {
        this.sitnum = sitnum;
    }

    public String getMealconver() {
        return mealconver;
    }

    public void setMealconver(String mealconver) {
        this.mealconver = mealconver;
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TMealorder{" +
        "id=" + id +
        ", userid=" + userid +
        ", barid=" + barid +
        ", price=" + price +
        ", paystate=" + paystate +
        ", headcount=" + headcount +
        ", paytime=" + paytime +
        ", payid=" + payid +
        ", createtime=" + createtime +
        ", code=" + code +
        ", mealname=" + mealname +
        ", mealdetails=" + mealdetails +
        ", mealdescription=" + mealdescription +
        ", attach=" + attach +
        ", transactionId=" + transactionId +
        ", used=" + used +
        ", type=" + type +
        ", refund=" + refund +
        ", version=" + version +
        ", tmealid=" + tmealid +
        ", tel=" + tel +
        ", sitnum=" + sitnum +
        ", mealconver=" + mealconver +
        ", operatorid=" + operatorid +
        "}";
    }
}
