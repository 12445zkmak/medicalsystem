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
import com.ruoyi.system.domain.TMedicalOutpatientdoctorMedicalrecord;
import com.ruoyi.system.service.ITMedicalOutpatientdoctorMedicalrecordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 门诊病历Controller
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
@RestController
@RequestMapping("/system/medicalrecord")
public class TMedicalOutpatientdoctorMedicalrecordController extends BaseController
{
    @Autowired
    private ITMedicalOutpatientdoctorMedicalrecordService tMedicalOutpatientdoctorMedicalrecordService;

    /**
     * 查询门诊病历列表
     */
    @PreAuthorize("@ss.hasPermi('system:medicalrecord:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalOutpatientdoctorMedicalrecord tMedicalOutpatientdoctorMedicalrecord)
    {
        startPage();
        List<TMedicalOutpatientdoctorMedicalrecord> list = tMedicalOutpatientdoctorMedicalrecordService.selectTMedicalOutpatientdoctorMedicalrecordList(tMedicalOutpatientdoctorMedicalrecord);
        return getDataTable(list);
    }

    /**
     * 导出门诊病历列表
     */
    @PreAuthorize("@ss.hasPermi('system:medicalrecord:export')")
    @Log(title = "门诊病历", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalOutpatientdoctorMedicalrecord tMedicalOutpatientdoctorMedicalrecord)
    {
        List<TMedicalOutpatientdoctorMedicalrecord> list = tMedicalOutpatientdoctorMedicalrecordService.selectTMedicalOutpatientdoctorMedicalrecordList(tMedicalOutpatientdoctorMedicalrecord);
        ExcelUtil<TMedicalOutpatientdoctorMedicalrecord> util = new ExcelUtil<TMedicalOutpatientdoctorMedicalrecord>(TMedicalOutpatientdoctorMedicalrecord.class);
        util.exportExcel(response, list, "门诊病历数据");
    }

    /**
     * 获取门诊病历详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:medicalrecord:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(tMedicalOutpatientdoctorMedicalrecordService.selectTMedicalOutpatientdoctorMedicalrecordById(id));
    }

    /**
     * 新增门诊病历
     */
    @PreAuthorize("@ss.hasPermi('system:medicalrecord:add')")
    @Log(title = "门诊病历", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalOutpatientdoctorMedicalrecord tMedicalOutpatientdoctorMedicalrecord)
    {
        return toAjax(tMedicalOutpatientdoctorMedicalrecordService.insertTMedicalOutpatientdoctorMedicalrecord(tMedicalOutpatientdoctorMedicalrecord));
    }

    /**
     * 修改门诊病历
     */
    @PreAuthorize("@ss.hasPermi('system:medicalrecord:edit')")
    @Log(title = "门诊病历", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalOutpatientdoctorMedicalrecord tMedicalOutpatientdoctorMedicalrecord)
    {
        return toAjax(tMedicalOutpatientdoctorMedicalrecordService.updateTMedicalOutpatientdoctorMedicalrecord(tMedicalOutpatientdoctorMedicalrecord));
    }

    /**
     * 删除门诊病历
     */
    @PreAuthorize("@ss.hasPermi('system:medicalrecord:remove')")
    @Log(title = "门诊病历", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalOutpatientdoctorMedicalrecordService.deleteTMedicalOutpatientdoctorMedicalrecordByIds(ids));
    }
}
