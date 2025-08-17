package com.leetcode.main;

import com.leetcode.practice.hard.LargestRectangleInHistogram;
import com.leetcode.practice.medium.DailyTemperatures;

public class Main {

	public static void main(String[] args) {

		LargestRectangleInHistogram obj = new LargestRectangleInHistogram();

		int[] arr = new int[] { 2, 1, 5, 6, 2, 3};
		int[] arr2 = new int[] {4, 1, 2, 6, 5, 8};

		//int [] result = obj.largestRectangleArea(arr);
		
		System.out.println( obj.largestRectangleArea(arr));
		
//		for(int i : result) {
//			System.out.print(i+" ");
//		}
	}

}
