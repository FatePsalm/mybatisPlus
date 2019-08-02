package com.baomidou.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class TBarnum extends Model<TBarnum> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String barid;

    private String qrcode;

    private String benqr;

    /**
     * 游戏页面链接
     */
    @TableField("gameQrcode")
    private String gameQrcode;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public String getBenqr() {
        return benqr;
    }

    public void setBenqr(String benqr) {
        this.benqr = benqr;
    }

    public String getGameQrcode() {
        return gameQrcode;
    }

    public void setGameQrcode(String gameQrcode) {
        this.gameQrcode = gameQrcode;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TBarnum{" +
        "id=" + id +
        ", barid=" + barid +
        ", qrcode=" + qrcode +
        ", benqr=" + benqr +
        ", gameQrcode=" + gameQrcode +
        "}";
    }
}
