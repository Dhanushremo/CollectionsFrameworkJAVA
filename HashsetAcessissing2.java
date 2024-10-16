package com.dhanush.java;

import java.util.HashSet;

public class HashsetAcessissing2 {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Dhanush");
		hs.add("Remo");
		hs.add("Dhoni");
		hs.add("Virat");
		hs.add("Hardik");
		hs.add("Jadeja");
		System.out.println(hs);
		for(Object o:hs) {
			System.out.print(o+" ");
		}

	}

}
