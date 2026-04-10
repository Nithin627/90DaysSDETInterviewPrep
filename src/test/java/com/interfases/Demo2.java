package com.interfases;

public class Demo2 implements Demo1, Demo3 {

	@Override
	public String method1() {

		return null;
	}

	@Override
	public int method2() {

		return 0;
	}

	@Override
	public void test(String name) {
		System.out.println(name);

	}
	public static void main(String[] args) {
		Demo2 d2=new Demo2();
		d2.test(name);
	}

}
