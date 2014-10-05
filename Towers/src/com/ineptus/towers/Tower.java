package com.ineptus.towers;

import java.util.ArrayList;

public class Tower {
	
	ArrayList<Integer> stack;
	
	public Tower() {
		stack = new ArrayList<Integer>();
	}
	
	public int getTop() {
		return stack.get(stack.size()-1);
	}
	
	public boolean isEmpty() {
		return stack.size() == 0;
	}
	
	public void put(int n) {
		stack.add(n);
	}
	
	public int removeTop() {
		int top = stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		return top;
	}
	
	public int size() {
		return stack.size();
	}

}
