package com.simplelearn;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		int a, b;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers 1 t0 200");

		a = scan.nextInt();
		b = scan.nextInt();
		if ((a > 100) && (b < 200)) {
			System.out.println("AND");
		}
		if ((a <=99) || (b == 0)) {
			System.out.println("OR");

		}
	}
}
