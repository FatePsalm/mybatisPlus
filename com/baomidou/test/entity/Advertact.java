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
public class Advertact extends Model<Advertact> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String actfn;

    @TableField("actTouser")
    private String actTouser;

    private LocalDateTime createtime;

    private Integer num;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getActfn() {
        return actfn;
    }

    public void setActfn(String actfn) {
        this.actfn = actfn;
    }

    public String getActTouser() {
        return actTouser;
    }

    public void setActTouser(String actTouser) {
        this.actTouser = actTouser;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Advertact{" +
        "id=" + id +
        ", actfn=" + actfn +
        ", actTouser=" + actTouser +
        ", createtime=" + createtime +
        ", num=" + num +
        "}";
    }
}
