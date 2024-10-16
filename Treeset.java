package com.dhanush.java;

import java.util.TreeSet;
public class Treeset {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
//		ts.add("Dhanush");
//		ts.add("REMO");
//		ts.add("Dhanush");
//		ts.add("remo");
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		ts.add(70);
		ts.add(80);
		System.out.println(ts);
//		ts.addFirst(100);
//		ts.addLast(200);
		System.out.println(ts);
		TreeSet ts1=new TreeSet();
		ts1.add(1);
		ts1.add(2);
		ts1.add(3);
		ts1.add(1000);
		ts1.addAll(ts);
		System.out.println(ts1);
		System.out.println(	ts.ceiling(11));
		System.out.println(ts.floor(1000));
		System.out.println(ts.contains(80));
		System.out.println(ts.higher(9));
		System.out.println(ts.lower(80));
		System.out.println(ts.headSet(70));
		System.out.println(ts.tailSet(20));
		System.out.println(ts.tailSet(30));
		System.out.println(ts.subSet(30,70));
//		for(int i=0;i<ts1.size();i++) {
//			System.out.println(ts1.get(i)); it wont work here!1
//		}
		
	}
}
