package com.linkedlist;

import java.util.LinkedList;

//have index
//can store multiple null values
//preserves insertion order
//underlying ds is doubly linked list
public class linkedlist {
 public static void main(String[] args) {
	LinkedList<Integer> ls = new LinkedList<Integer>();
	ls.add(24);
	ls.add(132);
	ls.add(null);
	ls.add(null);
	ls.add(24);
	System.out.println(ls);
	for(Integer i :ls)
	{
		System.out.println(i);
	}
	
	
}
}
