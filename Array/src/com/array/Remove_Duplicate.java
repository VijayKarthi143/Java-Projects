package com.array;

public class Remove_Duplicate {

		// Write a Java program to remove duplicates from array
	    // Input  a[]= {10,10,20,50,60,80,60,50}
	    // Output a[]= {10,20,50,60,80}

		public static int RemoveDuplicates(int a[], int b) {
			
			if (b==0 || b==1) {
			
				return b;
				
			}
			
			int j=0;
			
			for (int i = 0; i<b-1; i++) {
				if (a[i]!=a[b-1]) {
					
				}
			}
			return j;
			
			
		}
		 	
		
		
		public static void main(String[] args) {
			
			int a [] = new int[] {10,10,20,50,60,80,60,50};
			
			int length = a.length ;
			
			length = RemoveDuplicates(a,length);
			
			
		}
		

	}

	



