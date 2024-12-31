package com.low.palindrome;

public class Palindrome {

	public void palindrome(String str) {
		str.toUpperCase();
		String reverse=new StringBuilder(str).reverse().toString();
		
		System.out.println(reverse.equalsIgnoreCase(str)?"palindrome":"not palindrome");
	}
}
