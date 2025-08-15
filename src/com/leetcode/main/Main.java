package com.leetcode.main;

import com.leetcode.practice.medium.SubArraySumEqualsK;

public class Main {
	
	public static void main(String[] args) {
		
		
		SubArraySumEqualsK subArraySumEqualsK = new SubArraySumEqualsK();
		
		int [] arr = new int [] {1,2,3,2,1};
		
		System.out.println(subArraySumEqualsK.subarraySum(arr,3));
	}

}
