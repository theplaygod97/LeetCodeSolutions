package com.hundred.leetcode;

public class SquareofSortedArray {

	//Re-visit for better sol
	
	/*
	 * public int[] sortedSquares(int[] nums) { int[] squaredNums = new
	 * int[nums.length]; int low = 0, high = nums.length - 1; int index = high;
	 * while (low <= high) { if (Math.abs(nums[low]) >= Math.abs(nums[high])) {
	 * squaredNums[index] = nums[low] * nums[low]; index--; low++; } else {
	 * squaredNums[index] = nums[high] * nums[high]; index--; high--; } } return
	 * squaredNums; }
	 */
	static int[] findsquares(int[] arr) {
		int[] sqarr = new int[arr.length];
		for (int a = 0; a < arr.length; a++) {
			sqarr[a] = arr[a] * arr[a];
		}
		return sqarr;
	}

	static int[] sortArr(int[] arr) {
		

		for (int a = 0; a < arr.length; a++) {
			for (int b = a + 1; b < arr.length; b++) {
				
				int temp;

				if (arr[a] > arr[b]) {
					temp = arr[a];
					arr[a] = arr[b];
					arr[b] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] sq = sortArr(findsquares(new int[] { 1, -2, 3, -4 }));
		for (int i = 0; i < sq.length; i++) {
			System.out.print(sq[i] + " ");
		}
	}

}
