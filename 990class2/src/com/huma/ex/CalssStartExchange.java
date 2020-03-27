package com.huma.ex;

public class CalssStartExchange {

	public static void main(String[] args) {
		// 절차적 방법
		double exchangeRate = 1200;
		double exchangeTax = 0.05;
		double dollr = 20;
		double won = 20000;
		double rDollor=0;
		double rWon=0;
		
		//exchangeWonToDollar
		rDollor=won/exchangeRate*(1-exchangeTax);
		
		//exchangeDollarToWon
		rWon=dollr*exchangeRate*(1-exchangeTax);
		
		System.out.println("exRate :" +exchangeRate);
		System.out.println("exTax : " + exchangeTax);
		System.out.println("dollor : " + dollr);
		System.out.println("rDollor : " + rDollor);
		System.out.println("won : "+ won);
		System.out.println("rWon : " + rWon);
		
		
		

	}

}
