package com.ruoyi.system.domain;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 用例对象 sys_demo
 * 
 * @author ruoyi
 * @date 2021-03-11
 */
public class SysDemo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用例id */
    private Long dmId;

    /** 用例者 */
    @Excel(name = "用例者")
    private String dmName;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setDmId(Long dmId) 
    {
        this.dmId = dmId;
    }

    public Long getDmId() 
    {
        return dmId;
    }
    public void setDmName(String dmName) 
    {
        this.dmName = dmName;
    }

    public String getDmName() 
    {
        return dmName;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("dmId", getDmId())
            .append("dmName", getDmName())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
