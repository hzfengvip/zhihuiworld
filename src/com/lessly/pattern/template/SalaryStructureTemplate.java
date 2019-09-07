package com.lessly.pattern.template;

/**
 * 薪资结构模版 不可变
 */
public class SalaryStructureTemplate {

    private SalaryStructure salaryStructure;

    public final void  issueSalary(){

        System.out.println("获取城市薪资结构");

        //基本工资
        salaryStructure.issueSalary();

        //保险
        salaryStructure.issueInsurance();

        //公积金
        salaryStructure.issueFund();

        //个人所得税
        salaryStructure.issueTax();

    }

    public SalaryStructure getSalaryStructure() {
        return salaryStructure;
    }

    public void setSalaryStructure(SalaryStructure salaryStructure) {
        this.salaryStructure = salaryStructure;
    }
}
