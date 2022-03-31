package com.hundred.leetcode;

public class Duplicate0s {

	public static int[] duplicate0s(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				shift(arr, i + 1);
				if (i != arr.length - 1) {
					arr[i + 1] = 0;
					i++;
				}
			}
		}
		return arr;
		
	}

	public static void shift(int[] arr, int index) {
		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}

		
	}

	public static void main(String[] args) {

		int[] marr  = duplicate0s(new int[] { 1, 2, 0, 4, 5, 6, 7, 8, 9, 0 });
		for (int i = 0; i < marr.length ; i++) {
			System.out.print(marr[i] + " ,");
		}

	}

}
