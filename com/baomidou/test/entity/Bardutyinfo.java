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
public class Bardutyinfo extends Model<Bardutyinfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 负责人id
     */
    private String id;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 酒吧扩展id
     */
    private String barextendid;

    /**
     * 负责人
     */
    private String principal;

    /**
     * 职务类型 0 老板 1店长 2 策划 3 舞台
     */
    private Integer dutytype;

    /**
     * 手机号
     */
    private String tel;

    /**
     * 微信号
     */
    private String wechant;

    private LocalDateTime createtime;

    private LocalDateTime updatetime;

    /**
     * 是否是第一负责人
     */
    private Integer majorpeople;


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

    public String getBarextendid() {
        return barextendid;
    }

    public void setBarextendid(String barextendid) {
        this.barextendid = barextendid;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public Integer getDutytype() {
        return dutytype;
    }

    public void setDutytype(Integer dutytype) {
        this.dutytype = dutytype;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getWechant() {
        return wechant;
    }

    public void setWechant(String wechant) {
        this.wechant = wechant;
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

    public Integer getMajorpeople() {
        return majorpeople;
    }

    public void setMajorpeople(Integer majorpeople) {
        this.majorpeople = majorpeople;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Bardutyinfo{" +
        "id=" + id +
        ", barid=" + barid +
        ", barextendid=" + barextendid +
        ", principal=" + principal +
        ", dutytype=" + dutytype +
        ", tel=" + tel +
        ", wechant=" + wechant +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", majorpeople=" + majorpeople +
        "}";
    }
}
