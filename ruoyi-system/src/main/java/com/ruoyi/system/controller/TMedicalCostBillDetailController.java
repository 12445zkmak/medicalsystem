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
import com.ruoyi.system.domain.TMedicalCostBillDetail;
import com.ruoyi.system.service.ITMedicalCostBillDetailService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 患者费用明细Controller
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
@RestController
@RequestMapping("/system/detail")
public class TMedicalCostBillDetailController extends BaseController
{
    @Autowired
    private ITMedicalCostBillDetailService tMedicalCostBillDetailService;

    /**
     * 查询患者费用明细列表
     */
    @PreAuthorize("@ss.hasPermi('system:detail:list')")
    @GetMapping("/list")
    public TableDataInfo list(TMedicalCostBillDetail tMedicalCostBillDetail)
    {
        startPage();
        List<TMedicalCostBillDetail> list = tMedicalCostBillDetailService.selectTMedicalCostBillDetailList(tMedicalCostBillDetail);
        return getDataTable(list);
    }

    /**
     * 导出患者费用明细列表
     */
    @PreAuthorize("@ss.hasPermi('system:detail:export')")
    @Log(title = "患者费用明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TMedicalCostBillDetail tMedicalCostBillDetail)
    {
        List<TMedicalCostBillDetail> list = tMedicalCostBillDetailService.selectTMedicalCostBillDetailList(tMedicalCostBillDetail);
        ExcelUtil<TMedicalCostBillDetail> util = new ExcelUtil<TMedicalCostBillDetail>(TMedicalCostBillDetail.class);
        util.exportExcel(response, list, "患者费用明细数据");
    }

    /**
     * 获取患者费用明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:detail:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return AjaxResult.success(tMedicalCostBillDetailService.selectTMedicalCostBillDetailById(id));
    }

    /**
     * 新增患者费用明细
     */
    @PreAuthorize("@ss.hasPermi('system:detail:add')")
    @Log(title = "患者费用明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TMedicalCostBillDetail tMedicalCostBillDetail)
    {
        return toAjax(tMedicalCostBillDetailService.insertTMedicalCostBillDetail(tMedicalCostBillDetail));
    }

    /**
     * 修改患者费用明细
     */
    @PreAuthorize("@ss.hasPermi('system:detail:edit')")
    @Log(title = "患者费用明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TMedicalCostBillDetail tMedicalCostBillDetail)
    {
        return toAjax(tMedicalCostBillDetailService.updateTMedicalCostBillDetail(tMedicalCostBillDetail));
    }

    /**
     * 删除患者费用明细
     */
    @PreAuthorize("@ss.hasPermi('system:detail:remove')")
    @Log(title = "患者费用明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(tMedicalCostBillDetailService.deleteTMedicalCostBillDetailByIds(ids));
    }
}
