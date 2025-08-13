package com.leetcode.practice.medium;

public class ShortestUnsortedSubarray {
	
	public int findUnsortedSubarray(int[] nums) {
		
		int n = nums.length;
		int left = 0;
		int right = n-1;
		
		
		while(left < n-1 && nums[left] <= nums[left+1]) left++;
		while(right >0 && nums[right-1] <= nums[right]) right--;
		
		if(left == n-1)
			return 0;
		
		int wMin = Integer.MAX_VALUE;
		int wMax = Integer.MIN_VALUE;
		
		for(int i = left; i <= right; i++) {
			wMin = Math.min(wMin, nums[i]);
			wMax = Math.max(wMax, nums[i]);
		}
		
		while(left > 0 && nums[left - 1] > wMin) left--;
		while(right < n-1 && nums[right+1] < wMax ) right++;
		
		
		return right - left + 1;
	}

}
