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
public class Accountrecord extends Model<Accountrecord> {

    private static final long serialVersionUID = 1L;

    private String id;

    private BigDecimal money;

    private Integer consumetype;

    private String operator;

    private String consumer;

    private LocalDateTime consumetime;

    private Integer whereabouts;

    private String barid;

    private String objid;

    private Boolean agent;

    private String consumebarid;

    /**
     * 是否是集团的记录
     */
    @TableField("isGroup")
    private Boolean group;

    /**
     * 如果为酒吧、代理、集团收入明细，则该字段值为barid+objid，如果为操作者收入明细，则该字段值为userid+objid
     */
    private String objectid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getConsumetype() {
        return consumetype;
    }

    public void setConsumetype(Integer consumetype) {
        this.consumetype = consumetype;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public LocalDateTime getConsumetime() {
        return consumetime;
    }

    public void setConsumetime(LocalDateTime consumetime) {
        this.consumetime = consumetime;
    }

    public Integer getWhereabouts() {
        return whereabouts;
    }

    public void setWhereabouts(Integer whereabouts) {
        this.whereabouts = whereabouts;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getObjid() {
        return objid;
    }

    public void setObjid(String objid) {
        this.objid = objid;
    }

    public Boolean getAgent() {
        return agent;
    }

    public void setAgent(Boolean agent) {
        this.agent = agent;
    }

    public String getConsumebarid() {
        return consumebarid;
    }

    public void setConsumebarid(String consumebarid) {
        this.consumebarid = consumebarid;
    }

    public Boolean getGroup() {
        return group;
    }

    public void setGroup(Boolean group) {
        this.group = group;
    }

    public String getObjectid() {
        return objectid;
    }

    public void setObjectid(String objectid) {
        this.objectid = objectid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Accountrecord{" +
        "id=" + id +
        ", money=" + money +
        ", consumetype=" + consumetype +
        ", operator=" + operator +
        ", consumer=" + consumer +
        ", consumetime=" + consumetime +
        ", whereabouts=" + whereabouts +
        ", barid=" + barid +
        ", objid=" + objid +
        ", agent=" + agent +
        ", consumebarid=" + consumebarid +
        ", group=" + group +
        ", objectid=" + objectid +
        "}";
    }
}
