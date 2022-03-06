package com.hundred.leetcode;

public class MaxConsecutiveOnes {
	public static int findMaxConsecutiveOnes(int[] nums) {
		int longest = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
				if (longest < count) { // check if prev consecutive max is bigger
					longest = count;
				}
			} else {   // reset count if not 1
				count = 0;
			}
		}
		return longest;
	}

	public static void main(String[] args) {
	System.out.println(findMaxConsecutiveOnes(new int[]{1,1,1,0,1}));
	}

}
