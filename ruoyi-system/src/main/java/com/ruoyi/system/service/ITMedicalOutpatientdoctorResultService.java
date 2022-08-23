package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TMedicalOutpatientdoctorResult;

/**
 * 医生看病结果Service接口
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
public interface ITMedicalOutpatientdoctorResultService 
{
    /**
     * 查询医生看病结果
     * 
     * @param opdoctorresultid 医生看病结果主键
     * @return 医生看病结果
     */
    public TMedicalOutpatientdoctorResult selectTMedicalOutpatientdoctorResultByOpdoctorresultid(String opdoctorresultid);

    /**
     * 查询医生看病结果列表
     * 
     * @param tMedicalOutpatientdoctorResult 医生看病结果
     * @return 医生看病结果集合
     */
    public List<TMedicalOutpatientdoctorResult> selectTMedicalOutpatientdoctorResultList(TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult);

    /**
     * 新增医生看病结果
     * 
     * @param tMedicalOutpatientdoctorResult 医生看病结果
     * @return 结果
     */
    public int insertTMedicalOutpatientdoctorResult(TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult);

    /**
     * 修改医生看病结果
     * 
     * @param tMedicalOutpatientdoctorResult 医生看病结果
     * @return 结果
     */
    public int updateTMedicalOutpatientdoctorResult(TMedicalOutpatientdoctorResult tMedicalOutpatientdoctorResult);

    /**
     * 批量删除医生看病结果
     * 
     * @param opdoctorresultids 需要删除的医生看病结果主键集合
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorResultByOpdoctorresultids(String[] opdoctorresultids);

    /**
     * 删除医生看病结果信息
     * 
     * @param opdoctorresultid 医生看病结果主键
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorResultByOpdoctorresultid(String opdoctorresultid);
}
