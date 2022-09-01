package com.brideglab.empWage;

public class EmployeeWageMain {
	public static void main(String[] args) {
		EmployeeWage employeewage = new EmployeeWage();
		Welcome();
		employeewage.toCalculateMonthlyWages();
	}
	public static void Welcome() {
		System.out.println("welcome to Emplyoee Wage Computation Problem");
	}

}
