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
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String nickname;

    private String city;

    private String head;

    private LocalDateTime createtime;

    private String weixin;

    private String tel;

    private String openid;

    private Boolean sex;

    private Double longitude;

    private Double latitude;

    private String name;

    private String sitenum;

    private String remarks;

    private Integer age;

    private Integer height;

    private Integer weight;

    private String zy;

    private String admireta;

    @TableField("chatHead")
    private String chatHead;

    private Boolean todayislogin;

    private String mycity;

    private String sceneid;

    private Boolean updatehead;

    private Boolean black;

    private String blackremarks;

    /**
     * 喵微新公众号的openid
     */
    @TableField("wemewOpenId")
    private String wemewOpenId;

    /**
     * 是否更新了昵称
     */
    @TableField("isUpdateNickName")
    private Boolean updateNickName;

    /**
     * 微信开放平台UnionID
     */
    private String unionid;

    /**
     * 用户是否匿名
     */
    private Boolean anonymity;

    private String email;

    private String username;

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
    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSitenum() {
        return sitenum;
    }

    public void setSitenum(String sitenum) {
        this.sitenum = sitenum;
    }
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }
    public String getAdmireta() {
        return admireta;
    }

    public void setAdmireta(String admireta) {
        this.admireta = admireta;
    }
    public String getChatHead() {
        return chatHead;
    }

    public void setChatHead(String chatHead) {
        this.chatHead = chatHead;
    }
    public Boolean getTodayislogin() {
        return todayislogin;
    }

    public void setTodayislogin(Boolean todayislogin) {
        this.todayislogin = todayislogin;
    }
    public String getMycity() {
        return mycity;
    }

    public void setMycity(String mycity) {
        this.mycity = mycity;
    }
    public String getSceneid() {
        return sceneid;
    }

    public void setSceneid(String sceneid) {
        this.sceneid = sceneid;
    }
    public Boolean getUpdatehead() {
        return updatehead;
    }

    public void setUpdatehead(Boolean updatehead) {
        this.updatehead = updatehead;
    }
    public Boolean getBlack() {
        return black;
    }

    public void setBlack(Boolean black) {
        this.black = black;
    }
    public String getBlackremarks() {
        return blackremarks;
    }

    public void setBlackremarks(String blackremarks) {
        this.blackremarks = blackremarks;
    }
    public String getWemewOpenId() {
        return wemewOpenId;
    }

    public void setWemewOpenId(String wemewOpenId) {
        this.wemewOpenId = wemewOpenId;
    }
    public Boolean getUpdateNickName() {
        return updateNickName;
    }

    public void setUpdateNickName(Boolean updateNickName) {
        this.updateNickName = updateNickName;
    }
    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }
    public Boolean getAnonymity() {
        return anonymity;
    }

    public void setAnonymity(Boolean anonymity) {
        this.anonymity = anonymity;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", nickname=" + nickname +
        ", city=" + city +
        ", head=" + head +
        ", createtime=" + createtime +
        ", weixin=" + weixin +
        ", tel=" + tel +
        ", openid=" + openid +
        ", sex=" + sex +
        ", longitude=" + longitude +
        ", latitude=" + latitude +
        ", name=" + name +
        ", sitenum=" + sitenum +
        ", remarks=" + remarks +
        ", age=" + age +
        ", height=" + height +
        ", weight=" + weight +
        ", zy=" + zy +
        ", admireta=" + admireta +
        ", chatHead=" + chatHead +
        ", todayislogin=" + todayislogin +
        ", mycity=" + mycity +
        ", sceneid=" + sceneid +
        ", updatehead=" + updatehead +
        ", black=" + black +
        ", blackremarks=" + blackremarks +
        ", wemewOpenId=" + wemewOpenId +
        ", updateNickName=" + updateNickName +
        ", unionid=" + unionid +
        ", anonymity=" + anonymity +
        ", email=" + email +
        ", username=" + username +
        "}";
    }
}
