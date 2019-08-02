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
public class Horsegametimes extends Model<Horsegametimes> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private Integer number;

    private LocalDateTime time;

    private Integer type;

    /**
     * 生肖单价
     */
    private Double price;

    /**
     * 生肖结果
     */
    private String result;

    /**
     * 拔河游戏胜利队伍
     */
    private String win;


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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Horsegametimes{" +
        "id=" + id +
        ", barid=" + barid +
        ", number=" + number +
        ", time=" + time +
        ", type=" + type +
        ", price=" + price +
        ", result=" + result +
        ", win=" + win +
        "}";
    }
}
