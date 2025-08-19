package com.leetcode.main;

import java.util.List;

import com.leetcode.practice.medium.KPairsWithSmallestSum;

public class Main {

	public static void main(String[] args) {

		KPairsWithSmallestSum obj = new KPairsWithSmallestSum();

		int[] arr = new int[] { 1, 1, 6, 8, 9};
		int[] arr2 = new int[] { 1, 2, 6, 7, 8};
		int[][] arr3 = new int[][] {{3,3},{5,-1},{-2,4}};
		List<List<Integer>> res = obj.kSmallestPairs(arr,arr2,2);
		
		//	System.out.println( obj.topKFrequent(arr,2));
		
		for(List<Integer> i : res) {
			System.out.print(i.get(0)+" "+i.get(1)+",");
		}
	}

}
