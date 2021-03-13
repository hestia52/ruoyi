package com.ruoyi.system.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 用例对象 sys_demo
 * 
 * @author ruoyi
 * @date 2021-03-11
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@TableName("sysdemo")
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

}
