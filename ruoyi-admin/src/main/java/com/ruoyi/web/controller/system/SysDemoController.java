package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.system.domain.SysDemo;
import com.ruoyi.system.service.ISysDemoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用例Controller
 * 
 * @author ruoyi
 * @date 2021-03-11
 */
@Controller
@RequestMapping("/system/demo")
public class SysDemoController extends BaseController
{
    private String prefix = "system/demo";

    @Autowired
    private ISysDemoService sysDemoService;

    @Autowired
    public StringRedisTemplate stringRedisTemplate;

    @RequiresPermissions("system:demo:view")
    @GetMapping()
    public String demo()
    {
        return prefix + "/demo";
    }

    /**
     * 查询用例列表
     */
    @RequiresPermissions("system:demo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysDemo sysDemo)
    {
        startPage();
        List<SysDemo> list = sysDemoService.selectSysDemoList(sysDemo);
        return getDataTable(list);
    }

    /**
     * 导出用例列表
     */
    @RequiresPermissions("system:demo:export")
    @Log(title = "用例", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysDemo sysDemo)
    {
        List<SysDemo> list = sysDemoService.selectSysDemoList(sysDemo);
        ExcelUtil<SysDemo> util = new ExcelUtil<SysDemo>(SysDemo.class);
        return util.exportExcel(list, "demo");
    }

    /**
     * 新增用例
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存用例
     */
    @RequiresPermissions("system:demo:add")
    @Log(title = "用例", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysDemo sysDemo)
    {
        //测试redis连接是否正常
        //stringRedisTemplate.opsForValue().set("xixi", "Enhiles");
        System.out.println(stringRedisTemplate.opsForValue().get("xixi"));
        return toAjax(sysDemoService.insertSysDemo(sysDemo));
    }

    /**
     * 修改用例
     */
    @GetMapping("/edit/{dmId}")
    public String edit(@PathVariable("dmId") Long dmId, ModelMap mmap)
    {
        SysDemo sysDemo = sysDemoService.selectSysDemoById(dmId);
        mmap.put("sysDemo", sysDemo);
        return prefix + "/edit";
    }

    /**
     * 修改保存用例
     */
    @RequiresPermissions("system:demo:edit")
    @Log(title = "用例", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysDemo sysDemo)
    {
        return toAjax(sysDemoService.updateSysDemo(sysDemo));
    }

    /**
     * 删除用例
     */
    @RequiresPermissions("system:demo:remove")
    @Log(title = "用例", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysDemoService.deleteSysDemoByIds(ids));
    }
}
