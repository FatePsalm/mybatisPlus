package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
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
public class Agentclient extends Model<Agentclient> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 代理商id
     */
    private String agentid;

    /**
     * 客户id
     */
    private String clientid;

    /**
     * 城市
     */
    private String city;

    /**
     * 酒吧名称
     */
    private String barname;

    /**
     * 创建时间
     */
    private LocalDateTime time;

    /**
     *  审核状态：0:未审核；1:已审核
     */
    private Integer state;

    /**
     * 代理商和酒吧的唯一CODE
     */
    private Integer code;

    /**
     * 代理商在当前酒吧的总收益
     */
    private BigDecimal income;

    /**
     * 待下载代理授权书图片地址
     */
    private String agentcert;

    /**
     * 营业执照图片地址
     */
    private String licence;

    /**
     * 现场照片地址
     */
    private String livephoto;

    /**
     * 确认后代理授权书地址
     */
    private String completecert;

    /**
     * 认证进度：0:未通过，1：待认证，2：认证通过
     */
    private Integer process;

    /**
     * 申请认证时间
     */
    private LocalDateTime applydate;

    /**
     * 有流水的日期
     */
    private LocalDate havemoneydate;

    /**
     * 代理商对客户的备注
     */
    private String remarks;

    /**
     *  绑定类型：0、代理商客户绑定；1、集团账号客户绑定.
     */
    private Integer type;

    /**
     * 那个管理员操作的
     */
    private String adminid;

    /**
     * 分成记录
     */
    private String his;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAgentid() {
        return agentid;
    }

    public void setAgentid(String agentid) {
        this.agentid = agentid;
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBarname() {
        return barname;
    }

    public void setBarname(String barname) {
        this.barname = barname;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public void setIncome(BigDecimal income) {
        this.income = income;
    }

    public String getAgentcert() {
        return agentcert;
    }

    public void setAgentcert(String agentcert) {
        this.agentcert = agentcert;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getLivephoto() {
        return livephoto;
    }

    public void setLivephoto(String livephoto) {
        this.livephoto = livephoto;
    }

    public String getCompletecert() {
        return completecert;
    }

    public void setCompletecert(String completecert) {
        this.completecert = completecert;
    }

    public Integer getProcess() {
        return process;
    }

    public void setProcess(Integer process) {
        this.process = process;
    }

    public LocalDateTime getApplydate() {
        return applydate;
    }

    public void setApplydate(LocalDateTime applydate) {
        this.applydate = applydate;
    }

    public LocalDate getHavemoneydate() {
        return havemoneydate;
    }

    public void setHavemoneydate(LocalDate havemoneydate) {
        this.havemoneydate = havemoneydate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getAdminid() {
        return adminid;
    }

    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    public String getHis() {
        return his;
    }

    public void setHis(String his) {
        this.his = his;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Agentclient{" +
        "id=" + id +
        ", agentid=" + agentid +
        ", clientid=" + clientid +
        ", city=" + city +
        ", barname=" + barname +
        ", time=" + time +
        ", state=" + state +
        ", code=" + code +
        ", income=" + income +
        ", agentcert=" + agentcert +
        ", licence=" + licence +
        ", livephoto=" + livephoto +
        ", completecert=" + completecert +
        ", process=" + process +
        ", applydate=" + applydate +
        ", havemoneydate=" + havemoneydate +
        ", remarks=" + remarks +
        ", type=" + type +
        ", adminid=" + adminid +
        ", his=" + his +
        "}";
    }
}
