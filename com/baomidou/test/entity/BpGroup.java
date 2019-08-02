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
public class BpGroup extends Model<BpGroup> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private String id;

    /**
     * 分组名
     */
    @TableField("groupName")
    private String groupName;

    /**
     * 主题集合
     */
    private String themeNums;

    /**
     * 视屏地址
     */
    private String videoUrl;

    /**
     * 视屏背景
     */
    private String videoImage;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getThemeNums() {
        return themeNums;
    }

    public void setThemeNums(String themeNums) {
        this.themeNums = themeNums;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoImage() {
        return videoImage;
    }

    public void setVideoImage(String videoImage) {
        this.videoImage = videoImage;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "BpGroup{" +
        "id=" + id +
        ", groupName=" + groupName +
        ", themeNums=" + themeNums +
        ", videoUrl=" + videoUrl +
        ", videoImage=" + videoImage +
        "}";
    }
}
