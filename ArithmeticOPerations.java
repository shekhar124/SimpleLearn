package com.simplelearn;

public class ArithmeticOPerations {
	public static void main(String[] args) {
		int result = 1 + 2;
		System.out.println("1+2=" + result);
		int original_result = result;
		result = result - 1;
		System.out.println(original_result + "-1=" + result); //2
		int original_result1 = result;
		result = result * 2;
		System.out.println(original_result1 + "x2=" + result);//4
		int original_result2 = result;
		result = result + 21;
		System.out.println(original_result2 + "+21=" + result);//25
		int original_result3=result;
		result = result /2;
		System.out.println(original_result3 +"/2="+result);//12
		int original_result4=result;
		result = result /6;
		System.out.println(original_result4 +"/6="+result);//2
		int original_result5=result;
		result = result +23;
		System.out.println(original_result5 +"+23="+result);//25


	}

}
