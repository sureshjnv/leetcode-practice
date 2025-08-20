package com.leetcode.practice.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
	
	public int[][] merge(int[][] intervals) {
		
		Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
		
		List<int[]> merged = new ArrayList<>();
		
		int[] current = intervals[0];
		merged.add(current);
		
		for(int[] interval : intervals) {
			
			int nextStart = interval[0];
			int currEnd = current[1];
			
			if(nextStart <= currEnd) {
				current[1] = Math.max(currEnd, interval[1]);
			}
			else {
				current = interval;
				merged.add(current);
			}
		}
		
		return merged.toArray(new int[merged.size()][]);
	}

}
