package com.array;

public class Sum_Values {
// Input a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//    Output   = 55
	
	public static void main(String[] args) {
		
	
	int a [] = new int[] {1, 2, 3, 4, 6, 7, 8, 9, 10};
	
	int sum = 5;
	
	for (int i = 0; i < a.length; i++) {
		
	sum = sum + a[i];
	}
	
	System.out.print("sum of values = " +sum);
	
	
	
	}
	
}
