package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TMedicalOutpatientdoctorMedicalrecord;

/**
 * 门诊病历Service接口
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
public interface ITMedicalOutpatientdoctorMedicalrecordService 
{
    /**
     * 查询门诊病历
     * 
     * @param id 门诊病历主键
     * @return 门诊病历
     */
    public TMedicalOutpatientdoctorMedicalrecord selectTMedicalOutpatientdoctorMedicalrecordById(String id);

    /**
     * 查询门诊病历列表
     * 
     * @param tMedicalOutpatientdoctorMedicalrecord 门诊病历
     * @return 门诊病历集合
     */
    public List<TMedicalOutpatientdoctorMedicalrecord> selectTMedicalOutpatientdoctorMedicalrecordList(TMedicalOutpatientdoctorMedicalrecord tMedicalOutpatientdoctorMedicalrecord);

    /**
     * 新增门诊病历
     * 
     * @param tMedicalOutpatientdoctorMedicalrecord 门诊病历
     * @return 结果
     */
    public int insertTMedicalOutpatientdoctorMedicalrecord(TMedicalOutpatientdoctorMedicalrecord tMedicalOutpatientdoctorMedicalrecord);

    /**
     * 修改门诊病历
     * 
     * @param tMedicalOutpatientdoctorMedicalrecord 门诊病历
     * @return 结果
     */
    public int updateTMedicalOutpatientdoctorMedicalrecord(TMedicalOutpatientdoctorMedicalrecord tMedicalOutpatientdoctorMedicalrecord);

    /**
     * 批量删除门诊病历
     * 
     * @param ids 需要删除的门诊病历主键集合
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorMedicalrecordByIds(String[] ids);

    /**
     * 删除门诊病历信息
     * 
     * @param id 门诊病历主键
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorMedicalrecordById(String id);
}
