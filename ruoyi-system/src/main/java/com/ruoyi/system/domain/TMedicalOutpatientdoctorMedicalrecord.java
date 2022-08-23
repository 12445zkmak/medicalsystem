package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 门诊病历对象 t_medical_outpatientdoctor_medicalrecord
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
public class TMedicalOutpatientdoctorMedicalrecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 门诊病历表id随机 */
    private String id;

    /** 门诊卡id */
    @Excel(name = "门诊卡id")
    private String outpatientid;

    /** 病历URL */
    @Excel(name = "病历URL")
    private String medicalrecordurl;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setOutpatientid(String outpatientid) 
    {
        this.outpatientid = outpatientid;
    }

    public String getOutpatientid() 
    {
        return outpatientid;
    }
    public void setMedicalrecordurl(String medicalrecordurl) 
    {
        this.medicalrecordurl = medicalrecordurl;
    }

    public String getMedicalrecordurl() 
    {
        return medicalrecordurl;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("outpatientid", getOutpatientid())
            .append("medicalrecordurl", getMedicalrecordurl())
            .toString();
    }
}
