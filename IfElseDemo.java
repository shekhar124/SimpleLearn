package com.simplelearn;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		System.out.println("Please Enter Your Marks to find Grade+\n_____________________");
		Scanner scan = new Scanner(System.in);
		int score;
		score = scan.nextInt();
		if (score<=100 && score >=90) {
			System.out.println("A+");
		}
		else if (score<=90 && score >=80) {
			System.out.println("A");
		}
		else if (score<=80 && score >=70) {
			System.out.println("B+");
		}
		else if (score<=70 && score >=50) {
			System.out.println("B");
		}
		else if (score<=50 && score >=40) {
			System.out.println("C+");
		}
		else if (score<=40 && score >=30) {
			System.out.println("C");
		}
		
		else {
			System.out.println("f");
		}


	}

}
