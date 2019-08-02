package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class City extends Model<City> {

    private static final long serialVersionUID = 1L;

    private Integer cid;

    private String city;

    private Integer pid;


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    protected Serializable pkVal() {
        return this.city;
    }

    @Override
    public String toString() {
        return "City{" +
        "cid=" + cid +
        ", city=" + city +
        ", pid=" + pid +
        "}";
    }
}
