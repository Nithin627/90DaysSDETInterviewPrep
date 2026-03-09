package com.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
	public static void main(String[] args) {

//		HashMap<String, String> countryCapitalMap = new HashMap<>();
//		HashMap<String, String> countryCapitalMap = new LinkedHashMap();
		TreeMap<String, String> countryCapitalMap = new TreeMap();

		countryCapitalMap.put("India", "New Delhi");
		countryCapitalMap.put("USA", "Washington DC");
		countryCapitalMap.put("UK", "London");
		countryCapitalMap.put("Australia", "Canberra");

		System.out.println("India".hashCode() % 16);
		System.out.println("USA".hashCode() % 16);
		System.out.println("UK".hashCode() % 16);

		System.out.println(countryCapitalMap.get("India"));
//		System.out.println(countryCapitalMap.get("india"));

		System.out.println(countryCapitalMap.keySet());
		System.out.println(countryCapitalMap.values());

//		traverse a map
		for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {

			System.out.println(entry.getKey() + "---->" + entry.getValue());

		}

	}

}
