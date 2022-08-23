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
import com.ruoyi.system.domain.TMedicalOutpatientdoctorReceiverecord;
import com.ruoyi.system.service.ITMedicalOutpatientdoctorReceiverecordService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 接诊记录Controller
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
@RestController
@RequestMapping("/system/receiverecord")
public class TMedicalOutpatientdoctorReceiverecordController extends BaseController
{
    @Autowired
    private ITMedicalOutpatientdoctorReceiverecordService tMedicalOutpatientdoctorReceiverecordService;

    /**
     * 查询接诊记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:receiverecord:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalOutpatientdoctorReceiverecord tMedicalOutpatientdoctorReceiverecord)
    {
        startPage();
        List<TMedicalOutpatientdoctorReceiverecord> list = tMedicalOutpatientdoctorReceiverecordService.selectTMedicalOutpatientdoctorReceiverecordList(tMedicalOutpatientdoctorReceiverecord);
        return getDataTable(list);
    }

    /**
     * 导出接诊记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:receiverecord:export')")
    @Log(title = "接诊记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalOutpatientdoctorReceiverecord tMedicalOutpatientdoctorReceiverecord)
    {
        List<TMedicalOutpatientdoctorReceiverecord> list = tMedicalOutpatientdoctorReceiverecordService.selectTMedicalOutpatientdoctorReceiverecordList(tMedicalOutpatientdoctorReceiverecord);
        ExcelUtil<TMedicalOutpatientdoctorReceiverecord> util = new ExcelUtil<TMedicalOutpatientdoctorReceiverecord>(TMedicalOutpatientdoctorReceiverecord.class);
        util.exportExcel(response, list, "接诊记录数据");
    }

    /**
     * 获取接诊记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:receiverecord:query')")
    @GetMapping(value = "/{opdoctorreceiverecordid}")
    public AjaxResult getInfo(@PathVariable("opdoctorreceiverecordid") String opdoctorreceiverecordid)
    {
        return AjaxResult.success(tMedicalOutpatientdoctorReceiverecordService.selectTMedicalOutpatientdoctorReceiverecordByOpdoctorreceiverecordid(opdoctorreceiverecordid));
    }

    /**
     * 新增接诊记录
     */
    @PreAuthorize("@ss.hasPermi('system:receiverecord:add')")
    @Log(title = "接诊记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalOutpatientdoctorReceiverecord tMedicalOutpatientdoctorReceiverecord)
    {
        return toAjax(tMedicalOutpatientdoctorReceiverecordService.insertTMedicalOutpatientdoctorReceiverecord(tMedicalOutpatientdoctorReceiverecord));
    }

    /**
     * 修改接诊记录
     */
    @PreAuthorize("@ss.hasPermi('system:receiverecord:edit')")
    @Log(title = "接诊记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalOutpatientdoctorReceiverecord tMedicalOutpatientdoctorReceiverecord)
    {
        return toAjax(tMedicalOutpatientdoctorReceiverecordService.updateTMedicalOutpatientdoctorReceiverecord(tMedicalOutpatientdoctorReceiverecord));
    }

    /**
     * 删除接诊记录
     */
    @PreAuthorize("@ss.hasPermi('system:receiverecord:remove')")
    @Log(title = "接诊记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{opdoctorreceiverecordids}")
    public AjaxResult remove(@PathVariable String[] opdoctorreceiverecordids)
    {
        return toAjax(tMedicalOutpatientdoctorReceiverecordService.deleteTMedicalOutpatientdoctorReceiverecordByOpdoctorreceiverecordids(opdoctorreceiverecordids));
    }
}
