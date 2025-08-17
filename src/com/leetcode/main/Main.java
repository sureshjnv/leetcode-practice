package com.leetcode.main;

import com.leetcode.practice.medium.DailyTemperatures;

public class Main {

	public static void main(String[] args) {

		DailyTemperatures obj = new DailyTemperatures();

		int[] arr = new int[] { 1, 3, 4, 2, 5, 8, 6};
		int[] arr2 = new int[] {4, 1, 2, 6, 5, 8};

		int [] result = obj.dailyTemperatures(arr);
		
		for(int i : result) {
			System.out.print(i+" ");
		}
	}

}
