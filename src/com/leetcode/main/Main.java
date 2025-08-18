package com.leetcode.main;

import com.leetcode.practice.medium.TopKFrequentElements;

public class Main {

	public static void main(String[] args) {

		TopKFrequentElements obj = new TopKFrequentElements();

		int[] arr = new int[] { 2, 1, 3, 3, 2, 3};
		int[] arr2 = new int[] {4, 1, 2, 6, 5, 8};

		int [] result = obj.topKFrequent(arr,2);
		
		//System.out.println( obj.topKFrequent(arr,2));
		
		for(int i : result) {
			System.out.print(i+" ");
		}
	}

}
