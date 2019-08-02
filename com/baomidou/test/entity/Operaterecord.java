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
public class Operaterecord extends Model<Operaterecord> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 用户id
     */
    private String userid;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 操作后内容
     */
    private String newcontent;

    /**
     * 操作前内容
     */
    private String oldcontent;

    /**
     * 修改时间
     */
    private LocalDateTime time;

    /**
     * 操作类型：1、修改酒吧名称
     */
    private Integer type;

    /**
     * 操作人
     */
    private String operater;

    private String remark;


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

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getNewcontent() {
        return newcontent;
    }

    public void setNewcontent(String newcontent) {
        this.newcontent = newcontent;
    }

    public String getOldcontent() {
        return oldcontent;
    }

    public void setOldcontent(String oldcontent) {
        this.oldcontent = oldcontent;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Operaterecord{" +
        "id=" + id +
        ", userid=" + userid +
        ", barid=" + barid +
        ", newcontent=" + newcontent +
        ", oldcontent=" + oldcontent +
        ", time=" + time +
        ", type=" + type +
        ", operater=" + operater +
        ", remark=" + remark +
        "}";
    }
}
