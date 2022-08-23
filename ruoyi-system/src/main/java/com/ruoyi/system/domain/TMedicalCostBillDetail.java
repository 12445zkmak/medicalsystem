package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 患者费用明细对象 t_medical_cost_bill_detail
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
public class TMedicalCostBillDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 患者费用明细表id随机 */
    private String id;

    /** 账单id */
    @Excel(name = "账单id")
    private String billid;

    /** 消费事项：检查、药品.. */
    @Excel(name = "消费事项：检查、药品..")
    private String partname;

    /** 事项数量 */
    @Excel(name = "事项数量")
    private Long partnumber;

    /** 单价 */
    @Excel(name = "单价")
    private Long partmoney;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setBillid(String billid) 
    {
        this.billid = billid;
    }

    public String getBillid() 
    {
        return billid;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("billid", getBillid())
            .append("partname", getPartname())
            .append("partnumber", getPartnumber())
            .append("partmoney", getPartmoney())
            .toString();
    }
}
