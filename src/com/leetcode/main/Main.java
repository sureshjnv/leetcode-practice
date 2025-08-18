package com.leetcode.main;

import com.leetcode.practice.medium.KClosestPointstoOrigin;
import com.leetcode.practice.medium.TopKFrequentElements;

public class Main {

	public static void main(String[] args) {

		KClosestPointstoOrigin obj = new KClosestPointstoOrigin();

		int[] arr = new int[] { 2, 1, 3, 3, 2, 3};
		int[] arr2 = new int[] {4, 1, 2, 6, 5, 8};
		int[][] arr3 = new int[][] {{3,3},{5,-1},{-2,4}};
		//int [] result = obj.topKFrequent(arr,2);
		
		int [][] result1 = obj.kClosest(arr3, 2);
		
		//	System.out.println( obj.topKFrequent(arr,2));
		
		for(int[] i : result1) {
			System.out.print(i[0]+" "+i[1]+",");
		}
	}

}
