package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 医生看病结果对象 t_medical_outpatientdoctor_result
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
public class TMedicalOutpatientdoctorResult extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 医生看病结果表 id 随机 */
    private String opdoctorresultid;

    /** 病名称 */
    @Excel(name = "病名称")
    private String name;

    /** 描述症状 */
    @Excel(name = "描述症状")
    private String description;

    /** 门诊医生接诊记录ID */
    @Excel(name = "门诊医生接诊记录ID")
    private String opdoctorreceiverecordid;

    public void setOpdoctorresultid(String opdoctorresultid) 
    {
        this.opdoctorresultid = opdoctorresultid;
    }

    public String getOpdoctorresultid() 
    {
        return opdoctorresultid;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setOpdoctorreceiverecordid(String opdoctorreceiverecordid) 
    {
        this.opdoctorreceiverecordid = opdoctorreceiverecordid;
    }

    public String getOpdoctorreceiverecordid() 
    {
        return opdoctorreceiverecordid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("opdoctorresultid", getOpdoctorresultid())
            .append("name", getName())
            .append("description", getDescription())
            .append("remark", getRemark())
            .append("opdoctorreceiverecordid", getOpdoctorreceiverecordid())
            .toString();
    }
}
