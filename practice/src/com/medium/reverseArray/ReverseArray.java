package com.medium.reverseArray;

import java.util.Arrays;

public class ReverseArray {

	public void reverseAnArray(int[] arr) {
		
		int left=0;
		int right=arr.length-1;
		
		while(left<right) {
			int tem=arr[left];
			arr[left]=arr[right];
			arr[right]=tem;
			
			left++;
			right--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
