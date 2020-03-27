package com.huma.ex;
class ExchangeClass{
	public static double exchangeRate = 1200;
	public double exchangeTax = 0;
	public double dollor = 0;
	public double won = 0;
	public double rDollor=0;
	public double rWon=0;
	
	public ExchangeClass() {};
	public ExchangeClass(double exchangeRate, double exchangeTax, double dollor, double won){
		this.exchangeRate = exchangeRate;
		this.exchangeTax = exchangeTax;
		this.dollor = dollor;
		this.won = won;
	}	
	public static void changeExchangeRate() {
		ExchangeClass.exchangeRate=ExchangeClass.exchangeRate*1.1;//1.1�� ��½�Ű�� �޼ҵ�
	}
	public void changeExchangeRate1() {
		ExchangeClass.exchangeRate=ExchangeClass.exchangeRate*1.1;	}

	public double exchangeWonToDollar() {
		this.rDollor=this.won*(1-this.exchangeTax)/this.exchangeRate;
		return this.rDollor;
	}
	public double exchangeDollarToWon() {
		this.rWon=this.dollor*this.exchangeRate*(1-this.exchangeTax);
		return this.rWon;
	}
	public void display() {
		System.out.println("exRate :" +this.exchangeRate);
		System.out.println("exTax : " + this.exchangeTax);
		System.out.println("dollor : " + this.dollor);
		System.out.println("rDollor : " + this.rDollor);
		System.out.println("won : "+ this.won);
		System.out.println("rWon : " + this.rWon);
	}
}

public class CalssStartExchange4 {
	// 1. ���� �ִ� �ڵ带 ����
	// 2. ���� �ִ� �޼ҵ���� ����
	// 3. ������ �����
	// 4. �����Ǵ� data�� static
	// 5. static �޼ҵ带 �̿��ؼ� static�ʵ� ���� ���.
	public static void main(String[] args) {
		System.out.println(ExchangeClass.exchangeRate);
		ExchangeClass.changeExchangeRate();
		System.out.println(ExchangeClass.exchangeRate);
		
		(new ExchangeClass()).changeExchangeRate1();
		System.out.println(ExchangeClass.exchangeRate);
		
		ExchangeClass user1 = new ExchangeClass(1200,0.05,20,20000);
		ExchangeClass user2 = new ExchangeClass(1200,0.05,20,20000);
		ExchangeClass user3 = new ExchangeClass(1200,0.05,20,20000);
		
		user1.exchangeWonToDollar();
		user2.exchangeWonToDollar();
		user3.exchangeWonToDollar();
		
		user1.exchangeDollarToWon();
		user2.exchangeDollarToWon();
		user3.exchangeDollarToWon();
		
		user1.display();
		user2.display();
		user3.display();
	}

}
