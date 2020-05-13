package com.human.ex;
class ToyRobot implements Toy{
	public void walk() {
		System.out.println("The robot can walk");
	}
	public void run() {
		System.out.println("The robot can run");
	}
	public void alarm() {
		System.out.println("The robot has no alarm function");
	}
	public void light() {
		System.out.println("The robot has light function");
	}
	
}
class ToyAirplane implements Toy{
	public void walk() {
		System.out.println("The airplane can not walk");
	}
	public void run() {
		System.out.println("The airplane can not run");
	}
	public void alarm() {
		System.out.println("The airplane has alarm function");
	}
	public void light() {
		System.out.println("The airplane has no light function");
	}
	
}
interface Toy{
	public void walk();
	public void run();
	public void alarm();
	public void light();
}


public class InterfaceToy {

	public static void main(String[] args) {
	Toy robot = new ToyRobot();
	Toy airplane = new ToyAirplane();
	
	Toy toys [] = {robot,airplane};
	for(int i= 0; i < toys.length; i++) {
		toys[i].walk();
		toys[i].run();
		toys[i].alarm();
		toys[i].light();
	}
  }
}
