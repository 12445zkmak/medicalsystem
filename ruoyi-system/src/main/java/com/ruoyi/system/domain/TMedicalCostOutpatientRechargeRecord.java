package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 门诊卡充值记录对象 t_medical_cost_outpatient_recharge_record
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
public class TMedicalCostOutpatientRechargeRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 门诊卡充值记录表id随机 */
    private String id;

    /** 金额 */
    @Excel(name = "金额")
    private Long money;

    /** 类型 1充值2取现 */
    @Excel(name = "类型 1充值2取现")
    private Long type;

    /** 门诊卡id */
    @Excel(name = "门诊卡id")
    private String outpatientid;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setMoney(Long money) 
    {
        this.money = money;
    }

    public Long getMoney() 
    {
        return money;
    }
    public void setType(Long type) 
    {
        this.type = type;
    }

    public Long getType() 
    {
        return type;
    }
    public void setOutpatientid(String outpatientid) 
    {
        this.outpatientid = outpatientid;
    }

    public String getOutpatientid() 
    {
        return outpatientid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("money", getMoney())
            .append("type", getType())
            .append("createtime", getCreatetime())
            .append("outpatientid", getOutpatientid())
            .toString();
    }
}
