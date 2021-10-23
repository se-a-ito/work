package com.example.demo;

public class Memolist {
	private String fruits;
	private String memo;

	public Memolist(String fruits, String memo) {
		this.fruits = fruits;
		this.memo = memo;
	}

	public String getFruits() {
		return this.fruits;
	}
	public String getMemo() {
		return this.memo;
	}
}
