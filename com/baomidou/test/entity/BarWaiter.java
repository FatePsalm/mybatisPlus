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
public class BarWaiter extends Model<BarWaiter> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String barbaseid;

    /**
     * 成为服务的时间
     */
    private LocalDateTime time;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 手机
     */
    private String phone;

    /**
     * 姓名
     */
    private String realname;

    /**
     * 部门
     */
    private String department;

    /**
     * 是否分成
     */
    @TableField("isBpDivede")
    private Boolean bpDivede;

    /**
     * 是否兜风分成
     */
    @TableField("isDfDivede")
    private Boolean dfDivede;

    /**
     * 是否删除
     */
    @TableField("isDel")
    private Boolean del;

    /**
     * 霸屏默认分成
     */
    @TableField("bpDivedePercent")
    private BigDecimal bpDivedePercent;

    /**
     * 兜风默认分成
     */
    @TableField("dfDivedePercent")
    private BigDecimal dfDivedePercent;

    /**
     * 是否同意协议
     */
    @TableField("agreeDeal")
    private Boolean agreeDeal;

    /**
     * 月邀请人数
     */
    private Integer monthcount;

    /**
     * 总邀请人数
     */
    private Integer allcount;

    /**
     * 本月时间
     */
    @TableField("monthTime")
    private String monthTime;

    /**
     * 本月分成
     */
    @TableField("monthMoney")
    private BigDecimal monthMoney;

    /**
     * 总分成
     */
    @TableField("allMoney")
    private BigDecimal allMoney;


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

    public String getBarbaseid() {
        return barbaseid;
    }

    public void setBarbaseid(String barbaseid) {
        this.barbaseid = barbaseid;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Boolean getBpDivede() {
        return bpDivede;
    }

    public void setBpDivede(Boolean bpDivede) {
        this.bpDivede = bpDivede;
    }

    public Boolean getDfDivede() {
        return dfDivede;
    }

    public void setDfDivede(Boolean dfDivede) {
        this.dfDivede = dfDivede;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    public BigDecimal getBpDivedePercent() {
        return bpDivedePercent;
    }

    public void setBpDivedePercent(BigDecimal bpDivedePercent) {
        this.bpDivedePercent = bpDivedePercent;
    }

    public BigDecimal getDfDivedePercent() {
        return dfDivedePercent;
    }

    public void setDfDivedePercent(BigDecimal dfDivedePercent) {
        this.dfDivedePercent = dfDivedePercent;
    }

    public Boolean getAgreeDeal() {
        return agreeDeal;
    }

    public void setAgreeDeal(Boolean agreeDeal) {
        this.agreeDeal = agreeDeal;
    }

    public Integer getMonthcount() {
        return monthcount;
    }

    public void setMonthcount(Integer monthcount) {
        this.monthcount = monthcount;
    }

    public Integer getAllcount() {
        return allcount;
    }

    public void setAllcount(Integer allcount) {
        this.allcount = allcount;
    }

    public String getMonthTime() {
        return monthTime;
    }

    public void setMonthTime(String monthTime) {
        this.monthTime = monthTime;
    }

    public BigDecimal getMonthMoney() {
        return monthMoney;
    }

    public void setMonthMoney(BigDecimal monthMoney) {
        this.monthMoney = monthMoney;
    }

    public BigDecimal getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(BigDecimal allMoney) {
        this.allMoney = allMoney;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BarWaiter{" +
        "id=" + id +
        ", userid=" + userid +
        ", barbaseid=" + barbaseid +
        ", time=" + time +
        ", remarks=" + remarks +
        ", type=" + type +
        ", phone=" + phone +
        ", realname=" + realname +
        ", department=" + department +
        ", bpDivede=" + bpDivede +
        ", dfDivede=" + dfDivede +
        ", del=" + del +
        ", bpDivedePercent=" + bpDivedePercent +
        ", dfDivedePercent=" + dfDivedePercent +
        ", agreeDeal=" + agreeDeal +
        ", monthcount=" + monthcount +
        ", allcount=" + allcount +
        ", monthTime=" + monthTime +
        ", monthMoney=" + monthMoney +
        ", allMoney=" + allMoney +
        "}";
    }
}
