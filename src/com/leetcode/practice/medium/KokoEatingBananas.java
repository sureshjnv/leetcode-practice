package com.leetcode.practice.medium;

public class KokoEatingBananas {
	
	public int minEatingSpeed(int[] piles, int h) {
		int maxBananas = 0;
		for(int b: piles) {
			maxBananas = Math.max(maxBananas, b);
		}
		int left = 1;
		int right = maxBananas;
		int result = right;
		
		while(left <= right) {
			int mid = left + (right-left)/2;
			long hours = getHours(piles,mid);
			
			if(hours <= h) {
				result = mid;
				right = mid - 1;
			}
			else {
				left = mid+1;
			}
		}
		
		return result;
	}

	private long getHours(int[] piles, int c) {
		long count = 0;
		for(int b : piles) {
			if(b%c == 0) {
				count += (b/c);
			}
			else {
				count += (b/c)+1;
			}
		}
		return count;
	}

}
