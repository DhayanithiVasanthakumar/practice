package com.low.sumOfNumbers;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the numbers");
		Integer a=input.nextInt();
		Integer b=input.nextInt();
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(a);
		al.add(b);
		
		Optional<Integer> result=al
		.stream()
		.reduce((no1,no2)->no1+no2);
		
		System.out.println(result.get());
		
	}

}
