package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 患者费用账单对象 t_medical_cost_bill
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
public class TMedicalCostBill extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 患者费用账单表id随机 */
    private String id;

    /** 门诊卡id */
    @Excel(name = "门诊卡id")
    private String outpatientid;

    /** 金额 */
    @Excel(name = "金额")
    private Long money;

    @Excel(name = "创建时间")
    private Date createTime;

    @Override
    public Date getCreateTime() {
        return createTime;
    }

    @Override
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

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
    public void setMoney(Long money) 
    {
        this.money = money;
    }

    public Long getMoney() 
    {
        return money;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("outpatientid", getOutpatientid())
            .append("money", getMoney())
            .append("createtime", getCreateTime())
            .toString();
    }
}
