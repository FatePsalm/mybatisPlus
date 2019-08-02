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
public class Moduleotherfn extends Model<Moduleotherfn> {

    private static final long serialVersionUID = 1L;

    private String id;

    @TableField("barId")
    private String barId;

    private Integer reward;

    private LocalDateTime time;

    private Integer horsestate;

    private Integer horsepreliminarytime;

    private Integer horsefinaltime;

    @TableField("orderType")
    private Integer orderType;

    private Integer carstate;

    private Integer carpreliminarytime;

    private Integer carfinaltime;

    /**
     * 猜拳游戏状态
     */
    private Integer fingerstate;

    /**
     * 在线夺宝分成比例
     */
    private Integer treasureratio;

    @TableField("dbBackground")
    private String dbBackground;

    /**
     * 急速拉票分成比例
     */
    @TableField("voteRatio")
    private Integer voteRatio;

    @TableField("voteBackground")
    private String voteBackground;

    /**
     * 是否打开次数霸屏
     */
    private Boolean opentimebp;

    /**
     * 是否打开视频霸屏
     */
    private Boolean openvideo;

    /**
     *  是否打开弹幕版二维码
     */
    @TableField("isopendanmuQR")
    private Boolean opendanmuQR;

    /**
     * 删除状态：0、正常；1、删除中
     */
    private Integer delstate;

    /**
     * 微喵代理分成模式：0、55分成；1、微喵10%；2、微喵20%
     */
    @TableField("wmAgentRatio")
    private Integer wmAgentRatio;

    /**
     * 审核消息类型：0、不审核；1审核所有消息；2、只审核霸屏消息；3、审核霸屏视频消息
     */
    private Integer ischeckmsgtype;

    /**
     * 弹幕版二维码亮度0:亮 1:微亮 2:暗 3:最暗
     */
    private Integer danmulight;

    /**
     * 今夜不回家价格设置
     */
    @TableField("loveNightPrice")
    private BigDecimal loveNightPrice;

    private Boolean followwemew;

    private String sensitivewords;

    private Integer websocket;

    private BigDecimal cardamount;

    private Integer onwallfontsize;

    private Integer onwalllight;

    private Boolean openaudio;

    private Boolean opentable;

    /**
     * 是否开启土豪榜
     */
    private Boolean openrich;

    /**
     * 是否打开弹幕版
     */
    private Boolean opendanmu;

    /**
     * 代驾是否开启
     */
    private Boolean ondrive;

    /**
     * 是否检查开启屏幕
     */
    private Boolean checkopenscreen;

    /**
     * 后台首页是否隐藏收入
     */
    private Boolean hidemoney;

    /**
     * 自定义霸屏时间以英文逗号分隔
     */
    private String bptimes;

    /**
     * 否是开启红包
     */
    @TableField("isOpenRed")
    private Boolean openRed;

    /**
     * 集团分成
     */
    @TableField("newgroupDivid")
    private BigDecimal newgroupDivid;

    /**
     * 集团分成
     */
    @TableField("groupDivid")
    private BigDecimal groupDivid;

    /**
     * 代理商分成
     */
    @TableField("newagentDivid")
    private BigDecimal newagentDivid;

    /**
     * 代理商分成
     */
    @TableField("agentDivid")
    private BigDecimal agentDivid;

    /**
     * 酒吧分成
     */
    @TableField("newbarbaseDivid")
    private BigDecimal newbarbaseDivid;

    /**
     * 酒吧分成
     */
    @TableField("barbaseDivid")
    private BigDecimal barbaseDivid;

    /**
     * 人艺分成
     */
    @TableField("artistDivid")
    private BigDecimal artistDivid;

    /**
     * 微喵分成
     */
    @TableField("newwemewDivid")
    private BigDecimal newwemewDivid;

    /**
     * 微喵分成
     */
    @TableField("wemewDivid")
    private BigDecimal wemewDivid;

    private Integer shaketime;

    /**
     * 数钱游戏状态：1、游戏开始；2、游戏进行；3、游戏结束
     */
    @TableField("moneyGameState")
    private Integer moneyGameState;

    /**
     * 数钱游戏时长
     */
    @TableField("moneyGameTime")
    private Integer moneyGameTime;

    /**
     * 拔河游戏时间
     */
    private Integer tugfowartime;

    /**
     * 是否开启红人榜
     */
    @TableField("isOPenRedList")
    private Boolean oPenRedList;

    /**
     * 是否开启现场交友
     */
    @TableField("isOpenMakeFriend")
    private Boolean openMakeFriend;

    /**
     * 是否开启赛马游戏
     */
    @TableField("isOpenHorseGame")
    private Boolean openHorseGame;

    /**
     * 是否开启赛车游戏
     */
    @TableField("isOpenCarGame")
    private Boolean openCarGame;

    /**
     * 是否开启划拳游戏
     */
    @TableField("isOpenFingerGame")
    private Boolean openFingerGame;

    /**
     * 是否开启现场夺宝
     */
    @TableField("isOpenTreasure")
    private Boolean openTreasure;

    /**
     * 是否开启投票功能
     */
    @TableField("isOpenVote")
    private Boolean openVote;

    /**
     * 是否开启眼缘功能
     */
    @TableField("isOpenLoveNight")
    private Boolean openLoveNight;

    /**
     * 是否开启摇一摇游戏
     */
    @TableField("isOpenShakeGame")
    private Boolean openShakeGame;

    /**
     * 是否开启数钱游戏
     */
    @TableField("isOpenMoneyGame")
    private Boolean openMoneyGame;

    /**
     * 是否开启全民观战
     */
    @TableField("isOpenPeopleWatch")
    private Boolean openPeopleWatch;

    /**
     * 是否开启霸屏倒计时
     */
    @TableField("isOpenBpCountDown")
    private Boolean openBpCountDown;

    /**
     * 霸屏版本：0表示酷炫版，1表示普通版
     */
    @TableField("bpStyle")
    private Integer bpStyle;

    /**
     * 霸屏背景0表示透明，1表示酷炫
     */
    @TableField("bpBackground")
    private Integer bpBackground;

    /**
     * 视频风格
     */
    private Integer videostyle;

    /**
     * 是否循环显示弹幕版历史消息
     */
    @TableField("isLoopDanmuMsg")
    private Boolean loopDanmuMsg;

    /**
     * 是否开通12生肖
     */
    @TableField("isOpenAnimal")
    private Boolean openAnimal;

    /**
     * 是否开通拔河游戏
     */
    @TableField("isOpenTugofwar")
    private Boolean openTugofwar;

    /**
     * 是否禁止私聊
     */
    @TableField("isShutUp")
    private Boolean shutUp;

    /**
     * 当日最大点歌数量
     */
    @TableField("chooseSongNum")
    private Integer chooseSongNum;

    /**
     * 点歌时间
     */
    @TableField("chooseSongTime")
    private String chooseSongTime;

    /**
     * 是否开启点歌
     */
    @TableField("isOpenChooseSong")
    private Boolean openChooseSong;

    /**
     * 霸屏字体大小
     */
    @TableField("bpFontSize")
    private Integer bpFontSize;

    /**
     * 霸屏显示区域高度 默认为100
     */
    @TableField("bpHeight")
    private Integer bpHeight;

    /**
     * 夺宝成本比例
     */
    @TableField("dbCostDivid")
    private BigDecimal dbCostDivid;

    /**
     * 生肖成本比例
     */
    @TableField("sxCostDivid")
    private BigDecimal sxCostDivid;

    /**
     * 是否打开自动删除每天的上墙消息
     */
    @TableField("isOpenAutoCleanMsg")
    private Integer isOpenAutoCleanMsg;

