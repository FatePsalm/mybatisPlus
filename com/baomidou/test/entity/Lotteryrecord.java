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
public class Lotteryrecord extends Model<Lotteryrecord> {

    private static final long serialVersionUID = 1L;

    private String rid;

    private String barid;

    private Integer round;

    private LocalDateTime time;


    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    protected Serializable pkVal() {
        return this.rid;
    }

    @Override
    public String toString() {
        return "Lotteryrecord{" +
        "rid=" + rid +
        ", barid=" + barid +
        ", round=" + round +
        ", time=" + time +
        "}";
    }
}
