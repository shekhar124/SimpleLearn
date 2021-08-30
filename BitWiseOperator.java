package com.simplelearn;

import java.util.Scanner;

public class BitWiseOperator {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("a&b = "   +   (a&b));
		System.out.println("aorb = "   +   (a|b));

	}

}
