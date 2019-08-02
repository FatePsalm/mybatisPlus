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
public class AjaxFile extends Model<AjaxFile> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 酒吧ID
     */
    @TableField("barId")
    private String barId;

    /**
     * 文件路径
     */
    @TableField("fileUrl")
    private String fileUrl;

    /**
     * 类型 :1 excel
     */
    private Integer type;

    /**
     * 创建时间
     */
    @TableField("creationTime")
    private LocalDateTime creationTime;

    /**
     * 是否删除   0 未删除   1删除
     */
    @TableField("isDel")
    private Integer isDel;

    /**
     * 请求路径
     */
    @TableField("requestUrl")
    private String requestUrl;

    /**
     * MD5 验签
     */
    private String sign;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBarId() {
        return barId;
    }

    public void setBarId(String barId) {
        this.barId = barId;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "AjaxFile{" +
        "id=" + id +
        ", barId=" + barId +
        ", fileUrl=" + fileUrl +
        ", type=" + type +
        ", creationTime=" + creationTime +
        ", isDel=" + isDel +
        ", requestUrl=" + requestUrl +
        ", sign=" + sign +
        "}";
    }
}
