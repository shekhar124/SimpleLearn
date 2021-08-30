package com.simplelearn;

import java.util.Scanner;

public class ComparisionOperators {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two  values");
		int value1, value2;

		value1 = scan.nextInt();
		value2 = scan.nextInt();
		 
		scan.close();
		
		if (value1 == value2)
			System.out.println("two values are equal1");
		if (value1 != value2)
			System.out.println("two values are not equal");
		if (value1 < value2)
			System.out.println("value2 is greater than value 1");
		if (value1 > value2)
			System.out.println("value1 is greater than value 2");
		
	}

}
