package com.leetcode.practice.medium;

public class NumberOfProvinces {
	
	public int findCircleNum(int[][] isConnected) {
		
		int provinces = 0;
		int n = isConnected.length;
		
		boolean[] vis = new boolean[n];
		for(int i = 0 ; i < n;i++) {
			if(!vis[i]) {
				dfs(isConnected,vis,i);
				provinces++;
			}
		}
		return provinces;
		
	}

	private void dfs(int[][] isConnected, boolean[] vis, int i) {
		vis[i] = true;
		for(int j = 0; j < isConnected.length;j++) {
		if(isConnected[i][j] == 1 && !vis[j]) {
			dfs(isConnected,vis,j);
		}
		}
	}

}
