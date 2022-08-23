package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 医生看病治疗方案对象 t_medical_outpatientdoctor_resulthandle
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
public class TMedicalOutpatientdoctorResulthandle extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 医生看病治疗方案表id随机 */
    private String id;

    /** 消费事项：协定处方常用套餐-中成药西成药... */
    @Excel(name = "消费事项：协定处方常用套餐-中成药西成药...")
    private String partname;

    /** 事项数量 */
    @Excel(name = "事项数量")
    private Long partnumber;

    /** 单价 */
    @Excel(name = "单价")
    private Long partmoney;

    /** 医生治疗结果ID */
    @Excel(name = "医生治疗结果ID")
    private String opdoctorresultid;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setPartname(String partname) 
    {
        this.partname = partname;
    }

    public String getPartname() 
    {
        return partname;
    }
    public void setPartnumber(Long partnumber) 
    {
        this.partnumber = partnumber;
    }

    public Long getPartnumber() 
    {
        return partnumber;
    }
    public void setPartmoney(Long partmoney) 
    {
        this.partmoney = partmoney;
    }

    public Long getPartmoney() 
    {
        return partmoney;
    }
    public void setOpdoctorresultid(String opdoctorresultid) 
    {
        this.opdoctorresultid = opdoctorresultid;
    }

    public String getOpdoctorresultid() 
    {
        return opdoctorresultid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("partname", getPartname())
            .append("partnumber", getPartnumber())
            .append("partmoney", getPartmoney())
            .append("opdoctorresultid", getOpdoctorresultid())
            .toString();
    }
}
