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
public class Baseconfig extends Model<Baseconfig> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String basekey;

    private String basename;

    private String basevalue;

    private String note;

    private String type;

    private String jsapiticket;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBasekey() {
        return basekey;
    }

    public void setBasekey(String basekey) {
        this.basekey = basekey;
    }

    public String getBasename() {
        return basename;
    }

    public void setBasename(String basename) {
        this.basename = basename;
    }

    public String getBasevalue() {
        return basevalue;
    }

    public void setBasevalue(String basevalue) {
        this.basevalue = basevalue;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getJsapiticket() {
        return jsapiticket;
    }

    public void setJsapiticket(String jsapiticket) {
        this.jsapiticket = jsapiticket;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Baseconfig{" +
        "id=" + id +
        ", basekey=" + basekey +
        ", basename=" + basename +
        ", basevalue=" + basevalue +
        ", note=" + note +
        ", type=" + type +
        ", jsapiticket=" + jsapiticket +
        "}";
    }
}
