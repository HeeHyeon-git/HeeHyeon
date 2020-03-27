package com.huma.ex;
import java.util.*;
class Exchange{
	public Scanner sc = new Scanner(System.in);
	public static double exchangeRate = 1200;
	public static double exchangeTax = 0.05;
	public double dollar;
	public double won;
	public double exchangeWonToDollar;
	public double exchangeDollarToWon;
	
	public Exchange() {}
	public Exchange(double dollar, double won) {
		this.dollar = dollar;
		this.won=won;
		
	}
	
	public void exchangeWonToDollar() {
		exchangeWonToDollar=won/exchangeRate*(1-exchangeTax);
		System.out.println(won+"원 환전 시 " + exchangeWonToDollar + "달러 입니다. " );
	}

	public void exchangeDollarToWon() {
		exchangeDollarToWon=dollar*exchangeRate*(1-exchangeTax);
		System.out.println(dollar + "달러 환전시  " + exchangeDollarToWon + "원 입니다. ");
	}
	
}

public class ClassStart3 {

	public static void main(String[] args) {
		Exchange exchange = new Exchange(20, 20000);
		exchange.exchangeWonToDollar();
		exchange.exchangeDollarToWon();
		
	}

}
