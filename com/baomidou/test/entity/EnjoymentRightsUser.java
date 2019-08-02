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
public class EnjoymentRightsUser extends Model<EnjoymentRightsUser> {

    private static final long serialVersionUID = 1L;

    private String id;

    @TableField("barId")
    private String barId;

    @TableField("userId")
    private String userId;

    /**
     * 订单ID(bar_enjoyment_order)
     */
    @TableField("orderId")
    private String orderId;

    /**
     * 权益名称
     */
    private String name;

    /**
     * 权益图片
     */
    private String img;

    /**
     * 权益详情
     */
    private String content;

    /**
     * 权益生效时间（时效型权益使用）
     */
    private LocalDateTime start;

    /**
     * 权益失效时间（时效型权益使用）
     */
    private LocalDateTime end;

    /**
     * 权益类型
     */
    private Integer type;

    /**
     * 数量（允许兑换多少个）
     */
    private Integer num;

    /**
     * 已经兑换的数量
     */
    @TableField("usedNum")
    private Integer usedNum;

    /**
     * 频次天数（多少天一次）
     */
    private Integer days;

    /**
     * 状态（0未使用，1已使用）
     */
    private Integer state;

    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 管理员送达时间
     */
    @TableField("sendTime")
    private LocalDateTime sendTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getUsedNum() {
        return usedNum;
    }

    public void setUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "EnjoymentRightsUser{" +
        "id=" + id +
        ", barId=" + barId +
        ", userId=" + userId +
        ", orderId=" + orderId +
        ", name=" + name +
        ", img=" + img +
        ", content=" + content +
        ", start=" + start +
        ", end=" + end +
        ", type=" + type +
        ", num=" + num +
        ", usedNum=" + usedNum +
        ", days=" + days +
        ", state=" + state +
        ", createTime=" + createTime +
        ", sendTime=" + sendTime +
        "}";
    }
}
