package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TMedicalOutpatientdoctorReceiverecordMapper;
import com.ruoyi.system.domain.TMedicalOutpatientdoctorReceiverecord;
import com.ruoyi.system.service.ITMedicalOutpatientdoctorReceiverecordService;

/**
 * 接诊记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
@Service
public class TMedicalOutpatientdoctorReceiverecordServiceImpl implements ITMedicalOutpatientdoctorReceiverecordService 
{
    @Autowired
    private TMedicalOutpatientdoctorReceiverecordMapper tMedicalOutpatientdoctorReceiverecordMapper;

    /**
     * 查询接诊记录
     * 
     * @param opdoctorreceiverecordid 接诊记录主键
     * @return 接诊记录
     */
    @Override
    public TMedicalOutpatientdoctorReceiverecord selectTMedicalOutpatientdoctorReceiverecordByOpdoctorreceiverecordid(String opdoctorreceiverecordid)
    {
        return tMedicalOutpatientdoctorReceiverecordMapper.selectTMedicalOutpatientdoctorReceiverecordByOpdoctorreceiverecordid(opdoctorreceiverecordid);
    }

    /**
     * 查询接诊记录列表
     * 
     * @param tMedicalOutpatientdoctorReceiverecord 接诊记录
     * @return 接诊记录
     */
    @Override
    public List<TMedicalOutpatientdoctorReceiverecord> selectTMedicalOutpatientdoctorReceiverecordList(TMedicalOutpatientdoctorReceiverecord tMedicalOutpatientdoctorReceiverecord)
    {
        return tMedicalOutpatientdoctorReceiverecordMapper.selectTMedicalOutpatientdoctorReceiverecordList(tMedicalOutpatientdoctorReceiverecord);
    }

    /**
     * 新增接诊记录
     * 
     * @param tMedicalOutpatientdoctorReceiverecord 接诊记录
     * @return 结果
     */
    @Override
    public int insertTMedicalOutpatientdoctorReceiverecord(TMedicalOutpatientdoctorReceiverecord tMedicalOutpatientdoctorReceiverecord)
    {
        return tMedicalOutpatientdoctorReceiverecordMapper.insertTMedicalOutpatientdoctorReceiverecord(tMedicalOutpatientdoctorReceiverecord);
    }

    /**
     * 修改接诊记录
     * 
     * @param tMedicalOutpatientdoctorReceiverecord 接诊记录
     * @return 结果
     */
    @Override
    public int updateTMedicalOutpatientdoctorReceiverecord(TMedicalOutpatientdoctorReceiverecord tMedicalOutpatientdoctorReceiverecord)
    {
        return tMedicalOutpatientdoctorReceiverecordMapper.updateTMedicalOutpatientdoctorReceiverecord(tMedicalOutpatientdoctorReceiverecord);
    }

    /**
     * 批量删除接诊记录
     * 
     * @param opdoctorreceiverecordids 需要删除的接诊记录主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalOutpatientdoctorReceiverecordByOpdoctorreceiverecordids(String[] opdoctorreceiverecordids)
    {
        return tMedicalOutpatientdoctorReceiverecordMapper.deleteTMedicalOutpatientdoctorReceiverecordByOpdoctorreceiverecordids(opdoctorreceiverecordids);
    }

    /**
     * 删除接诊记录信息
     * 
     * @param opdoctorreceiverecordid 接诊记录主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalOutpatientdoctorReceiverecordByOpdoctorreceiverecordid(String opdoctorreceiverecordid)
    {
        return tMedicalOutpatientdoctorReceiverecordMapper.deleteTMedicalOutpatientdoctorReceiverecordByOpdoctorreceiverecordid(opdoctorreceiverecordid);
    }
}
