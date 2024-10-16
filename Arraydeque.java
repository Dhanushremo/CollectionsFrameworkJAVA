package com.dhanush.java;
import java.util.*;
import java.util.Scanner;
public class Arraydeque {
	public static void main(String args[]) {
		ArrayDeque ad=new ArrayDeque();
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OBJECTS TO BE STORED!! "+ad.getClass());
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int element=sc.nextInt();
			ad.add(element);
		}
		System.out.println(ad);
		ArrayDeque ad1=new ArrayDeque();
		System.out.println("ENTER THE NUMBER OBJECTS TO BE STORED!! "+ad.getClass());
		int n1=sc.nextInt();
		for(int j=0;j<n1;j++) {
			int element1=sc.nextInt();
			ad1.add(element1);
		}
		System.out.println(ad1);
		System.out.println("addAll() will take the data from one class and add to another class");
		ad1.addAll(ad);
		System.out.println(ad1);
//		ad1.addAll(2,ad); it does not work coz,arraydeque dont have any index!!
		System.out.println(ad1);
		ad.addFirst("Dhanush");
		System.out.println(ad);
		ad.addLast("Remo");
		System.out.println(ad);
		ad.offer(100);
		System.out.println(ad);
		ad.offerFirst("CSK");
		System.out.println(ad);
		ad.offerLast("DHONI");
		System.out.println(ad);
		System.out.println("removing Head!! element!! "+ad.remove());
		System.out.println(ad);
		System.out.println("removing last element!! "+ad.removeLast());
		System.out.println(ad);
		System.out.println("removing First element!! "+ad.removeFirst());
		System.out.println(ad);
		System.out.println("peek() will give first element without removing the element in the queue!! "+ad.peek());
		System.out.println(ad);
		System.out.println("poll() will give first element with removing the element in the queue!! "+ad.poll());
		System.out.println(ad);
		System.out.println("size() will give the length of the elements!! "+ad.size());
		System.out.println(ad);
		System.out.println("element() will retrives the head element without removing in the queue!! "+ ad.element());
		System.out.println(ad);
		System.out.println("getFirst() will give the head data "+ad.getFirst());
		System.out.println(ad);
		System.out.println("getLast() will give the last data "+ad.getLast());
		System.out.println(ad);
		System.out.println("what even operations we want perform, we can do at both front/rear end only not any random locations!");}}
