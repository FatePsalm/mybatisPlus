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
public class Stylebanner extends Model<Stylebanner> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String bannerimgid;

    private String link;

    private String styleid;


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

    public String getBannerimgid() {
        return bannerimgid;
    }

    public void setBannerimgid(String bannerimgid) {
        this.bannerimgid = bannerimgid;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getStyleid() {
        return styleid;
    }

    public void setStyleid(String styleid) {
        this.styleid = styleid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Stylebanner{" +
        "id=" + id +
        ", barid=" + barid +
        ", bannerimgid=" + bannerimgid +
        ", link=" + link +
        ", styleid=" + styleid +
        "}";
    }
}
