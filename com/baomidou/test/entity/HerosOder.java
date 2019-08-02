package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 海选支付列表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class HerosOder extends Model<HerosOder> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private String id;

    /**
     * 发送者UserID
     */
    private String sendUserId;

    /**
     * 接收者UserID
     */
    private String acceptUserId;

    /**
     * 礼品ID
     */
    private String goodsId;

    /**
     * 礼物数量
     */
    private Integer goodsNum;

    /**
     * 类型 1-礼物送票
     */
    private Integer type;

    /**
     * 支付订单
     */
    private String payid;

    /**
     * 支付识别码
     */
    private String attach;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 投票类型
     */
    private Integer ticketType;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId;
    }

    public String getAcceptUserId() {
        return acceptUserId;
    }

    public void setAcceptUserId(String acceptUserId) {
        this.acceptUserId = acceptUserId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getTicketType() {
        return ticketType;
    }

    public void setTicketType(Integer ticketType) {
        this.ticketType = ticketType;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "HerosOder{" +
        "id=" + id +
        ", sendUserId=" + sendUserId +
        ", acceptUserId=" + acceptUserId +
        ", goodsId=" + goodsId +
        ", goodsNum=" + goodsNum +
        ", type=" + type +
        ", payid=" + payid +
        ", attach=" + attach +
        ", createTime=" + createTime +
        ", ticketType=" + ticketType +
        "}";
    }
}
