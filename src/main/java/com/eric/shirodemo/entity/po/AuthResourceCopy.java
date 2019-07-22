package com.eric.shirodemo.entity.po;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 资源信息表(菜单,资源)
 * </p>
 *
 * @author ben
 * @since 2019-07-22
 */
public class AuthResourceCopy extends Model<AuthResourceCopy> {

    private static final long serialVersionUID = 1L;

    /**
     * 资源ID
     */
    @TableId("ID")
    private String id;

    /**
     * 资源名称
     */
    @TableField("CODE")
    private String code;

    /**
     * 资源描述
     */
    @TableField("NAME")
    private String name;

    /**
     * 父资源编码->菜单
     */
    @TableField("PARENT_ID")
    private String parentId;

    /**
     * 访问地址URL
     */
    @TableField("URI")
    private String uri;

    /**
     * 类型 1:菜单menu 2:资源element(rest-api) 
     */
    @TableField("TYPE")
    private Integer type;

    /**
     * 访问方式 GET POST PUT DELETE PATCH
     */
    @TableField("METHOD")
    private String method;

    /**
     * 图标
     */
    @TableField("ICON")
    private String icon;

    /**
     * 状态   1:正常、9：禁用
     */
    @TableField("STATUS")
    private Integer status;

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
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        return "AuthResourceCopy{" +
        "id=" + id +
        ", code=" + code +
        ", name=" + name +
        ", parentId=" + parentId +
        ", uri=" + uri +
        ", type=" + type +
        ", method=" + method +
        ", icon=" + icon +
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
