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
public class GraduationActivity extends Model<GraduationActivity> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private String id;

    /**
     * 用户id
     */
    @TableField("userId")
    private String userId;

    /**
     * 奖获等级，1表示一等奖，2表示二等奖
     */
    private Integer type;

    private LocalDateTime time;

    /**
     * 获奖码
     */
    private String code;

    /**
     * 酒吧id
     */
    @TableField("barId")
    private String barId;

    /**
     * 中奖的序列
     */
    @TableField("indexSort")
    private Integer indexSort;

    /**
     * 送积分活动的id
     */
    @TableField("activeId")
    private String activeId;

    private String realname;

    private String tel;

    @TableField("hasShare")
    private Boolean hasShare;

    /**
     * 备注
     */
    private String remark;

    private LocalDateTime startdate;

    private LocalDateTime overdate;

    /**
     * 礼物名称
     */
    @TableField("prizeName")
    private String prizeName;


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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBarId() {
        return barId;
    }

    public void setBarId(String barId) {
        this.barId = barId;
    }

    public Integer getIndexSort() {
        return indexSort;
    }

    public void setIndexSort(Integer indexSort) {
        this.indexSort = indexSort;
    }

    public String getActiveId() {
        return activeId;
    }

    public void setActiveId(String activeId) {
        this.activeId = activeId;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Boolean getHasShare() {
        return hasShare;
    }

    public void setHasShare(Boolean hasShare) {
        this.hasShare = hasShare;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDateTime startdate) {
        this.startdate = startdate;
    }

    public LocalDateTime getOverdate() {
        return overdate;
    }

    public void setOverdate(LocalDateTime overdate) {
        this.overdate = overdate;
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "GraduationActivity{" +
        "id=" + id +
        ", userId=" + userId +
        ", type=" + type +
        ", time=" + time +
        ", code=" + code +
        ", barId=" + barId +
        ", indexSort=" + indexSort +
        ", activeId=" + activeId +
        ", realname=" + realname +
        ", tel=" + tel +
        ", hasShare=" + hasShare +
        ", remark=" + remark +
        ", startdate=" + startdate +
        ", overdate=" + overdate +
        ", prizeName=" + prizeName +
        "}";
    }
}
