package com.maps;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Nithin");
		Employee e2 = new Employee(102, "Ram");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}

}
