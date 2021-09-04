package com.simplelearn;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("enter a number 1 to 12");
		Scanner scan = new Scanner(System.in);
		int month;
		month = scan.nextInt();
		String MonthName;
		switch (month) {
		case 1:
			MonthName = "JANUARY";
			break;
		case 2:
			MonthName = "FEBUARY";
			break;
		case 3:
			MonthName = "MARCH";
			break;
		case 4:
			MonthName = "APRIL";
			break;
		case 5:
			MonthName = "MAY";
			break;
		case 6:
			MonthName = "JUNE";
			break;
		case 7:
			MonthName = "JULY";
			break;
		case 8:
			MonthName = "AUGUST";
			break;
		case 9:
			MonthName ="SEPTEMBER";
			break;
		case 10:
			MonthName ="OCTOBER";
			break;
		case 11:
			MonthName ="NOVEMBER";
			break;
		case 12:
			MonthName ="DECEMBER";
			break;
		default:
			MonthName = "invalied";
			break;
		}
		System.out.println(MonthName);
	}

}
