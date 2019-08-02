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
public class Agent extends Model<Agent> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String email;

    private String name;

    private String city;

    private String company;

    private LocalDateTime time;

    private Integer type;

    private String tel;

    private Integer state;

    private Integer opennum;

    private String remark;

    private String password;

    private Boolean defaultpwd;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getOpennum() {
        return opennum;
    }

    public void setOpennum(Integer opennum) {
        this.opennum = opennum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getDefaultpwd() {
        return defaultpwd;
    }

    public void setDefaultpwd(Boolean defaultpwd) {
        this.defaultpwd = defaultpwd;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Agent{" +
        "id=" + id +
        ", email=" + email +
        ", name=" + name +
        ", city=" + city +
        ", company=" + company +
        ", time=" + time +
        ", type=" + type +
        ", tel=" + tel +
        ", state=" + state +
        ", opennum=" + opennum +
        ", remark=" + remark +
        ", password=" + password +
        ", defaultpwd=" + defaultpwd +
        "}";
    }
}
