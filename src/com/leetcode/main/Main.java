package com.leetcode.main;

import com.leetcode.practice.easy.HappyNumber;
import com.leetcode.practice.medium.FindDuplicateInLinearTimeAndConstantSpace;

public class Main {

	public static void main(String[] args) {

		FindDuplicateInLinearTimeAndConstantSpace obj = new FindDuplicateInLinearTimeAndConstantSpace();

		int[] arr = new int[] { 2, 4, 3, 2, 1 };

		System.out.println(obj.findDuplicate(arr));
	}

}
