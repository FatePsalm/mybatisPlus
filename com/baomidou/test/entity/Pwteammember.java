package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class Pwteammember extends Model<Pwteammember> {

    private static final long serialVersionUID = 1L;

    /**
     * 战队队员主键
     */
    private String userid;

    /**
     * 队员头像
     */
    private String head;

    /**
     * 队员昵称
     */
    private String name;

    /**
     * 战队主键(外键)
     */
    private String teamId;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    @Override
    protected Serializable pkVal() {
        return this.userid;
    }

    @Override
    public String toString() {
        return "Pwteammember{" +
        "userid=" + userid +
        ", head=" + head +
        ", name=" + name +
        ", teamId=" + teamId +
        "}";
    }
}
