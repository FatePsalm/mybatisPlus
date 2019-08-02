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
public class Barapply extends Model<Barapply> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barname;

    /**
     * 收件人的名字
     */
    private String username;

    /**
     * 申请人职位
     */
    private String position;

    private Integer type;

    private String city;

    private String tel;

    private String email;

    private LocalDateTime createtime;

    private String remark;

    private Integer state;

    private String barid;

    /**
     * 物料
     */
    private String materiel;

    /**
     * 打印名称
     */
    private String printname;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBarname() {
        return barname;
    }

    public void setBarname(String barname) {
        this.barname = barname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getMateriel() {
        return materiel;
    }

    public void setMateriel(String materiel) {
        this.materiel = materiel;
    }

    public String getPrintname() {
        return printname;
    }

    public void setPrintname(String printname) {
        this.printname = printname;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Barapply{" +
        "id=" + id +
        ", barname=" + barname +
        ", username=" + username +
        ", position=" + position +
        ", type=" + type +
        ", city=" + city +
        ", tel=" + tel +
        ", email=" + email +
        ", createtime=" + createtime +
        ", remark=" + remark +
        ", state=" + state +
        ", barid=" + barid +
        ", materiel=" + materiel +
        ", printname=" + printname +
        "}";
    }
}
