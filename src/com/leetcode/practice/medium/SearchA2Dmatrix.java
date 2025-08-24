package com.leetcode.practice.medium;

public class SearchA2Dmatrix {

	public boolean searchMatrix(int[][] matrix, int target) {

		for (int[] row : matrix) {
			int left = 0;
			int right = row.length - 1;

			while (left <= right) {
				int mid = (left + right) / 2;
				if (row[mid] == target) {
					return true;
				}
				if (row[mid] < target) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}

		}
		return false;
	}

}
