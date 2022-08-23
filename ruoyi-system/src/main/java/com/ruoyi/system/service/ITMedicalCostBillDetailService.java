package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TMedicalCostBillDetail;

/**
 * 患者费用明细Service接口
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
public interface ITMedicalCostBillDetailService 
{
    /**
     * 查询患者费用明细
     * 
     * @param id 患者费用明细主键
     * @return 患者费用明细
     */
    public TMedicalCostBillDetail selectTMedicalCostBillDetailById(String id);

    /**
     * 查询患者费用明细列表
     * 
     * @param tMedicalCostBillDetail 患者费用明细
     * @return 患者费用明细集合
     */
    public List<TMedicalCostBillDetail> selectTMedicalCostBillDetailList(TMedicalCostBillDetail tMedicalCostBillDetail);

    /**
     * 新增患者费用明细
     * 
     * @param tMedicalCostBillDetail 患者费用明细
     * @return 结果
     */
    public int insertTMedicalCostBillDetail(TMedicalCostBillDetail tMedicalCostBillDetail);

    /**
     * 修改患者费用明细
     * 
     * @param tMedicalCostBillDetail 患者费用明细
     * @return 结果
     */
    public int updateTMedicalCostBillDetail(TMedicalCostBillDetail tMedicalCostBillDetail);

    /**
     * 批量删除患者费用明细
     * 
     * @param ids 需要删除的患者费用明细主键集合
     * @return 结果
     */
    public int deleteTMedicalCostBillDetailByIds(String[] ids);

    /**
     * 删除患者费用明细信息
     * 
     * @param id 患者费用明细主键
     * @return 结果
     */
    public int deleteTMedicalCostBillDetailById(String id);
}
