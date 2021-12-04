package com.java;

import java.util.HashSet;
import java.util.Set;

public class Collection_Set {

	public static void main(String[] args) {
		Set<Integer>sc=new HashSet<Integer>();
		//add---->to add the values in the class
	sc.add(45);
	sc.add(52);
	sc.add(53);
	sc.add(54);
	sc.add(56);
		System.out.println(sc);
//		size----->to get size value of the class
		int size = sc.size();
		System.out.println(size);
		boolean contains = sc.contains(53);
		System.out.println(contains);
		Set<Integer>re=new HashSet<Integer>();
	re.add(56);
	re.add(64);
	re.add(94);
	re.add(96);
	re.add(65);
//	addall---->add two class
	//sc.addAll(re);
	System.out.println(sc);
	int size2 = sc.size();
	System.out.println(size2);
//	sc.retainAll(re);
	System.out.println(sc);
//	remove all---->remove yhe common values in the class
	sc.removeAll(re);
	System.out.println(sc);
	boolean empty = re.isEmpty();
	System.out.println(empty);
	boolean equals = sc.equals(re);
	System.out.println(equals);
	}

}
