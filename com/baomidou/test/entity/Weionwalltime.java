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
public class Weionwalltime extends Model<Weionwalltime> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private LocalDateTime onwalltime;

    @TableField("deleteNum")
    private Integer deleteNum;

    private LocalDateTime pascreentime;


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

    public LocalDateTime getOnwalltime() {
        return onwalltime;
    }

    public void setOnwalltime(LocalDateTime onwalltime) {
        this.onwalltime = onwalltime;
    }

    public Integer getDeleteNum() {
        return deleteNum;
    }

    public void setDeleteNum(Integer deleteNum) {
        this.deleteNum = deleteNum;
    }

    public LocalDateTime getPascreentime() {
        return pascreentime;
    }

    public void setPascreentime(LocalDateTime pascreentime) {
        this.pascreentime = pascreentime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Weionwalltime{" +
        "id=" + id +
        ", barid=" + barid +
        ", onwalltime=" + onwalltime +
        ", deleteNum=" + deleteNum +
        ", pascreentime=" + pascreentime +
        "}";
    }
}
