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
public class Shakegame extends Model<Shakegame> {

    private static final long serialVersionUID = 1L;

    private String id;

    @TableField("barId")
    private String barId;

    @TableField("gameRule")
    private String gameRule;

    private Boolean state;

    @TableField("addTime")
    private LocalDateTime addTime;

    @TableField("beginTime")
    private LocalDateTime beginTime;


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

    public String getGameRule() {
        return gameRule;
    }

    public void setGameRule(String gameRule) {
        this.gameRule = gameRule;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public LocalDateTime getAddTime() {
        return addTime;
    }

    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Shakegame{" +
        "id=" + id +
        ", barId=" + barId +
        ", gameRule=" + gameRule +
        ", state=" + state +
        ", addTime=" + addTime +
        ", beginTime=" + beginTime +
        "}";
    }
}
