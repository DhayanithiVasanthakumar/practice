package com.low.secondLargestNum;

import java.util.Arrays;

public class SecondLargestNumber {

	public void secondLargest() {
		int a[]= {1,2,3,4,5,6};
		
		Arrays.sort(a);
		int num=a[a.length-2];
		System.out.println(num);
	}
}
