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
public class Waiter extends Model<Waiter> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String userid;

    private LocalDateTime time;

    private String remarks;

    private String barbaseid;

    private Integer del;

    private Boolean receive;

    /**
     * 免费次数
     */
    private Integer freetimes;

    /**
     * 打赏免费次数
     */
    private Integer dsfreetimes;

    /**
     * 服务员每日限制免费次数
     */
    private Integer limittimes;

    /**
     * 每天免费点歌次数
     */
    private Integer songfreetimes;

    /**
     * 管理员是否有删除和拉黑、审核的功能
     */
    private Boolean delblack;

    /**
     * 是否有为用户霸屏权限
     */
    @TableField("isRepeatPascreen")
    private Boolean repeatPascreen;

    /**
     * 是否开启免费点歌,默认开启
     */
    private Boolean freeSong;

    /**
     * 单次最长霸屏时间
     */
    @TableField("maxBpTime")
    private Integer maxBpTime;

    /**
     * 类型：1管理员，2操作员
     */
    private Integer type;

    /**
     * 现场管理者的分成比例
     */
    private BigDecimal ratio;

    /**
     * 新分成比列需要审核
     */
    private BigDecimal newratio;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 决策关系
     */
    private String role;

    /**
     * 管理员所有使用的免费次数
     */
    private Integer allusedtime;

    /**
     * 管理员打赏的PK点是否显示
     */
    private Boolean showpk;

    /**
     * 是否开启管理员壕榜
     */
    private Boolean openBprich;

    /**
     * 是否分成
     */
    @TableField("isDivede")
    private Boolean divede;

    /**
     * 管理员是否同意协议
     */
    @TableField("divedePrent")
    private BigDecimal divedePrent;

    /**
     * 管理员是否同意协议
     */
    @TableField("agreeDeal")
    private Boolean agreeDeal;

    private Boolean freeDrive;

    private Integer drivefreetimes;

    private Integer limitdrivetimes;

    /**
     * 点舞-免费次数
     */
    @TableField("freeDanceTimes")
    private Integer freeDanceTimes;

    /**
     * 是否开启免费点舞
     */
    @TableField("freeDance")
    private Boolean freeDance;

    /**
     * 最大免费点歌次数
     */
    @TableField("songMaxFreeTimes")
    private Integer songMaxFreeTimes;

    /**
     * 点歌模板消息接收开始时间
     */
    @TableField("songTempStartTime")
    private String songTempStartTime;

    /**
     * 点歌模板消息接收结束时间
     */
    @TableField("songTempEndTime")
    private String songTempEndTime;

    /**
     * 操作者过期时间
     */
    private LocalDateTime divideExpireTime;

    /**
     * 操作者分成有效天数
     */
    private Integer divideDays;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getBarbaseid() {
        return barbaseid;
    }

    public void setBarbaseid(String barbaseid) {
        this.barbaseid = barbaseid;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public Boolean getReceive() {
        return receive;
    }

    public void setReceive(Boolean receive) {
        this.receive = receive;
    }

    public Integer getFreetimes() {
        return freetimes;
    }

    public void setFreetimes(Integer freetimes) {
        this.freetimes = freetimes;
    }

    public Integer getDsfreetimes() {
        return dsfreetimes;
    }

    public void setDsfreetimes(Integer dsfreetimes) {
        this.dsfreetimes = dsfreetimes;
    }

    public Integer getLimittimes() {
        return limittimes;
    }

    public void setLimittimes(Integer limittimes) {
        this.limittimes = limittimes;
    }

    public Integer getSongfreetimes() {
        return songfreetimes;
    }

    public void setSongfreetimes(Integer songfreetimes) {
        this.songfreetimes = songfreetimes;
    }

    public Boolean getDelblack() {
        return delblack;
    }

    public void setDelblack(Boolean delblack) {
        this.delblack = delblack;
    }

    public Boolean getRepeatPascreen() {
        return repeatPascreen;
    }

    public void setRepeatPascreen(Boolean repeatPascreen) {
        this.repeatPascreen = repeatPascreen;
    }

    public Boolean getFreeSong() {
        return freeSong;
    }

    public void setFreeSong(Boolean freeSong) {
        this.freeSong = freeSong;
    }

    public Integer getMaxBpTime() {
        return maxBpTime;
    }

    public void setMaxBpTime(Integer maxBpTime) {
        this.maxBpTime = maxBpTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getRatio() {
        return ratio;
    }

    public void setRatio(BigDecimal ratio) {
        this.ratio = ratio;
    }

    public BigDecimal getNewratio() {
        return newratio;
    }

    public void setNewratio(BigDecimal newratio) {
        this.newratio = newratio;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getAllusedtime() {
        return allusedtime;
    }

    public void setAllusedtime(Integer allusedtime) {
        this.allusedtime = allusedtime;
    }

    public Boolean getShowpk() {
        return showpk;
    }

    public void setShowpk(Boolean showpk) {
        this.showpk = showpk;
    }

    public Boolean getOpenBprich() {
        return openBprich;
    }

    public void setOpenBprich(Boolean openBprich) {
        this.openBprich = openBprich;
    }

    public Boolean getDivede() {
        return divede;
    }

    public void setDivede(Boolean divede) {
        this.divede = divede;
    }

    public BigDecimal getDivedePrent() {
        return divedePrent;
    }

    public void setDivedePrent(BigDecimal divedePrent) {
        this.divedePrent = divedePrent;
    }

    public Boolean getAgreeDeal() {
        return agreeDeal;
    }

    public void setAgreeDeal(Boolean agreeDeal) {
        this.agreeDeal = agreeDeal;
    }

    public Boolean getFreeDrive() {
        return freeDrive;
    }

    public void setFreeDrive(Boolean freeDrive) {
        this.freeDrive = freeDrive;
    }

    public Integer getDrivefreetimes() {
        return drivefreetimes;
    }

    public void setDrivefreetimes(Integer drivefreetimes) {
        this.drivefreetimes = drivefreetimes;
    }

    public Integer getLimitdrivetimes() {
        return limitdrivetimes;
    }

    public void setLimitdrivetimes(Integer limitdrivetimes) {
        this.limitdrivetimes = limitdrivetimes;
    }

    public Integer getFreeDanceTimes() {
        return freeDanceTimes;
    }

    public void setFreeDanceTimes(Integer freeDanceTimes) {
        this.freeDanceTimes = freeDanceTimes;
    }

    public Boolean getFreeDance() {
        return freeDance;
    }

    public void setFreeDance(Boolean freeDance) {
        this.freeDance = freeDance;
    }

    public Integer getSongMaxFreeTimes() {
        return songMaxFreeTimes;
    }

    public void setSongMaxFreeTimes(Integer songMaxFreeTimes) {
        this.songMaxFreeTimes = songMaxFreeTimes;
    }

    public String getSongTempStartTime() {
        return songTempStartTime;
    }

    public void setSongTempStartTime(String songTempStartTime) {
        this.songTempStartTime = songTempStartTime;
    }

    public String getSongTempEndTime() {
        return songTempEndTime;
    }

    public void setSongTempEndTime(String songTempEndTime) {
        this.songTempEndTime = songTempEndTime;
    }

    public LocalDateTime getDivideExpireTime() {
        return divideExpireTime;
    }

    public void setDivideExpireTime(LocalDateTime divideExpireTime) {
        this.divideExpireTime = divideExpireTime;
    }

    public Integer getDivideDays() {
        return divideDays;
    }

    public void setDivideDays(Integer divideDays) {
        this.divideDays = divideDays;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Waiter{" +
        "id=" + id +
        ", userid=" + userid +
        ", time=" + time +
        ", remarks=" + remarks +
        ", barbaseid=" + barbaseid +
        ", del=" + del +
        ", receive=" + receive +
        ", freetimes=" + freetimes +
        ", dsfreetimes=" + dsfreetimes +
        ", limittimes=" + limittimes +
        ", songfreetimes=" + songfreetimes +
        ", delblack=" + delblack +
        ", repeatPascreen=" + repeatPascreen +
        ", freeSong=" + freeSong +
        ", maxBpTime=" + maxBpTime +
        ", type=" + type +
        ", ratio=" + ratio +
        ", newratio=" + newratio +
        ", phone=" + phone +
        ", realname=" + realname +
        ", role=" + role +
        ", allusedtime=" + allusedtime +
        ", showpk=" + showpk +
        ", openBprich=" + openBprich +
        ", divede=" + divede +
        ", divedePrent=" + divedePrent +
        ", agreeDeal=" + agreeDeal +
        ", freeDrive=" + freeDrive +
        ", drivefreetimes=" + drivefreetimes +
        ", limitdrivetimes=" + limitdrivetimes +
        ", freeDanceTimes=" + freeDanceTimes +
        ", freeDance=" + freeDance +
        ", songMaxFreeTimes=" + songMaxFreeTimes +
        ", songTempStartTime=" + songTempStartTime +
        ", songTempEndTime=" + songTempEndTime +
        ", divideExpireTime=" + divideExpireTime +
        ", divideDays=" + divideDays +
        "}";
    }
}
