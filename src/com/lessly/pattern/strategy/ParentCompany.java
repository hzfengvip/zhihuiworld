package com.lessly.pattern.strategy;

/**
 * 总公司
 */
public class ParentCompany implements Salary{
    @Override
    public Double calSalary() {
        System.out.println("总公司的薪水计算");
        return null;
    }
}
