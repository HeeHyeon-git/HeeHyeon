package com.huma.ex;
//class ExchangeClass{
//	public double exchangeRate = 1200;
//	public double exchangeTax = 0;
//	public double dollor = 0;
//	public double won = 0;
//	public double rDollor=0;
//	public double rWon=0;
//	public ExchangeClass() {};
//	public ExchangeClass(double exchangeRate, double exchangeTax, double dollor, double won){
//		this.exchangeRate = exchangeRate;
//		this.exchangeTax = exchangeTax;
//		this.dollor = dollor;
//		this.won = won;
//	}	
//
//	public double exchangeWonToDollar() {
//		this.rDollor=this.won*(1-this.exchangeTax)/this.exchangeRate;
//		return this.rDollor;
//	}
//	public double exchangeDollarToWon() {
//		this.rWon=this.dollor*this.exchangeRate*(1-this.exchangeTax);
//		return this.rWon;
//	}
//	public void display() {
//		System.out.println("exRate :" +this.exchangeRate);
//		System.out.println("exTax : " + this.exchangeTax);
//		System.out.println("dollor : " + this.dollor);
//		System.out.println("rDollor : " + this.rDollor);
//		System.out.println("won : "+ this.won);
//		System.out.println("rWon : " + this.rWon);
//	}
//
//}

public class CalssStartExchange3 {
		//함수
//	public static double exchangeWonToDollar(ExchangeClass ec) {
//		ec.rDollor=ec.won*(1-ec.exchangeTax)/ec.exchangeRate;
//		return ec.rDollor;
//	}
//	public static double exchangeDollarToWon(ExchangeClass ec) {
//		ec.rWon=ec.dollor*ec.exchangeRate*(1-ec.exchangeTax);
//		return ec.rWon;
//	}
	public static void display(ExchangeClass ec) {
		System.out.println("exRate :" +ec.exchangeRate);
		System.out.println("exTax : " + ec.exchangeTax);
		System.out.println("dollor : " + ec.dollor);
		System.out.println("rDollor : " + ec.rDollor);
		System.out.println("won : "+ ec.won);
		System.out.println("rWon : " + ec.rWon);
	}
	
	public static void main(String[] args) {
		// 절차적 방법
		// 3000원 이상 환전한 사람
		// 홍길동
		// 30달러 환전한 사람들
		ExchangeClass user1 = new ExchangeClass(1200,0.05,20,20000);
		ExchangeClass user2 = new ExchangeClass(1200,0.05,20,20000);
		ExchangeClass user3 = new ExchangeClass(1200,0.05,20,20000);
//		double exchangeRate1 = 1200, exchangeRate2 = 1200, exchangeRate3 = 1200;
//		double exchangeTax1 = 0.05, exchangeTax2 = 0.05, exchangeTax3 = 0.05;
//		double dollr1 = 20, dollr2 = 20, dollr3 = 20;
//		double won1 = 20000, won2 = 20000, won3 = 20000;
//		double rDollor1=0, rDollor2=0, rDollor3=0;
//		double rWon1=0, rWon2=0, rWon3=0;
//		
		//exchangeWonToDollar
		//user1.exchangeWonToDollar();
		user1.exchangeWonToDollar();
		user2.exchangeWonToDollar();
		user3.exchangeWonToDollar();
		
//		ExchangeClass.exchangeWonToDollar(user1);
//		exchangeWonToDollar(user2);
//		exchangeWonToDollar(user3);
		
//		rDollor1=exchangeWonToDollar(won1, exchangeRate1, exchangeTax1);
//		rDollor2=exchangeWonToDollar(won2, exchangeRate2, exchangeTax2);
//		rDollor3=exchangeWonToDollar(won3, exchangeRate3, exchangeTax3);
		
		//exchangeDollarToWon
		user1.exchangeDollarToWon();
		user2.exchangeDollarToWon();
		user3.exchangeDollarToWon();
		
//		exchangeDollarToWon(user1);
//		exchangeDollarToWon(user2);
//		exchangeDollarToWon(user3);
		
//		rWon1=exchangeDollarToWon(dollr1, exchangeRate1, exchangeTax1);
//		rWon2=exchangeDollarToWon(dollr2, exchangeRate2, exchangeTax2);
//		rWon3=exchangeDollarToWon(dollr3, exchangeRate3, exchangeTax3);
		
		//값출력
		display(user1);
		display(user2);
		display(user3);
//		
//		display("1", exchangeRate1, exchangeTax1, dollr1, rDollor1, won1, rWon1);
//		display("2", exchangeRate2, exchangeTax2, dollr2, rDollor2, won2, rWon2);		
//		display("3", exchangeRate3, exchangeTax3, dollr3, rDollor3, won3, rWon3);		
//		
//		System.out.println("exRate :" +exchangeRate);
//		System.out.println("exTax : " + exchangeTax);
//		System.out.println("dollor : " + dollor);
//		System.out.println("rDollor : " +	 rDollor);
//		System.out.println("won : "+ won);
//		System.out.println("rWon : " + rWon);
//		


	}

}
