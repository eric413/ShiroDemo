package com.eric.shirodemo.entity.po;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author ben
 * @since 2019-07-22
 */
public class AuthUser extends Model<AuthUser> {

    private static final long serialVersionUID = 1L;

    /**
     * uid,用户账号,主键
     */
    private String id;

    private String mchId;

    /**
     * 是否为管理员(0.否 1.是)
     */
    private Boolean admin;

    /**
     * 用户名(nick_name)
     */
    private String username;

    /**
     * 密码(MD5(密码+盐))
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 用户真名
     */
    private String realName;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 电话号码(唯一)
     */
    private String phone;

    /**
     * 邮件地址(唯一)
     */
    private String email;

    /**
     * 性别(1.男 2.女)
     */
    private Boolean sex;

    /**
     * 账户状态(1.正常 2.冻结 3.删除 4.非法)
     */
    private Boolean status;

    /**
     * 微信openid
     */
    @TableField("openId")
    private String openId;

    /**
     * 微信用户呢称
     */
    private String nickname;

    /**
     * 手机绑定(0否1是)
     */
    private String phoneBind;

    /**
     * 微信绑定(0否1是)
     */
    private String wxBind;

    /**
     * 邮箱绑定(0否1是)
     */
    private String emailBind;

    /**
     * 是否临时密码(0否1是)
     */
    private Boolean tempPwd;

    /**
     * 临时密码创建时间
     */
    private Date tempPwdTime;

    /**
     * 实名认证(0否1是)
     */
    private String realNameAuth;

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
     * 创建来源(1.web 2.android 3.ios 4.win 5.macos 6.ubuntu)
     */
    @TableField("CREATE_WHERE")
    private Boolean createWhere;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getMchId() {
        return mchId;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }
    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getPhoneBind() {
        return phoneBind;
    }

    public void setPhoneBind(String phoneBind) {
        this.phoneBind = phoneBind;
    }
    public String getWxBind() {
        return wxBind;
    }

    public void setWxBind(String wxBind) {
        this.wxBind = wxBind;
    }
    public String getEmailBind() {
        return emailBind;
    }

    public void setEmailBind(String emailBind) {
        this.emailBind = emailBind;
    }
    public Boolean getTempPwd() {
        return tempPwd;
    }

    public void setTempPwd(Boolean tempPwd) {
        this.tempPwd = tempPwd;
    }
    public Date getTempPwdTime() {
        return tempPwdTime;
    }

    public void setTempPwdTime(Date tempPwdTime) {
        this.tempPwdTime = tempPwdTime;
    }
    public String getRealNameAuth() {
        return realNameAuth;
    }

    public void setRealNameAuth(String realNameAuth) {
        this.realNameAuth = realNameAuth;
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
    public Boolean getCreateWhere() {
        return createWhere;
    }

    public void setCreateWhere(Boolean createWhere) {
        this.createWhere = createWhere;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "AuthUser{" +
        "id=" + id +
        ", mchId=" + mchId +
        ", admin=" + admin +
        ", username=" + username +
        ", password=" + password +
        ", salt=" + salt +
        ", realName=" + realName +
        ", avatar=" + avatar +
        ", phone=" + phone +
        ", email=" + email +
        ", sex=" + sex +
        ", status=" + status +
        ", openId=" + openId +
        ", nickname=" + nickname +
        ", phoneBind=" + phoneBind +
        ", wxBind=" + wxBind +
        ", emailBind=" + emailBind +
        ", tempPwd=" + tempPwd +
        ", tempPwdTime=" + tempPwdTime +
        ", realNameAuth=" + realNameAuth +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", createWhere=" + createWhere +
        "}";
    }
}
