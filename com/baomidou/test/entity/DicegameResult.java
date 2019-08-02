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
public class DicegameResult extends Model<DicegameResult> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    /**
     * 参赛人数
     */
    private Integer num;

    /**
     * 开始时间
     */
    private LocalDateTime time;

    /**
     * 游戏状态, 0 未开始 1 预赛中 2 预赛结束 3 决赛开始 4 决赛结束
     */
    private Integer status;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "DicegameResult{" +
        "id=" + id +
        ", barid=" + barid +
        ", num=" + num +
        ", time=" + time +
        ", status=" + status +
        "}";
    }
}
