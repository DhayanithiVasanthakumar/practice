package com.low.reverse;

public class Reverse {

	public void reverse(String input) {
		StringBuilder sb=new StringBuilder(input);
		sb.reverse();
		System.out.println(sb);
	}
}