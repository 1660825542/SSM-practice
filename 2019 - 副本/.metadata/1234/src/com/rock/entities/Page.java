package com.rock.entities;

public class Page {
	int max;
	int now;
	float  ye=5;
	float  count;
	public int getMax() {
		
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getNow() {
		return now;
	}
	public void setNow(int now) {
		this.now = now;
	}
	public float getYe() {
		return ye;
	}
	public void setYe(int ye) {
		this.ye = ye;
	}
	public float getCount() {
		return count;
	}
	public void setCount(int count) {
		
		this.count = count;
		this.max=Math.round(count/ye);
	}
	
}
