package com.leetcode.main;

import com.leetcode.practice.medium.SearchA2Dmatrix;

public class Main {

	public static void main(String[] args) {

		SearchA2Dmatrix obj = new SearchA2Dmatrix();

		int[] arr = new int[] { 1, 1, 6, 8, 9};
		int[] arr2 = new int[] { 1, 2, 6, 7, 8,0};
		int[][] arr3 = new int[][] {{1,3},{6,9},{1,2},{1,4}};
		int[][] arr4 = new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		//int[][] res = obj.insert(arr3,new int[]{2,5});
		
		System.out.println( obj.searchMatrix(arr4,21));
		
//		for(int[] i : res) {
//			System.out.print(i[0]+" "+i[1]);
//		}
	}

}
