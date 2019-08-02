package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class Activity extends Model<Activity> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String description;

    private Integer type;

    private LocalDateTime time;

    private Integer total;

    private String name;

    private Double probability;

    private Integer times;

    private Integer effectivetime;

    private Boolean open;

    private Integer canusetotal;

    private Integer useday;

    private LocalDateTime overtime;


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getProbability() {
        return probability;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Integer getEffectivetime() {
        return effectivetime;
    }

    public void setEffectivetime(Integer effectivetime) {
        this.effectivetime = effectivetime;
    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public Integer getCanusetotal() {
        return canusetotal;
    }

    public void setCanusetotal(Integer canusetotal) {
        this.canusetotal = canusetotal;
    }

    public Integer getUseday() {
        return useday;
    }

    public void setUseday(Integer useday) {
        this.useday = useday;
    }

    public LocalDateTime getOvertime() {
        return overtime;
    }

    public void setOvertime(LocalDateTime overtime) {
        this.overtime = overtime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Activity{" +
        "id=" + id +
        ", barid=" + barid +
        ", description=" + description +
        ", type=" + type +
        ", time=" + time +
        ", total=" + total +
        ", name=" + name +
        ", probability=" + probability +
        ", times=" + times +
        ", effectivetime=" + effectivetime +
        ", open=" + open +
        ", canusetotal=" + canusetotal +
        ", useday=" + useday +
        ", overtime=" + overtime +
        "}";
    }
}
