package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class ChoosesongMsg extends Model<ChoosesongMsg> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 订单ID
     */
    @TableField("pascreenId")
    private String pascreenId;

    /**
     * 点歌信息处理
     */
    private String msg;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPascreenId() {
        return pascreenId;
    }

    public void setPascreenId(String pascreenId) {
        this.pascreenId = pascreenId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ChoosesongMsg{" +
        "id=" + id +
        ", pascreenId=" + pascreenId +
        ", msg=" + msg +
        "}";
    }
}
