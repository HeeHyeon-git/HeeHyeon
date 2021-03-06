package test;
class Bank{
	public static java.util.Scanner sc = new java.util.Scanner(System.in); 
	private String accountNumber;
	private String name;
	private String id;
	private String password;
	private int balance=0;

	
	//1.계좌생성
	//-계좌번호, 계좌주, 초기 입금액, 결과문구, id, pw
	//2.계좌목록
	//- 계좌번호, 계좌주, 총 금액
	//3.예금
	//- 계좌번호, 계좌주, 예금액, 잔액, 결과문구
	//4.출금
	//-계좌번호, 계좌주, 출금액, 잔액, 결과문구
	//5.종료
	//-종료 문구
	
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
	
	//1.계좌생성
	//-계좌번호, 계좌주, 초기 입금액, 결과문구, id, pw
	public Bank(String name, String accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void createAccount() {
		System.out.println("-----------------");
		System.out.println("계좌를 생성하겠습니다.");
		System.out.println("-----------------");
		System.out.println("계좌주 이름을 입력해주세요");
		String name=sc.nextLine();
		System.out.println("------------------");
		System.out.println("계좌 번호를 입력해주세요");
		String accountNumber = sc.nextLine();
		System.out.println("------------------");
		System.out.println("초기 입금액을 입력해 주세요");
		int balance = Integer.parseInt(sc.nextLine());
			  System.out.println("계좌가 생성되었습니다.");
	}
		
	//2.계좌목록
	//- 계좌번호, 계좌주, 총 금액
	public void showInfoAccount() {
		System.out.println("--------");
		System.out.println("계좌주 :" + this.name);
		System.out.println("계좌번호 : " + this.accountNumber);
		System.out.println("잔액 : "+ this.balance);
	}
	
	//3.예금
	//- 계좌번호, 계좌주, 예금액, 잔액, 결과문구
	public void save(int balance ) {
		this.balance=this.balance+balance;
	}
	
	//4.출금
	//-계좌번호, 계좌주, 출금액, 잔액, 결과문구
	public void draw(int balance) {
		this.balance=this.balance-balance;
	}
	//5.종료
	//-종료 문구
		
}

public class BankTest {

	public static void main(String[] args) {
	//	Bank bk = new Bank ("고다온", "3562323", 10000);
	//	bk.createAccount();
		Bank bk1 = new Bank ("고다온", "3434", 10000);
		//bk1.createAccount();
		bk1.save(10000);
		bk1.showInfoAccount();
		bk1.draw(1000);
		bk1.showInfoAccount();
	}

}
