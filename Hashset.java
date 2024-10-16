package com.dhanush.java;

import java.util.ArrayDeque;
import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(10);
		hs.add(20);
		hs.add(33);
		hs.add(1);
		hs.add(null);
		hs.add(69);
		hs.add(1234);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
//		hs.clear();
//		System.out.println(hs.isEmpty());
//		System.out.println(hs);
		HashSet<Integer> hs1=new HashSet<Integer>();
		hs1.add(10);
		hs1.add(10);
		hs1.add(20);
		hs1.add(33);
		hs1.add(1);
		hs1.add(null);
		hs1.add(69);
		hs1.add(100);
		hs1.add(67);
		System.out.println(hs1);
		hs1.addAll(hs);
		System.out.println(hs);
		System.out.println(hs1);
	}

}
