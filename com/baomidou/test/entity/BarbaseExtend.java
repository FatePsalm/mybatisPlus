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
public class BarbaseExtend extends Model<BarbaseExtend> {

    private static final long serialVersionUID = 1L;

    /**
     * 酒吧扩展表id
     */
    private String id;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 酒吧等级  1A，2B，3C，4D，5E
     */
    private String grade;

    /**
     * 酒吧面积
     */
    private String acreage;

    /**
     * 可用霸屏的大屏数量
     */
    private Integer pascreennum;

    /**
     * 电视机数量
     */
    private Integer televisionnum;

    /**
     * 月酒水销售额
     */
    private String salesmonths;

    /**
     * 创建时间
     */
    private LocalDateTime createtime;

    /**
     * 修改时间
     */
    private LocalDateTime updatetime;

    /**
     * 人均酒水销售额
     */
    private String consumptiondrinks;


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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAcreage() {
        return acreage;
    }

    public void setAcreage(String acreage) {
        this.acreage = acreage;
    }

    public Integer getPascreennum() {
        return pascreennum;
    }

    public void setPascreennum(Integer pascreennum) {
        this.pascreennum = pascreennum;
    }

    public Integer getTelevisionnum() {
        return televisionnum;
    }

    public void setTelevisionnum(Integer televisionnum) {
        this.televisionnum = televisionnum;
    }

    public String getSalesmonths() {
        return salesmonths;
    }

    public void setSalesmonths(String salesmonths) {
        this.salesmonths = salesmonths;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public LocalDateTime getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(LocalDateTime updatetime) {
        this.updatetime = updatetime;
    }

    public String getConsumptiondrinks() {
        return consumptiondrinks;
    }

    public void setConsumptiondrinks(String consumptiondrinks) {
        this.consumptiondrinks = consumptiondrinks;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BarbaseExtend{" +
        "id=" + id +
        ", barid=" + barid +
        ", grade=" + grade +
        ", acreage=" + acreage +
        ", pascreennum=" + pascreennum +
        ", televisionnum=" + televisionnum +
        ", salesmonths=" + salesmonths +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", consumptiondrinks=" + consumptiondrinks +
        "}";
    }
}
