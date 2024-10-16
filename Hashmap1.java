package com.dhanush.java;
import java.util.*;
public class Hashmap1 {
	public static void main(String args[]) {
		HashMap hm=new HashMap();
		hm.put(7,"DHONI");
		hm.put(18,"VIRAT");
		hm.put(45,"ROHITH");
		hm.put(17,"PANT");
		System.out.println(hm);
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Set s1=hm.keySet();
		System.out.println(s1);
		Iterator itr1=s1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		Collection c=hm.values();
		System.out.println(c);
		Iterator itr11=c.iterator();
		while(itr11.hasNext()) {
			System.out.println(itr11.next());
		}
		System.out.println("________________________________________");
		for(Object a:c) {
			System.out.println(a);
		}
		System.out.println("________________________________________");
		for(Object a1:s1) {
			System.out.println(a1);
		}
		System.out.println("________________________________________");
		for(Object a2:s) {
			System.out.println(a2);
		}
		for(int i=0;i<hm.size();i=i+4) {
			System.out.println(hm.get(i));
		}
	}
}
