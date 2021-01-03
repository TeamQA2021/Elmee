package com.array.test;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int number;
	
	int [] num = new int [5];
	Arrays.sort(num);;
	System.out.print("Please enter 5 numbers: ");
	for (int i = 0; i<num.length; i++) {
		num [i]= input.nextInt();
		System.out.print(num[i]+" ");
		
		
		
	}
	
	}

	}


