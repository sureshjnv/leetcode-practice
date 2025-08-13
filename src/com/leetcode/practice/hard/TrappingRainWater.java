package com.leetcode.practice.hard;

public class TrappingRainWater {
	
	public int trapprefixArray(int [] height) {
		
		int trappedWater = 0;
		int n = height.length;
		int [] leftMax = new int[n];
		int [] rightMax = new int[n];
		
		leftMax[0] = height[0];
		rightMax[n-1] = height[n-1];
		
		for(int  i = 1; i < n ; i++) {
			leftMax[i] = Math.max(leftMax[i-1], height[i]);
		}
		
		for(int  i = n-2; i >= 0 ; i--) {
			rightMax[i] = Math.max(rightMax[i+1], height[i]);
		}
		
		for (int  i = 0; i < n;i++) {
			trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
		}
		return trappedWater;
	}
	
	public int trapTwoPointer(int [] height) {
		
		int n = height.length;
		int trappedWater = 0;
		int left = 0;
		int right = n-1;
		int leftMax = 0;
		int rightMax = 0;
		
		while(left < right) {
			leftMax = Math.max(leftMax, height[left]);
			rightMax = Math.max(rightMax, height[right]);
			
			if(leftMax < rightMax) {
				trappedWater += leftMax - height[left];
				left++;
			}
			else {
				trappedWater += rightMax - height[right];
				right--;
				
			}
		}
		
		return trappedWater;
		
	}

}
