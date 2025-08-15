package com.leetcode.practice.medium;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
	
	public int contiguousArray(int[] nums) {
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] == 0 ? -1 : 1;
		}
		
		Map<Integer,Integer> map = new HashMap<>();
		int maxLength = 0;
		int count = 0;
		map.put(0, -1);
		
		for(int i = 0;i<nums.length;i++) {
			count = count + nums[i];
			if(map.containsKey(count)) {
				maxLength = Math.max(maxLength, i - map.get(count));
			}
			else {
				map.put(count, i);
			}
		}
		return maxLength;
	}

}
