package com.simplelearn;

public class ExplicitDataType {

	public static void main(String[] args) {
		double a = 50.03;
		System.out.println("double print:" + a);
		float f = (float) a;
		System.out.println("float print :" + f);
		long b = (long) a;
		System.out.println("print long :" + b);
		int i = (int) f;
		System.out.println("int print :" + i);

	}

}
