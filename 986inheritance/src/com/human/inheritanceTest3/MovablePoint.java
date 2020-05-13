package com.human.inheritanceTest3;

public class MovablePoint extends Point{
	private int xSpeed;
	private int ySpeed;
	
	MovablePoint(){};
	MovablePoint(int x, int y, int xSpeed, int ySpeed){
		super(x,y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	@Override
	public String toString() {
		return "MovablePoint [getxSpeed()=" + getxSpeed() + ", getySpeed()=" + getySpeed() + "]";
	}
	
	public int getxSpeed() {
		return xSpeed;
	}
	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	public int getySpeed() {
		return ySpeed;
	}
	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	
	
	
}
