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
public class Chatrecorduser extends Model<Chatrecorduser> {

    private static final long serialVersionUID = 1L;

    private String recordid;

    private String userid;


    public String getRecordid() {
        return recordid;
    }

    public void setRecordid(String recordid) {
        this.recordid = recordid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    protected Serializable pkVal() {
        return this.recordid;
    }

    @Override
    public String toString() {
        return "Chatrecorduser{" +
        "recordid=" + recordid +
        ", userid=" + userid +
        "}";
    }
}
