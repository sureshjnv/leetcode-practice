package com.leetcode.practice.medium;

public class CapacityToShipPackagesWithinDDays {
	
	public int shipWithinDays(int[] weights, int days) {
		
		int maxWeight = 0;
		int sumWeight = 0;
		
		for(int w : weights) {
			maxWeight = Math.max(maxWeight, w);
			sumWeight += w;
		}
		
		int left = maxWeight;
		int right = sumWeight;
		int result = right;
		
		while(left <= right) {
			
			int mid = left + (right-left)/2;
			
			int day = getDays(weights,mid);
			
			if(day <=  days) {
				result = mid;
				right = mid -1;
			}
			else {
				left = mid+1;
			}
			
			
		}
		return result;
	}

	private int getDays(int[] weights, int mid) {
		// TODO Auto-generated method stub
		int load = 0; int days = 1;
		for(int w : weights) {
			if(load + w> mid) {
				days++;
				load = 0;
			}
			load += w;
		}
		return days;
	}

}
