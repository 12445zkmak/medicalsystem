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
import com.ruoyi.system.domain.TMedicalOutpatientdoctorResult;
import com.ruoyi.system.service.ITMedicalOutpatientdoctorResultService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 医生看病结果Controller
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
@RestController
@RequestMapping("/system/result")
public class TMedicalOutpatientdoctorResultController extends BaseController
{
    @Autowired
    private ITMedicalOutpatientdoctorResultService tMedicalOutpatientdoctorResultService;

    /**
     * 查询医生看病结果列表
     */
    @PreAuthorize("@ss.hasPermi('system:result:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult)
    {
        startPage();
        List<TMedicalOutpatientdoctorResult> list = tMedicalOutpatientdoctorResultService.selectTMedicalOutpatientdoctorResultList(tMedicalOutpatientdoctorResult);
        return getDataTable(list);
    }

    /**
     * 导出医生看病结果列表
     */
    @PreAuthorize("@ss.hasPermi('system:result:export')")
    @Log(title = "医生看病结果", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult)
    {
        List<TMedicalOutpatientdoctorResult> list = tMedicalOutpatientdoctorResultService.selectTMedicalOutpatientdoctorResultList(tMedicalOutpatientdoctorResult);
        ExcelUtil<TMedicalOutpatientdoctorResult> util = new ExcelUtil<TMedicalOutpatientdoctorResult>(TMedicalOutpatientdoctorResult.class);
        util.exportExcel(response, list, "医生看病结果数据");
    }

    /**
     * 获取医生看病结果详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:result:query')")
    @GetMapping(value = "/{opdoctorresultid}")
    public AjaxResult getInfo(@PathVariable("opdoctorresultid") String opdoctorresultid)
    {
        return AjaxResult.success(tMedicalOutpatientdoctorResultService.selectTMedicalOutpatientdoctorResultByOpdoctorresultid(opdoctorresultid));
    }

    /**
     * 新增医生看病结果
     */
    @PreAuthorize("@ss.hasPermi('system:result:add')")
    @Log(title = "医生看病结果", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult)
    {
        return toAjax(tMedicalOutpatientdoctorResultService.insertTMedicalOutpatientdoctorResult(tMedicalOutpatientdoctorResult));
    }

    /**
     * 修改医生看病结果
     */
    @PreAuthorize("@ss.hasPermi('system:result:edit')")
    @Log(title = "医生看病结果", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult)
    {
        return toAjax(tMedicalOutpatientdoctorResultService.updateTMedicalOutpatientdoctorResult(tMedicalOutpatientdoctorResult));
    }

    /**
     * 删除医生看病结果
     */
    @PreAuthorize("@ss.hasPermi('system:result:remove')")
    @Log(title = "医生看病结果", businessType = BusinessType.DELETE)
	@DeleteMapping("/{opdoctorresultids}")
    public AjaxResult remove(@PathVariable String[] opdoctorresultids)
    {
        return toAjax(tMedicalOutpatientdoctorResultService.deleteTMedicalOutpatientdoctorResultByOpdoctorresultids(opdoctorresultids));
    }
}
