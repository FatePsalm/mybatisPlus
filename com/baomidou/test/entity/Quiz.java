package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class Quiz extends Model<Quiz> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String description;

    private Integer state;

    private String barid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Quiz{" +
        "id=" + id +
        ", description=" + description +
        ", state=" + state +
        ", barid=" + barid +
        "}";
    }
}
