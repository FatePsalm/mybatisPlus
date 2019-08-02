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
public class Agentnew extends Model<Agentnew> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 公司名称
     */
    private String conpany;

    /**
     * 联系电话
     */
    private String tel;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 所在城市
     */
    private String city;

    /**
     * 联系人姓名
     */
    private String name;

    /**
     * 地址
     */
    private String address;

    /**
     * 授权时间
     */
    private LocalDateTime time;

    /**
     * 到期时间
     */
    private LocalDateTime endtime;

    /**
     * 绑定账号
     */
    private String account;

    /**
     * 收入分成
     */
    private BigDecimal income;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 代理的城市
     */
    private String actingcity;

    private Integer num;

    /**
     * 父级ID
     */
    @TableField("parentId")
    private String parentId;

    /**
     * 权限等级
     */
    @TableField("roleLevel")
    private Integer roleLevel;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConpany() {
        return conpany;
    }

    public void setConpany(String conpany) {
        this.conpany = conpany;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public LocalDateTime getEndtime() {
        return endtime;
    }

    public void setEndtime(LocalDateTime endtime) {
        this.endtime = endtime;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getActingcity() {
        return actingcity;
    }

    public void setActingcity(String actingcity) {
        this.actingcity = actingcity;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(Integer roleLevel) {
        this.roleLevel = roleLevel;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Agentnew{" +
        "id=" + id +
        ", conpany=" + conpany +
        ", tel=" + tel +
        ", email=" + email +
        ", city=" + city +
        ", name=" + name +
        ", address=" + address +
        ", time=" + time +
        ", endtime=" + endtime +
        ", account=" + account +
        ", income=" + income +
        ", state=" + state +
        ", type=" + type +
        ", remarks=" + remarks +
        ", actingcity=" + actingcity +
        ", num=" + num +
        ", parentId=" + parentId +
        ", roleLevel=" + roleLevel +
        "}";
    }
}
