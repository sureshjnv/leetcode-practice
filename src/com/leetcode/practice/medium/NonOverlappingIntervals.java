package com.leetcode.practice.medium;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {
	
	public int eraseOverlapIntervals(int[][] intervals) {
		
		if(intervals.length == 0) {
			return 0;
		}
		
		Arrays.sort(intervals,Comparator.comparingInt(a -> a[1]));
		int count = 1;
		int pi = 0;
		
		for(int i = 1 ; i < intervals.length;i++) {
			if(intervals[i][0] >= intervals[pi][1]) {
				count++;
				pi = i;
			}
		}
		
		return intervals.length - count;
	}

}
