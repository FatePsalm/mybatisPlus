package com.baomidou.test.entity;

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
public class Userinfo extends Model<Userinfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private String userid;

    /**
     * 用户真实姓名
     */
    private String realName;

    /**
     * 用户身份证号
     */
    private String idNumber;

    /**
     * 学历
     */
    private String education;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 证件类型：0、身份证；2、港澳通行证；3、台胞证；
     */
    private Integer type;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 国籍：1:大陆、2:香港、3:澳门、4:台湾；
     */
    private Integer nationality;

    /**
     * 是否残疾烈属孤老
     */
    private Boolean deformity;

    /**
     * 证件照正面
     */
    private String identificationFront;

    /**
     * 证件照背面
     */
    private String identificationBack;

    /**
     * 审核状态：0、待审核；1、已审核；2、审核失败；
     */
    private Integer state;

    /**
     * 是否容易操作者协议(只针对操作者有用)
     */
    private Boolean agreementOperator;

    /**
     * 如果为港澳通行证和台胞证，该时间为来华时间
     */
    private LocalDate time;

    /**
     * 缘由：审核不通过的原因
     */
    private String reason;


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getNationality() {
        return nationality;
    }

    public void setNationality(Integer nationality) {
        this.nationality = nationality;
    }

    public Boolean getDeformity() {
        return deformity;
    }

    public void setDeformity(Boolean deformity) {
        this.deformity = deformity;
    }

    public String getIdentificationFront() {
        return identificationFront;
    }

    public void setIdentificationFront(String identificationFront) {
        this.identificationFront = identificationFront;
    }

    public String getIdentificationBack() {
        return identificationBack;
    }

    public void setIdentificationBack(String identificationBack) {
        this.identificationBack = identificationBack;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Boolean getAgreementOperator() {
        return agreementOperator;
    }

    public void setAgreementOperator(Boolean agreementOperator) {
        this.agreementOperator = agreementOperator;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    protected Serializable pkVal() {
        return this.userid;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
        "userid=" + userid +
        ", realName=" + realName +
        ", idNumber=" + idNumber +
        ", education=" + education +
        ", phone=" + phone +
        ", type=" + type +
        ", createTime=" + createTime +
        ", nationality=" + nationality +
        ", deformity=" + deformity +
        ", identificationFront=" + identificationFront +
        ", identificationBack=" + identificationBack +
        ", state=" + state +
        ", agreementOperator=" + agreementOperator +
        ", time=" + time +
        ", reason=" + reason +
        "}";
    }
}
