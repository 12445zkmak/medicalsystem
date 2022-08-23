package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TMedicalCostBillDetailMapper;
import com.ruoyi.system.domain.TMedicalCostBillDetail;
import com.ruoyi.system.service.ITMedicalCostBillDetailService;

/**
 * 患者费用明细Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
@Service
public class TMedicalCostBillDetailServiceImpl implements ITMedicalCostBillDetailService 
{
    @Autowired
    private TMedicalCostBillDetailMapper tMedicalCostBillDetailMapper;

    /**
     * 查询患者费用明细
     * 
     * @param id 患者费用明细主键
     * @return 患者费用明细
     */
    @Override
    public TMedicalCostBillDetail selectTMedicalCostBillDetailById(String id)
    {
        return tMedicalCostBillDetailMapper.selectTMedicalCostBillDetailById(id);
    }

    /**
     * 查询患者费用明细列表
     * 
     * @param tMedicalCostBillDetail 患者费用明细
     * @return 患者费用明细
     */
    @Override
    public List<TMedicalCostBillDetail> selectTMedicalCostBillDetailList(TMedicalCostBillDetail tMedicalCostBillDetail)
    {
        return tMedicalCostBillDetailMapper.selectTMedicalCostBillDetailList(tMedicalCostBillDetail);
    }

    /**
     * 新增患者费用明细
     * 
     * @param tMedicalCostBillDetail 患者费用明细
     * @return 结果
     */
    @Override
    public int insertTMedicalCostBillDetail(TMedicalCostBillDetail tMedicalCostBillDetail)
    {
        return tMedicalCostBillDetailMapper.insertTMedicalCostBillDetail(tMedicalCostBillDetail);
    }

    /**
     * 修改患者费用明细
     * 
     * @param tMedicalCostBillDetail 患者费用明细
     * @return 结果
     */
    @Override
    public int updateTMedicalCostBillDetail(TMedicalCostBillDetail tMedicalCostBillDetail)
    {
        return tMedicalCostBillDetailMapper.updateTMedicalCostBillDetail(tMedicalCostBillDetail);
    }

    /**
     * 批量删除患者费用明细
     * 
     * @param ids 需要删除的患者费用明细主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCostBillDetailByIds(String[] ids)
    {
        return tMedicalCostBillDetailMapper.deleteTMedicalCostBillDetailByIds(ids);
    }

    /**
     * 删除患者费用明细信息
     * 
     * @param id 患者费用明细主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalCostBillDetailById(String id)
    {
        return tMedicalCostBillDetailMapper.deleteTMedicalCostBillDetailById(id);
    }
}
