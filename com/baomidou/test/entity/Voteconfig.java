package com.baomidou.test.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 投票配置表：设置投票参数
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class Voteconfig extends Model<Voteconfig> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String cid;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 投票活动主题
     */
    private String theme;

    /**
     * 创建时间
     */
    private LocalDateTime time;

    /**
     * 截止时间
     */
    private LocalDateTime endtime;

    /**
     * 急速拉票价格
     */
    private BigDecimal price;

    /**
     * 当前投票状态：1、进行中；2、已过期；3、已关闭；
     */
    private Integer state;

    /**
     * 是否开启急速拉：0、未开启；1、已开启
     */
    private Integer speedstate;

    /**
     * 是否开启用户参与：0、未开启；1、已开启
     */
    private Integer isuser;

    private String poster;

    /**
     * 当前投票主题二维码
     */
    private String ewmurl;

    /**
     * 投票类型
     */
    private Integer type;

    /**
     * 是否开启
     */
    private String isopen;

    /**
     * 间隔时长
     */
    private String jg;

    /**
     * 显示时长
     */
    private String xs;

    /**
     * 是否是大屏幕显示主题
     */
    private Integer isshowindex;

    /**
     * 是否开启搜索
     */
    private Integer issearch;

    /**
     * 是否开通倒计时
     */
    private Integer opencountdown;

    /**
     * 倒计时的时间戳
     */
    private String countdowntime;

    /**
     * 投票主题是否使用
     */
    private Integer isuse;

    /**
     * 修改时间
     */
    private LocalDateTime updatetime;

    /**
     * 清除豪榜时间
     */
    private LocalDateTime clearhbtime;

    /**
     * 是否显示用户头像名称 礼物列表
     */
    private String isopengoods;

    /**
     * 投票和pk手机页面显示风格
     */
    private Integer skinstyle;

    /**
     * 是否开启分组功能
     */
    private Integer isopengroup;

    private String groupmsg;

    private String customvotes;

    /**
     * 手机端pk投票展示时间
     */
    private String showTime;

    /**
     * 豪榜显示标识: 1实名显示, 0匿名显示
     */
    private Boolean anonymous;

    /**
     * 0-关闭酒水预存 1-开启酒水预存
     */
    private Boolean drinksstate;

    /**
     * 是否开通现场大屏实时版
     */
    @TableField("liveScreen")
    private Boolean liveScreen;

    /**
     * 最大免费投票数量
     */
    @TableField("maxFreeVoteNum")
    private Integer maxFreeVoteNum;

    /**
     * 免费次数用完后是否还允许付费投票
     */
    @TableField("canVoteAfterFree")
    private Boolean canVoteAfterFree;

    /**
     * 投票开启时间开关 ，开通：1， 关闭 ：0
     */
    @TableField("voteSwitch")
    private Boolean voteSwitch;

    /**
     * 投票开启时间（用户在规定时间之后才能投票）
     */
    @TableField("voteStartTime")
    private LocalDateTime voteStartTime;

    /**
     * 现场大屏实时显示人数 默认为6
     */
    @TableField("liveScreenSize")
    private Integer liveScreenSize;

    /**
     * 真实姓名认证 0 关闭 1开启
     */
    private Boolean realStatus;


    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public LocalDateTime getEndtime() {
        return endtime;
    }

    public void setEndtime(LocalDateTime endtime) {
        this.endtime = endtime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getSpeedstate() {
        return speedstate;
    }

    public void setSpeedstate(Integer speedstate) {
        this.speedstate = speedstate;
    }

    public Integer getIsuser() {
        return isuser;
    }

    public void setIsuser(Integer isuser) {
        this.isuser = isuser;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getEwmurl() {
        return ewmurl;
    }

    public void setEwmurl(String ewmurl) {
        this.ewmurl = ewmurl;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIsopen() {
        return isopen;
    }

    public void setIsopen(String isopen) {
        this.isopen = isopen;
    }

    public String getJg() {
        return jg;
    }

    public void setJg(String jg) {
        this.jg = jg;
    }

    public String getXs() {
        return xs;
    }

    public void setXs(String xs) {
        this.xs = xs;
    }

    public Integer getIsshowindex() {
        return isshowindex;
    }

    public void setIsshowindex(Integer isshowindex) {
        this.isshowindex = isshowindex;
    }

    public Integer getIssearch() {
        return issearch;
    }

    public void setIssearch(Integer issearch) {
        this.issearch = issearch;
    }

    public Integer getOpencountdown() {
        return opencountdown;
    }

    public void setOpencountdown(Integer opencountdown) {
        this.opencountdown = opencountdown;
    }

    public String getCountdowntime() {
        return countdowntime;
    }

    public void setCountdowntime(String countdowntime) {
        this.countdowntime = countdowntime;
    }

    public Integer getIsuse() {
        return isuse;
    }

    public void setIsuse(Integer isuse) {
        this.isuse = isuse;
    }

    public LocalDateTime getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(LocalDateTime updatetime) {
        this.updatetime = updatetime;
    }

    public LocalDateTime getClearhbtime() {
        return clearhbtime;
    }

    public void setClearhbtime(LocalDateTime clearhbtime) {
        this.clearhbtime = clearhbtime;
    }

    public String getIsopengoods() {
        return isopengoods;
    }

    public void setIsopengoods(String isopengoods) {
        this.isopengoods = isopengoods;
    }

    public Integer getSkinstyle() {
        return skinstyle;
    }

    public void setSkinstyle(Integer skinstyle) {
        this.skinstyle = skinstyle;
    }

    public Integer getIsopengroup() {
        return isopengroup;
    }

    public void setIsopengroup(Integer isopengroup) {
        this.isopengroup = isopengroup;
    }

    public String getGroupmsg() {
        return groupmsg;
    }

    public void setGroupmsg(String groupmsg) {
        this.groupmsg = groupmsg;
    }

    public String getCustomvotes() {
        return customvotes;
    }

    public void setCustomvotes(String customvotes) {
        this.customvotes = customvotes;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public Boolean getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Boolean anonymous) {
        this.anonymous = anonymous;
    }

    public Boolean getDrinksstate() {
        return drinksstate;
    }

    public void setDrinksstate(Boolean drinksstate) {
        this.drinksstate = drinksstate;
    }

    public Boolean getLiveScreen() {
        return liveScreen;
    }

    public void setLiveScreen(Boolean liveScreen) {
        this.liveScreen = liveScreen;
    }

    public Integer getMaxFreeVoteNum() {
        return maxFreeVoteNum;
    }

    public void setMaxFreeVoteNum(Integer maxFreeVoteNum) {
        this.maxFreeVoteNum = maxFreeVoteNum;
    }

    public Boolean getCanVoteAfterFree() {
        return canVoteAfterFree;
    }

    public void setCanVoteAfterFree(Boolean canVoteAfterFree) {
        this.canVoteAfterFree = canVoteAfterFree;
    }

    public Boolean getVoteSwitch() {
        return voteSwitch;
    }

    public void setVoteSwitch(Boolean voteSwitch) {
        this.voteSwitch = voteSwitch;
    }

    public LocalDateTime getVoteStartTime() {
        return voteStartTime;
    }

    public void setVoteStartTime(LocalDateTime voteStartTime) {
        this.voteStartTime = voteStartTime;
    }

    public Integer getLiveScreenSize() {
        return liveScreenSize;
    }

    public void setLiveScreenSize(Integer liveScreenSize) {
        this.liveScreenSize = liveScreenSize;
    }

    public Boolean getRealStatus() {
        return realStatus;
    }

    public void setRealStatus(Boolean realStatus) {
        this.realStatus = realStatus;
    }

    @Override
    protected Serializable pkVal() {
        return this.cid;
    }

    @Override
    public String toString() {
        return "Voteconfig{" +
        "cid=" + cid +
        ", barid=" + barid +
        ", theme=" + theme +
        ", time=" + time +
        ", endtime=" + endtime +
        ", price=" + price +
        ", state=" + state +
        ", speedstate=" + speedstate +
        ", isuser=" + isuser +
        ", poster=" + poster +
        ", ewmurl=" + ewmurl +
        ", type=" + type +
        ", isopen=" + isopen +
        ", jg=" + jg +
        ", xs=" + xs +
        ", isshowindex=" + isshowindex +
        ", issearch=" + issearch +
        ", opencountdown=" + opencountdown +
        ", countdowntime=" + countdowntime +
        ", isuse=" + isuse +
        ", updatetime=" + updatetime +
        ", clearhbtime=" + clearhbtime +
        ", isopengoods=" + isopengoods +
        ", skinstyle=" + skinstyle +
        ", isopengroup=" + isopengroup +
        ", groupmsg=" + groupmsg +
        ", customvotes=" + customvotes +
        ", showTime=" + showTime +
        ", anonymous=" + anonymous +
        ", drinksstate=" + drinksstate +
        ", liveScreen=" + liveScreen +
        ", maxFreeVoteNum=" + maxFreeVoteNum +
        ", canVoteAfterFree=" + canVoteAfterFree +
        ", voteSwitch=" + voteSwitch +
        ", voteStartTime=" + voteStartTime +
        ", liveScreenSize=" + liveScreenSize +
        ", realStatus=" + realStatus +
        "}";
    }
}
