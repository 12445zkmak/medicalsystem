package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TMedicalOutpatientdoctorMedicalrecord;

/**
 * 门诊病历Mapper接口
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
public interface TMedicalOutpatientdoctorMedicalrecordMapper 
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
     * 删除门诊病历
     * 
     * @param id 门诊病历主键
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorMedicalrecordById(String id);

    /**
     * 批量删除门诊病历
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorMedicalrecordByIds(String[] ids);
}
