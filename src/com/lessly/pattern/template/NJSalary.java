package com.lessly.pattern.template;


/**
 * 南京薪资结构
 */
public class NJSalary implements SalaryStructure{

    @Override
    public void issueSalary() {
        System.out.println("南京工资标准");
    }

    @Override
    public void issueInsurance() {
        System.out.println("南京社保标准");
    }

    @Override
    public void issueFund() {
        System.out.println("南京公积金标准");
    }

    @Override
    public void issueTax() {
        System.out.println("南京个人所得税标准");
    }
}
