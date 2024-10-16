package com.dhanush.java;
import java.util.TreeSet;
public class TreesetAcessessing1 {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Dhanush");
		ts.add("Remo");
		ts.add("Naanu");
		ts.add("DhanushRemo");
		System.out.println(ts);
		System.out.println("Acessessing the elements in the TreeSet");
		for(Object o:ts) {
			System.out.print(o+" ");
		}
	}
}
