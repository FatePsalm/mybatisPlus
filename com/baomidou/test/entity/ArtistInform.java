package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 发布新通告
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class ArtistInform extends Model<ArtistInform> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private String id;

    /**
     * UserId
     */
    private String userId;

    /**
     * 创建时间
     */
    private LocalDateTime creationTime;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 职位
     */
    private String position;

    /**
     * 结算方式
     */
    private String settlement;

    /**
     * 薪酬最小值
     */
    private BigDecimal salaryMin;

    /**
     * 薪酬最大值
     */
    private BigDecimal salaryMax;

    /**
     * 应聘地点
     */
    private String city;

    /**
     * 职位描述
     */
    private String note;

    /**
     * 招聘人数
     */
    private Integer peopleNumber;

    /**
     * 招聘性别
     */
    private Boolean sex;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }

    public BigDecimal getSalaryMin() {
        return salaryMin;
    }

    public void setSalaryMin(BigDecimal salaryMin) {
        this.salaryMin = salaryMin;
    }

    public BigDecimal getSalaryMax() {
        return salaryMax;
    }

    public void setSalaryMax(BigDecimal salaryMax) {
        this.salaryMax = salaryMax;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(Integer peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ArtistInform{" +
        "id=" + id +
        ", userId=" + userId +
        ", creationTime=" + creationTime +
        ", state=" + state +
        ", position=" + position +
        ", settlement=" + settlement +
        ", salaryMin=" + salaryMin +
        ", salaryMax=" + salaryMax +
        ", city=" + city +
        ", note=" + note +
        ", peopleNumber=" + peopleNumber +
        ", sex=" + sex +
        "}";
    }
}
