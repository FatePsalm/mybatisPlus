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
public class UserFaceResult extends Model<UserFaceResult> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private String id;

    /**
     * 用户id
     */
    private String userid;

    /**
     * 匹配的用户id
     */
    private String matchuserid;

    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 时间
     */
    private String time;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("updateTime")
    private LocalDateTime updateTime;

    /**
     * 时间
     */
    private LocalDateTime sorttime;

    private String heado;

    private String headt;

    private String namet;

    private String nameo;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getMatchuserid() {
        return matchuserid;
    }

    public void setMatchuserid(String matchuserid) {
        this.matchuserid = matchuserid;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public LocalDateTime getSorttime() {
        return sorttime;
    }

    public void setSorttime(LocalDateTime sorttime) {
        this.sorttime = sorttime;
    }

    public String getHeado() {
        return heado;
    }

    public void setHeado(String heado) {
        this.heado = heado;
    }

    public String getHeadt() {
        return headt;
    }

    public void setHeadt(String headt) {
        this.headt = headt;
    }

    public String getNamet() {
        return namet;
    }

    public void setNamet(String namet) {
        this.namet = namet;
    }

    public String getNameo() {
        return nameo;
    }

    public void setNameo(String nameo) {
        this.nameo = nameo;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserFaceResult{" +
        "id=" + id +
        ", userid=" + userid +
        ", matchuserid=" + matchuserid +
        ", money=" + money +
        ", time=" + time +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", sorttime=" + sorttime +
        ", heado=" + heado +
        ", headt=" + headt +
        ", namet=" + namet +
        ", nameo=" + nameo +
        "}";
    }
}
