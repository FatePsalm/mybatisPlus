package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class TSignupdatewine extends Model<TSignupdatewine> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String datewineid;

    private String userid;

    private LocalDateTime createtime;

    private String tel;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDatewineid() {
        return datewineid;
    }

    public void setDatewineid(String datewineid) {
        this.datewineid = datewineid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TSignupdatewine{" +
        "id=" + id +
        ", datewineid=" + datewineid +
        ", userid=" + userid +
        ", createtime=" + createtime +
        ", tel=" + tel +
        "}";
    }
}
