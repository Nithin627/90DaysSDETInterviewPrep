package com.maps;

import java.util.HashMap;
import java.util.Map;

public class ReverseMap {

	// Method to reverse a given map
	public static <K, V> Map<V, K> reverse(Map<K, V> original) {
		Map<V, K> reversed = new HashMap<>();
		for (Map.Entry<K, V> entry : original.entrySet()) {
			reversed.put(entry.getValue(), entry.getKey());
		}
		return reversed;
	}

	// Example usage
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);

		Map<Integer, String> reversed = reverse(map);
		System.out.println(reversed); // Output: {1=One, 2=Two, 3=Three}
	}

}
