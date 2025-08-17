package com.leetcode.main;

import com.leetcode.practice.easy.HappyNumber;
import com.leetcode.practice.easy.NextGreaterElementI;
import com.leetcode.practice.medium.FindDuplicateInLinearTimeAndConstantSpace;

public class Main {

	public static void main(String[] args) {

		NextGreaterElementI obj = new NextGreaterElementI();

		int[] arr = new int[] { 1, 3, 4, 2, 5, 8, 6};
		int[] arr2 = new int[] {4, 1, 2, 6, 5, 8};

		int [] result = obj.nextGreaterElement(arr2,arr);
		
		for(int i : result) {
			System.out.print(i+" ");
		}
	}

}
