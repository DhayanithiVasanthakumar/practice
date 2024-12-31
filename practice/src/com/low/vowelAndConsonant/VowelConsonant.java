package com.low.vowelAndConsonant;

public class VowelConsonant {

	public void countVowelAndConsonant(String str) {
		int vCount=0;
		int cCount=0;
		
		String s=str.toLowerCase();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				vCount++;
			}
			else if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
				cCount++;
			}
		}
		System.out.println("Vowel :"+vCount);
		System.out.println("Consonent :"+cCount);
	}
}
