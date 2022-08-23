package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 接诊记录对象 t_medical_outpatientdoctor_receiverecord
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
public class TMedicalOutpatientdoctorReceiverecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 接诊记录表id随机 注：其实就是门诊卡医生中间表，挂号、住院患者与医生或护士绑定关系的表 */
    private String opdoctorreceiverecordid;

    /** 门诊卡id */
    @Excel(name = "门诊卡id")
    private String outpatientid;

    /** 医生id */
    @Excel(name = "医生id")
    private String doctorid;

    /** 状态1门诊2住院 */
    @Excel(name = "状态1门诊2住院")
    private Long status;

    @Excel(name="创建时间,存在换医生的情况, 取最新的那个")
    private Date createTime;

    public void setOpdoctorreceiverecordid(String opdoctorreceiverecordid) 
    {
        this.opdoctorreceiverecordid = opdoctorreceiverecordid;
    }

    public String getOpdoctorreceiverecordid() 
    {
        return opdoctorreceiverecordid;
    }
    public void setOutpatientid(String outpatientid) 
    {
        this.outpatientid = outpatientid;
    }

    public String getOutpatientid() 
    {
        return outpatientid;
    }
    public void setDoctorid(String doctorid) 
    {
        this.doctorid = doctorid;
    }

    public String getDoctorid() 
    {
        return doctorid;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("opdoctorreceiverecordid", getOpdoctorreceiverecordid())
            .append("outpatientid", getOutpatientid())
            .append("doctorid", getDoctorid())
            .append("status", getStatus())
            .append("createtime", getCreateTime())
            .toString();
    }
}
