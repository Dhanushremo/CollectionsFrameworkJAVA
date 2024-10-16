package com.dhanush.java;

import java.util.*;

public class LinkedHashsetAcessessing2 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Dhanush");
		lhs.add("Remo");
		lhs.add("Dhoni");
		lhs.add("Virat");
		lhs.add("Jadeja");
		lhs.add("Raina");
		lhs.add("Chahar");
		System.out.println(lhs);
		Iterator itr=lhs.iterator();	
		while(itr.hasNext()) {
			System.out.print(itr.next()+"-> ");
		}

	}

}
