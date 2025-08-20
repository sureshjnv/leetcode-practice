package com.leetcode.main;

import com.leetcode.practice.medium.MergeIntervals;

public class Main {

	public static void main(String[] args) {

		MergeIntervals obj = new MergeIntervals();

		int[] arr = new int[] { 1, 1, 6, 8, 9};
		int[] arr2 = new int[] { 1, 2, 6, 7, 8};
		int[][] arr3 = new int[][] {{1,3},{2,6},{8,10}};
		int[][] res = obj.merge(arr3);
		
		//	System.out.println( obj.topKFrequent(arr,2));
		
		for(int[] i : res) {
			System.out.print(i[0]+" "+i[1]);
		}
	}

}
