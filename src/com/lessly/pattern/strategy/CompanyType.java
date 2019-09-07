package com.lessly.pattern.strategy;

public enum CompanyType {

    COMPANY_ZORE(new ParentCompany()),
    COMPANY_ONE(new CompanyOne()),
    COMPANY_TWO(new CompanyTwo());

    private Salary salary;

    CompanyType(Salary salary) {
        this.salary = salary;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }



}
