package com.simplelearn;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("A");
		list.add("B");
		// System.out.println(list);
		list.addFirst("C");
		// System.out.println(list);
		list.addLast("D");
		System.out.println(list);
		list.add(3, "E");
		System.out.println(list);
		list.remove("B");
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);

	}
 
}
