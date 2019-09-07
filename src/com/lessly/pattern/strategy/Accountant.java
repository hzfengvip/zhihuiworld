package com.lessly.pattern.strategy;


/**
 * 财务类
 */
public class Accountant {


    /**
     * 根据公司类型获取公司薪水计算方式
     * @param companyType
     * @return
     */
    public static Salary getCurSalary(CompanyType companyType){

        return companyType.getSalary();
    }

}
