package com.dhanush.java;

import java.util.LinkedHashSet;

public class LinkedHashsetAcessessing1 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(100);
		lhs.add(1000);
		lhs.add(10000);
		lhs.add(100000);
		lhs.add(1000000);
		lhs.add(10000000);
		System.out.println(lhs);
		System.out.println("Acessessing the elements in the LinkedHashSet");
		for(Integer a:lhs) {
			System.out.print(a+"<->");
		}
		
	}

}
