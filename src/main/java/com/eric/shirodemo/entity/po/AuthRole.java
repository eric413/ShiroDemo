package com.eric.shirodemo.entity.po;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 角色信息表
 * </p>
 *
 * @author ben
 * @since 2019-07-22
 */
public class AuthRole extends Model<AuthRole> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    @TableId("ID")
    private String id;

    /**
     * 商户id
     */
    private String mchId;

    /**
     * 角色编码
     */
    @TableField("CODE")
    private String code;

    /**
     * 角色名称
     */
    @TableField("NAME")
    private String name;

    /**
     * 状态   1:正常、9：禁用
     */
    @TableField("STATUS")
    private Integer status;

    /**
     * 角色类别：0营业平台  1 商户公用  2商户私有
     */
    private Integer roleType;

    private String remarkInfo;

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
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }
    public String getRemarkInfo() {
        return remarkInfo;
    }

    public void setRemarkInfo(String remarkInfo) {
        this.remarkInfo = remarkInfo;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "AuthRole{" +
        "id=" + id +
        ", mchId=" + mchId +
        ", code=" + code +
        ", name=" + name +
        ", status=" + status +
        ", roleType=" + roleType +
        ", remarkInfo=" + remarkInfo +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
