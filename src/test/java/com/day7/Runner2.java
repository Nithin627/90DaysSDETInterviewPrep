package com.day7;

import java.lang.reflect.Field;

public class Runner2 {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Calculator cal = new Calculator();
		Class<Calculator> c = Calculator.class;
		Field f = c.getDeclaredField("x");
		f.setAccessible(true);

		System.out.println(f.getInt(cal));
	}

}
