package com.leetcode.utility;

import java.util.Arrays;

public class BinarySearch {
	
	public int search(int[] nums, int target) {
		
		Arrays.sort(nums);
		int index = -1;
		int left = 0;
		int right = nums.length - 1;
		while(left <= right) {
			 int mid = (left + right) / 2;
			if(nums[mid] == target) {
				return mid;
			}
			else if(nums[mid] < target) {
				left = mid+1;
			}
			else {
				right = mid-1;
			}
		}
		return -1	;
	}

}
