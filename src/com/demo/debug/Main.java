package com.demo.debug;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Debugging.....");
		Counter counter = new Counter();
		counter.count();
		System.out.println("We have counted " + counter.getResult());

	}

}
