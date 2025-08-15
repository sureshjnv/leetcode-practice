package com.leetcode.practice.easy;

public class HappyNumber {
	
	public boolean happy(int num) {
		
		int slow = num;
		int fast = next(num);
		
		while(fast != 1 && slow != fast) {
			slow = next(slow);
			fast = next(next(fast));
		}
		
		return fast == 1;
	}
	
	public int next(int n) {
		int sum = 0;
		while(n > 0) {
			int d = n % 10;
			sum += d * d;
			n /= 10;
		}
		return sum;
	}

}
