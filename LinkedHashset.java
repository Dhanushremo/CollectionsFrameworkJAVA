package com.dhanush.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(10);
		lhs.add(true);
		lhs.add(20.0f);
		lhs.add("Dhanush");
		lhs.add("Dhanush");
		lhs.add(null);
		lhs.add(null);
		lhs.add('D');
		lhs.add('R');
		System.out.println(lhs);
		lhs.addFirst("DhanushFirst");
		System.out.println(lhs);
		lhs.addLast("DhanushLast");
		System.out.println(lhs);
		System.out.println(lhs.isEmpty());
		System.out.println(lhs.contains("Dhanush"));
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(10);
		al.add(null);
		al.add("Dhanush2327");
		al.add(null);
		al.add(12.11);
		System.out.println(al);
		lhs.addAll(al);
		System.out.println(lhs);
		System.out.println(lhs.getClass());
	}

}