    /**
     * 酒吧自动删除上墙消息的时间
     */
    @TableField("autoCleanMsgTime")
    private String autoCleanMsgTime;

    /**
     * 弹幕移动速度
     */
    @TableField("danmuSpeed")
    private Integer danmuSpeed;

    /**
     * 设置字体样式
     */
    private Integer setfont;

    /**
     * 点歌艺人分成
     */
    @TableField("dgArtistDivid")
    private BigDecimal dgArtistDivid;

    /**
     * 是否开启pk
     */
    private Integer isopenpk;

    /**
     * pk页面版本
     */
    private Integer pkversion;

    /**
     * 默认开启
     */
    private Integer openWeionwallmsg;

    /**
     * 微上墙消息显示时间
     */
    private Integer timeWeionwallmsg;

    /**
     * 大屏幕艺人是否显示
     */
    private Integer openArtis;

    /**
     * 大屏幕艺人显示时间
     */
    private Integer timeArtis;

    /**
     * 大屏幕是否显示PK
     */
    private Integer openPk;

    /**
     * 大屏幕显示PK的时间
     */
    private Integer timePk;

    /**
     * 大屏幕是否开启红包排行
     */
    private Integer openRedbag;

    /**
     * 红包默认显示时间
     */
    private Integer timeRedbag;

    /**
     * 大屏幕是否开启点歌
     */
    private Integer openSong;

    /**
     * 大屏幕显示点歌的时间
     */
    private Integer timeSong;

    /**
     * 富豪榜是否开启,0:不开启,1开启
     */
    private Integer openRicher;

    /**
     * 大屏幕显示富豪榜的时间,默认30
     */
    private Integer timeRicher;

    /**
     * 是否开启右下角游戏条
     */
    private Boolean openDanmugame;

    /**
     * 间隔时长
     */
    private String jg;

    /**
     * 显示时长
     */
    private String xs;

    /**
     * pk分成
     */
    private BigDecimal pkdivid;

    /**
     * 上墙模式。0:普通模式，1:派对模式
     */
    private Integer onwallmode;

    /**
     * pk集团分成
     */
    private BigDecimal pkGroupDivid;

    /**
     * pk代理分成
     */
    private BigDecimal pkAgentDivid;

    /**
     * pk酒吧分成
     */
    private BigDecimal pkBarbaseDivid;

    /**
     * pk微喵分成
     */
    private BigDecimal pkWemewDivid;

    /**
     * pk艺人分成
     */
    private BigDecimal pkArtistDivid;

    /**
     * 是否开启pk分成新模式，默认关闭
     */
    private Integer isOpenPknewdivid;

    /**
     * 积分赠送
     */
    private String score;

    /**
     * 是否显示派对模式背景视频
     */
    private Boolean showPartyvideo;

    /**
     * 幸运霸屏模式
     */
    @TableField("luckBp")
    private Integer luckBp;

    /**
     * 霸屏模式 0 普通版 1 派对场
     */
    @TableField("bpModel")
    private Integer bpModel;

    /**
     * 是否开启摇骰子游戏
     */
    @TableField("isOpenDice")
    private Boolean openDice;

    /**
     * 摇骰子游戏状态 默认 0 
     */
    @TableField("diceState")
    private Integer diceState;

    /**
     * 摇骰子预赛时间
     */
    private Integer dicegamePreliminaryTime;

    /**
     * 摇骰子决赛时间
     */
    private Integer dicegameFinalTime;

    /**
     * 是否开启大屏运营时间
     */
    @TableField("openScreenTips")
    private Integer openScreenTips;

    /**
     * 大屏幕运营时间
     */
    @TableField("ScreenTipsTime")
    private String ScreenTipsTime;

    /**
     * 开宝箱活动名称
     */
    @TableField("openBoxName")
    private String openBoxName;

    /**
     * 宝箱数量
     */
    @TableField("openBoxNumber")
    private Integer openBoxNumber;

    /**
     * 宝箱价格
     */
    @TableField("openBoxPrice")
    private BigDecimal openBoxPrice;

    /**
     * 开宝箱活动状态
     */
    @TableField("openBoxState")
    private Integer openBoxState;

    /**
     * 是否开启开宝箱
     */
    @TableField("isOpenTreasureBox")
    private Boolean openTreasureBox;

    /**
     * pk队员默认比例
     */
    private BigDecimal pkUserDefaultDivid;

    /**
     * PK队长默认比例
     */
    private BigDecimal pkCaptainDefaultDivid;

    /**
     * 禁止上墙普通消息
     */
    @TableField("refuseMes")
    private Boolean refuseMes;

    /**
     * 今日营收统计时间
     */
    @TableField("incomeTime")
    private LocalDateTime incomeTime;

    /**
     * 酒吧是否可以使用免费游戏
     */
    @TableField("isOpenFreeGame")
    private Integer isOpenFreeGame;

    /**
     * 免费游戏使用时间
     */
    @TableField("lastGameTime")
    private LocalDateTime lastGameTime;

    /**
     * 是否打开世界杯
     */
    @TableField("isOpenWorldCup")
    private Integer isOpenWorldCup;

    /**
     * 自动霸屏开始时间
     */
    @TableField("autoPascreenTime")
    private String autoPascreenTime;

    /**
     * 自动霸屏开始时间
     */
    @TableField("isOpenAutoPascreenTime")
    private Integer isOpenAutoPascreenTime;

    /**
     * 是否开启拍马屁游戏
     */
    @TableField("isOpenBootlick")
    private Boolean openBootlick;

    /**
     * 拍马屁游戏状态 默认 0 
     */
    @TableField("bootlickState")
    private Integer bootlickState;

    /**
     * 拍马屁比赛时间
     */
    @TableField("bootlickTime")
    private Integer bootlickTime;

    /**
     * 拍马屁price
     */
    @TableField("bootlickPrice")
    private BigDecimal bootlickPrice;

    /**
     * 酒吧logo
     */
    private String barlogo;

    /**
     * 霸屏分组
     */
    private String bpGroup;

    /**
     * 霸屏风格设置
     */
    @TableField("bpVideoStyle")
    private String bpVideoStyle;

    /**
     * 是否开启显示座驾  0 未开启 1 开启
     */
    @TableField("openUserMount")
    private Integer openUserMount;

    /**
     * 是否开启活动邀请新人
     */
    @TableField("openInvite")
    private Integer openInvite;

    @TableField("maxChooseSongNum")
    private Integer maxChooseSongNum;

    @TableField("goForDriveDivid")
    private BigDecimal goForDriveDivid;

    /**
     * 是否进行你演我猜
     */
    @TableField("isPlayGuess")
    private Boolean playGuess;

    /**
     * 单人单次最大点歌首数
     */
    @TableField("maxSingleChooseSongNum")
    private Integer maxSingleChooseSongNum;

    /**
     * 点舞是否开启, 1:开启, 0:关闭
     */
    @TableField("isOpenDance")
    private Boolean openDance;

    /**
     * 点舞图标显示时间,json格式
     */
    @TableField("chooseDanceTime")
    private String chooseDanceTime;

    /**
     * 大屏是否显示点舞 1:显示  0:不显示
     */
    @TableField("openDance")
    private Boolean openDance;

    /**
     * 没人点舞时,大屏默认图片和视频的url
     */
    @TableField("bigScreenDefault")
    private String bigScreenDefault;

    /**
     * 大屏显示点舞时长(单位:min)
     */
    @TableField("danceTime")
    private Integer danceTime;

    /**
     * 当晚最大点舞数量
     */
    @TableField("tonightMaxDanceNum")
    private Integer tonightMaxDanceNum;

    /**
     * 单人单次最大点舞数量
     */
    @TableField("onceMaxDanceNum")
    private Integer onceMaxDanceNum;

