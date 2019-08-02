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
public class Wxpayconfig extends Model<Wxpayconfig> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String barid;

    private String mchId;

    @TableField("partnerID")
    private String partnerID;

    @TableField("partnerKey")
    private String partnerKey;

    private LocalDateTime time;

    private String remark;

    private String staticfileid;


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

    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public String getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(String partnerID) {
        this.partnerID = partnerID;
    }

    public String getPartnerKey() {
        return partnerKey;
    }

    public void setPartnerKey(String partnerKey) {
        this.partnerKey = partnerKey;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStaticfileid() {
        return staticfileid;
    }

    public void setStaticfileid(String staticfileid) {
        this.staticfileid = staticfileid;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Wxpayconfig{" +
        "id=" + id +
        ", barid=" + barid +
        ", mchId=" + mchId +
        ", partnerID=" + partnerID +
        ", partnerKey=" + partnerKey +
        ", time=" + time +
        ", remark=" + remark +
        ", staticfileid=" + staticfileid +
        "}";
    }
}
