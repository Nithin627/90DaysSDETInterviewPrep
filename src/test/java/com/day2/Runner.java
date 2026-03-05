package com.day2;

public class Runner {

	public static void main(String[] args) {
//		Employee e1=new Employee("Nithin", "123", "EY", 2000, "CTS");
//		System.out.println(e1);
		
		Employee e1=new Employee.Builder().setEmpName("Nithin").setCompanyName("CTS").setEmpId("1234").build();
		System.out.println(e1);
		
		
		
	}

}
