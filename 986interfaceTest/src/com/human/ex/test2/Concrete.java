package com.human.ex.test2;

public class Concrete extends Abstract {
	public int j = 0;

	public Concrete(int i, int j) {
		super(i);
		this.j = j;
	}

	@Override
	public void show() {
		System.out.println("i = "+ super.i + ", j = " + j);
	}

	
}
