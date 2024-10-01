package com.dhanush.java;
import java.util.*;
import java.util.Scanner;
public class Linkedlist {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("LINKEDLIST");
			LinkedList ll=new LinkedList();
			ll.add(100);
			ll.add(200);
			ll.add("Dhanush");
			ll.add("Remo");
			ll.add(100);
			ll.add(200);
			ll.add(null);
			ll.add(null);
			System.out.println(ll);
			ArrayList al=new ArrayList(ll); //it will call ArrayList Constructor which have collection parameter
			System.out.println("Using LinkedList refernce printed objects in ArrayList "+al);
			System.out.println();
			LinkedList ll2=new LinkedList();
			System.out.println("Enter the No.of Objects to be Inserted in LinkedList");
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				int object=sc.nextInt();
				ll2.add(object);
			}
			System.out.println(ll2);
			ll2.add(1,100);
			System.out.println("Adding New Object At 1st Index");
			System.out.println(ll2);
			System.out.println("Using peek() we can get the front object in LINKEDLIST & It does not remove the object from LINKEDLIST \n->"+ll2.peek());//peek() method will give the front object & it does not remove!!
			System.out.println(ll2);
			System.out.println("Using poll() we can get the front object in LINKEDLIST & It will  remove the object from LINKEDLIST \n->"+ll2.poll());//poll() method will give the front object & it will remove!!
			System.out.println(ll2);
	}

}
