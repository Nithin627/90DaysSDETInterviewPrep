package com.day7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException,
			IllegalAccessException, NoSuchMethodException, InvocationTargetException {

		Calculator cal = new Calculator();
		cal.name = "Nithin";

		int sum = cal.add(2, 2);
		System.out.println(sum);
		System.out.println(cal.name);

//		Reflection
		Class<?> clazz = Calculator.class;

		Field x = clazz.getDeclaredField("x");

		x.setAccessible(true);
		System.out.println(x.getInt(cal));

		Method addMethod = clazz.getDeclaredMethod("addNum", int.class, int.class, int.class);
		addMethod.setAccessible(true);
		int result = (int) addMethod.invoke(cal, 10, 20, 30);
		System.out.println(result);
		
//		test

	}

}
