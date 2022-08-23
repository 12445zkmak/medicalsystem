package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TMedicalOutpatientdoctorAction;

/**
 * 医生看病结果
Mapper接口
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
public interface TMedicalOutpatientdoctorActionMapper 
{
    /**
     * 查询医生看病结果

     * 
     * @param id 医生看病结果
主键
     * @return 医生看病结果

     */
    public TMedicalOutpatientdoctorAction selectTMedicalOutpatientdoctorActionById(String id);

    /**
     * 查询医生看病结果
列表
     * 
     * @param tMedicalOutpatientdoctorAction 医生看病结果

     * @return 医生看病结果
集合
     */
    public List<TMedicalOutpatientdoctorAction> selectTMedicalOutpatientdoctorActionList(TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction);

    /**
     * 新增医生看病结果

     * 
     * @param tMedicalOutpatientdoctorAction 医生看病结果

     * @return 结果
     */
    public int insertTMedicalOutpatientdoctorAction(TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction);

    /**
     * 修改医生看病结果

     * 
     * @param tMedicalOutpatientdoctorAction 医生看病结果

     * @return 结果
     */
    public int updateTMedicalOutpatientdoctorAction(TMedicalOutpatientdoctorAction tMedicalOutpatientdoctorAction);

    /**
     * 删除医生看病结果

     * 
     * @param id 医生看病结果
主键
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorActionById(String id);

    /**
     * 批量删除医生看病结果

     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTMedicalOutpatientdoctorActionByIds(String[] ids);
}
