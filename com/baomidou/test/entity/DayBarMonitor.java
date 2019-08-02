package com.baomidou.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 每日酒吧监控
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class DayBarMonitor extends Model<DayBarMonitor> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 日期
     */
    private LocalDate date;

    /**
     * 酒吧id
     */
    private String barid;

    /**
     * 请求次数
     */
    private Integer requestTime;

    /**
     * 是否有流水
     */
    private Boolean haveMoney;

    /**
     * 打开屏幕时间
     */
    private LocalDateTime openScreenTime;

    /**
     * 关闭大屏幕时间
     */
    private LocalDateTime closeScreenTime;

    /**
     * 网页版开屏市场
     */
    private Integer webScreenLong;

    /**
     * 客户端打开大屏幕时长
     */
    private Integer clientScreenLong;

    /**
     * B端游戏功能类型：0、基础统计；1、赛马；2、赛车；3、石头剪刀布；4、夺宝；5、摇一摇；6、数钱；7、生肖；8、拔河；9、开宝箱；10、摇骰子；
     */
    private Integer type;

    /**
     * 酒吧启动游戏频次
     */
    private Integer openGameNum;

    /**
     * 酒吧启动游戏时长
     */
    private Integer openGameTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Integer getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Integer requestTime) {
        this.requestTime = requestTime;
    }

    public Boolean getHaveMoney() {
        return haveMoney;
    }

    public void setHaveMoney(Boolean haveMoney) {
        this.haveMoney = haveMoney;
    }

    public LocalDateTime getOpenScreenTime() {
        return openScreenTime;
    }

    public void setOpenScreenTime(LocalDateTime openScreenTime) {
        this.openScreenTime = openScreenTime;
    }

    public LocalDateTime getCloseScreenTime() {
        return closeScreenTime;
    }

    public void setCloseScreenTime(LocalDateTime closeScreenTime) {
        this.closeScreenTime = closeScreenTime;
    }

    public Integer getWebScreenLong() {
        return webScreenLong;
    }

    public void setWebScreenLong(Integer webScreenLong) {
        this.webScreenLong = webScreenLong;
    }

    public Integer getClientScreenLong() {
        return clientScreenLong;
    }

    public void setClientScreenLong(Integer clientScreenLong) {
        this.clientScreenLong = clientScreenLong;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getOpenGameNum() {
        return openGameNum;
    }

    public void setOpenGameNum(Integer openGameNum) {
        this.openGameNum = openGameNum;
    }

    public Integer getOpenGameTime() {
        return openGameTime;
    }

    public void setOpenGameTime(Integer openGameTime) {
        this.openGameTime = openGameTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "DayBarMonitor{" +
        "id=" + id +
        ", date=" + date +
        ", barid=" + barid +
        ", requestTime=" + requestTime +
        ", haveMoney=" + haveMoney +
        ", openScreenTime=" + openScreenTime +
        ", closeScreenTime=" + closeScreenTime +
        ", webScreenLong=" + webScreenLong +
        ", clientScreenLong=" + clientScreenLong +
        ", type=" + type +
        ", openGameNum=" + openGameNum +
        ", openGameTime=" + openGameTime +
        "}";
    }
}
