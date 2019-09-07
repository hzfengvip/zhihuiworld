package com.lessly.pattern.strategy;


/**
 * 分公司1
 */
public class CompanyOne implements Salary{
    @Override
    public Double calSalary() {
        System.out.println("分公司1的薪水计算");
        return null;
    }
}
