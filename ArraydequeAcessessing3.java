package com.dhanush.java;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArraydequeAcessessing3 {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(true);
		ad.add("Dhanush");
		ad.add(34.4f);
		ad.add('R');
		System.out.println(ad);
		Iterator ditr=ad.descendingIterator();
		while(ditr.hasNext()) {
			System.out.println(ditr.next());
		}
	}

}
