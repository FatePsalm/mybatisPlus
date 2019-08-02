package com.baomidou.test.entity;

import java.math.BigDecimal;
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
public class WaiterAncestorRatio extends Model<WaiterAncestorRatio> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String waiterId;

    private BigDecimal oldRatio;

    private LocalDateTime time;

    /**
     * 新老分成
     */
    private Integer type;

    /**
     * 酒吧id
     */
    private String barId;

    /**
     * 用户id
     */
    private String userId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWaiterId() {
        return waiterId;
    }

    public void setWaiterId(String waiterId) {
        this.waiterId = waiterId;
    }

    public BigDecimal getOldRatio() {
        return oldRatio;
    }

    public void setOldRatio(BigDecimal oldRatio) {
        this.oldRatio = oldRatio;
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

    public String getBarId() {
        return barId;
    }

    public void setBarId(String barId) {
        this.barId = barId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "WaiterAncestorRatio{" +
        "id=" + id +
        ", waiterId=" + waiterId +
        ", oldRatio=" + oldRatio +
        ", time=" + time +
        ", type=" + type +
        ", barId=" + barId +
        ", userId=" + userId +
        "}";
    }
}
