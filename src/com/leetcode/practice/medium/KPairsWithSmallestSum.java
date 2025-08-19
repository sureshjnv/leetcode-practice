package com.leetcode.practice.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class KPairsWithSmallestSum {
	
	public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		
		List<List<Integer>> result = new ArrayList<>();
		
		PriorityQueue<int[]> pq = new PriorityQueue<>(
				
				(a,b) -> (nums1[a[0]]+nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]])
				
		);
		
		Set<String> visited = new HashSet<>();
		
		pq.add(new int[] {0,0});
		visited.add("0,0");
		
		while( k >0 && !pq.isEmpty()) {
			
			int[] curr = pq.poll();
			int i = curr[0];
			int j = curr[1];
			
			result.add(Arrays.asList(nums1[i],nums2[j]));
			k--;
			
			if(i+1 < nums1.length && !visited.contains((i+1)+","+j)) {
				pq.add(new int[] {i+1,j});
				visited.add((i+1)+","+j);
			}
			
			if(j+1 < nums2.length && !visited.contains(i+","+(j+1))) {
				pq.add(new int[] {i,j+1});
				visited.add(i+","+(j+1));
			}
		}
		
		
		return result;
		
		
	}

}
