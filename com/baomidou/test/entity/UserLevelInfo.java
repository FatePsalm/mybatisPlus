package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 用户等级信息表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class UserLevelInfo extends Model<UserLevelInfo> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 系统等级
     */
    private Integer level;

    /**
     * 购买的等级
     */
    private Integer paylevel;

    /**
     * 升级时间
     */
    private LocalDateTime time;

    /**
     * 消费分数
     */
    private Integer userscope;

    /**
     * 购买等级到期时间
     */
    private LocalDateTime expirepay;

    private String userid;

    /**
     * 风格
     */
    private String theme;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getPaylevel() {
        return paylevel;
    }

    public void setPaylevel(Integer paylevel) {
        this.paylevel = paylevel;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getUserscope() {
        return userscope;
    }

    public void setUserscope(Integer userscope) {
        this.userscope = userscope;
    }

    public LocalDateTime getExpirepay() {
        return expirepay;
    }

    public void setExpirepay(LocalDateTime expirepay) {
        this.expirepay = expirepay;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserLevelInfo{" +
        "id=" + id +
        ", level=" + level +
        ", paylevel=" + paylevel +
        ", time=" + time +
        ", userscope=" + userscope +
        ", expirepay=" + expirepay +
        ", userid=" + userid +
        ", theme=" + theme +
        "}";
    }
}
