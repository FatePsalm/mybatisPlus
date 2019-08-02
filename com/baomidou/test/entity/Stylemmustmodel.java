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
public class Stylemmustmodel extends Model<Stylemmustmodel> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String styleid;

    private String modulid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStyleid() {
        return styleid;
    }

    public void setStyleid(String styleid) {
        this.styleid = styleid;
    }

    public String getModulid() {
        return modulid;
    }

    public void setModulid(String modulid) {
        this.modulid = modulid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Stylemmustmodel{" +
        "id=" + id +
        ", styleid=" + styleid +
        ", modulid=" + modulid +
        "}";
    }
}
