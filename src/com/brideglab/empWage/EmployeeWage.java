package com.brideglab.empWage;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Emplyoee Wage Computation Program");
		
		/* UC=1
		 * checking employee is present or absent
		 */
		int isPresent = 1;
		int checkAttendance =(int)Math.floor((Math.random()*10)%2);	
		System.out.println(checkAttendance);
		if(checkAttendance == isPresent) {
			System.out.println("Emplyoee is present");
		}
		else {
			System.out.println("Emplyoee is absent");
	}
}

}
