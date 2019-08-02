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
public class Admin extends Model<Admin> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String username;

    private String password;

    private String barid;

    private Integer role;

    private LocalDateTime time;

    private String rancode;

    private Boolean useful;

    private LocalDateTime expires;

    private BigDecimal alipaymoney;

    private BigDecimal labourmoney;

    private LocalDateTime vipendtime;

    private String remark;

    @TableField("proveImgid")
    private String proveImgid;

    private Boolean static;

    private Boolean rempwd;

    private String codeid;

    private Boolean sendemail;

    private Boolean sendtoweemail;

    private String paypassword;

    private String tel;

    private LocalDateTime svipendtime;

    private LocalDateTime vipopentime;

    private Boolean updatepwd;

    private Integer accountlevel;

    private Integer cashtype;

    private String telhome;

    /**
     * 是否是代理实名认证酒吧
     */
    private Boolean agentauth;

    /**
     * 是否是特约代理已经处理
     */
    private Boolean agentdeal;

    /**
     * 用户id
     */
    private String uid;

    /**
     * 是否同意用户协议
     */
    @TableField("isAgreement")
    private Boolean agreement;

    /**
     * 公司名称
     */
    @TableField("companyName")
    private String companyName;

    /**
     * 联系人
     */
    private String contacter;

    /**
     * 版本号
     */
    private String version;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getRancode() {
        return rancode;
    }

    public void setRancode(String rancode) {
        this.rancode = rancode;
    }

    public Boolean getUseful() {
        return useful;
    }

    public void setUseful(Boolean useful) {
        this.useful = useful;
    }

    public LocalDateTime getExpires() {
        return expires;
    }

    public void setExpires(LocalDateTime expires) {
        this.expires = expires;
    }

    public BigDecimal getAlipaymoney() {
        return alipaymoney;
    }

    public void setAlipaymoney(BigDecimal alipaymoney) {
        this.alipaymoney = alipaymoney;
    }

    public BigDecimal getLabourmoney() {
        return labourmoney;
    }

    public void setLabourmoney(BigDecimal labourmoney) {
        this.labourmoney = labourmoney;
    }

    public LocalDateTime getVipendtime() {
        return vipendtime;
    }

    public void setVipendtime(LocalDateTime vipendtime) {
        this.vipendtime = vipendtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getProveImgid() {
        return proveImgid;
    }

    public void setProveImgid(String proveImgid) {
        this.proveImgid = proveImgid;
    }

    public Boolean getStatic() {
        return static;
    }

    public void setStatic(Boolean static) {
        this.static = static;
    }

    public Boolean getRempwd() {
        return rempwd;
    }

    public void setRempwd(Boolean rempwd) {
        this.rempwd = rempwd;
    }

    public String getCodeid() {
        return codeid;
    }

    public void setCodeid(String codeid) {
        this.codeid = codeid;
    }

    public Boolean getSendemail() {
        return sendemail;
    }

    public void setSendemail(Boolean sendemail) {
        this.sendemail = sendemail;
    }

    public Boolean getSendtoweemail() {
        return sendtoweemail;
    }

    public void setSendtoweemail(Boolean sendtoweemail) {
        this.sendtoweemail = sendtoweemail;
    }

    public String getPaypassword() {
        return paypassword;
    }

    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public LocalDateTime getSvipendtime() {
        return svipendtime;
    }

    public void setSvipendtime(LocalDateTime svipendtime) {
        this.svipendtime = svipendtime;
    }

    public LocalDateTime getVipopentime() {
        return vipopentime;
    }

    public void setVipopentime(LocalDateTime vipopentime) {
        this.vipopentime = vipopentime;
    }

    public Boolean getUpdatepwd() {
        return updatepwd;
    }

    public void setUpdatepwd(Boolean updatepwd) {
        this.updatepwd = updatepwd;
    }

    public Integer getAccountlevel() {
        return accountlevel;
    }

    public void setAccountlevel(Integer accountlevel) {
        this.accountlevel = accountlevel;
    }

    public Integer getCashtype() {
        return cashtype;
    }

    public void setCashtype(Integer cashtype) {
        this.cashtype = cashtype;
    }

    public String getTelhome() {
        return telhome;
    }

    public void setTelhome(String telhome) {
        this.telhome = telhome;
    }

    public Boolean getAgentauth() {
        return agentauth;
    }

    public void setAgentauth(Boolean agentauth) {
        this.agentauth = agentauth;
    }

    public Boolean getAgentdeal() {
        return agentdeal;
    }

    public void setAgentdeal(Boolean agentdeal) {
        this.agentdeal = agentdeal;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Boolean getAgreement() {
        return agreement;
    }

    public void setAgreement(Boolean agreement) {
        this.agreement = agreement;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContacter() {
        return contacter;
    }

    public void setContacter(String contacter) {
        this.contacter = contacter;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Admin{" +
        "id=" + id +
        ", username=" + username +
        ", password=" + password +
        ", barid=" + barid +
        ", role=" + role +
        ", time=" + time +
        ", rancode=" + rancode +
        ", useful=" + useful +
        ", expires=" + expires +
        ", alipaymoney=" + alipaymoney +
        ", labourmoney=" + labourmoney +
        ", vipendtime=" + vipendtime +
        ", remark=" + remark +
        ", proveImgid=" + proveImgid +
        ", static=" + static +
        ", rempwd=" + rempwd +
        ", codeid=" + codeid +
        ", sendemail=" + sendemail +
        ", sendtoweemail=" + sendtoweemail +
        ", paypassword=" + paypassword +
        ", tel=" + tel +
        ", svipendtime=" + svipendtime +
        ", vipopentime=" + vipopentime +
        ", updatepwd=" + updatepwd +
        ", accountlevel=" + accountlevel +
        ", cashtype=" + cashtype +
        ", telhome=" + telhome +
        ", agentauth=" + agentauth +
        ", agentdeal=" + agentdeal +
        ", uid=" + uid +
        ", agreement=" + agreement +
        ", companyName=" + companyName +
        ", contacter=" + contacter +
        ", version=" + version +
        "}";
    }
}
