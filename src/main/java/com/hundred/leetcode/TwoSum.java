package com.hundred.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static int[] twoSum(int[] arr, int target) {
		Map<Integer, Integer> keepTrack = new HashMap<Integer, Integer>(arr.length);
		int[] ans = new int[2];
		for (int i = 0; i < arr.length; ++i) {
		
			if (keepTrack.containsKey(target - arr[i])) {
				ans[0] = keepTrack.get(target - arr[i]);
				ans[1] = i;
				keepTrack.clear();
				return ans;
			}
			keepTrack.put(arr[i], i);
		
		}
		return ans;
	}

	public static void main(String[] args) {

		int[] list = new int[] { 2, 3, 4, 6 };
		int target = 5;
		
		for (int a : twoSum(list, target) ) {
			System.out.print(a + " ");
		}
	}

}
