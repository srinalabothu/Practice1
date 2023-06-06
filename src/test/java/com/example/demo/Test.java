package com.example.demo;

public class Test {

	public static String test() {
		return "test";
	}

	public String test(String value) {
		return value;
	}

	public static void main(String[] args) {
		System.out.println(Test.test());
		Test t = new Test();
		System.out.println(t.test("test"));
	}

}
