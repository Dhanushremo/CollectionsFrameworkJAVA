package com.dhanush.java;
import java.util.*;
public class Linkedlist {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20.5f);
		ll.add(45.67);
		ll.add("Dhanush!");
		ll.add(10);
		ll.add(20.5f);
		ll.add(45.67);
		ll.add("Dhanush!");
		System.out.println(ll);
		System.out.println("Methods!! in "+ll.getClass());
		ll.add(20);
		System.out.println(ll);
		ll.add(10);
		ll.peek();
		System.out.println(ll.peek());
		ll.addFirst("Remo");
		System.out.println(ll);
		ll.addLast("Naanu");
		ll.offer(20);
		ll.offerFirst("FIRST!!");
		ll.offerLast("LAST!!");
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		for(int i=0;i<ll.size();i++) {
			System.out.print(ll.get(i)+"||");
		}
		System.out.println();
		for( Object a: ll) {
			System.out.print(a+"||");
		}
		System.out.println();
		Iterator itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"||");
		}
		System.out.println();
		ListIterator ltr=ll.listIterator();
		while(ltr.hasNext()) {
			System.out.print(ltr.next()+"||");
		}
		System.out.println();
		ListIterator ltr1=ll.listIterator(ll.size());
		while(ltr1.hasPrevious()) {
			System.out.print(ltr1.previous()+"||");
		}
		System.out.println();
		Iterator ditr=ll.descendingIterator();
		while(ditr.hasNext()) {
			System.out.print(ditr.next()+" ");
		}
	}

}
