package test;
class Bank{
	public static java.util.Scanner sc = new java.util.Scanner(System.in); 
	private String accountNumber;
	private String name;
	private String id;
	private String password;
	private int balance=0;

	
	//1.���»���
	//-���¹�ȣ, ������, �ʱ� �Աݾ�, �������, id, pw
	//2.���¸��
	//- ���¹�ȣ, ������, �� �ݾ�
	//3.����
	//- ���¹�ȣ, ������, ���ݾ�, �ܾ�, �������
	//4.���
	//-���¹�ȣ, ������, ��ݾ�, �ܾ�, �������
	//5.����
	//-���� ����
	
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
	
	//1.���»���
	//-���¹�ȣ, ������, �ʱ� �Աݾ�, �������, id, pw
	public Bank(String name, String accountNumber, int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void createAccount() {
		System.out.println("-----------------");
		System.out.println("���¸� �����ϰڽ��ϴ�.");
		System.out.println("-----------------");
		System.out.println("������ �̸��� �Է����ּ���");
		String name=sc.nextLine();
		System.out.println("------------------");
		System.out.println("���� ��ȣ�� �Է����ּ���");
		String accountNumber = sc.nextLine();
		System.out.println("------------------");
		System.out.println("�ʱ� �Աݾ��� �Է��� �ּ���");
		int balance = Integer.parseInt(sc.nextLine());
			  System.out.println("���°� �����Ǿ����ϴ�.");
	}
		
	//2.���¸��
	//- ���¹�ȣ, ������, �� �ݾ�
	public void showInfoAccount() {
		System.out.println("--------");
		System.out.println("������ :" + this.name);
		System.out.println("���¹�ȣ : " + this.accountNumber);
		System.out.println("�ܾ� : "+ this.balance);
	}
	
	//3.����
	//- ���¹�ȣ, ������, ���ݾ�, �ܾ�, �������
	public void save(int balance ) {
		this.balance=this.balance+balance;
	}
	
	//4.���
	//-���¹�ȣ, ������, ��ݾ�, �ܾ�, �������
	public void draw(int balance) {
		this.balance=this.balance-balance;
	}
	//5.����
	//-���� ����
		
}

public class BankTest {

	public static void main(String[] args) {
	//	Bank bk = new Bank ("��ٿ�", "3562323", 10000);
	//	bk.createAccount();
		Bank bk1 = new Bank ("��ٿ�", "3434", 10000);
		//bk1.createAccount();
		bk1.save(10000);
		bk1.showInfoAccount();
		bk1.draw(1000);
		bk1.showInfoAccount();
	}

}
