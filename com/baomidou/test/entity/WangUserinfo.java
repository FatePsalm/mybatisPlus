package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 旺小宝用户信息
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class WangUserinfo extends Model<WangUserinfo> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 平台id
     */
    private String userid;

    /**
     * 用户上传图片6张以内已","隔开
     */
    private String head;

    /**
     * 签名
     */
    private String admireta;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 用户标签
     */
    private String userlabel;

    /**
     * 最后一次登录酒吧ID
     */
    private String lastBarid;

    /**
     * 座位号
     */
    private String lastSitnum;

    /**
     * 最后登录时间
     */
    private LocalDateTime lastTime;

    /**
     * 用户当前状态
     */
    private Integer state;


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

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getAdmireta() {
        return admireta;
    }

    public void setAdmireta(String admireta) {
        this.admireta = admireta;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUserlabel() {
        return userlabel;
    }

    public void setUserlabel(String userlabel) {
        this.userlabel = userlabel;
    }

    public String getLastBarid() {
        return lastBarid;
    }

    public void setLastBarid(String lastBarid) {
        this.lastBarid = lastBarid;
    }

    public String getLastSitnum() {
        return lastSitnum;
    }

    public void setLastSitnum(String lastSitnum) {
        this.lastSitnum = lastSitnum;
    }

    public LocalDateTime getLastTime() {
        return lastTime;
    }

    public void setLastTime(LocalDateTime lastTime) {
        this.lastTime = lastTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "WangUserinfo{" +
        "id=" + id +
        ", userid=" + userid +
        ", head=" + head +
        ", admireta=" + admireta +
        ", nickname=" + nickname +
        ", userlabel=" + userlabel +
        ", lastBarid=" + lastBarid +
        ", lastSitnum=" + lastSitnum +
        ", lastTime=" + lastTime +
        ", state=" + state +
        "}";
    }
}
