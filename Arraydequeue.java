package com.dhanush.java;
import java.util.ArrayDeque;
import java.util.Iterator;
public class Arraydequeue {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add("Dhanush");
		ad.add(true);
		try {
			ad.add(null);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		ad.add(10);
		ad.add(20);
		ad.add(30);
		System.out.println(ad);
		System.out.println(ad.size());
		System.out.println("Getting First Element using getFirst() i.e "+ad.getFirst());
		Iterator itr=ad.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"|");
		}
		System.out.println();
		Iterator ditr=ad.descendingIterator();
		while(ditr.hasNext()) {
			System.out.print(ditr.next()+"|");
		}
		System.out.println();
		ad.addFirst(100);
		ad.addLast(200);
		System.out.println(ad);
		
		}
}
