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
public class Chatusers extends Model<Chatusers> {

    private static final long serialVersionUID = 1L;

    private String chatid;

    private String userid;

    private Integer outline;

    private Boolean pullblack;


    public String getChatid() {
        return chatid;
    }

    public void setChatid(String chatid) {
        this.chatid = chatid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getOutline() {
        return outline;
    }

    public void setOutline(Integer outline) {
        this.outline = outline;
    }

    public Boolean getPullblack() {
        return pullblack;
    }

    public void setPullblack(Boolean pullblack) {
        this.pullblack = pullblack;
    }

    @Override
    protected Serializable pkVal() {
        return this.chatid;
    }

    @Override
    public String toString() {
        return "Chatusers{" +
        "chatid=" + chatid +
        ", userid=" + userid +
        ", outline=" + outline +
        ", pullblack=" + pullblack +
        "}";
    }
}
