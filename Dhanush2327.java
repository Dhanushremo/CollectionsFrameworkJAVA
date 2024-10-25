package com.dhanush.java;

import java.util.HashMap;
import java.util.*;
import java.util.HashSet;

public class Dhanush2327 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(07,"Dhoni");
		hm.put(18,"Virat");
		hm.put(88,"Dhanush");
		hm.put(07,"Dhoni123");
		hm.put(null,"null");
		hm.put(null,"null1");
		hm.put(null,"null11");
		hm.put(null,"null111");
		hm.put(null,"null1111");
		System.out.println("Printing the HashMap Elements!!");
		System.out.println(hm);
		Set s=hm.keySet();
		System.out.println(s);
		Iterator itr=s.iterator();
		System.out.println("Acessessing the keys in the keyset!!");
		while(itr.hasNext()) {
			System.out.print(itr.next()+"-> ");
		}
		System.out.println();
		System.out.println("_____________________________");
		for(Object o:s) {
			System.out.println(o);
		}
		System.out.println("_____________________________");
		Collection c=hm.values();
		System.out.println("Printing the Values in the HashMap!!");
		System.out.println(c);
		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(2);
		ts.add(200);
		ts.add(98729847);
		ts.add(46);
		ts.add(2);
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(true);
		hs.add(34.0f);
		hs.add(false);
		hs.add(false);
		hs.add("Dhanush");
		System.out.println(hs);
		LinkedHashSet lhs=new LinkedHashSet(hs);
		lhs.addAll(hs);
		lhs.add(hs);  
		System.out.println(lhs);
		
		System.out.println(ts);
		
		
		}

}
