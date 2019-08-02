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
public class WaiterAllot extends Model<WaiterAllot> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
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
     * 服务员id
     */
    private String waiterid;

    /**
     * 添加时间
     */
    private LocalDateTime creettime;

    /**
     * 过期时间
     */
    private LocalDateTime overtime;


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

    public String getWaiterid() {
        return waiterid;
    }

    public void setWaiterid(String waiterid) {
        this.waiterid = waiterid;
    }

    public LocalDateTime getCreettime() {
        return creettime;
    }

    public void setCreettime(LocalDateTime creettime) {
        this.creettime = creettime;
    }

    public LocalDateTime getOvertime() {
        return overtime;
    }

    public void setOvertime(LocalDateTime overtime) {
        this.overtime = overtime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "WaiterAllot{" +
        "id=" + id +
        ", userid=" + userid +
        ", barid=" + barid +
        ", waiterid=" + waiterid +
        ", creettime=" + creettime +
        ", overtime=" + overtime +
        "}";
    }
}
