package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.TMedicalOutpatientdoctorResulthandle;
import com.ruoyi.system.service.ITMedicalOutpatientdoctorResulthandleService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 医生看病治疗方案Controller
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
@RestController
@RequestMapping("/system/resulthandle")
public class TMedicalOutpatientdoctorResulthandleController extends BaseController
{
    @Autowired
    private ITMedicalOutpatientdoctorResulthandleService tMedicalOutpatientdoctorResulthandleService;

    /**
     * 查询医生看病治疗方案列表
     */
    @PreAuthorize("@ss.hasPermi('system:resulthandle:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalOutpatientdoctorResulthandle tMedicalOutpatientdoctorResulthandle)
    {
        startPage();
        List<TMedicalOutpatientdoctorResulthandle> list = tMedicalOutpatientdoctorResulthandleService.selectTMedicalOutpatientdoctorResulthandleList(tMedicalOutpatientdoctorResulthandle);
        return getDataTable(list);
    }

    /**
     * 导出医生看病治疗方案列表
     */
    @PreAuthorize("@ss.hasPermi('system:resulthandle:export')")
    @Log(title = "医生看病治疗方案", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalOutpatientdoctorResulthandle tMedicalOutpatientdoctorResulthandle)
    {
        List<TMedicalOutpatientdoctorResulthandle> list = tMedicalOutpatientdoctorResulthandleService.selectTMedicalOutpatientdoctorResulthandleList(tMedicalOutpatientdoctorResulthandle);
        ExcelUtil<TMedicalOutpatientdoctorResulthandle> util = new ExcelUtil<TMedicalOutpatientdoctorResulthandle>(TMedicalOutpatientdoctorResulthandle.class);
        util.exportExcel(response, list, "医生看病治疗方案数据");
    }

    /**
     * 获取医生看病治疗方案详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:resulthandle:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(tMedicalOutpatientdoctorResulthandleService.selectTMedicalOutpatientdoctorResulthandleById(id));
    }

    /**
     * 新增医生看病治疗方案
     */
    @PreAuthorize("@ss.hasPermi('system:resulthandle:add')")
    @Log(title = "医生看病治疗方案", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalOutpatientdoctorResulthandle tMedicalOutpatientdoctorResulthandle)
    {
        return toAjax(tMedicalOutpatientdoctorResulthandleService.insertTMedicalOutpatientdoctorResulthandle(tMedicalOutpatientdoctorResulthandle));
    }

    /**
     * 修改医生看病治疗方案
     */
    @PreAuthorize("@ss.hasPermi('system:resulthandle:edit')")
    @Log(title = "医生看病治疗方案", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalOutpatientdoctorResulthandle tMedicalOutpatientdoctorResulthandle)
    {
        return toAjax(tMedicalOutpatientdoctorResulthandleService.updateTMedicalOutpatientdoctorResulthandle(tMedicalOutpatientdoctorResulthandle));
    }

    /**
     * 删除医生看病治疗方案
     */
    @PreAuthorize("@ss.hasPermi('system:resulthandle:remove')")
    @Log(title = "医生看病治疗方案", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalOutpatientdoctorResulthandleService.deleteTMedicalOutpatientdoctorResulthandleByIds(ids));
    }
}
