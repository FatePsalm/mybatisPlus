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
public class TBarbase extends Model<TBarbase> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String tel;

    private LocalDateTime time;

    private String logourl;

    private String address;

    private String label;

    private Double longitude;

    private Double latitude;

    private String city;

    private String describes;

    private String remark;

    private String contacts;

    private Integer type;

    private String logoid;

    private String pwd;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getLogourl() {
        return logourl;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLogoid() {
        return logoid;
    }

    public void setLogoid(String logoid) {
        this.logoid = logoid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TBarbase{" +
        "id=" + id +
        ", name=" + name +
        ", tel=" + tel +
        ", time=" + time +
        ", logourl=" + logourl +
        ", address=" + address +
        ", label=" + label +
        ", longitude=" + longitude +
        ", latitude=" + latitude +
        ", city=" + city +
        ", describes=" + describes +
        ", remark=" + remark +
        ", contacts=" + contacts +
        ", type=" + type +
        ", logoid=" + logoid +
        ", pwd=" + pwd +
        "}";
    }
}
