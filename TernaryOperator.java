package com.simplelearn;

public class TernaryOperator {

	public static void main(String[] args) {
		int a = 1;
		int b = 3;
		int result;
		// result = a<b?a:b; // ternary operator if else statement same like
		if (a < b) {
			result = a;
		} else {              // ternary operator code is equal to if else code
			result = b;
		}
		System.out.println(result);
	}

}
