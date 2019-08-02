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
public class Bartable extends Model<Bartable> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String tablename;

    private String imgurl;

    private LocalDateTime time;

    private String barid;

    private Integer tableid;

    private Boolean del;

    private Integer operatid;

    private String seattypeid;

    private Integer version;

    private LocalDateTime updatetime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getBarid() {
        return barid;
    }

    public void setBarid(String barid) {
        this.barid = barid;
    }

    public Integer getTableid() {
        return tableid;
    }

    public void setTableid(Integer tableid) {
        this.tableid = tableid;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
        this.del = del;
    }

    public Integer getOperatid() {
        return operatid;
    }

    public void setOperatid(Integer operatid) {
        this.operatid = operatid;
    }

    public String getSeattypeid() {
        return seattypeid;
    }

    public void setSeattypeid(String seattypeid) {
        this.seattypeid = seattypeid;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public LocalDateTime getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(LocalDateTime updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Bartable{" +
        "id=" + id +
        ", tablename=" + tablename +
        ", imgurl=" + imgurl +
        ", time=" + time +
        ", barid=" + barid +
        ", tableid=" + tableid +
        ", del=" + del +
        ", operatid=" + operatid +
        ", seattypeid=" + seattypeid +
        ", version=" + version +
        ", updatetime=" + updatetime +
        "}";
    }
}
