package com.baomidou.test.entity;

import java.math.BigDecimal;
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
public class Prize extends Model<Prize> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private Integer lev;

    private Integer total;

    private LocalDateTime time;

    private String barid;

    private Integer type;

    private Integer begin;

    private Integer end;

    private String imgurl;

    private Integer surplusnum;

    private LocalDateTime overtime;

    private String description;

    private BigDecimal probability;

    private LocalDateTime effectivetime;

    private LocalDateTime starttime;

    /**
     * 活动结束时间
     */
    @TableField("startDate")
    private LocalDateTime startDate;

    /**
     * 活动开始时间
     */
    @TableField("endDate")
    private LocalDateTime endDate;

    /**
     * 使用范围
     */
    private String userange;

    /**
     * 霸屏触发价格
     */
    private BigDecimal pricelimit;

    /**
     * 奖项名称
     */
    private String prizename;


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

    public Integer getLev() {
        return lev;
    }

    public void setLev(Integer lev) {
        this.lev = lev;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getBegin() {
        return begin;
    }

    public void setBegin(Integer begin) {
        this.begin = begin;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Integer getSurplusnum() {
        return surplusnum;
    }

    public void setSurplusnum(Integer surplusnum) {
        this.surplusnum = surplusnum;
    }

    public LocalDateTime getOvertime() {
        return overtime;
    }

    public void setOvertime(LocalDateTime overtime) {
        this.overtime = overtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getProbability() {
        return probability;
    }

    public void setProbability(BigDecimal probability) {
        this.probability = probability;
    }

    public LocalDateTime getEffectivetime() {
        return effectivetime;
    }

    public void setEffectivetime(LocalDateTime effectivetime) {
        this.effectivetime = effectivetime;
    }

    public LocalDateTime getStarttime() {
        return starttime;
    }

    public void setStarttime(LocalDateTime starttime) {
        this.starttime = starttime;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getUserange() {
        return userange;
    }

    public void setUserange(String userange) {
        this.userange = userange;
    }

    public BigDecimal getPricelimit() {
        return pricelimit;
    }

    public void setPricelimit(BigDecimal pricelimit) {
        this.pricelimit = pricelimit;
    }

    public String getPrizename() {
        return prizename;
    }

    public void setPrizename(String prizename) {
        this.prizename = prizename;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Prize{" +
        "id=" + id +
        ", name=" + name +
        ", lev=" + lev +
        ", total=" + total +
        ", time=" + time +
        ", barid=" + barid +
        ", type=" + type +
        ", begin=" + begin +
        ", end=" + end +
        ", imgurl=" + imgurl +
        ", surplusnum=" + surplusnum +
        ", overtime=" + overtime +
        ", description=" + description +
        ", probability=" + probability +
        ", effectivetime=" + effectivetime +
        ", starttime=" + starttime +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        ", userange=" + userange +
        ", pricelimit=" + pricelimit +
        ", prizename=" + prizename +
        "}";
    }
}
