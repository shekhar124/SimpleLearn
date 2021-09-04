package com.simplelearn;

import java.util.*;

public class HashetDemo {
	public static void main(String[] args) {
		Set<String> hashset = new HashSet<>();
		hashset.add("A");
		hashset.add("B");
		boolean r1 = hashset.add("C");
		System.out.println(r1);
		boolean r2 = hashset.add("C");
		System.out.println(r2);
		System.out.println(hashset);
//hashset contains C r not. if C has shows True. if C is not Contain Shows False.
		System.out.println("set cointains C or not : " + hashset.contains("C"));
		hashset.remove("A");
		System.out.println("after removing A:"+hashset);
		for(String item : hashset) {
			System.out.println(item);
		}
	}

}
