package com.ruoyi.system.service.impl;


import com.ruoyi.common.core.text.Convert;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.SysDemo;
import com.ruoyi.system.mapper.SysDemoMapper;
import com.ruoyi.system.service.ISysDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用例Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-03-11
 */
@Service
public class SysDemoServiceImpl implements ISysDemoService
{
    @Autowired
    private SysDemoMapper sysDemoMapper;

    /**
     * 查询用例
     * 
     * @param dmId 用例ID
     * @return 用例
     */
    @Override
    public SysDemo selectSysDemoById(Long dmId)
    {
        return sysDemoMapper.selectSysDemoById(dmId);
    }

    /**
     * 查询用例列表
     * 
     * @param sysDemo 用例
     * @return 用例
     */
    @Override
    public List<SysDemo> selectSysDemoList(SysDemo sysDemo)
    {
        return sysDemoMapper.selectSysDemoList(sysDemo);
    }

    /**
     * 新增用例
     * 
     * @param sysDemo 用例
     * @return 结果
     */
    @Override
    public int insertSysDemo(SysDemo sysDemo)
    {
        sysDemo.setCreateTime(DateUtils.getNowDate());
        return sysDemoMapper.insertSysDemo(sysDemo);
    }

    /**
     * 修改用例
     * 
     * @param sysDemo 用例
     * @return 结果
     */
    @Override
    public int updateSysDemo(SysDemo sysDemo)
    {
        sysDemo.setUpdateTime(DateUtils.getNowDate());
        return sysDemoMapper.updateSysDemo(sysDemo);
    }

    /**
     * 删除用例对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysDemoByIds(String ids)
    {
        return sysDemoMapper.deleteSysDemoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除用例信息
     * 
     * @param dmId 用例ID
     * @return 结果
     */
    @Override
    public int deleteSysDemoById(Long dmId)
    {
        return sysDemoMapper.deleteSysDemoById(dmId);
    }
}
