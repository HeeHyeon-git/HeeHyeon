package test;
class Bank{
	public static java.util.Scanner sc = new java.util.Scanner(System.in); 
	private String accountNumber;
	private String name;
	private String id;
	private String password;
	private int balance=0;

	
	//1.°èÁÂ»ý¼º
	//-°èÁÂ¹øÈ£, °èÁÂÁÖ, ÃÊ±â ÀÔ±Ý¾×, °á°ú¹®±¸, id, pw
	//2.°èÁÂ¸ñ·Ï
	//- °èÁÂ¹øÈ£, °èÁÂÁÖ, ÃÑ ±Ý¾×
	//3.¿¹±Ý
	//- °èÁÂ¹øÈ£, °èÁÂÁÖ, ¿¹±Ý¾×, ÀÜ¾×, °á°ú¹®±¸
	//4.Ãâ±Ý
	//-°èÁÂ¹øÈ£, °èÁÂÁÖ, Ãâ±Ý¾×, ÀÜ¾×, °á°ú¹®±¸
	//5.Á¾·á
	//-Á¾·á ¹®±¸
	
	public Bank(){}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//1.°èÁÂ»ý¼º
	//-°èÁÂ¹øÈ£, °èÁÂÁÖ, ÃÊ±â ÀÔ±Ý¾×, °á°ú¹®±¸, id, pw
	public Bank(String name, String accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void createAccount() {
		System.out.println("-----------------");
		System.out.println("°èÁÂ¸¦ »ý¼ºÇÏ°Ú½À´Ï´Ù.");
		System.out.println("-----------------");
		System.out.println("°èÁÂÁÖ ÀÌ¸§À» ÀÔ·ÂÇØÁÖ¼¼¿ä");
		String name=sc.nextLine();
		System.out.println("------------------");
		System.out.println("°èÁÂ ¹øÈ£¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä");
		String accountNumber = sc.nextLine();
		System.out.println("------------------");
		System.out.println("ÃÊ±â ÀÔ±Ý¾×À» ÀÔ·ÂÇØ ÁÖ¼¼¿ä");
		int balance = Integer.parseInt(sc.nextLine());
			  System.out.println("°èÁÂ°¡ »ý¼ºµÇ¾ú½À´Ï´Ù.");
	}
		
	//2.°èÁÂ¸ñ·Ï
	//- °èÁÂ¹øÈ£, °èÁÂÁÖ, ÃÑ ±Ý¾×
	public void showInfoAccount() {
		System.out.println("--------");
		System.out.println("°èÁÂÁÖ :" + this.name);
		System.out.println("°èÁÂ¹øÈ£ : " + this.accountNumber);
		System.out.println("ÀÜ¾× : "+ this.balance);
	}
	
	//3.¿¹±Ý
	//- °èÁÂ¹øÈ£, °èÁÂÁÖ, ¿¹±Ý¾×, ÀÜ¾×, °á°ú¹®±¸
	public void save(int balance ) {
		this.balance=this.balance+balance;
	}
	
	//4.Ãâ±Ý
	//-°èÁÂ¹øÈ£, °èÁÂÁÖ, Ãâ±Ý¾×, ÀÜ¾×, °á°ú¹®±¸
	public void draw(int balance) {
		this.balance=this.balance-balance;
	}
	//5.Á¾·á
	//-Á¾·á ¹®±¸
		
}

public class BankTest {

	public static void main(String[] args) {
	//	Bank bk = new Bank ("°í´Ù¿Â", "3562323", 10000);
	//	bk.createAccount();
		Bank bk1 = new Bank ("°í´Ù¿Â", "3434", 10000);
		//bk1.createAccount();
		bk1.save(10000);
		bk1.showInfoAccount();
		bk1.draw(1000);
		bk1.showInfoAccount();
	}

}
