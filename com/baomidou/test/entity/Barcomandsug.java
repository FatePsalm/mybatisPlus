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
public class Barcomandsug extends Model<Barcomandsug> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private Boolean comandsug;

    private String email;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Boolean getComandsug() {
        return comandsug;
    }

    public void setComandsug(Boolean comandsug) {
        this.comandsug = comandsug;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Barcomandsug{" +
        "id=" + id +
        ", barid=" + barid +
        ", comandsug=" + comandsug +
        ", email=" + email +
        "}";
    }
}
