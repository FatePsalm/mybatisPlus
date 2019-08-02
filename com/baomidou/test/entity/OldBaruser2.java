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
public class OldBaruser2 extends Model<OldBaruser2> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String userid;

    private LocalDateTime time;

    private Boolean rich;

    private LocalDateTime nearseated;

    private Boolean firstinnear;

    private Boolean black;

    @TableField("isScene")
    private Boolean scene;

    private Boolean innear;

    @TableField("sendTime")
    private LocalDateTime sendTime;

    /**
     * 拉黑到期时间
     */
    private LocalDateTime outblacktime;

    private String remark;

    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 是否清除钻石到店榜足迹
     */
    private Integer footPrint;


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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Boolean getRich() {
        return rich;
    }

    public void setRich(Boolean rich) {
        this.rich = rich;
    }

    public LocalDateTime getNearseated() {
        return nearseated;
    }

    public void setNearseated(LocalDateTime nearseated) {
        this.nearseated = nearseated;
    }

    public Boolean getFirstinnear() {
        return firstinnear;
    }

    public void setFirstinnear(Boolean firstinnear) {
        this.firstinnear = firstinnear;
    }

    public Boolean getBlack() {
        return black;
    }

    public void setBlack(Boolean black) {
        this.black = black;
    }

    public Boolean getScene() {
        return scene;
    }

    public void setScene(Boolean scene) {
        this.scene = scene;
    }

    public Boolean getInnear() {
        return innear;
    }

    public void setInnear(Boolean innear) {
        this.innear = innear;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }

    public LocalDateTime getOutblacktime() {
        return outblacktime;
    }

    public void setOutblacktime(LocalDateTime outblacktime) {
        this.outblacktime = outblacktime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getFootPrint() {
        return footPrint;
    }

    public void setFootPrint(Integer footPrint) {
        this.footPrint = footPrint;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "OldBaruser2{" +
        "id=" + id +
        ", barid=" + barid +
        ", userid=" + userid +
        ", time=" + time +
        ", rich=" + rich +
        ", nearseated=" + nearseated +
        ", firstinnear=" + firstinnear +
        ", black=" + black +
        ", scene=" + scene +
        ", innear=" + innear +
        ", sendTime=" + sendTime +
        ", outblacktime=" + outblacktime +
        ", remark=" + remark +
        ", createTime=" + createTime +
        ", footPrint=" + footPrint +
        "}";
    }
}
