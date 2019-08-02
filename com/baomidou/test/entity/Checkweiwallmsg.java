package com.baomidou.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Checkweiwallmsg extends Model<Checkweiwallmsg> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String barid;

    private String userid;

    private LocalDateTime time;

    private String type;

    private String message;

    private String imgurl;

    private Integer pasecond;

    @TableField("showNum")
    private Integer showNum;

    @TableField("videoUrl")
    private String videoUrl;

    private String forusername;

    private String formsg;

    private Integer theme;

    private String obj;

    /**
     * 是否审核
     */
    private Boolean check;

    /**
     * 是否代付
     */
    @TableField("needWhoPay")
    private Integer needWhoPay;

    /**
     * 坐席号码
     */
    private String seatNumber;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    public Integer getShowNum() {
        return showNum;
    }

    public void setShowNum(Integer showNum) {
        this.showNum = showNum;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
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

    public Integer getTheme() {
        return theme;
    }

    public void setTheme(Integer theme) {
        this.theme = theme;
    }

    public String getObj() {
        return obj;
    }

    public void setObj(String obj) {
        this.obj = obj;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Checkweiwallmsg{" +
        "id=" + id +
        ", barid=" + barid +
        ", userid=" + userid +
        ", time=" + time +
        ", type=" + type +
        ", message=" + message +
        ", imgurl=" + imgurl +
        ", pasecond=" + pasecond +
        ", showNum=" + showNum +
        ", videoUrl=" + videoUrl +
        ", forusername=" + forusername +
        ", formsg=" + formsg +
        ", theme=" + theme +
        ", obj=" + obj +
        ", check=" + check +
        ", needWhoPay=" + needWhoPay +
        ", seatNumber=" + seatNumber +
        "}";
    }
}
