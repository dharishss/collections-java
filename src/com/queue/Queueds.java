package com.queue;

import java.util.PriorityQueue;

//queues :
//queue store dupliactes
//queue have index
//queue allows to store multiple null values
//queue preserve insertion order

public class Queueds 

//priority queue 
//allows duplicate ]
//do not have index
////cant store null values {null pointer exception}
//no insertion order
//do not allow hetetogenous data
//underlying ds of priority queue is priority heap
//poll //peek and element()
    


{
public static void main(String[] args) {
	PriorityQueue<Integer> ps = new PriorityQueue<Integer>();
			ps.add(1);
			ps.add(1);
			ps.add(34);
			ps.add(222);
			ps.add(2);
			System.out.println("executed");
			System.out.println(ps);
			System.out.println(ps.poll());
			System.out.println(ps);
			System.out.println(ps.peek());
			System.out.println(ps);
}
}
