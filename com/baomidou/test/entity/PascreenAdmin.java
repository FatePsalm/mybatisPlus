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
public class PascreenAdmin extends Model<PascreenAdmin> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String barid;

    private LocalDateTime time;

    private LocalDateTime paytime;

    private Integer paystate;

    private Integer pasecond;

    private BigDecimal price;

    private Integer paytype;

    private Boolean wemew;

    private String payid;

    private String transactionid;

    private String attach;

    private String msg;

    /**
     * 霸屏图片地址
     */
    private String picurl;

    private String sitnum;

    private Integer type;

    private String staticfileid;

    private String obj;

    private Integer examine;

    private LocalDateTime operationtime;

    private Integer source;

    private BigDecimal mymoney;

    /**
     * 霸屏次数
     */
    private Integer shownum;

    /**
     * 几连霸屏
     */
    @TableField("maxLoop")
    private Integer maxLoop;

    /**
     * 打赏文字消息
     */
    private String dsmsg;

    /**
     * 视频地址
     */
    private String videourl;

    /**
     * 使用红包支付金额
     */
    private BigDecimal redbag;

    /**
     * 霸屏选择主题
     */
    private Integer theme;

    /**
     * 现金余额
     */
    private BigDecimal cashbag;

    /**
     * 坐席号码
     */
    private String seatNumber;


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

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public LocalDateTime getPaytime() {
        return paytime;
    }

    public void setPaytime(LocalDateTime paytime) {
        this.paytime = paytime;
    }

    public Integer getPaystate() {
        return paystate;
    }

    public void setPaystate(Integer paystate) {
        this.paystate = paystate;
    }

    public Integer getPasecond() {
        return pasecond;
    }

    public void setPasecond(Integer pasecond) {
        this.pasecond = pasecond;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Boolean getWemew() {
        return wemew;
    }

    public void setWemew(Boolean wemew) {
        this.wemew = wemew;
    }

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String getSitnum() {
        return sitnum;
    }

    public void setSitnum(String sitnum) {
        this.sitnum = sitnum;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getStaticfileid() {
        return staticfileid;
    }

    public void setStaticfileid(String staticfileid) {
        this.staticfileid = staticfileid;
    }

    public String getObj() {
        return obj;
    }

    public void setObj(String obj) {
        this.obj = obj;
    }

    public Integer getExamine() {
        return examine;
    }

    public void setExamine(Integer examine) {
        this.examine = examine;
    }

    public LocalDateTime getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(LocalDateTime operationtime) {
        this.operationtime = operationtime;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public BigDecimal getMymoney() {
        return mymoney;
    }

    public void setMymoney(BigDecimal mymoney) {
        this.mymoney = mymoney;
    }

    public Integer getShownum() {
        return shownum;
    }

    public void setShownum(Integer shownum) {
        this.shownum = shownum;
    }

    public Integer getMaxLoop() {
        return maxLoop;
    }

    public void setMaxLoop(Integer maxLoop) {
        this.maxLoop = maxLoop;
    }

    public String getDsmsg() {
        return dsmsg;
    }

    public void setDsmsg(String dsmsg) {
        this.dsmsg = dsmsg;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    public BigDecimal getRedbag() {
        return redbag;
    }

    public void setRedbag(BigDecimal redbag) {
        this.redbag = redbag;
    }

    public Integer getTheme() {
        return theme;
    }

    public void setTheme(Integer theme) {
        this.theme = theme;
    }

    public BigDecimal getCashbag() {
        return cashbag;
    }

    public void setCashbag(BigDecimal cashbag) {
        this.cashbag = cashbag;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "PascreenAdmin{" +
        "id=" + id +
        ", userid=" + userid +
        ", barid=" + barid +
        ", time=" + time +
        ", paytime=" + paytime +
        ", paystate=" + paystate +
        ", pasecond=" + pasecond +
        ", price=" + price +
        ", paytype=" + paytype +
        ", wemew=" + wemew +
        ", payid=" + payid +
        ", transactionid=" + transactionid +
        ", attach=" + attach +
        ", msg=" + msg +
        ", picurl=" + picurl +
        ", sitnum=" + sitnum +
        ", type=" + type +
        ", staticfileid=" + staticfileid +
        ", obj=" + obj +
        ", examine=" + examine +
        ", operationtime=" + operationtime +
        ", source=" + source +
        ", mymoney=" + mymoney +
        ", shownum=" + shownum +
        ", maxLoop=" + maxLoop +
        ", dsmsg=" + dsmsg +
        ", videourl=" + videourl +
        ", redbag=" + redbag +
        ", theme=" + theme +
        ", cashbag=" + cashbag +
        ", seatNumber=" + seatNumber +
        "}";
    }
}
