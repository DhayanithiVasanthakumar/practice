package com.low.evenOrOdd;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter number");
		Integer a=in.nextInt();
		
		if(a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
