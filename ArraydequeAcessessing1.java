package com.dhanush.java;
import java.util.*;
public class ArraydequeAcessessing1 {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(true);
		ad.add("Dhanush");
		ad.add(34.4f);
		ad.add('R');
		System.out.println(ad);
//		for(int i=0;i<ad.size();i++) {
//			System.out.println(ad.get(i)); for loop want index value to get the elements so it wont work!!
//		}
		for( Object a: ad) {
			System.out.println(a);
		}
	}

}
