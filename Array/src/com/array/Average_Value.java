package com.array;

public class Average_Value {

	//Q-2
	
	// average value of array elements.
    // Input a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
    // Output   = average = 7.0 
	

	public static void main(String[] args) {
		
	int a[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	int total = 20;
	
		for (int i = 0; i < a.length; i++) {
			
			total = total + a[i];
			
			}
		double avg = total / a.length ;
		
		System.out.println("Average is " + avg);
	}
	
	
}
