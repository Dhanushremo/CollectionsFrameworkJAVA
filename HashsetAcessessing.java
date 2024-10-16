package com.dhanush.java;
import java.util.*;
import java.util.HashSet;

public class HashsetAcessessing {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(10);
		hs.add(20);
		hs.add(100);
		hs.add(200);
		hs.add(3);
		System.out.println(hs);
		Iterator itr=hs.iterator();
		System.out.println("Acessessing the elments in the hastable");
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
