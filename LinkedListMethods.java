package com.dhanush.java;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedListMethods {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList ll=new LinkedList();
		System.out.println("Enter the No.of Objects to be stored!!");
		int n=sc.nextInt();
		System.out.println("Now Enter the "+n+" Objects!!");
		for(int i=0;i<n;i++) {
			int object=sc.nextInt();
			ll.add(object);
		}
		System.out.println(ll);
		System.out.println("add(index,object) method used insert the data at specific index");
		ll.add(1,100);
		System.out.println(ll);
		System.out.println("remove(index) method used remove the data at specific index");
		ll.remove(3);
		System.out.println(ll);
		System.out.println("get(index) method is used to get the object at specific index");
		System.out.println(ll.get(1));
		System.out.println("set(index,object) method is used to set the object at specific index");
		ll.set(1, 500);
		System.out.println(ll);
		LinkedList ll1=new LinkedList();
		ll1.add("Dhanush");
		ll1.add("Remo");
		ll1.add("Dhanush");
		ll1.add("Remo");
		ll1.add(100);
		ll1.add(1000);
		System.out.println(ll1);
		LinkedList ll2=new LinkedList();
		ll2.add("Remo");
		ll2.add("Remo");
		ll2.add("Dhanush");
		ll2.add(100);
		ll2.add(200);
		System.out.println(ll2);
		ll1.removeAll(ll2);
		System.out.println("removeAll(collection) method will compare to the LinkedList and remove duplicates");
		System.out.println(ll1);
		
	}

}
