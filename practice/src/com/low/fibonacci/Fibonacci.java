package com.low.fibonacci;

public class Fibonacci {

	public void fibonacci(int num) {
		int a=1;
		int b=1;
		
		for(int i=2;i<=num;i++) {
			
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}
