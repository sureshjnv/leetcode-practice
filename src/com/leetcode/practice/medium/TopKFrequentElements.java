package com.leetcode.practice.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

	public int[] topKFrequent(int[] nums, int k) {

		int result[] = new int[k];

		Map<Integer, Integer> freqMap = new HashMap<>();
		for (int num : nums) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		}

		PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(

				(a, b) -> a.getValue() - b.getValue());

		for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
			minHeap.add(entry);
			if (minHeap.size() > k) {
				minHeap.poll();
			}
		}

		int i = 0;
		while (!minHeap.isEmpty()) {
			result[i++] = minHeap.poll().getKey();
		}

		return result;
	}

}
