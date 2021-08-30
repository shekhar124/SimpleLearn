package com.simplelearn;

public class NonPrimitiveDataType {

	public static void main(String[] args) { // we can print string in two methods

		String A = "test";
		System.out.println("string is :" + A);

		String B = new String("test");
		System.out.println("another string is :" + B);
		
		int arr[];
		arr = new int[3];
		arr [0]=1;
		arr [1]=2;
		arr[2]=3;
		System.out.println(arr);  // it will show memory location of array
		System.out.println(arr[2]); // if we enter index number shows the result
	}

}
