package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 全国地级市
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class CommonDistrict extends Model<CommonDistrict> {

    private static final long serialVersionUID = 1L;

    /**
     * 常见的地区名称ID
     */
    private Long commonDistrictId;

    /**
     * 常见的地区名称
     */
    private String commonDistrictName;

    /**
     * 省州ID
     */
    private Integer provinceId;

    /**
     * 省州
     */
    private Integer provinceState;

    /**
     * 城市ID
     */
    private Long cityId;

    /**
     * 城市国家
     */
    private Integer cityState;


    public Long getCommonDistrictId() {
        return commonDistrictId;
    }

    public void setCommonDistrictId(Long commonDistrictId) {
        this.commonDistrictId = commonDistrictId;
    }

    public String getCommonDistrictName() {
        return commonDistrictName;
    }

    public void setCommonDistrictName(String commonDistrictName) {
        this.commonDistrictName = commonDistrictName;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getProvinceState() {
        return provinceState;
    }

    public void setProvinceState(Integer provinceState) {
        this.provinceState = provinceState;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Integer getCityState() {
        return cityState;
    }

    public void setCityState(Integer cityState) {
        this.cityState = cityState;
    }

    @Override
    protected Serializable pkVal() {
        return this.commonDistrictId;
    }

    @Override
    public String toString() {
        return "CommonDistrict{" +
        "commonDistrictId=" + commonDistrictId +
        ", commonDistrictName=" + commonDistrictName +
        ", provinceId=" + provinceId +
        ", provinceState=" + provinceState +
        ", cityId=" + cityId +
        ", cityState=" + cityState +
        "}";
    }
}
