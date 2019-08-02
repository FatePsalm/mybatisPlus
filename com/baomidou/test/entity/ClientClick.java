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
public class ClientClick extends Model<ClientClick> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    /**
     * 屏幕数量
     */
    private Integer type;

    /**
     * 地址栏输入内容
     */
    private String operation;

    /**
     * 客户端点击更新时间
     */
    private LocalDateTime clickTime;


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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public LocalDateTime getClickTime() {
        return clickTime;
    }

    public void setClickTime(LocalDateTime clickTime) {
        this.clickTime = clickTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ClientClick{" +
        "id=" + id +
        ", barid=" + barid +
        ", type=" + type +
        ", operation=" + operation +
        ", clickTime=" + clickTime +
        "}";
    }
}
