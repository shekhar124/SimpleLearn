package com.simplelearn;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		System.out.println("enter number below 200");//nested if
		Scanner scan = new Scanner(System.in);
		int i;
		i = scan.nextInt();
		if (i <= 100) {
			System.out.println("u win 100 ra");

			if (i < 120) {
				System.out.println("hey");

				if (i < 200) {
					System.out.println("50ml");
				}

			}

		}else {
			System.out.println("you entered rong no");
		}
	}
}
