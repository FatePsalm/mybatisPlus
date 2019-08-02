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
public class Barborder2 extends Model<Barborder2> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private String barid;

    private LocalDateTime time;

    @TableField("isScene")
    private Boolean scene;

    @TableField("sendTime")
    private LocalDateTime sendTime;

    private Boolean black;


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

    public Boolean getScene() {
        return scene;
    }

    public void setScene(Boolean scene) {
        this.scene = scene;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }

    public Boolean getBlack() {
        return black;
    }

    public void setBlack(Boolean black) {
        this.black = black;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Barborder2{" +
        "id=" + id +
        ", userid=" + userid +
        ", barid=" + barid +
        ", time=" + time +
        ", scene=" + scene +
        ", sendTime=" + sendTime +
        ", black=" + black +
        "}";
    }
}
