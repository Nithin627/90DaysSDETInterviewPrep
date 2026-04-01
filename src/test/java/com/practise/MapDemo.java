package com.practise;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		String name = "Nithin";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		map.put('x', 2);

//		char[] nameArray = name.toCharArray();
//
//		for (char n : nameArray) {
//			
//			map.put(n,map.get(n));
//
////			if (map.containsKey(n)) {
////				map.put(n, map.get(n)+1);
////			}else {
////				map.put(n, 1);
////			}
//
//		}

		System.out.println(map);
		System.out.println(map.get('x') + 1);
	}

}
