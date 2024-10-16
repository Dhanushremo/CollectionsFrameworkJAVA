package com.dhanush.java;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetAcessessing2 {

	public static void main(String[] args) {
		TreeSet<Character> ts=new TreeSet<Character>();
		ts.add('Z');
		ts.add('A');
		ts.add('C');
		ts.add('D');
		ts.add('D');
		ts.add('R');
		System.out.println(ts);
		System.out.println("Acessessing the elements in the TreeSet/ForWardDirection!!");
		Iterator<Character> itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
