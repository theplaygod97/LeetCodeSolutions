package com.hundred.leetcode;

public class FindNumsWithEvenDigits {

	static boolean checkeven(int a){
		return a % 2 == 0 ? true : false;	// check if divisible by 2 
	}
	
	static int finddigits(int a) {
		if(a < 0) {
			a = a * -1; //convert into a positive num
		}
		
		
		
		int count = 0;
		if(a > 0) {
			
			while(a != 0) {
				a = a / 10; // count digits by dividing by 10
				count ++;
			}
		}
		
		return count;
	}
	
	static int howmanyevens(int[] arr) {
		int count = 0;
		for(int num : arr) {
			if(num != 0 && checkeven(finddigits(num))) {
				count ++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		System.out.println(howmanyevens(new int[] {-11,00,22,333,4444,5555}));
		System.out.println(checkeven(0));
	}

}
