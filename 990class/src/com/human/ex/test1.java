package com.human.ex;
class Customer{
	public int customerID = 0;
	public String customerName = " ";
	public String customerGrade = " ";
	public int bonusPoint = 0;
	public double bonusRatio = 0;
	
	
	Customer() {
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
	}
	
	public Customer(int customerID, String customerName, 
			String customerGrade, int bonusPoint, double bonusRatio) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = customerGrade;
		this.bonusPoint = bonusPoint;
		this.bonusRatio = bonusRatio;
	}
	
	public int calcPrice(int price) {
		bonusPoint +=price * bonusRatio;
		return price;
	}
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade 
				+ "이며, 적립된 보너스 포인트는 " + bonusPoint +"점 입니다.";  
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}

class VIPCustomer extends Customer{
	public int agentID = 0;
	double saleRatio = 0;
	
	VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	public VIPCustomer(int agentID, double saleRatio) {
		super();
		this.agentID = agentID;
		this.saleRatio = saleRatio;
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint +=price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
}

class GoldCustomer extends Customer{
	public String customerGrade = "GOLD";
	public double bonusRatio = 0.025;
	
	public GoldCustomer(int customerID, String customerName,int bonusPoint) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.bonusPoint = bonusPoint;
		
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint +=price * bonusRatio;
		return price;
	}
}



public class test1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
	
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		
	
	}
}
