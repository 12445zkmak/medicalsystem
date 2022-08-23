package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 医生看病结果
对象 t_medical_outpatientdoctor_action
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
public class TMedicalOutpatientdoctorAction extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 医生看病流程表id随机 */
    private String id;

    /** 消费事项：检查CT、检验血常规... */
    @Excel(name = "消费事项：检查CT、检验血常规...")
    private String partname;

    /** 事项数量 */
    @Excel(name = "事项数量")
    private Long partnumber;

    /** 1门诊患者2住院患者 */
    @Excel(name = "1门诊患者2住院患者")
    private Long persontype;

    /** 单价 */
    @Excel(name = "单价")
    private Long partmoney;

    /** 1检查2检验3处置 */
    @Excel(name = "1检查2检验3处置")
    private Long type;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String opdoctorreceiverecordid;

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
    public void setPersontype(Long persontype) 
    {
        this.persontype = persontype;
    }

    public Long getPersontype() 
    {
        return persontype;
    }
    public void setPartmoney(Long partmoney) 
    {
        this.partmoney = partmoney;
    }

    public Long getPartmoney() 
    {
        return partmoney;
    }
    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
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
            .append("id", getId())
            .append("partname", getPartname())
            .append("partnumber", getPartnumber())
            .append("persontype", getPersontype())
            .append("partmoney", getPartmoney())
            .append("type", getType())
            .append("opdoctorreceiverecordid", getOpdoctorreceiverecordid())
            .toString();
    }
}
