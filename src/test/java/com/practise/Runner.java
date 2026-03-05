package com.practise;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Runner {

	public static void main(String[] args) throws Exception {
//
//		Demo1 d1 = new Demo1();
//
//		Class<?> dclass = Demo1.class;
//
//		Field name = dclass.getDeclaredField("name");
//		name.setAccessible(true);
//		System.out.println(name.get(d1));
		
//		without using new keyword
		Class<?> clazz=Demo1.class;
		Constructor<?> constructor = clazz.getDeclaredConstructor();
		Demo1 c1 = (Demo1)constructor.newInstance();
		
		Student std1=new Student.stdBuilder().setStdName("Nithin").setGender("M").stdBuild();
		System.out.println(std1);
	

		

	}

}
