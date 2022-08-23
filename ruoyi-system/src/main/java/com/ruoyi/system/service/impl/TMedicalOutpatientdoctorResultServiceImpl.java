package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TMedicalOutpatientdoctorResultMapper;
import com.ruoyi.system.domain.TMedicalOutpatientdoctorResult;
import com.ruoyi.system.service.ITMedicalOutpatientdoctorResultService;

/**
 * 医生看病结果Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
@Service
public class TMedicalOutpatientdoctorResultServiceImpl implements ITMedicalOutpatientdoctorResultService 
{
    @Autowired
    private TMedicalOutpatientdoctorResultMapper tMedicalOutpatientdoctorResultMapper;

    /**
     * 查询医生看病结果
     * 
     * @param opdoctorresultid 医生看病结果主键
     * @return 医生看病结果
     */
    @Override
    public TMedicalOutpatientdoctorResult selectTMedicalOutpatientdoctorResultByOpdoctorresultid(String opdoctorresultid)
    {
        return tMedicalOutpatientdoctorResultMapper.selectTMedicalOutpatientdoctorResultByOpdoctorresultid(opdoctorresultid);
    }

    /**
     * 查询医生看病结果列表
     * 
     * @param tMedicalOutpatientdoctorResult 医生看病结果
     * @return 医生看病结果
     */
    @Override
    public List<TMedicalOutpatientdoctorResult> selectTMedicalOutpatientdoctorResultList(TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult)
    {
        return tMedicalOutpatientdoctorResultMapper.selectTMedicalOutpatientdoctorResultList(tMedicalOutpatientdoctorResult);
    }

    /**
     * 新增医生看病结果
     * 
     * @param tMedicalOutpatientdoctorResult 医生看病结果
     * @return 结果
     */
    @Override
    public int insertTMedicalOutpatientdoctorResult(TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult)
    {
        return tMedicalOutpatientdoctorResultMapper.insertTMedicalOutpatientdoctorResult(tMedicalOutpatientdoctorResult);
    }

    /**
     * 修改医生看病结果
     * 
     * @param tMedicalOutpatientdoctorResult 医生看病结果
     * @return 结果
     */
    @Override
    public int updateTMedicalOutpatientdoctorResult(TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult)
    {
        return tMedicalOutpatientdoctorResultMapper.updateTMedicalOutpatientdoctorResult(tMedicalOutpatientdoctorResult);
    }

    /**
     * 批量删除医生看病结果
     * 
     * @param opdoctorresultids 需要删除的医生看病结果主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalOutpatientdoctorResultByOpdoctorresultids(String[] opdoctorresultids)
    {
        return tMedicalOutpatientdoctorResultMapper.deleteTMedicalOutpatientdoctorResultByOpdoctorresultids(opdoctorresultids);
    }

    /**
     * 删除医生看病结果信息
     * 
     * @param opdoctorresultid 医生看病结果主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalOutpatientdoctorResultByOpdoctorresultid(String opdoctorresultid)
    {
        return tMedicalOutpatientdoctorResultMapper.deleteTMedicalOutpatientdoctorResultByOpdoctorresultid(opdoctorresultid);
    }
}
