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
public class Myredbag extends Model<Myredbag> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private Double redbag;

    private String barid;

    private Double totalredbag;

    private Boolean put;

    /**
     * 包红类型
     */
    private Integer type;


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

    public Double getRedbag() {
        return redbag;
    }

    public void setRedbag(Double redbag) {
        this.redbag = redbag;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Double getTotalredbag() {
        return totalredbag;
    }

    public void setTotalredbag(Double totalredbag) {
        this.totalredbag = totalredbag;
    }

    public Boolean getPut() {
        return put;
    }

    public void setPut(Boolean put) {
        this.put = put;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Myredbag{" +
        "id=" + id +
        ", userid=" + userid +
        ", redbag=" + redbag +
        ", barid=" + barid +
        ", totalredbag=" + totalredbag +
        ", put=" + put +
        ", type=" + type +
        "}";
    }
}
