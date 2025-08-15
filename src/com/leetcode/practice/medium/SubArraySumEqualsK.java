package com.leetcode.practice.medium;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
	
	public int subarraySum(int[] nums, int k) {
		
		int[] sum = new int[nums.length];
		sum[0] = nums[0];
		for(int i = 1; i < nums.length; i++) {
			sum[i] = sum[i-1]+ nums[i];
		}
		int count = 0;
		
		Map<Integer,Integer> freqMap = new HashMap<>();
		freqMap.put(0,1);
		
		for(int i : sum) {
			if(freqMap.containsKey(i-k)) {
				count += freqMap.get(i-k);
			}
			
			freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
		}
		
		return count;
	}
	

}
