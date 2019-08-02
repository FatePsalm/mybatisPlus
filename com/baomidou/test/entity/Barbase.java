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
public class Barbase extends Model<Barbase> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String tel;

    private String description;

    private LocalDateTime time;

    private Double longitude;

    private Double latitude;

    private String logoid;

    private Integer consumption;

    private String address;

    private String wifipwd;

    private String label;

    private String toneid;

    private String vidiourl;

    private String pushimgid;

    private String pushmsg;

    private String pushtitle;

    private Integer step;

    private String twodimension;

    private String iframehtml;

    private String pushlink;

    private String styleewmurl;

    private String city;

    private String bartype;

    private Boolean normal;

    private String firstabc;

    private String settel;

    private String remark;

    /**
     * 艺人注册连接
     */
    private String artistUrl;

    /**
     * 省份(或直辖市)
     */
    private String province;

    /**
     * 酒吧编号
     */
    private Integer number;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getLogoid() {
        return logoid;
    }

    public void setLogoid(String logoid) {
        this.logoid = logoid;
    }

    public Integer getConsumption() {
        return consumption;
    }

    public void setConsumption(Integer consumption) {
        this.consumption = consumption;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWifipwd() {
        return wifipwd;
    }

    public void setWifipwd(String wifipwd) {
        this.wifipwd = wifipwd;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getToneid() {
        return toneid;
    }

    public void setToneid(String toneid) {
        this.toneid = toneid;
    }

    public String getVidiourl() {
        return vidiourl;
    }

    public void setVidiourl(String vidiourl) {
        this.vidiourl = vidiourl;
    }

    public String getPushimgid() {
        return pushimgid;
    }

    public void setPushimgid(String pushimgid) {
        this.pushimgid = pushimgid;
    }

    public String getPushmsg() {
        return pushmsg;
    }

    public void setPushmsg(String pushmsg) {
        this.pushmsg = pushmsg;
    }

    public String getPushtitle() {
        return pushtitle;
    }

    public void setPushtitle(String pushtitle) {
        this.pushtitle = pushtitle;
    }

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public String getTwodimension() {
        return twodimension;
    }

    public void setTwodimension(String twodimension) {
        this.twodimension = twodimension;
    }

    public String getIframehtml() {
        return iframehtml;
    }

    public void setIframehtml(String iframehtml) {
        this.iframehtml = iframehtml;
    }

    public String getPushlink() {
        return pushlink;
    }

    public void setPushlink(String pushlink) {
        this.pushlink = pushlink;
    }

    public String getStyleewmurl() {
        return styleewmurl;
    }

    public void setStyleewmurl(String styleewmurl) {
        this.styleewmurl = styleewmurl;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBartype() {
        return bartype;
    }

    public void setBartype(String bartype) {
        this.bartype = bartype;
    }

    public Boolean getNormal() {
        return normal;
    }

    public void setNormal(Boolean normal) {
        this.normal = normal;
    }

    public String getFirstabc() {
        return firstabc;
    }

    public void setFirstabc(String firstabc) {
        this.firstabc = firstabc;
    }

    public String getSettel() {
        return settel;
    }

    public void setSettel(String settel) {
        this.settel = settel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getArtistUrl() {
        return artistUrl;
    }

    public void setArtistUrl(String artistUrl) {
        this.artistUrl = artistUrl;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Barbase{" +
        "id=" + id +
        ", name=" + name +
        ", tel=" + tel +
        ", description=" + description +
        ", time=" + time +
        ", longitude=" + longitude +
        ", latitude=" + latitude +
        ", logoid=" + logoid +
        ", consumption=" + consumption +
        ", address=" + address +
        ", wifipwd=" + wifipwd +
        ", label=" + label +
        ", toneid=" + toneid +
        ", vidiourl=" + vidiourl +
        ", pushimgid=" + pushimgid +
        ", pushmsg=" + pushmsg +
        ", pushtitle=" + pushtitle +
        ", step=" + step +
        ", twodimension=" + twodimension +
        ", iframehtml=" + iframehtml +
        ", pushlink=" + pushlink +
        ", styleewmurl=" + styleewmurl +
        ", city=" + city +
        ", bartype=" + bartype +
        ", normal=" + normal +
        ", firstabc=" + firstabc +
        ", settel=" + settel +
        ", remark=" + remark +
        ", artistUrl=" + artistUrl +
        ", province=" + province +
        ", number=" + number +
        "}";
    }
}
