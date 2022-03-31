package com.hundred.leetcode;

import java.util.Arrays;

public class MergeSortedArray {

	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		int j = 0;
		for (int i = m; i < m + n; i++) {
			while (j < n) {
				nums1[i] = nums2[j];

				j++;
				break;
			}
		}
		Arrays.sort(nums1);
		return nums1;
	}
	 
	public static void main(String[] args) {
		int[] num1 = new int[]{1,2,3,0,0};
		int[] num2 = new int[]{2,5};
		int[] result = merge(num1, 3, num2, 2);
		
		for(int i=0;i < result.length;i++) {
			System.out.print(result[i] + " ,");
		}
	}
}
