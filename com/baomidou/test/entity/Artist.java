package com.baomidou.test.entity;

import java.math.BigDecimal;
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
public class Artist extends Model<Artist> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 艺人名称
     */
    private String name;

    /**
     * 艺人号
     */
    private String code;

    /**
     * 头像
     */
    private String head;

    /**
     * 手机号
     */
    private String tel;

    /**
     * 艺人类型
     */
    private String type;

    /**
     * 注册类型
     */
    private Integer registertype;

    private String intro;

    /**
     * 关联用户
     */
    private String userid;

    /**
     * 状态 (0:认证中 1:已认证 2:认证未通过)
     */
    private Integer state;

    /**
     * 是否启用(0:未启用,1:已启用)
     */
    private Integer ifuse;

    /**
     * 艺人收入
     */
    private BigDecimal money;

    private String remark;

    /**
     * 注册时间
     */
    private LocalDateTime time;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 身份证号码
     */
    private String codenum;

    /**
     * 新艺名
     */
    private String newname;

    /**
     * 新类型
     */
    private String newtype;

    /**
     * 艺人是否已经赠送过艺人专属座驾
     */
    private Boolean presented;

    /**
     * 新头像
     */
    private String newhead;

    /**
     * 艺人城市
     */
    private String city;

    /**
     * 获得打赏礼物数
     */
    private BigDecimal giftNumber;

    /**
     * 个人成就
     */
    private String achievement;

    /**
     * 是否隐藏身份： 0 不隐藏  1隐藏
     */
    @TableField("isIdentity")
    private Integer isIdentity;

    /**
     * 艺人免费宣传次数
     */
    private Integer publicityNum;

    /**
     * 艺人等级
     */
    private Integer artistLv;

    /**
     * 艺人积分
     */
    private BigDecimal artistIntegral;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getRegistertype() {
        return registertype;
    }

    public void setRegistertype(Integer registertype) {
        this.registertype = registertype;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getIfuse() {
        return ifuse;
    }

    public void setIfuse(Integer ifuse) {
        this.ifuse = ifuse;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getCodenum() {
        return codenum;
    }

    public void setCodenum(String codenum) {
        this.codenum = codenum;
    }

    public String getNewname() {
        return newname;
    }

    public void setNewname(String newname) {
        this.newname = newname;
    }

    public String getNewtype() {
        return newtype;
    }

    public void setNewtype(String newtype) {
        this.newtype = newtype;
    }

    public Boolean getPresented() {
        return presented;
    }

    public void setPresented(Boolean presented) {
        this.presented = presented;
    }

    public String getNewhead() {
        return newhead;
    }

    public void setNewhead(String newhead) {
        this.newhead = newhead;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BigDecimal getGiftNumber() {
        return giftNumber;
    }

    public void setGiftNumber(BigDecimal giftNumber) {
        this.giftNumber = giftNumber;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public Integer getIsIdentity() {
        return isIdentity;
    }

    public void setIsIdentity(Integer isIdentity) {
        this.isIdentity = isIdentity;
    }

    public Integer getPublicityNum() {
        return publicityNum;
    }

    public void setPublicityNum(Integer publicityNum) {
        this.publicityNum = publicityNum;
    }

    public Integer getArtistLv() {
        return artistLv;
    }

    public void setArtistLv(Integer artistLv) {
        this.artistLv = artistLv;
    }

    public BigDecimal getArtistIntegral() {
        return artistIntegral;
    }

    public void setArtistIntegral(BigDecimal artistIntegral) {
        this.artistIntegral = artistIntegral;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Artist{" +
        "id=" + id +
        ", name=" + name +
        ", code=" + code +
        ", head=" + head +
        ", tel=" + tel +
        ", type=" + type +
        ", registertype=" + registertype +
        ", intro=" + intro +
        ", userid=" + userid +
        ", state=" + state +
        ", ifuse=" + ifuse +
        ", money=" + money +
        ", remark=" + remark +
        ", time=" + time +
        ", realname=" + realname +
        ", codenum=" + codenum +
        ", newname=" + newname +
        ", newtype=" + newtype +
        ", presented=" + presented +
        ", newhead=" + newhead +
        ", city=" + city +
        ", giftNumber=" + giftNumber +
        ", achievement=" + achievement +
        ", isIdentity=" + isIdentity +
        ", publicityNum=" + publicityNum +
        ", artistLv=" + artistLv +
        ", artistIntegral=" + artistIntegral +
        "}";
    }
}
