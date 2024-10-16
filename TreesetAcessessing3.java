package com.dhanush.java;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetAcessessing3 {

	public TreesetAcessessing3() {
		System.out.println("HAIIIIIIIIIIIIIIIIIIIII");
	}
TreesetAcessessing3(int a){
	System.out.println("Helo Rain");
}
	public static void main(String[] args) {
		TreesetAcessessing3 ta=new TreesetAcessessing3();
		TreesetAcessessing3 ta1=new TreesetAcessessing3(2);
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(34);
		ts.add(1);
		ts.add(453);
		ts.add(3);
		ts.add(0);
		ts.add(0);
		System.out.println(ts);
		System.out.println("Acessessing the elements in the TreeSet/BackWardDirection!!");
		Iterator<Integer> itr=ts.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
