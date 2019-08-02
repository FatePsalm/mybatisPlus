package com.baomidou.test.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 微喵艺人配置信息
 * </p>
 *
 * @author Yanghu
 * @since 2019-08-02
 */
public class ArtistConfig extends Model<ArtistConfig> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    private String id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 当前身份
     */
    private Integer identity;

    /**
     * 创建时间
     */
    private LocalDateTime creationTime;

    /**
     * 上线/下线时间配置
     */
    private String onlineOffline;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public String getOnlineOffline() {
        return onlineOffline;
    }

    public void setOnlineOffline(String onlineOffline) {
        this.onlineOffline = onlineOffline;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ArtistConfig{" +
        "id=" + id +
        ", userId=" + userId +
        ", identity=" + identity +
        ", creationTime=" + creationTime +
        ", onlineOffline=" + onlineOffline +
        "}";
    }
}
