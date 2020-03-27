package com.huma.ex;

public class CalssStartExchange2 {
		//함수
	public static double exchangeWonToDollar(double won, double rate, double tax) {
		return won/rate*(1-tax);
	}
	public static double exchangeDollarToWon(double dollar, double rate, double tax) {
		return dollar*rate*(1-tax);
	}
	public static void display(String user, double rate, double tax, double dollor, double rDollor,
			double won, double rWon) {
		System.out.println("exUser : " + user);
		System.out.println("exRate :" +rate);
		System.out.println("exTax : " + tax);
		System.out.println("dollor : " + dollor);
		System.out.println("rDollor : " + rDollor);
		System.out.println("won : "+ won);
		System.out.println("rWon : " + rWon);
	}
	
	public static void main(String[] args) {
		// 절차적 방법
		// 3000원 이상 환전한 사람
		// 홍길동
		// 30달러 환전한 사람들
		
		double exchangeRate1 = 1200, exchangeRate2 = 1200, exchangeRate3 = 1200;
		double exchangeTax1 = 0.05, exchangeTax2 = 0.05, exchangeTax3 = 0.05;
		double dollr1 = 20, dollr2 = 20, dollr3 = 20;
		double won1 = 20000, won2 = 20000, won3 = 20000;
		double rDollor1=0, rDollor2=0, rDollor3=0;
		double rWon1=0, rWon2=0, rWon3=0;
		
		//exchangeWonToDollar
		rDollor1=exchangeWonToDollar(won1, exchangeRate1, exchangeTax1);
		rDollor2=exchangeWonToDollar(won2, exchangeRate2, exchangeTax2);
		rDollor3=exchangeWonToDollar(won3, exchangeRate3, exchangeTax3);
		
		//exchangeDollarToWon
		rWon1=exchangeDollarToWon(dollr1, exchangeRate1, exchangeTax1);
		rWon2=exchangeDollarToWon(dollr2, exchangeRate2, exchangeTax2);
		rWon3=exchangeDollarToWon(dollr3, exchangeRate3, exchangeTax3);
		
		display("1", exchangeRate1, exchangeTax1, dollr1, rDollor1, won1, rWon1);
		display("2", exchangeRate2, exchangeTax2, dollr2, rDollor2, won2, rWon2);		
		display("3", exchangeRate3, exchangeTax3, dollr3, rDollor3, won3, rWon3);		
		
//		System.out.println("exRate :" +exchangeRate);
//		System.out.println("exTax : " + exchangeTax);
//		System.out.println("dollor : " + dollr);
//		System.out.println("rDollor : " +	 rDollor);
//		System.out.println("won : "+ won);
//		System.out.println("rWon : " + rWon);
//		


	}

}
