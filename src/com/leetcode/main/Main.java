package com.leetcode.main;

import com.leetcode.practice.medium.FindElementInRotatedSA;

public class Main {

	public static void main(String[] args) {

		FindElementInRotatedSA obj = new FindElementInRotatedSA();

		int[] arr = new int[] { 1, 1, 6, 8, 9};
		int[] arr2 = new int[] { 1, 2, 6, 7, 8,-1,0};
		int[][] arr3 = new int[][] {{1,3},{6,9},{1,2},{1,4}};
		//int[][] res = obj.insert(arr3,new int[]{2,5});
		
		System.out.println( obj.search(arr2,-1));
		
//		for(int[] i : res) {
//			System.out.print(i[0]+" "+i[1]);
//		}
	}

}
