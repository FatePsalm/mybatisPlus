package com.baomidou.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class TAdminRole extends Model<TAdminRole> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String adminId;

    /**
     * 酒吧账号
     */
    private Integer barlabel;

    /**
     * 流水监控
     */
    private Integer sqlabel;

    /**
     * 代理监控
     */
    private Integer aglabel;

    /**
     * 集团账号
     */
    private Integer conpanylabel;

    /**
     * 结算
     */
    private Integer dalabel;

    /**
     * 反馈与消息
     */
    private Integer fklabel;

    /**
     * 系统数据
     */
    private Integer syslabel;

    /**
     * 系统配置
     */
    private Integer sysclabel;

    /**
     * 未完善功能
     */
    private Integer templabel;

    /**
     * 备注
     */
    private String remark;

    private Integer monitoring;

    /**
     * 艺人中心
     */
    private Integer artistlabel;

    /**
     * 绑定代理
     */
    private Integer binding;

    /**
     * 市场监控
     */
    private Integer marketlabel;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public Integer getBarlabel() {
        return barlabel;
    }

    public void setBarlabel(Integer barlabel) {
        this.barlabel = barlabel;
    }

    public Integer getSqlabel() {
        return sqlabel;
    }

    public void setSqlabel(Integer sqlabel) {
        this.sqlabel = sqlabel;
    }

    public Integer getAglabel() {
        return aglabel;
    }

    public void setAglabel(Integer aglabel) {
        this.aglabel = aglabel;
    }

    public Integer getConpanylabel() {
        return conpanylabel;
    }

    public void setConpanylabel(Integer conpanylabel) {
        this.conpanylabel = conpanylabel;
    }

    public Integer getDalabel() {
        return dalabel;
    }

    public void setDalabel(Integer dalabel) {
        this.dalabel = dalabel;
    }

    public Integer getFklabel() {
        return fklabel;
    }

    public void setFklabel(Integer fklabel) {
        this.fklabel = fklabel;
    }

    public Integer getSyslabel() {
        return syslabel;
    }

    public void setSyslabel(Integer syslabel) {
        this.syslabel = syslabel;
    }

    public Integer getSysclabel() {
        return sysclabel;
    }

    public void setSysclabel(Integer sysclabel) {
        this.sysclabel = sysclabel;
    }

    public Integer getTemplabel() {
        return templabel;
    }

    public void setTemplabel(Integer templabel) {
        this.templabel = templabel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getMonitoring() {
        return monitoring;
    }

    public void setMonitoring(Integer monitoring) {
        this.monitoring = monitoring;
    }

    public Integer getArtistlabel() {
        return artistlabel;
    }

    public void setArtistlabel(Integer artistlabel) {
        this.artistlabel = artistlabel;
    }

    public Integer getBinding() {
        return binding;
    }

    public void setBinding(Integer binding) {
        this.binding = binding;
    }

    public Integer getMarketlabel() {
        return marketlabel;
    }

    public void setMarketlabel(Integer marketlabel) {
        this.marketlabel = marketlabel;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TAdminRole{" +
        "id=" + id +
        ", adminId=" + adminId +
        ", barlabel=" + barlabel +
        ", sqlabel=" + sqlabel +
        ", aglabel=" + aglabel +
        ", conpanylabel=" + conpanylabel +
        ", dalabel=" + dalabel +
        ", fklabel=" + fklabel +
        ", syslabel=" + syslabel +
        ", sysclabel=" + sysclabel +
        ", templabel=" + templabel +
        ", remark=" + remark +
        ", monitoring=" + monitoring +
        ", artistlabel=" + artistlabel +
        ", binding=" + binding +
        ", marketlabel=" + marketlabel +
        "}";
    }
}
