package com.eric.shirodemo.entity.po;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 登录注册登出记录
 * </p>
 *
 * @author ben
 * @since 2019-07-22
 */
public class AuthAccountLog extends Model<AuthAccountLog> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户账户操作日志主键
     */
    @TableId("ID")
    private String id;

    /**
     * 日志名称(login,register,logout)
     */
    @TableField("LOG_NAME")
    private String logName;

    /**
     * 用户id
     */
    @TableField("USER_ID")
    private String userId;

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
     * 具体消息
     */
    @TableField("MESSAGE")
    private String message;

    /**
     * 登录ip
     */
    @TableField("IP")
    private String ip;

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
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "AuthAccountLog{" +
        "id=" + id +
        ", logName=" + logName +
        ", userId=" + userId +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", succeed=" + succeed +
        ", message=" + message +
        ", ip=" + ip +
        "}";
    }
}
