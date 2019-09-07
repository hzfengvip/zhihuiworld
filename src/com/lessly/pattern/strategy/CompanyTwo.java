package com.lessly.pattern.strategy;


/**
 * 分公司2
 */
public class CompanyTwo implements Salary{
    @Override
    public Double calSalary() {
        System.out.println("分公司2的薪水计算");
        return null;
    }
}
