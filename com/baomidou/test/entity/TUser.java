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
public class TUser extends Model<TUser> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String nickname;

    private String city;

    private String head;

    private LocalDateTime createtime;

    private String openid;

    private Boolean sex;

    private String remarks;

    private String weixin;

    private String tel;

    private String code;

    private String verifytel;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getVerifytel() {
        return verifytel;
    }

    public void setVerifytel(String verifytel) {
        this.verifytel = verifytel;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TUser{" +
        "id=" + id +
        ", nickname=" + nickname +
        ", city=" + city +
        ", head=" + head +
        ", createtime=" + createtime +
        ", openid=" + openid +
        ", sex=" + sex +
        ", remarks=" + remarks +
        ", weixin=" + weixin +
        ", tel=" + tel +
        ", code=" + code +
        ", verifytel=" + verifytel +
        "}";
    }
}
