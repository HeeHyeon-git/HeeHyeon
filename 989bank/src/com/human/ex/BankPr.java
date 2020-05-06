package com.human.ex;

class Account{
	public static int totalCount = 0;
	public int money = 0;
	public String id = null;
	public String pw = null;
	
	public Account() {
		totalCount++;
	}
	public Account(String id, String pw) {
		this(); // �⺻������ ȣ�� totalCount ȣ��
		this.id = id;
		this.pw = pw;
	}
	public boolean isLogin(String id, String pw) {
		boolean returnValue = false;
		
		if(this.id.equals(id)&&this.pw.equals(pw)) {
			returnValue = true;
		}//���̵�� �н����尡 ���� ����� �����ϸ� true�� �����Ѵ�.
		return returnValue;
	}
	
	public void display() {
		System.out.println("-------------------------");
		System.out.println("�� �������� : " +  Account.totalCount );
		System.out.println("id�� : " + id );
		System.out.println("money�� : " + money );
		System.out.println("-------------------------");
	}
	public void add(int money) {
		this.money = this.money + money;
				
	}
	public void minus(int money) {
		this.money = this.money - money;
	}
	
	public void menu() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String inputString = null;
		boolean flag = true;
		
		while(flag) {	
		System.out.println(this.id+": 1.�Ա�   2.���   3.���� ");
		inputString = sc.nextLine();
		
		switch(inputString) {
		case "1": 
			display();
			System.out.println("�Աݾ��� �Է��ϼ���>>");
			int money = Integer.parseInt(sc.nextLine());
			add(money);
			display();
			break;
		case "2":
			display();
			System.out.println("��ݾ��� �Է��ϼ���>>");
			money = Integer.parseInt(sc.nextLine());
			minus(money);
			display();
			break;
		case "3":
			System.out.println("������� �ϼ̽��ϴ�.");
			flag=false;
			break;
		default :
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	  }	
	}	
}

class Bank{
	public static int totalCount = 0;
	public String name = null;
	public Account [] account = new Account[10];
	public int accountCount = 0; //Account.total
	//�α��� ���� ������ -1, �α��� �Ǹ� �ش� �ε���
	public int accountCurrent = -1;
	public Bank() {
		totalCount++;
	}
	public Bank(String name) {
		totalCount++;
		this.name = name;
	}
	public void accountAdd() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("���ϴ� id�� �Է��ϼ���");
		String id = sc.nextLine();
		if(isId(id)) {//�ߺ� Ȯ��
			System.out.println("���̵� �ߺ��˴ϴ�.");
			return;
		}
		
		System.out.println("���ϴ� pw�� �Է��ϼ���");
		String pw = sc.nextLine();
		account[accountCount++] = new Account(id,pw); 
		
	}
	private boolean isId(String id) {
		boolean returnValue = false;
		for(int i = 0; i < accountCount; i++) {
			if(account[i].id.equals(id)) {
				returnValue = true;
			};
		}
		return returnValue;
	}
	public void logout() {
		accountCurrent = -1;
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
	public boolean login(String id, String pw) {
		//isLogin(id,pw)
		//���̵�� �н����尡 ���� ����� �����ϸ� true�� �����Ѵ�.
		boolean returnValue = false;
		for(int i = 0; i < accountCount; i++) {
			if(account[i].isLogin(id,pw)) {
				returnValue = true;
				accountCurrent = i;
				break;
			};
		}//true�̸� �α��� ��. false�� �α��� �ȵ�.
		return returnValue;
	}
	
	public void displayAll() {
		System.out.println("�� ����� : " + Bank.totalCount);
		System.out.println("���� ���� �̸�: " + name);
		for(int i = 0; i < accountCount; i++ ) {
			account[i].display();
		}
	}
	public void useAccount() {
		if(accountCurrent!= -1) {
		account[accountCurrent].menu();  
		}else{
			System.out.println("�߸��� �α���");
		}
	}
	
	public void menu() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		boolean flag = true;
		//bank�� �޴�
		//1.���� ��� 2.��� ���� ��� 3.���� �α��� 4.�α׾ƿ� 5. ����
		while(flag) {
			System.out.println("1.���� ���  2.��� ���� ���	3.���� �α��� "+
								"4.�α׾ƿ�  5.��������  6.���� ");
			String stringInput = sc.nextLine();
			switch(stringInput) {
			case "1":
				accountAdd();
				displayAll();
				break;
			case "2":
				displayAll();
				break;
			case "3":
				System.out.println("���ϴ� id�� �Է��ϼ���");
				String id = sc.nextLine();
				System.out.println("���ϴ� pw�� �Է��ϼ���");
				String pw = sc.nextLine();
				
				if(login(id, pw)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					useAccount();
				}else {
					System.out.println("�α��� ���еǾ����ϴ�.");
				};
				break;
			case "4":
				logout();
				break;
			case "5":
				if(accountCurrent != -1) {
					System.out.println("������ pw�Է�");
	//				System.out.println("���ϴ� id�� �Է��ϼ���");
	//				id = sc.nextLine();
					System.out.println("���ϴ� pw�� �Է��ϼ���");
					pw = sc.nextLine();
					delete(pw);
				}else {
					System.out.println("�α��� �ϼ���.");
				}
				break;
			case "6":
				System.out.println("����Ǿ����ϴ�.");
				flag = false;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	//������� �۾� �� ������ ���
	//  bk.accountAdd();
	//  bk.displayAll();
	//  bk.accountAdd();
	//  bk.displayAll();
	//  bk.accountAdd();
	//  bk.displayAll();
	  //�α���
	  //1. ����ڿ��� id�� pw�� �Է¹޴´�.
	  //2. ���� ����ڰ� �´��� Ȯ���Ѵ�.
	  //3. �α����� ����ڰ� ����Ҽ� �ֵ��� �����Ѵ�.
	  //account�迭�߿� � account�� ����Ұ��� ����
	  //4. �α��� ����� ���� ���
	  
	//  System.out.println("id�� �Է��ϼ���");
	//  String id=sc.nextLine();
	//  System.out.println("pw�� �Է��ϼ���");
	//  String pw=sc.nextLine();
	//  
	//  if(bk.isLogin(id, pw)) {
	//   System.out.println("�α��� �Ǿ����ϴ�.");
	//   bk.useAccount();
	//  }else{
	//   System.out.println("�α��� ���еǾ����ϴ�.");
	//  };
		
	}
	
	public void delete(String pw) {
		delete(account[accountCurrent].id,pw);
	}
	
	public void delete(String id, String pw) {
		boolean flag = false;
		for(int i = 0; i < accountCount; i++) {
			if(account[i].isLogin(id, pw)) {
				accountCurrent = i;
				flag = true;
				break;	
			};
		}
		if(flag) {//ã���� ����
			for(int i = accountCurrent; i+1 < accountCount; i++) {
				account[i] = account[i+1];
			}
			Account.totalCount--;
			accountCount--;
			accountCurrent=-1;
			System.out.println("�����Ǿ����ϴ�.");
			
		}else {
			System.out.println("���� ����");
		}
	}
}

public class BankPr {

	public static void main(String[] args) {
//		Account ac = new Account("park" , "1234");
//		ac.menu();
		Bank bk = new Bank("�ѱ�����");
		bk.menu();

		
		
		
	}

}
