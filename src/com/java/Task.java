package com.java;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.SortOrder;

public class Task {

	public static void main(String[] args) {
List<Object> n=new ArrayList<>();
//add---->to add the values in the list
n.add(67);
n.add(45);
n.add(56);				
n.add(54);
n.add("SRIDHAR");
n.add('a');
n.add(24.54);
System.out.println(n);
//size---->to return the size of the array
int size = n.size();
System.out.println(size);
//get---->get the values based on given index value
Object object = n.get(4);
System.out.println(object);
//set---->update or change the values
Object set = n.set(4, "father");
System.out.println(n);
//remove---->remove a value based on index
Object remove = n.remove(6);
System.out.println(n);
//index value---->return the index value based on the argument passed
int indexOf = n.indexOf("father");
System.out.println(indexOf);
boolean contains = n.contains("father");
System.out.println(contains);
//clear---->clear the entire list
//n.clear();
//System.out.println(n);
List<Integer>n1=new ArrayList<Integer>();
n1.add(45);
n1.add(54);
n1.add(43);
n1.add(62);
n1.add(65);
//n.addAll(n1);
//System.out.println(n);
//n.retainAll(n1);--->return the common values
//System.out.println(n);
//remove all---->remove the common value
n.removeAll(n1);
System.out.println(n);
Collections.sort(n1);
System.out.println(n1);
Collections.sort(n1,Collections.reverseOrder());
	System.out.println(n1);
	boolean empty = n.isEmpty();
	System.out.println(empty);
	boolean equals = n.equals(n1);
	System.out.println(equals);
	
	
	
	
	
	}

}
