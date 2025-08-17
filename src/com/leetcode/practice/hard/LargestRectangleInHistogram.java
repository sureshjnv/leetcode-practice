package com.leetcode.practice.hard;

import java.util.Stack;

public class LargestRectangleInHistogram {
	
	public int largestRectangleArea(int[] heights) {
		
		int n = heights.length;
		int maxArea = 0;
		int[] nsl = new int[n];
		int[] nsr = new int[n];
		Stack<Integer> stack = new Stack<>();
		
		for(int i = n - 1; i >= 0; i--) {
			while(!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
				
				stack.pop();	
				
			}
			nsr[i] = stack.isEmpty() ? n : stack.peek();
			stack.push(i);
			
		}
		
		while(!stack.isEmpty()) {
			stack.pop();
		}
		
		for(int i = 0; i < n; i++) {
			while(!stack.isEmpty() && heights[i] <= heights[stack.peek()]) {
				
				stack.pop();	
				
			}
			nsl[i] = stack.isEmpty() ? -1 : stack.peek();
			stack.push(i);
			
		}
		
		for(int i = 0 ; i < n ;i++) {
			int width = nsr[i] - nsl[i] - 1;
			maxArea = Math.max(maxArea, heights[i] * width);
		}
		
		
		return maxArea;
	}

}
