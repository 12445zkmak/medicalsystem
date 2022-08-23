package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 医院烂账记录对象 t_medical_cost_dead_bill
 * 
 * @author ruoyi
 * @date 2022-08-23
 */
public class TMedicalCostDeadBill extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 医院烂账记录表id随机 */
    private String id;

    /** 实收金额 */
    @Excel(name = "实收金额")
    private Long realnoney;

    /** 账上金额 */
    @Excel(name = "账上金额")
    private Long accountmoney;

    /** 用户账号 */
    @Excel(name = "用户账号")
    private String username;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setRealnoney(Long realnoney) 
    {
        this.realnoney = realnoney;
    }

    public Long getRealnoney() 
    {
        return realnoney;
    }
    public void setAccountmoney(Long accountmoney) 
    {
        this.accountmoney = accountmoney;
    }

    public Long getAccountmoney() 
    {
        return accountmoney;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("realnoney", getRealnoney())
            .append("accountmoney", getAccountmoney())
            .append("username", getUsername())
            .append("createtime", getCreatetime())
            .toString();
    }
}
