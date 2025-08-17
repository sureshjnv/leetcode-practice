package com.leetcode.practice.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {
	
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		
		int[] result = new int[nums1.length];
		Map<Integer,Integer> indexMap = new HashMap<>();
		int[] greaterElementArray = new int[nums2.length];
		for(int i = 0; i < nums2.length;i++) {
			indexMap.put(nums2[i], i);
		}
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i = nums2.length - 1; i>=0 ;i--) {
			
			while(!stack.isEmpty() && nums2[i] > stack.peek()) {
				stack.pop();
			}
			greaterElementArray[i] = stack.isEmpty() ? -1 : stack.pop();
			stack.push(nums2[i]);
		}
		
		for(int i = 0; i < nums1.length ;i++) {
			result[i] = greaterElementArray[indexMap.get(nums1[i])];
		}
		return result;
	}

}
