package com.lessly.pattern.template;


/**
 * 北京薪资结构
 */
public class BJSalary implements SalaryStructure{

    @Override
    public void issueSalary() {
        System.out.println("北京工资标准");
    }

    @Override
    public void issueInsurance() {
        System.out.println("北京社保标准");
    }

    @Override
    public void issueFund() {
        System.out.println("北京公积金标准");
    }

    @Override
    public void issueTax() {
        System.out.println("北京个人所得税标准");
    }
}
