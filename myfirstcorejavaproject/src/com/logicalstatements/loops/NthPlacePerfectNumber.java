package com.logicalstatements.loops;

import java.util.Scanner;

public class NthPlacePerfectNumber {
	
	static boolean isPerfect(int n){
		if(n<0) {
			return false;
		}
		
		int i=1;
		int sum=0;
		while(i<=n/2) {
			if(n%i==0) {
			sum=sum+i;	
			}
			i++;
		}
		if(n==sum) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		System.out.println("Enter the start range for finding perfect number : ");
//		int charan=sc.nextInt();
//		
//		System.out.println("Enter the end range for finding perfect number : ");
//		int range=sc.nextInt();
		
		//perfect number        -> 6, 28, 496, 8128
		//perfect number places -> 1   2   3    4
		
		System.out.println("Enter the number for find the given number place perfect number : ");
		int perplace=sc.nextInt();
		
		int charan=1;
		int count=0;
		while(count<perplace) {
			
			if(isPerfect(charan)) {
				count++;
				
				if(perplace==count) {
					System.out.println(perplace+" place perfect number is : "+charan);
				}
			}
			
			charan++;
		}
		

	}

}
