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
public class Stepbarbase extends Model<Stepbarbase> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String stepid;

    private String barid;

    private Boolean completion;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStepid() {
        return stepid;
    }

    public void setStepid(String stepid) {
        this.stepid = stepid;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Boolean getCompletion() {
        return completion;
    }

    public void setCompletion(Boolean completion) {
        this.completion = completion;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Stepbarbase{" +
        "id=" + id +
        ", stepid=" + stepid +
        ", barid=" + barid +
        ", completion=" + completion +
        "}";
    }
}
