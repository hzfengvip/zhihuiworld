package com.lessly.pattern.strategy;

public class TestStategy {

    public static void main(String[] args) {
       Accountant.getCurSalary(CompanyType.COMPANY_ONE).calSalary();
        Accountant.getCurSalary(CompanyType.COMPANY_TWO).calSalary();
        Accountant.getCurSalary(CompanyType.COMPANY_ZORE).calSalary();
    }
}
