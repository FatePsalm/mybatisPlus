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
public class Advert extends Model<Advert> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String title;

    private String staticfileid;

    private Integer type;

    private String putintype;

    private Integer putinuser;

    private LocalDateTime createtime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStaticfileid() {
        return staticfileid;
    }

    public void setStaticfileid(String staticfileid) {
        this.staticfileid = staticfileid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPutintype() {
        return putintype;
    }

    public void setPutintype(String putintype) {
        this.putintype = putintype;
    }

    public Integer getPutinuser() {
        return putinuser;
    }

    public void setPutinuser(Integer putinuser) {
        this.putinuser = putinuser;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Advert{" +
        "id=" + id +
        ", title=" + title +
        ", staticfileid=" + staticfileid +
        ", type=" + type +
        ", putintype=" + putintype +
        ", putinuser=" + putinuser +
        ", createtime=" + createtime +
        "}";
    }
}