    /**
     * 系统默认舞曲的艺人总分成
     */
    @TableField("sysDancerPercent")
    private BigDecimal sysDancerPercent;

    /**
     * 系统歌曲冷却时间
     */
    private Integer customtime;

    /**
     * 酒吧和艺人分成比列初始化默认设置
     */
    private BigDecimal defaultProportion;

    /**
     * 酒吧系统重复点歌，系统默认设置
     */
    private Integer songMaxnum;

    /**
     * 砸金蛋活动名称
     */
    @TableField("smashEggName")
    private String smashEggName;

    /**
     * 砸金蛋数量
     */
    @TableField("smashEggNumber")
    private Integer smashEggNumber;

    /**
     * 砸金蛋数量
     */
    @TableField("smashEggPrice")
    private Double smashEggPrice;

    /**
     * 砸金蛋状态
     */
    @TableField("smashEggState")
    private Integer smashEggState;

    /**
     * 是否开启砸金蛋游戏
     */
    @TableField("isSmashEgg")
    private Boolean smashEgg;

    /**
     * 是否开启打赏新模式分成
     */
    @TableField("isNewPlayShowDivid")
    private Boolean newPlayShowDivid;

    /**
     * 达成成就赠送奖品开关
     */
    @TableField("isSendBigCustomerGift")
    private Boolean sendBigCustomerGift;

    /**
     * 是否开启礼物分类开关
     */
    @TableField("isOpenClassifyGift")
    private Boolean openClassifyGift;

    /**
     * 点歌图片上传开关
     */
    @TableField("isOpenSongUpPic")
    private Integer isOpenSongUpPic;

    /**
     * 点歌上传图片大屏展示时间
     */
    @TableField("songUpPicTime")
    private Integer songUpPicTime;

    /**
     * 新的点歌组件显示时间
     */
    @TableField("newSongTime")
    private Integer newSongTime;

    /**
     * 默认开启
     */
    @TableField("isopenScreenAd")
    private Boolean openScreenAd;

    /**
     * 拼歌人数 0：不开启   2  3  5 ：人数
     */
    @TableField("isSpellSong")
    private Integer isSpellSong;

    /**
     * 是否打开吃鸡游戏
     */
    @TableField("isOpenChickenGame")
    private Boolean openChickenGame;

    /**
     * 拼歌溢价比例
     */
    @TableField("isSpellSong_proportion")
    private BigDecimal isspellsongProportion;

    /**
     * 区间点歌次数
     */
    private String chooseSongCustomNum;

    /**
     * 好歌榜开关 0开启 1关闭
     */
    @TableField("isGoodSongList")
    private Integer isGoodSongList;

    /**
     * 好歌榜艺人排名 0开启 1未开启
     */
    @TableField("isArtistRanking")
    private Integer isArtistRanking;

    /**
     * 默认自动勾选  true 勾选 false未勾选
     */
    @TableField("isNewRewardGiftSelection")
    private Boolean newRewardGiftSelection;

    /**
     * 系统酒吧乐队默认头像
     */
    @TableField("barBandHead")
    private String barBandHead;

    /**
     * 系统酒吧乐队自定义头像
     */
    @TableField("myBarBandHead")
    private String myBarBandHead;

    /**
     * 点歌组件切换时间
     */
    @TableField("chooseSongComponentSwitchTime")
    private Integer chooseSongComponentSwitchTime;

    /**
     * 是否开启互动游戏
     */
    @TableField("is_openInteract_play")
    private Boolean openinteractPlay;

    /**
     * 全局控制是否显示开关控制
     */
    private Boolean onOffControl;

    /**
     * 自定义艺人开启歌单
     */
    private Boolean customArtistSong;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBarId() {
        return barId;
    }

    public void setBarId(String barId) {
        this.barId = barId;
    }

