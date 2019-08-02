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
public class Gameresult extends Model<Gameresult> {

    private static final long serialVersionUID = 1L;

    private String id;

    @TableField("userId")
    private String userId;

    private String shakegame;

    private Long result;

    private LocalDateTime savetime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getShakegame() {
        return shakegame;
    }

    public void setShakegame(String shakegame) {
        this.shakegame = shakegame;
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

    public LocalDateTime getSavetime() {
        return savetime;
    }

    public void setSavetime(LocalDateTime savetime) {
        this.savetime = savetime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Gameresult{" +
        "id=" + id +
        ", userId=" + userId +
        ", shakegame=" + shakegame +
        ", result=" + result +
        ", savetime=" + savetime +
        "}";
    }
}
