package com.day23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Nithin", "QA", 5000);
		Employee e2 = new Employee(102, "Ram", "HR", 9000);
		Employee e3 = new Employee(103, "Nihal", "CA", 10000);
//		System.out.println(e1);

		List<Employee> empList = new ArrayList<>();

		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(new Employee(104, "Neema", "Manager", 20000));

//		empList.forEach(e -> System.out.println(e));

//		Print all the emp which have the salar greater than 10k
		List<Employee> list = empList.stream().filter(s -> s.getSalary() > 10000).toList();
		list.forEach(e -> System.out.println(e));

//		Sort the list on basis on the salary
		List<Employee> result = empList.stream()
				.sorted((emp1, emp2) -> Double.compare(emp1.getSalary(), emp2.getSalary()))
				.collect(Collectors.toList());
		System.out.println(result);

//		.forEach(s -> System.out.println(s));

//		for (Employee e : empList) {
//			System.out.println(e);
//		}

	}

}
