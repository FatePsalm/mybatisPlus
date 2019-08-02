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
public class Customermanager extends Model<Customermanager> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 客户酒吧
     */
    private String barid;

    /**
     * 自己酒吧
     */
    private String mybarid;

    /**
     * 创建时间
     */
    private LocalDateTime time;

    /**
     * 开始维护时间
     */
    private LocalDateTime startdate;

    /**
     * 维护状态:0：未开始；1：开始维护；2：关闭维护
     */
    private Integer state;

    /**
     * 维护类型:1：流水激活；2：流水维护
     */
    private Integer type;

    /**
     * 备注
     */
    private String remarks;


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

    public String getMybarid() {
        return mybarid;
    }

    public void setMybarid(String mybarid) {
        this.mybarid = mybarid;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public LocalDateTime getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDateTime startdate) {
        this.startdate = startdate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Customermanager{" +
        "id=" + id +
        ", barid=" + barid +
        ", mybarid=" + mybarid +
        ", time=" + time +
        ", startdate=" + startdate +
        ", state=" + state +
        ", type=" + type +
        ", remarks=" + remarks +
        "}";
    }
}
