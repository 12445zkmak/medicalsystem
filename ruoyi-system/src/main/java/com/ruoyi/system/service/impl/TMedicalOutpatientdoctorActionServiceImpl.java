package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TMedicalOutpatientdoctorActionMapper;
import com.ruoyi.system.domain.TMedicalOutpatientdoctorAction;
import com.ruoyi.system.service.ITMedicalOutpatientdoctorActionService;

/**
 * 医生看病结果
Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
@Service
public class TMedicalOutpatientdoctorActionServiceImpl implements ITMedicalOutpatientdoctorActionService 
{
    @Autowired
    private TMedicalOutpatientdoctorActionMapper tMedicalOutpatientdoctorActionMapper;

    /**
     * 查询医生看病结果

     * 
     * @param id 医生看病结果
主键
     * @return 医生看病结果

     */
    @Override
    public TMedicalOutpatientdoctorAction selectTMedicalOutpatientdoctorActionById(String id)
    {
        return tMedicalOutpatientdoctorActionMapper.selectTMedicalOutpatientdoctorActionById(id);
    }

    /**
     * 查询医生看病结果
列表
     * 
     * @param tMedicalOutpatientdoctorAction 医生看病结果

     * @return 医生看病结果

     */
    @Override
    public List<TMedicalOutpatientdoctorAction> selectTMedicalOutpatientdoctorActionList(TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction)
    {
        return tMedicalOutpatientdoctorActionMapper.selectTMedicalOutpatientdoctorActionList(tMedicalOutpatientdoctorAction);
    }

    /**
     * 新增医生看病结果

     * 
     * @param tMedicalOutpatientdoctorAction 医生看病结果

     * @return 结果
     */
    @Override
    public int insertTMedicalOutpatientdoctorAction(TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction)
    {
        return tMedicalOutpatientdoctorActionMapper.insertTMedicalOutpatientdoctorAction(tMedicalOutpatientdoctorAction);
    }

    /**
     * 修改医生看病结果

     * 
     * @param tMedicalOutpatientdoctorAction 医生看病结果

     * @return 结果
     */
    @Override
    public int updateTMedicalOutpatientdoctorAction(TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction)
    {
        return tMedicalOutpatientdoctorActionMapper.updateTMedicalOutpatientdoctorAction(tMedicalOutpatientdoctorAction);
    }

    /**
     * 批量删除医生看病结果

     * 
     * @param ids 需要删除的医生看病结果
主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalOutpatientdoctorActionByIds(String[] ids)
    {
        return tMedicalOutpatientdoctorActionMapper.deleteTMedicalOutpatientdoctorActionByIds(ids);
    }

    /**
     * 删除医生看病结果
信息
     * 
     * @param id 医生看病结果
主键
     * @return 结果
     */
    @Override
    public int deleteTMedicalOutpatientdoctorActionById(String id)
    {
        return tMedicalOutpatientdoctorActionMapper.deleteTMedicalOutpatientdoctorActionById(id);
    }
}
