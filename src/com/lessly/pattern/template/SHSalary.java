package com.lessly.pattern.template;

/**
 * 上海薪资结构
 */
public class SHSalary implements SalaryStructure{
    @Override
    public void issueSalary() {
        System.out.println("上海工资标准");
    }

    @Override
    public void issueInsurance() {
        System.out.println("上海社保标准");
    }

    @Override
    public void issueFund() {
        System.out.println("上海公积金标准");
    }

    @Override
    public void issueTax() {
        System.out.println("上海个人所得税标准");
    }
}
