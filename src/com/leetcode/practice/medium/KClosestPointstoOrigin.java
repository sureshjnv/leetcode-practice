package com.leetcode.practice.medium;

import java.util.PriorityQueue;

public class KClosestPointstoOrigin {

	public int[][] kClosest(int[][] points, int k) {

		int result[][] = new int[k][];

		PriorityQueue<int[]> maxHeap = new PriorityQueue<>(

				(a, b) -> distance(b) - distance(a));

		for (int[] point : points) {
			maxHeap.add(point);
			if (maxHeap.size() > k) {
				maxHeap.poll();
			}
		}

		int i = 0;
		while (!maxHeap.isEmpty()) {
			result[i++] = maxHeap.poll();
		}

		return result;
	}

	public int distance(int[] point) {

		return point[0] * point[0] + point[1] * point[1];
	}

}
