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
public class Provincial extends Model<Provincial> {

    private static final long serialVersionUID = 1L;

    private Integer pid;

    private String provincial;


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getProvincial() {
        return provincial;
    }

    public void setProvincial(String provincial) {
        this.provincial = provincial;
    }

    @Override
    protected Serializable pkVal() {
        return this.pid;
    }

    @Override
    public String toString() {
        return "Provincial{" +
        "pid=" + pid +
        ", provincial=" + provincial +
        "}";
    }
}