    public Integer getReward() {
        return reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getHorsestate() {
        return horsestate;
    }

    public void setHorsestate(Integer horsestate) {
        this.horsestate = horsestate;
    }

    public Integer getHorsepreliminarytime() {
        return horsepreliminarytime;
    }

    public void setHorsepreliminarytime(Integer horsepreliminarytime) {
        this.horsepreliminarytime = horsepreliminarytime;
    }

    public Integer getHorsefinaltime() {
        return horsefinaltime;
    }

    public void setHorsefinaltime(Integer horsefinaltime) {
        this.horsefinaltime = horsefinaltime;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getCarstate() {
        return carstate;
    }

    public void setCarstate(Integer carstate) {
        this.carstate = carstate;
    }

    public Integer getCarpreliminarytime() {
        return carpreliminarytime;
    }

    public void setCarpreliminarytime(Integer carpreliminarytime) {
        this.carpreliminarytime = carpreliminarytime;
    }

    public Integer getCarfinaltime() {
        return carfinaltime;
    }

    public void setCarfinaltime(Integer carfinaltime) {
        this.carfinaltime = carfinaltime;
    }

    public Integer getFingerstate() {
        return fingerstate;
    }

    public void setFingerstate(Integer fingerstate) {
        this.fingerstate = fingerstate;
    }

    public Integer getTreasureratio() {
        return treasureratio;
    }

    public void setTreasureratio(Integer treasureratio) {
        this.treasureratio = treasureratio;
    }

    public String getDbBackground() {
        return dbBackground;
    }

    public void setDbBackground(String dbBackground) {
        this.dbBackground = dbBackground;
    }

    public Integer getVoteRatio() {
        return voteRatio;
    }

    public void setVoteRatio(Integer voteRatio) {
        this.voteRatio = voteRatio;
    }

    public String getVoteBackground() {
        return voteBackground;
    }

    public void setVoteBackground(String voteBackground) {
        this.voteBackground = voteBackground;
    }

    public Boolean getOpentimebp() {
        return opentimebp;
    }

    public void setOpentimebp(Boolean opentimebp) {
        this.opentimebp = opentimebp;
    }

    public Boolean getOpenvideo() {
        return openvideo;
    }

    public void setOpenvideo(Boolean openvideo) {
        this.openvideo = openvideo;
    }

    public Boolean getOpendanmuQR() {
        return opendanmuQR;
    }

    public void setOpendanmuQR(Boolean opendanmuQR) {
        this.opendanmuQR = opendanmuQR;
    }

    public Integer getDelstate() {
        return delstate;
    }

    public void setDelstate(Integer delstate) {
        this.delstate = delstate;
    }

    public Integer getWmAgentRatio() {
        return wmAgentRatio;
    }

    public void setWmAgentRatio(Integer wmAgentRatio) {
        this.wmAgentRatio = wmAgentRatio;
    }

    public Integer getIscheckmsgtype() {
        return ischeckmsgtype;
    }

    public void setIscheckmsgtype(Integer ischeckmsgtype) {
        this.ischeckmsgtype = ischeckmsgtype;
    }

    public Integer getDanmulight() {
        return danmulight;
    }

    public void setDanmulight(Integer danmulight) {
        this.danmulight = danmulight;
    }

    public BigDecimal getLoveNightPrice() {
        return loveNightPrice;
    }

    public void setLoveNightPrice(BigDecimal loveNightPrice) {
        this.loveNightPrice = loveNightPrice;
    }

    public Boolean getFollowwemew() {
        return followwemew;
    }

    public void setFollowwemew(Boolean followwemew) {
        this.followwemew = followwemew;
    }

    public String getSensitivewords() {
        return sensitivewords;
    }

    public void setSensitivewords(String sensitivewords) {
        this.sensitivewords = sensitivewords;
    }

    public Integer getWebsocket() {
        return websocket;
    }

    public void setWebsocket(Integer websocket) {
        this.websocket = websocket;
    }

    public BigDecimal getCardamount() {
        return cardamount;
    }

    public void setCardamount(BigDecimal cardamount) {
        this.cardamount = cardamount;
    }

    public Integer getOnwallfontsize() {
        return onwallfontsize;
    }

    public void setOnwallfontsize(Integer onwallfontsize) {
        this.onwallfontsize = onwallfontsize;
    }

    public Integer getOnwalllight() {
        return onwalllight;
    }

    public void setOnwalllight(Integer onwalllight) {
        this.onwalllight = onwalllight;
    }

    public Boolean getOpenaudio() {
        return openaudio;
    }

    public void setOpenaudio(Boolean openaudio) {
        this.openaudio = openaudio;
    }

    public Boolean getOpentable() {
        return opentable;
    }

    public void setOpentable(Boolean opentable) {
        this.opentable = opentable;
    }

    public Boolean getOpenrich() {
        return openrich;
    }

    public void setOpenrich(Boolean openrich) {
        this.openrich = openrich;
    }

    public Boolean getOpendanmu() {
        return opendanmu;
    }

    public void setOpendanmu(Boolean opendanmu) {
        this.opendanmu = opendanmu;
    }

    public Boolean getOndrive() {
        return ondrive;
    }

    public void setOndrive(Boolean ondrive) {
        this.ondrive = ondrive;
    }

    public Boolean getCheckopenscreen() {
        return checkopenscreen;
    }

    public void setCheckopenscreen(Boolean checkopenscreen) {
        this.checkopenscreen = checkopenscreen;
    }

    public Boolean getHidemoney() {
        return hidemoney;
    }

    public void setHidemoney(Boolean hidemoney) {
        this.hidemoney = hidemoney;
    }

    public String getBptimes() {
        return bptimes;
    }

    public void setBptimes(String bptimes) {
        this.bptimes = bptimes;
    }

    public Boolean getOpenRed() {
        return openRed;
    }

    public void setOpenRed(Boolean openRed) {
        this.openRed = openRed;
    }

    public BigDecimal getNewgroupDivid() {
        return newgroupDivid;
    }

    public void setNewgroupDivid(BigDecimal newgroupDivid) {
        this.newgroupDivid = newgroupDivid;
    }

    public BigDecimal getGroupDivid() {
        return groupDivid;
    }

    public void setGroupDivid(BigDecimal groupDivid) {
        this.groupDivid = groupDivid;
    }

    public BigDecimal getNewagentDivid() {
        return newagentDivid;
    }

    public void setNewagentDivid(BigDecimal newagentDivid) {
        this.newagentDivid = newagentDivid;
    }

    public BigDecimal getAgentDivid() {
        return agentDivid;
    }

    public void setAgentDivid(BigDecimal agentDivid) {
        this.agentDivid = agentDivid;
    }

    public BigDecimal getNewbarbaseDivid() {
        return newbarbaseDivid;
    }

    public void setNewbarbaseDivid(BigDecimal newbarbaseDivid) {
        this.newbarbaseDivid = newbarbaseDivid;
    }

    public BigDecimal getBarbaseDivid() {
        return barbaseDivid;
    }

    public void setBarbaseDivid(BigDecimal barbaseDivid) {
        this.barbaseDivid = barbaseDivid;
    }

    public BigDecimal getArtistDivid() {
        return artistDivid;
    }

    public void setArtistDivid(BigDecimal artistDivid) {
        this.artistDivid = artistDivid;
    }

    public BigDecimal getNewwemewDivid() {
        return newwemewDivid;
    }

    public void setNewwemewDivid(BigDecimal newwemewDivid) {
        this.newwemewDivid = newwemewDivid;
    }

    public BigDecimal getWemewDivid() {
        return wemewDivid;
    }

    public void setWemewDivid(BigDecimal wemewDivid) {
        this.wemewDivid = wemewDivid;
    }

    public Integer getShaketime() {
        return shaketime;
    }

    public void setShaketime(Integer shaketime) {
        this.shaketime = shaketime;
    }

    public Integer getMoneyGameState() {
        return moneyGameState;
    }

    public void setMoneyGameState(Integer moneyGameState) {
        this.moneyGameState = moneyGameState;
    }

    public Integer getMoneyGameTime() {
        return moneyGameTime;
    }

    public void setMoneyGameTime(Integer moneyGameTime) {
        this.moneyGameTime = moneyGameTime;
    }

    public Integer getTugfowartime() {
        return tugfowartime;
    }

    public void setTugfowartime(Integer tugfowartime) {
        this.tugfowartime = tugfowartime;
    }

    public Boolean getoPenRedList() {
        return oPenRedList;
    }

    public void setoPenRedList(Boolean oPenRedList) {
        this.oPenRedList = oPenRedList;
    }

    public Boolean getOpenMakeFriend() {
        return openMakeFriend;
    }

    public void setOpenMakeFriend(Boolean openMakeFriend) {
        this.openMakeFriend = openMakeFriend;
    }

    public Boolean getOpenHorseGame() {
        return openHorseGame;
    }

    public void setOpenHorseGame(Boolean openHorseGame) {
        this.openHorseGame = openHorseGame;
    }

    public Boolean getOpenCarGame() {
        return openCarGame;
    }

    public void setOpenCarGame(Boolean openCarGame) {
        this.openCarGame = openCarGame;
    }

    public Boolean getOpenFingerGame() {
        return openFingerGame;
    }

    public void setOpenFingerGame(Boolean openFingerGame) {
        this.openFingerGame = openFingerGame;
    }

    public Boolean getOpenTreasure() {
        return openTreasure;
    }

    public void setOpenTreasure(Boolean openTreasure) {
        this.openTreasure = openTreasure;
    }

    public Boolean getOpenVote() {
        return openVote;
    }

    public void setOpenVote(Boolean openVote) {
        this.openVote = openVote;
    }

    public Boolean getOpenLoveNight() {
        return openLoveNight;
    }

    public void setOpenLoveNight(Boolean openLoveNight) {
        this.openLoveNight = openLoveNight;
    }

    public Boolean getOpenShakeGame() {
        return openShakeGame;
    }

    public void setOpenShakeGame(Boolean openShakeGame) {
        this.openShakeGame = openShakeGame;
    }

    public Boolean getOpenMoneyGame() {
        return openMoneyGame;
    }

    public void setOpenMoneyGame(Boolean openMoneyGame) {
        this.openMoneyGame = openMoneyGame;
    }

    public Boolean getOpenPeopleWatch() {
        return openPeopleWatch;
    }

    public void setOpenPeopleWatch(Boolean openPeopleWatch) {
        this.openPeopleWatch = openPeopleWatch;
    }

    public Boolean getOpenBpCountDown() {
        return openBpCountDown;
    }

    public void setOpenBpCountDown(Boolean openBpCountDown) {
        this.openBpCountDown = openBpCountDown;
    }

    public Integer getBpStyle() {
        return bpStyle;
    }

    public void setBpStyle(Integer bpStyle) {
        this.bpStyle = bpStyle;
    }

    public Integer getBpBackground() {
        return bpBackground;
    }

    public void setBpBackground(Integer bpBackground) {
        this.bpBackground = bpBackground;
    }

    public Integer getVideostyle() {
        return videostyle;
    }

    public void setVideostyle(Integer videostyle) {
        this.videostyle = videostyle;
    }

    public Boolean getLoopDanmuMsg() {
        return loopDanmuMsg;
    }

    public void setLoopDanmuMsg(Boolean loopDanmuMsg) {
        this.loopDanmuMsg = loopDanmuMsg;
    }

    public Boolean getOpenAnimal() {
        return openAnimal;
    }

    public void setOpenAnimal(Boolean openAnimal) {
        this.openAnimal = openAnimal;
    }

    public Boolean getOpenTugofwar() {
        return openTugofwar;
    }

    public void setOpenTugofwar(Boolean openTugofwar) {
        this.openTugofwar = openTugofwar;
    }

    public Boolean getShutUp() {
        return shutUp;
    }

    public void setShutUp(Boolean shutUp) {
        this.shutUp = shutUp;
    }

    public Integer getChooseSongNum() {
        return chooseSongNum;
    }

    public void setChooseSongNum(Integer chooseSongNum) {
        this.chooseSongNum = chooseSongNum;
    }

    public String getChooseSongTime() {
        return chooseSongTime;
    }

    public void setChooseSongTime(String chooseSongTime) {
        this.chooseSongTime = chooseSongTime;
    }

    public Boolean getOpenChooseSong() {
        return openChooseSong;
    }

    public void setOpenChooseSong(Boolean openChooseSong) {
        this.openChooseSong = openChooseSong;
    }

    public Integer getBpFontSize() {
        return bpFontSize;
    }

    public void setBpFontSize(Integer bpFontSize) {
        this.bpFontSize = bpFontSize;
    }

    public Integer getBpHeight() {
        return bpHeight;
    }

    public void setBpHeight(Integer bpHeight) {
        this.bpHeight = bpHeight;
    }

    public BigDecimal getDbCostDivid() {
        return dbCostDivid;
    }

    public void setDbCostDivid(BigDecimal dbCostDivid) {
        this.dbCostDivid = dbCostDivid;
    }

    public BigDecimal getSxCostDivid() {
        return sxCostDivid;
    }

    public void setSxCostDivid(BigDecimal sxCostDivid) {
        this.sxCostDivid = sxCostDivid;
    }

    public Integer getIsOpenAutoCleanMsg() {
        return isOpenAutoCleanMsg;
    }

    public void setIsOpenAutoCleanMsg(Integer isOpenAutoCleanMsg) {
        this.isOpenAutoCleanMsg = isOpenAutoCleanMsg;
    }

    public String getAutoCleanMsgTime() {
        return autoCleanMsgTime;
    }

    public void setAutoCleanMsgTime(String autoCleanMsgTime) {
        this.autoCleanMsgTime = autoCleanMsgTime;
    }

    public Integer getDanmuSpeed() {
        return danmuSpeed;
    }

    public void setDanmuSpeed(Integer danmuSpeed) {
        this.danmuSpeed = danmuSpeed;
    }

    public Integer getSetfont() {
        return setfont;
    }

    public void setSetfont(Integer setfont) {
        this.setfont = setfont;
    }

    public BigDecimal getDgArtistDivid() {
        return dgArtistDivid;
    }

    public void setDgArtistDivid(BigDecimal dgArtistDivid) {
        this.dgArtistDivid = dgArtistDivid;
    }

    public Integer getIsopenpk() {
        return isopenpk;
    }

    public void setIsopenpk(Integer isopenpk) {
        this.isopenpk = isopenpk;
    }

    public Integer getPkversion() {
        return pkversion;
    }

    public void setPkversion(Integer pkversion) {
        this.pkversion = pkversion;
    }

    public Integer getOpenWeionwallmsg() {
        return openWeionwallmsg;
    }

    public void setOpenWeionwallmsg(Integer openWeionwallmsg) {
        this.openWeionwallmsg = openWeionwallmsg;
    }

    public Integer getTimeWeionwallmsg() {
        return timeWeionwallmsg;
    }

    public void setTimeWeionwallmsg(Integer timeWeionwallmsg) {
        this.timeWeionwallmsg = timeWeionwallmsg;
    }

    public Integer getOpenArtis() {
        return openArtis;
    }

    public void setOpenArtis(Integer openArtis) {
        this.openArtis = openArtis;
    }

    public Integer getTimeArtis() {
        return timeArtis;
    }

    public void setTimeArtis(Integer timeArtis) {
        this.timeArtis = timeArtis;
    }

    public Integer getOpenPk() {
        return openPk;
    }

    public void setOpenPk(Integer openPk) {
        this.openPk = openPk;
    }

    public Integer getTimePk() {
        return timePk;
    }

    public void setTimePk(Integer timePk) {
        this.timePk = timePk;
    }

    public Integer getOpenRedbag() {
        return openRedbag;
    }

    public void setOpenRedbag(Integer openRedbag) {
        this.openRedbag = openRedbag;
    }

    public Integer getTimeRedbag() {
        return timeRedbag;
    }

    public void setTimeRedbag(Integer timeRedbag) {
        this.timeRedbag = timeRedbag;
    }

    public Integer getOpenSong() {
        return openSong;
    }

    public void setOpenSong(Integer openSong) {
        this.openSong = openSong;
    }

    public Integer getTimeSong() {
        return timeSong;
    }

    public void setTimeSong(Integer timeSong) {
        this.timeSong = timeSong;
    }

    public Integer getOpenRicher() {
        return openRicher;
    }

    public void setOpenRicher(Integer openRicher) {
        this.openRicher = openRicher;
    }

    public Integer getTimeRicher() {
        return timeRicher;
    }

    public void setTimeRicher(Integer timeRicher) {
        this.timeRicher = timeRicher;
    }

    public Boolean getOpenDanmugame() {
        return openDanmugame;
    }

    public void setOpenDanmugame(Boolean openDanmugame) {
        this.openDanmugame = openDanmugame;
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

    public BigDecimal getPkdivid() {
        return pkdivid;
    }

    public void setPkdivid(BigDecimal pkdivid) {
        this.pkdivid = pkdivid;
    }

    public Integer getOnwallmode() {
        return onwallmode;
    }

    public void setOnwallmode(Integer onwallmode) {
        this.onwallmode = onwallmode;
    }

    public BigDecimal getPkGroupDivid() {
        return pkGroupDivid;
    }

    public void setPkGroupDivid(BigDecimal pkGroupDivid) {
        this.pkGroupDivid = pkGroupDivid;
    }

    public BigDecimal getPkAgentDivid() {
        return pkAgentDivid;
    }

    public void setPkAgentDivid(BigDecimal pkAgentDivid) {
        this.pkAgentDivid = pkAgentDivid;
    }

    public BigDecimal getPkBarbaseDivid() {
        return pkBarbaseDivid;
    }

    public void setPkBarbaseDivid(BigDecimal pkBarbaseDivid) {
        this.pkBarbaseDivid = pkBarbaseDivid;
    }

    public BigDecimal getPkWemewDivid() {
        return pkWemewDivid;
    }

    public void setPkWemewDivid(BigDecimal pkWemewDivid) {
        this.pkWemewDivid = pkWemewDivid;
    }

    public BigDecimal getPkArtistDivid() {
        return pkArtistDivid;
    }

    public void setPkArtistDivid(BigDecimal pkArtistDivid) {
        this.pkArtistDivid = pkArtistDivid;
    }

    public Integer getIsOpenPknewdivid() {
        return isOpenPknewdivid;
    }

    public void setIsOpenPknewdivid(Integer isOpenPknewdivid) {
        this.isOpenPknewdivid = isOpenPknewdivid;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Boolean getShowPartyvideo() {
        return showPartyvideo;
    }

    public void setShowPartyvideo(Boolean showPartyvideo) {
        this.showPartyvideo = showPartyvideo;
    }

    public Integer getLuckBp() {
        return luckBp;
    }

    public void setLuckBp(Integer luckBp) {
        this.luckBp = luckBp;
    }

    public Integer getBpModel() {
        return bpModel;
    }

    public void setBpModel(Integer bpModel) {
        this.bpModel = bpModel;
    }

    public Boolean getOpenDice() {
        return openDice;
    }

    public void setOpenDice(Boolean openDice) {
        this.openDice = openDice;
    }

    public Integer getDiceState() {
        return diceState;
    }

    public void setDiceState(Integer diceState) {
        this.diceState = diceState;
    }

    public Integer getDicegamePreliminaryTime() {
        return dicegamePreliminaryTime;
    }

    public void setDicegamePreliminaryTime(Integer dicegamePreliminaryTime) {
        this.dicegamePreliminaryTime = dicegamePreliminaryTime;
    }

    public Integer getDicegameFinalTime() {
        return dicegameFinalTime;
    }

    public void setDicegameFinalTime(Integer dicegameFinalTime) {
        this.dicegameFinalTime = dicegameFinalTime;
    }

    public Integer getOpenScreenTips() {
        return openScreenTips;
    }

    public void setOpenScreenTips(Integer openScreenTips) {
        this.openScreenTips = openScreenTips;
    }

    public String getScreenTipsTime() {
        return ScreenTipsTime;
    }

    public void setScreenTipsTime(String ScreenTipsTime) {
        this.ScreenTipsTime = ScreenTipsTime;
    }

    public String getOpenBoxName() {
        return openBoxName;
    }

    public void setOpenBoxName(String openBoxName) {
        this.openBoxName = openBoxName;
    }

    public Integer getOpenBoxNumber() {
        return openBoxNumber;
    }

    public void setOpenBoxNumber(Integer openBoxNumber) {
        this.openBoxNumber = openBoxNumber;
    }

    public BigDecimal getOpenBoxPrice() {
        return openBoxPrice;
    }

    public void setOpenBoxPrice(BigDecimal openBoxPrice) {
        this.openBoxPrice = openBoxPrice;
    }

    public Integer getOpenBoxState() {
        return openBoxState;
    }

    public void setOpenBoxState(Integer openBoxState) {
        this.openBoxState = openBoxState;
    }

    public Boolean getOpenTreasureBox() {
        return openTreasureBox;
    }

    public void setOpenTreasureBox(Boolean openTreasureBox) {
        this.openTreasureBox = openTreasureBox;
    }

    public BigDecimal getPkUserDefaultDivid() {
        return pkUserDefaultDivid;
    }

    public void setPkUserDefaultDivid(BigDecimal pkUserDefaultDivid) {
        this.pkUserDefaultDivid = pkUserDefaultDivid;
    }

    public BigDecimal getPkCaptainDefaultDivid() {
        return pkCaptainDefaultDivid;
    }

    public void setPkCaptainDefaultDivid(BigDecimal pkCaptainDefaultDivid) {
        this.pkCaptainDefaultDivid = pkCaptainDefaultDivid;
    }

    public Boolean getRefuseMes() {
        return refuseMes;
    }

    public void setRefuseMes(Boolean refuseMes) {
        this.refuseMes = refuseMes;
    }

    public LocalDateTime getIncomeTime() {
        return incomeTime;
    }

    public void setIncomeTime(LocalDateTime incomeTime) {
        this.incomeTime = incomeTime;
    }

    public Integer getIsOpenFreeGame() {
        return isOpenFreeGame;
    }

    public void setIsOpenFreeGame(Integer isOpenFreeGame) {
        this.isOpenFreeGame = isOpenFreeGame;
    }

    public LocalDateTime getLastGameTime() {
        return lastGameTime;
    }

    public void setLastGameTime(LocalDateTime lastGameTime) {
        this.lastGameTime = lastGameTime;
    }

    public Integer getIsOpenWorldCup() {
        return isOpenWorldCup;
    }

    public void setIsOpenWorldCup(Integer isOpenWorldCup) {
        this.isOpenWorldCup = isOpenWorldCup;
    }

    public String getAutoPascreenTime() {
        return autoPascreenTime;
    }

    public void setAutoPascreenTime(String autoPascreenTime) {
        this.autoPascreenTime = autoPascreenTime;
    }

    public Integer getIsOpenAutoPascreenTime() {
        return isOpenAutoPascreenTime;
    }

    public void setIsOpenAutoPascreenTime(Integer isOpenAutoPascreenTime) {
        this.isOpenAutoPascreenTime = isOpenAutoPascreenTime;
    }

    public Boolean getOpenBootlick() {
        return openBootlick;
    }

    public void setOpenBootlick(Boolean openBootlick) {
        this.openBootlick = openBootlick;
    }

    public Integer getBootlickState() {
        return bootlickState;
    }

    public void setBootlickState(Integer bootlickState) {
        this.bootlickState = bootlickState;
    }

    public Integer getBootlickTime() {
        return bootlickTime;
    }

    public void setBootlickTime(Integer bootlickTime) {
        this.bootlickTime = bootlickTime;
    }

    public BigDecimal getBootlickPrice() {
        return bootlickPrice;
    }

    public void setBootlickPrice(BigDecimal bootlickPrice) {
        this.bootlickPrice = bootlickPrice;
    }

    public String getBarlogo() {
        return barlogo;
    }

    public void setBarlogo(String barlogo) {
        this.barlogo = barlogo;
    }

    public String getBpGroup() {
        return bpGroup;
    }

    public void setBpGroup(String bpGroup) {
        this.bpGroup = bpGroup;
    }

    public String getBpVideoStyle() {
        return bpVideoStyle;
    }

    public void setBpVideoStyle(String bpVideoStyle) {
        this.bpVideoStyle = bpVideoStyle;
    }

    public Integer getOpenUserMount() {
        return openUserMount;
    }

    public void setOpenUserMount(Integer openUserMount) {
        this.openUserMount = openUserMount;
    }

    public Integer getOpenInvite() {
        return openInvite;
    }

    public void setOpenInvite(Integer openInvite) {
        this.openInvite = openInvite;
    }

    public Integer getMaxChooseSongNum() {
        return maxChooseSongNum;
    }

    public void setMaxChooseSongNum(Integer maxChooseSongNum) {
        this.maxChooseSongNum = maxChooseSongNum;
    }

    public BigDecimal getGoForDriveDivid() {
        return goForDriveDivid;
    }

    public void setGoForDriveDivid(BigDecimal goForDriveDivid) {
        this.goForDriveDivid = goForDriveDivid;
    }

    public Boolean getPlayGuess() {
        return playGuess;
    }

    public void setPlayGuess(Boolean playGuess) {
        this.playGuess = playGuess;
    }

    public Integer getMaxSingleChooseSongNum() {
        return maxSingleChooseSongNum;
    }

    public void setMaxSingleChooseSongNum(Integer maxSingleChooseSongNum) {
        this.maxSingleChooseSongNum = maxSingleChooseSongNum;
    }

    public Boolean getOpenDance() {
        return openDance;
    }

    public void setOpenDance(Boolean openDance) {
        this.openDance = openDance;
    }

    public String getChooseDanceTime() {
        return chooseDanceTime;
    }

    public void setChooseDanceTime(String chooseDanceTime) {
        this.chooseDanceTime = chooseDanceTime;
    }

    public Boolean getOpenDance() {
        return openDance;
    }

    public void setOpenDance(Boolean openDance) {
        this.openDance = openDance;
    }

    public String getBigScreenDefault() {
        return bigScreenDefault;
    }

    public void setBigScreenDefault(String bigScreenDefault) {
        this.bigScreenDefault = bigScreenDefault;
    }

    public Integer getDanceTime() {
        return danceTime;
    }

    public void setDanceTime(Integer danceTime) {
        this.danceTime = danceTime;
    }

    public Integer getTonightMaxDanceNum() {
        return tonightMaxDanceNum;
    }

    public void setTonightMaxDanceNum(Integer tonightMaxDanceNum) {
        this.tonightMaxDanceNum = tonightMaxDanceNum;
    }

    public Integer getOnceMaxDanceNum() {
        return onceMaxDanceNum;
    }

    public void setOnceMaxDanceNum(Integer onceMaxDanceNum) {
        this.onceMaxDanceNum = onceMaxDanceNum;
    }

    public BigDecimal getSysDancerPercent() {
        return sysDancerPercent;
    }

    public void setSysDancerPercent(BigDecimal sysDancerPercent) {
        this.sysDancerPercent = sysDancerPercent;
    }

    public Integer getCustomtime() {
        return customtime;
    }

    public void setCustomtime(Integer customtime) {
        this.customtime = customtime;
    }

    public BigDecimal getDefaultProportion() {
        return defaultProportion;
    }

    public void setDefaultProportion(BigDecimal defaultProportion) {
        this.defaultProportion = defaultProportion;
    }

    public Integer getSongMaxnum() {
        return songMaxnum;
    }

    public void setSongMaxnum(Integer songMaxnum) {
        this.songMaxnum = songMaxnum;
    }

    public String getSmashEggName() {
        return smashEggName;
    }

    public void setSmashEggName(String smashEggName) {
        this.smashEggName = smashEggName;
    }

    public Integer getSmashEggNumber() {
        return smashEggNumber;
    }

    public void setSmashEggNumber(Integer smashEggNumber) {
        this.smashEggNumber = smashEggNumber;
    }

    public Double getSmashEggPrice() {
        return smashEggPrice;
    }

    public void setSmashEggPrice(Double smashEggPrice) {
        this.smashEggPrice = smashEggPrice;
    }

    public Integer getSmashEggState() {
        return smashEggState;
    }

    public void setSmashEggState(Integer smashEggState) {
        this.smashEggState = smashEggState;
    }

    public Boolean getSmashEgg() {
        return smashEgg;
    }

    public void setSmashEgg(Boolean smashEgg) {
        this.smashEgg = smashEgg;
    }

    public Boolean getNewPlayShowDivid() {
        return newPlayShowDivid;
    }

    public void setNewPlayShowDivid(Boolean newPlayShowDivid) {
        this.newPlayShowDivid = newPlayShowDivid;
    }

    public Boolean getSendBigCustomerGift() {
        return sendBigCustomerGift;
    }

    public void setSendBigCustomerGift(Boolean sendBigCustomerGift) {
        this.sendBigCustomerGift = sendBigCustomerGift;
    }

    public Boolean getOpenClassifyGift() {
        return openClassifyGift;
    }

    public void setOpenClassifyGift(Boolean openClassifyGift) {
        this.openClassifyGift = openClassifyGift;
    }

    public Integer getIsOpenSongUpPic() {
        return isOpenSongUpPic;
    }

    public void setIsOpenSongUpPic(Integer isOpenSongUpPic) {
        this.isOpenSongUpPic = isOpenSongUpPic;
    }

    public Integer getSongUpPicTime() {
        return songUpPicTime;
    }

    public void setSongUpPicTime(Integer songUpPicTime) {
        this.songUpPicTime = songUpPicTime;
    }

    public Integer getNewSongTime() {
        return newSongTime;
    }

    public void setNewSongTime(Integer newSongTime) {
        this.newSongTime = newSongTime;
    }

    public Boolean getOpenScreenAd() {
        return openScreenAd;
    }

    public void setOpenScreenAd(Boolean openScreenAd) {
        this.openScreenAd = openScreenAd;
    }

    public Integer getIsSpellSong() {
        return isSpellSong;
    }

    public void setIsSpellSong(Integer isSpellSong) {
        this.isSpellSong = isSpellSong;
    }

    public Boolean getOpenChickenGame() {
        return openChickenGame;
    }

    public void setOpenChickenGame(Boolean openChickenGame) {
        this.openChickenGame = openChickenGame;
    }

    public BigDecimal getIsspellsongProportion() {
        return isspellsongProportion;
    }

    public void setIsspellsongProportion(BigDecimal isspellsongProportion) {
        this.isspellsongProportion = isspellsongProportion;
    }

    public String getChooseSongCustomNum() {
        return chooseSongCustomNum;
    }

    public void setChooseSongCustomNum(String chooseSongCustomNum) {
        this.chooseSongCustomNum = chooseSongCustomNum;
    }

    public Integer getIsGoodSongList() {
        return isGoodSongList;
    }

    public void setIsGoodSongList(Integer isGoodSongList) {
        this.isGoodSongList = isGoodSongList;
    }

    public Integer getIsArtistRanking() {
        return isArtistRanking;
    }

    public void setIsArtistRanking(Integer isArtistRanking) {
        this.isArtistRanking = isArtistRanking;
    }

    public Boolean getNewRewardGiftSelection() {
        return newRewardGiftSelection;
    }

    public void setNewRewardGiftSelection(Boolean newRewardGiftSelection) {
        this.newRewardGiftSelection = newRewardGiftSelection;
    }

    public String getBarBandHead() {
        return barBandHead;
    }

    public void setBarBandHead(String barBandHead) {
        this.barBandHead = barBandHead;
    }

    public String getMyBarBandHead() {
        return myBarBandHead;
    }

    public void setMyBarBandHead(String myBarBandHead) {
        this.myBarBandHead = myBarBandHead;
    }

    public Integer getChooseSongComponentSwitchTime() {
        return chooseSongComponentSwitchTime;
    }

    public void setChooseSongComponentSwitchTime(Integer chooseSongComponentSwitchTime) {
        this.chooseSongComponentSwitchTime = chooseSongComponentSwitchTime;
    }

    public Boolean getOpeninteractPlay() {
        return openinteractPlay;
    }

    public void setOpeninteractPlay(Boolean openinteractPlay) {
        this.openinteractPlay = openinteractPlay;
    }

    public Boolean getOnOffControl() {
        return onOffControl;
    }

    public void setOnOffControl(Boolean onOffControl) {
        this.onOffControl = onOffControl;
    }

    public Boolean getCustomArtistSong() {
        return customArtistSong;
    }

    public void setCustomArtistSong(Boolean customArtistSong) {
        this.customArtistSong = customArtistSong;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Moduleotherfn{" +
        "id=" + id +
        ", barId=" + barId +
        ", reward=" + reward +
        ", time=" + time +
        ", horsestate=" + horsestate +
        ", horsepreliminarytime=" + horsepreliminarytime +
        ", horsefinaltime=" + horsefinaltime +
        ", orderType=" + orderType +
        ", carstate=" + carstate +
        ", carpreliminarytime=" + carpreliminarytime +
        ", carfinaltime=" + carfinaltime +
        ", fingerstate=" + fingerstate +
        ", treasureratio=" + treasureratio +
        ", dbBackground=" + dbBackground +
        ", voteRatio=" + voteRatio +
        ", voteBackground=" + voteBackground +
        ", opentimebp=" + opentimebp +
        ", openvideo=" + openvideo +
        ", opendanmuQR=" + opendanmuQR +
        ", delstate=" + delstate +
        ", wmAgentRatio=" + wmAgentRatio +
        ", ischeckmsgtype=" + ischeckmsgtype +
        ", danmulight=" + danmulight +
        ", loveNightPrice=" + loveNightPrice +
        ", followwemew=" + followwemew +
        ", sensitivewords=" + sensitivewords +
        ", websocket=" + websocket +
        ", cardamount=" + cardamount +
        ", onwallfontsize=" + onwallfontsize +
        ", onwalllight=" + onwalllight +
        ", openaudio=" + openaudio +
        ", opentable=" + opentable +
        ", openrich=" + openrich +
        ", opendanmu=" + opendanmu +
        ", ondrive=" + ondrive +
        ", checkopenscreen=" + checkopenscreen +
        ", hidemoney=" + hidemoney +
        ", bptimes=" + bptimes +
        ", openRed=" + openRed +
        ", newgroupDivid=" + newgroupDivid +
        ", groupDivid=" + groupDivid +
        ", newagentDivid=" + newagentDivid +
        ", agentDivid=" + agentDivid +
        ", newbarbaseDivid=" + newbarbaseDivid +
        ", barbaseDivid=" + barbaseDivid +
        ", artistDivid=" + artistDivid +
        ", newwemewDivid=" + newwemewDivid +
        ", wemewDivid=" + wemewDivid +
        ", shaketime=" + shaketime +
        ", moneyGameState=" + moneyGameState +
        ", moneyGameTime=" + moneyGameTime +
        ", tugfowartime=" + tugfowartime +
        ", oPenRedList=" + oPenRedList +
        ", openMakeFriend=" + openMakeFriend +
        ", openHorseGame=" + openHorseGame +
        ", openCarGame=" + openCarGame +
        ", openFingerGame=" + openFingerGame +
        ", openTreasure=" + openTreasure +
        ", openVote=" + openVote +
        ", openLoveNight=" + openLoveNight +
        ", openShakeGame=" + openShakeGame +
        ", openMoneyGame=" + openMoneyGame +
        ", openPeopleWatch=" + openPeopleWatch +
        ", openBpCountDown=" + openBpCountDown +
        ", bpStyle=" + bpStyle +
        ", bpBackground=" + bpBackground +
        ", videostyle=" + videostyle +
        ", loopDanmuMsg=" + loopDanmuMsg +
        ", openAnimal=" + openAnimal +
        ", openTugofwar=" + openTugofwar +
        ", shutUp=" + shutUp +
        ", chooseSongNum=" + chooseSongNum +
        ", chooseSongTime=" + chooseSongTime +
        ", openChooseSong=" + openChooseSong +
        ", bpFontSize=" + bpFontSize +
        ", bpHeight=" + bpHeight +
        ", dbCostDivid=" + dbCostDivid +
        ", sxCostDivid=" + sxCostDivid +
        ", isOpenAutoCleanMsg=" + isOpenAutoCleanMsg +
        ", autoCleanMsgTime=" + autoCleanMsgTime +
        ", danmuSpeed=" + danmuSpeed +
        ", setfont=" + setfont +
        ", dgArtistDivid=" + dgArtistDivid +
        ", isopenpk=" + isopenpk +
        ", pkversion=" + pkversion +
        ", openWeionwallmsg=" + openWeionwallmsg +
        ", timeWeionwallmsg=" + timeWeionwallmsg +
        ", openArtis=" + openArtis +
        ", timeArtis=" + timeArtis +
        ", openPk=" + openPk +
        ", timePk=" + timePk +
        ", openRedbag=" + openRedbag +
        ", timeRedbag=" + timeRedbag +
        ", openSong=" + openSong +
        ", timeSong=" + timeSong +
        ", openRicher=" + openRicher +
        ", timeRicher=" + timeRicher +
        ", openDanmugame=" + openDanmugame +
        ", jg=" + jg +
        ", xs=" + xs +
        ", pkdivid=" + pkdivid +
        ", onwallmode=" + onwallmode +
        ", pkGroupDivid=" + pkGroupDivid +
        ", pkAgentDivid=" + pkAgentDivid +
        ", pkBarbaseDivid=" + pkBarbaseDivid +
        ", pkWemewDivid=" + pkWemewDivid +
        ", pkArtistDivid=" + pkArtistDivid +
        ", isOpenPknewdivid=" + isOpenPknewdivid +
        ", score=" + score +
        ", showPartyvideo=" + showPartyvideo +
        ", luckBp=" + luckBp +
        ", bpModel=" + bpModel +
        ", openDice=" + openDice +
        ", diceState=" + diceState +
        ", dicegamePreliminaryTime=" + dicegamePreliminaryTime +
        ", dicegameFinalTime=" + dicegameFinalTime +
        ", openScreenTips=" + openScreenTips +
        ", ScreenTipsTime=" + ScreenTipsTime +
        ", openBoxName=" + openBoxName +
        ", openBoxNumber=" + openBoxNumber +
        ", openBoxPrice=" + openBoxPrice +
        ", openBoxState=" + openBoxState +
        ", openTreasureBox=" + openTreasureBox +
        ", pkUserDefaultDivid=" + pkUserDefaultDivid +
        ", pkCaptainDefaultDivid=" + pkCaptainDefaultDivid +
        ", refuseMes=" + refuseMes +
        ", incomeTime=" + incomeTime +
        ", isOpenFreeGame=" + isOpenFreeGame +
        ", lastGameTime=" + lastGameTime +
        ", isOpenWorldCup=" + isOpenWorldCup +
        ", autoPascreenTime=" + autoPascreenTime +
        ", isOpenAutoPascreenTime=" + isOpenAutoPascreenTime +
        ", openBootlick=" + openBootlick +
        ", bootlickState=" + bootlickState +
        ", bootlickTime=" + bootlickTime +
        ", bootlickPrice=" + bootlickPrice +
        ", barlogo=" + barlogo +
        ", bpGroup=" + bpGroup +
        ", bpVideoStyle=" + bpVideoStyle +
        ", openUserMount=" + openUserMount +
        ", openInvite=" + openInvite +
        ", maxChooseSongNum=" + maxChooseSongNum +
        ", goForDriveDivid=" + goForDriveDivid +
        ", playGuess=" + playGuess +
        ", maxSingleChooseSongNum=" + maxSingleChooseSongNum +
        ", openDance=" + openDance +
        ", chooseDanceTime=" + chooseDanceTime +
        ", openDance=" + openDance +
        ", bigScreenDefault=" + bigScreenDefault +
        ", danceTime=" + danceTime +
        ", tonightMaxDanceNum=" + tonightMaxDanceNum +
        ", onceMaxDanceNum=" + onceMaxDanceNum +
        ", sysDancerPercent=" + sysDancerPercent +
        ", customtime=" + customtime +
        ", defaultProportion=" + defaultProportion +
        ", songMaxnum=" + songMaxnum +
        ", smashEggName=" + smashEggName +
        ", smashEggNumber=" + smashEggNumber +
        ", smashEggPrice=" + smashEggPrice +
        ", smashEggState=" + smashEggState +
        ", smashEgg=" + smashEgg +
        ", newPlayShowDivid=" + newPlayShowDivid +
        ", sendBigCustomerGift=" + sendBigCustomerGift +
        ", openClassifyGift=" + openClassifyGift +
        ", isOpenSongUpPic=" + isOpenSongUpPic +
        ", songUpPicTime=" + songUpPicTime +
        ", newSongTime=" + newSongTime +
        ", openScreenAd=" + openScreenAd +
        ", isSpellSong=" + isSpellSong +
        ", openChickenGame=" + openChickenGame +
        ", isspellsongProportion=" + isspellsongProportion +
        ", chooseSongCustomNum=" + chooseSongCustomNum +
        ", isGoodSongList=" + isGoodSongList +
        ", isArtistRanking=" + isArtistRanking +
        ", newRewardGiftSelection=" + newRewardGiftSelection +
        ", barBandHead=" + barBandHead +
        ", myBarBandHead=" + myBarBandHead +
        ", chooseSongComponentSwitchTime=" + chooseSongComponentSwitchTime +
        ", openinteractPlay=" + openinteractPlay +
        ", onOffControl=" + onOffControl +
        ", customArtistSong=" + customArtistSong +
        "}";
    }
}
