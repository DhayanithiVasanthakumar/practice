package com.low.factorial;

public class Fact {
	public void factorial(int num) {
		int fac=1;
		for(int i=1;i<=num;i++) {
			fac=fac*i;
		}
		System.out.println(fac);
	}
}
