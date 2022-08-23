package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TMedicalOutpatientdoctorReceiverecord;

/**
 * 接诊记录Service接口
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
public interface ITMedicalOutpatientdoctorReceiverecordService 
{
    /**
     * 查询接诊记录
     * 
     * @param opdoctorreceiverecordid 接诊记录主键
     * @return 接诊记录
     */
    public TMedicalOutpatientdoctorReceiverecord selectTMedicalOutpatientdoctorReceiverecordByOpdoctorreceiverecordid(String opdoctorreceiverecordid);

    /**
     * 查询接诊记录列表
     * 
     * @param tMedicalOutpatientdoctorReceiverecord 接诊记录
     * @return 接诊记录集合
     */
    public List<TMedicalOutpatientdoctorReceiverecord> selectTMedicalOutpatientdoctorReceiverecordList(TMedicalOutpatientdoctorReceiverecord tMedicalOutpatientdoctorReceiverecord);

    /**
     * 新增接诊记录
     * 
     * @param tMedicalOutpatientdoctorReceiverecord 接诊记录
     * @return 结果
     */
    public int insertTMedicalOutpatientdoctorReceiverecord(TMedicalOutpatientdoctorReceiverecord tMedicalOutpatientdoctorReceiverecord);

    /**
     * 修改接诊记录
     * 
     * @param tMedicalOutpatientdoctorReceiverecord 接诊记录
     * @return 结果
     */
    public int updateTMedicalOutpatientdoctorReceiverecord(TMedicalOutpatientdoctorReceiverecord tMedicalOutpatientdoctorReceiverecord);

    /**
     * 批量删除接诊记录
     * 
     * @param opdoctorreceiverecordids 需要删除的接诊记录主键集合
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorReceiverecordByOpdoctorreceiverecordids(String[] opdoctorreceiverecordids);

    /**
     * 删除接诊记录信息
     * 
     * @param opdoctorreceiverecordid 接诊记录主键
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorReceiverecordByOpdoctorreceiverecordid(String opdoctorreceiverecordid);
}
