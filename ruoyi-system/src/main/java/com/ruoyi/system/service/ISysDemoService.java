package com.ruoyi.system.service;

import com.ruoyi.system.domain.SysDemo;

import java.util.List;

/**
 * 用例Service接口
 * 
 * @author ruoyi
 * @date 2021-03-11
 */
public interface ISysDemoService 
{
    /**
     * 查询用例
     * 
     * @param dmId 用例ID
     * @return 用例
     */
    public SysDemo selectSysDemoById(Long dmId);

    /**
     * 查询用例列表
     * 
     * @param sysDemo 用例
     * @return 用例集合
     */
    public List<SysDemo> selectSysDemoList(SysDemo sysDemo);

    /**
     * 新增用例
     * 
     * @param sysDemo 用例
     * @return 结果
     */
    public int insertSysDemo(SysDemo sysDemo);

    /**
     * 修改用例
     * 
     * @param sysDemo 用例
     * @return 结果
     */
    public int updateSysDemo(SysDemo sysDemo);

    /**
     * 批量删除用例
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysDemoByIds(String ids);

    /**
     * 删除用例信息
     * 
     * @param dmId 用例ID
     * @return 结果
     */
    public int deleteSysDemoById(Long dmId);
}
