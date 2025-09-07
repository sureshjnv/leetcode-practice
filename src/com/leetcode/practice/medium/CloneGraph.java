package com.leetcode.practice.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class CloneGraph {
	
	Map<Node,Node> map = new HashMap<>();
	
	public Node cloneGraph(Node node) {
		
		if(node == null) {
			return null;
		}
		
		if(map.containsKey(node)) {
			return map.get(node);
		}
		
		Node clone = new Node(node.val);
		map.put(node, clone);
		
		for(Node n : node.neighbors) {
			clone.neighbors.add(cloneGraph(n));
		}
		
		return clone;
	}

}
