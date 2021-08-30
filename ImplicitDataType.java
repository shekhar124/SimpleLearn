package com.simplelearn;

public class ImplicitDataType {
	public static void main(String [] args) {
		int a = 100;                            // int 32bit
		System.out.println("int print : "+a);
		long b =a;                                //long 64bit
		System.out.println("long print :"+b);
		float c = b;                            // float 32bitIEEE754
		System.out.println("float print :"+c);
		
	}
	

}
// implication data type is storing smaller range variable to 
// larger range is called implication data type conversion or casting
