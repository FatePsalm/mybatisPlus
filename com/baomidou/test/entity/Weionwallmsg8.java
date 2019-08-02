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
public class Weionwallmsg8 extends Model<Weionwallmsg8> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String weionwallid;

    private String message;

    private LocalDateTime time;

    private Boolean del;

    private String type;

    private String imgurl;

    private Integer pasecond;

    private String forusername;

    private String formsg;

    /**
     * 霸屏次数
     */
    private Integer shownum;

    /**
     * 视频地址
     */
    private String videourl;

    /**
     * 霸屏主题
     */
    private Integer theme;

    /**
     * 霸屏主键id
     */
    private String pid;

    /**
     * 是否代付
     */
    @TableField("needWhoPay")
    private Integer needWhoPay;

    /**
     * 坐席号码
     */
    private String seatNumber;

    /**
     * 点赞数量
     */
    @TableField("likeNums")
    private Integer likeNums;


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

    public String getWeionwallid() {
        return weionwallid;
    }

    public void setWeionwallid(String weionwallid) {
        this.weionwallid = weionwallid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Integer getPasecond() {
        return pasecond;
    }

    public void setPasecond(Integer pasecond) {
        this.pasecond = pasecond;
    }

    public String getForusername() {
        return forusername;
    }

    public void setForusername(String forusername) {
        this.forusername = forusername;
    }

    public String getFormsg() {
        return formsg;
    }

    public void setFormsg(String formsg) {
        this.formsg = formsg;
    }

    public Integer getShownum() {
        return shownum;
    }

    public void setShownum(Integer shownum) {
        this.shownum = shownum;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    public Integer getTheme() {
        return theme;
    }

    public void setTheme(Integer theme) {
        this.theme = theme;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Integer getNeedWhoPay() {
        return needWhoPay;
    }

    public void setNeedWhoPay(Integer needWhoPay) {
        this.needWhoPay = needWhoPay;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Integer getLikeNums() {
        return likeNums;
    }

    public void setLikeNums(Integer likeNums) {
        this.likeNums = likeNums;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Weionwallmsg8{" +
        "id=" + id +
        ", userid=" + userid +
        ", weionwallid=" + weionwallid +
        ", message=" + message +
        ", time=" + time +
        ", del=" + del +
        ", type=" + type +
        ", imgurl=" + imgurl +
        ", pasecond=" + pasecond +
        ", forusername=" + forusername +
        ", formsg=" + formsg +
        ", shownum=" + shownum +
        ", videourl=" + videourl +
        ", theme=" + theme +
        ", pid=" + pid +
        ", needWhoPay=" + needWhoPay +
        ", seatNumber=" + seatNumber +
        ", likeNums=" + likeNums +
        "}";
    }
}
