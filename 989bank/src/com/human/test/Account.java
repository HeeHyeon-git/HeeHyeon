package com.human.test;

public class Account {
	//1.id 2.pw 3.°èÁÂÁ¤º¸  4.ÀÔ±Ý  5.Ãâ±Ý  6.¸Þ´º
	public static int totalCount = 0; //ÃÑ °èÁÂ¼ö
	public String accountId = null;
	public String accountPw = null;
	public int money = 0;
	
	public Account() {
		totalCount++;
	}
	public Account(String accountId, String accountPw) {
		this();
		this.accountId = accountId;
		this.accountPw = accountPw;
	}
	public void display() {
		System.out.println("-------------");
		System.out.println("ÃÑ °èÁÂ ¼ö : " + Account.totalCount);
		System.out.println("ID : " + accountId);
		System.out.println("money : " + money);
		System.out.println("--------------");
	}
	public void add(int money) {
		this.money = this.money + money;
	}

	public void minus(int money) {
		this.money = this.money - money;
	}
	
	public boolean isLongin(String accountId, String accountPw) {
		boolean returnValue = false;
		if(this.accountId.equals(accountId) && this.accountPw.equals(accountPw)) {
			returnValue = true;
		}
		return returnValue;
	}
	
	public void menu() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String stirngInput = null;
		
	}
	
}
