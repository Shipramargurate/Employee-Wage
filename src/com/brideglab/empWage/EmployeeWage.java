package com.brideglab.empWage;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Emplyoee Wage Computation Program");
		
		/* 
		 * UC2
		 * Calculate Daily Employee Wage 
		 */
		int isPresent = 1;
		int wagePerHour = 20;
		int noOfWorkingHours = 8;
		int checkAttendance =(int)Math.floor((Math.random()*10)%2);	
		System.out.println(checkAttendance);
		if(checkAttendance == isPresent) {
			System.out.println("Emplyoee is present");
			System.out.println("Emplyoee Daily wage is = " +wagePerHour*noOfWorkingHours);
		}
		else {
			System.out.println("Emplyoee is absent");
	}
}

}
