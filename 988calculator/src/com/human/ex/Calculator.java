package com.human.ex;

class VIPCustomer extends Customer{
	public double sale = 0.1;
	@Override
	public double getRate() {
		return rate - sale;
	}
	
}

class GOLDCustomer extends Customer{
	public double sale = 0.2;
	@Override
	public double getRate() {
		return rate -   sale;
	}
	
}
class TV extends Product{
	public double tax = 0.1;
	@Override
	public double getPrice() {
		return price*(1+tax);
	}

}

class Cellphone extends Product{
	public double tax = 0.11;
	@Override
	public double getPrice() {
		return price*(1+tax);
	}

}
class Radio extends Product{
	public double tax = 0.12;
	@Override
	public double getPrice() {
		return price*(1+tax);
	}

}
public class Calculator {
	public static double productCalculator(Customer c, Product[] p) {
		double totalPrice = 0;
		double totalRate = 0;
		
		totalRate=c.getRate();
		if(p != null) {
		for(Product pr : p) {
			if(pr !=null) {
			totalPrice += pr.getPrice();
			}
		}
	}
		return totalPrice * totalRate;//√— ±∏∏≈π∞«∞ ±›æ◊  * ∞Ì∞¥«“¿Œ¿≤ 
	}

	
	public static void main(String[] args) {
		Customer c =new Customer();
		Customer vip =new VIPCustomer();
		Customer gold =new GOLDCustomer();
		
		Product [] pr = new Product[5];
		pr[0] = new TV();
		pr[1] = new Radio();
		pr[2] = new Cellphone();
		
		System.out.println("¿œπ›∞Ì∞¥: " + Calculator.productCalculator(c, pr));
		System.out.println("VIP ∞Ì∞¥ : " + Calculator.productCalculator(vip, pr));
		System.out.println("GOLD ∞Ì∞¥ : " + Calculator.productCalculator(gold, pr));
		
	}

}
