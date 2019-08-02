package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class Printer extends Model<Printer> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String machinecode;

    @TableField("mKey")
    private String mKey;

    private String barid;

    private LocalDateTime time;

    private Integer printnum;

    private String type;

    private String name;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMachinecode() {
        return machinecode;
    }

    public void setMachinecode(String machinecode) {
        this.machinecode = machinecode;
    }

    public String getmKey() {
        return mKey;
    }

    public void setmKey(String mKey) {
        this.mKey = mKey;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getPrintnum() {
        return printnum;
    }

    public void setPrintnum(Integer printnum) {
        this.printnum = printnum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Printer{" +
        "id=" + id +
        ", machinecode=" + machinecode +
        ", mKey=" + mKey +
        ", barid=" + barid +
        ", time=" + time +
        ", printnum=" + printnum +
        ", type=" + type +
        ", name=" + name +
        "}";
    }
}
