package com.eric.shirodemo.entity.po;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 操作日志
 * </p>
 *
 * @author ben
 * @since 2019-07-22
 */
public class AuthOperationLog extends Model<AuthOperationLog> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户操作日志主键
     */
    @TableId("ID")
    private String id;

    /**
     * 日志名称
     */
    @TableField("LOG_NAME")
    private String logName;

    /**
     * 用户id
     */
    @TableField("USER_ID")
    private String userId;

    @TableField("IP")
    private String ip;

    private String nickname;

    private String name;

    /**
     * api名称
     */
    @TableField("API")
    private String api;

    /**
     * 方法名称
     */
    @TableField("METHOD")
    private String method;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField("UPDATE_TIME")
    private Date updateTime;

    /**
     * 是否执行成功(0失败1成功)
     */
    @TableField("SUCCEED")
    private Boolean succeed;

    /**
     * 具体消息备注
     */
    @TableField("MESSAGE")
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public Boolean getSucceed() {
        return succeed;
    }

    public void setSucceed(Boolean succeed) {
        this.succeed = succeed;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "AuthOperationLog{" +
        "id=" + id +
        ", logName=" + logName +
        ", userId=" + userId +
        ", ip=" + ip +
        ", nickname=" + nickname +
        ", name=" + name +
        ", api=" + api +
        ", method=" + method +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", succeed=" + succeed +
        ", message=" + message +
        "}";
    }
}
