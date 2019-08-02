package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 群聊和用户关系表
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class GroupUserid extends Model<GroupUserid> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * 群聊id
     */
    private String grouptalkid;

    /**
     * 用户id
     */
    private String userid;

    /**
     * 加入群聊时间
     */
    private LocalDateTime creationtime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrouptalkid() {
        return grouptalkid;
    }

    public void setGrouptalkid(String grouptalkid) {
        this.grouptalkid = grouptalkid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public LocalDateTime getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(LocalDateTime creationtime) {
        this.creationtime = creationtime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "GroupUserid{" +
        "id=" + id +
        ", grouptalkid=" + grouptalkid +
        ", userid=" + userid +
        ", creationtime=" + creationtime +
        "}";
    }
}
