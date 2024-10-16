package com.dhanush.java;

import java.util.*;

public class ArraydequeAcessessing2 {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(true);
		ad.add("Dhanush");
		ad.add(34.4f);
		ad.add('R');
		System.out.println(ad);
		Iterator itr=ad.iterator();
		System.out.println("Forward Traversal");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
