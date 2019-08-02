package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 酒吧申请开通免费游戏记录表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class ApplyOpenGame extends Model<ApplyOpenGame> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 大屏开启时间
     */
    private Integer openScreenTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 审核是否通过
     */
    private Integer isPass;


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

    public Integer getOpenScreenTime() {
        return openScreenTime;
    }

    public void setOpenScreenTime(Integer openScreenTime) {
        this.openScreenTime = openScreenTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getIsPass() {
        return isPass;
    }

    public void setIsPass(Integer isPass) {
        this.isPass = isPass;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ApplyOpenGame{" +
        "id=" + id +
        ", barid=" + barid +
        ", openScreenTime=" + openScreenTime +
        ", createTime=" + createTime +
        ", isPass=" + isPass +
        "}";
    }
}
