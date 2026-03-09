package com.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {
	public static void main(String[] args) {

		HashMap<Employee, String> empHashMap = new HashMap<Employee, String>();

		Employee e1 = new Employee(101, "Nithin");
		Employee e2 = new Employee(101, "Nithin");
		Employee e3 = new Employee(102, "Ram");

		empHashMap.put(e1, "Banglore");
//		empHashMap.put(null, "pune");
		empHashMap.put(null, "Mumbai");
		empHashMap.put(e3, null);

		System.out.println(empHashMap);
		System.out.println(empHashMap.get(e1));
		System.out.println(empHashMap.get(e2));
		System.out.println(empHashMap.get(e3));

	}

}
