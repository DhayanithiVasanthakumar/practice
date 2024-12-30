package com.low.largestNum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter num");
		Integer a=in.nextInt();
		Integer b=in.nextInt();
		Integer c=in.nextInt();
		
		int[] ar= {a,b,c};
		
		OptionalInt oi=Arrays
		.stream(ar)
		.max();
		
		System.out.println(oi.getAsInt());
	}

}
