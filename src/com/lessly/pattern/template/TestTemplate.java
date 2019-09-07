package com.lessly.pattern.template;

public class TestTemplate {

    public static void main(String[] args) {
        SalaryStructureTemplate template = new SalaryStructureTemplate();
        template.setSalaryStructure(new NJSalary());

        template.issueSalary();
    }
}
