package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 微喵工作人员
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class WemewWorker extends Model<WemewWorker> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private LocalDateTime time;

    private String department;

    private String tel;

    private String head;

    private Integer type;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
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
        return "WemewWorker{" +
        "id=" + id +
        ", name=" + name +
        ", time=" + time +
        ", department=" + department +
        ", tel=" + tel +
        ", head=" + head +
        ", type=" + type +
        "}";
    }
}
