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
public class Weionwall extends Model<Weionwall> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private LocalDateTime time;

    private Integer open;

    private Integer islottery;

    private Integer beginlottery;

    private String theme;

    private String bgimgid;

    private Boolean openflower;

    private Integer runtime;

    private Integer perpagesize;

    private Integer duang;

    @TableField("openCutneighbor")
    private Boolean openCutneighbor;

    /**
     * 分成比例
     */
    private Integer splitratio;

    private Boolean openscreen;

    /**
     * 对对碰配对 0、异性；1、男男；2、女女
     */
    private Integer pairtype;

    private Boolean opends;

    /**
     * 霸屏单价
     */
    private Double bpprice;

    /**
     * 打赏分成比例：0、5-5；1、4-6；2、3-7；4、2-8；5、1-9；
     */
    private Integer rewardratio;

    private Integer walltype;

    /**
     * 霸屏价格类型：0 基数递增；1 基数每秒
     */
    private Integer pricetype;

    /**
     * 大屏幕打开时间
     */
    private LocalDateTime openpascreentime;


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

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getOpen() {
        return open;
    }

    public void setOpen(Integer open) {
        this.open = open;
    }

    public Integer getIslottery() {
        return islottery;
    }

    public void setIslottery(Integer islottery) {
        this.islottery = islottery;
    }

    public Integer getBeginlottery() {
        return beginlottery;
    }

    public void setBeginlottery(Integer beginlottery) {
        this.beginlottery = beginlottery;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getBgimgid() {
        return bgimgid;
    }

    public void setBgimgid(String bgimgid) {
        this.bgimgid = bgimgid;
    }

    public Boolean getOpenflower() {
        return openflower;
    }

    public void setOpenflower(Boolean openflower) {
        this.openflower = openflower;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public Integer getPerpagesize() {
        return perpagesize;
    }

    public void setPerpagesize(Integer perpagesize) {
        this.perpagesize = perpagesize;
    }

    public Integer getDuang() {
        return duang;
    }

    public void setDuang(Integer duang) {
        this.duang = duang;
    }

    public Boolean getOpenCutneighbor() {
        return openCutneighbor;
    }

    public void setOpenCutneighbor(Boolean openCutneighbor) {
        this.openCutneighbor = openCutneighbor;
    }

    public Integer getSplitratio() {
        return splitratio;
    }

    public void setSplitratio(Integer splitratio) {
        this.splitratio = splitratio;
    }

    public Boolean getOpenscreen() {
        return openscreen;
    }

    public void setOpenscreen(Boolean openscreen) {
        this.openscreen = openscreen;
    }

    public Integer getPairtype() {
        return pairtype;
    }

    public void setPairtype(Integer pairtype) {
        this.pairtype = pairtype;
    }

    public Boolean getOpends() {
        return opends;
    }

    public void setOpends(Boolean opends) {
        this.opends = opends;
    }

    public Double getBpprice() {
        return bpprice;
    }

    public void setBpprice(Double bpprice) {
        this.bpprice = bpprice;
    }

    public Integer getRewardratio() {
        return rewardratio;
    }

    public void setRewardratio(Integer rewardratio) {
        this.rewardratio = rewardratio;
    }

    public Integer getWalltype() {
        return walltype;
    }

    public void setWalltype(Integer walltype) {
        this.walltype = walltype;
    }

    public Integer getPricetype() {
        return pricetype;
    }

    public void setPricetype(Integer pricetype) {
        this.pricetype = pricetype;
    }

    public LocalDateTime getOpenpascreentime() {
        return openpascreentime;
    }

    public void setOpenpascreentime(LocalDateTime openpascreentime) {
        this.openpascreentime = openpascreentime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Weionwall{" +
        "id=" + id +
        ", barid=" + barid +
        ", time=" + time +
        ", open=" + open +
        ", islottery=" + islottery +
        ", beginlottery=" + beginlottery +
        ", theme=" + theme +
        ", bgimgid=" + bgimgid +
        ", openflower=" + openflower +
        ", runtime=" + runtime +
        ", perpagesize=" + perpagesize +
        ", duang=" + duang +
        ", openCutneighbor=" + openCutneighbor +
        ", splitratio=" + splitratio +
        ", openscreen=" + openscreen +
        ", pairtype=" + pairtype +
        ", opends=" + opends +
        ", bpprice=" + bpprice +
        ", rewardratio=" + rewardratio +
        ", walltype=" + walltype +
        ", pricetype=" + pricetype +
        ", openpascreentime=" + openpascreentime +
        "}";
    }
}
