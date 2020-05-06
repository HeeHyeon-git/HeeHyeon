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
		this(); // 기본생성자 호출 totalCount 호출
		this.id = id;
		this.pw = pw;
	}
	public boolean isLogin(String id, String pw) {
		boolean returnValue = false;
		
		if(this.id.equals(id)&&this.pw.equals(pw)) {
			returnValue = true;
		}//아이디랑 패스워드가 같은 사람이 존재하면 true를 리턴한다.
		return returnValue;
	}
	
	public void display() {
		System.out.println("-------------------------");
		System.out.println("총 계정수는 : " +  Account.totalCount );
		System.out.println("id는 : " + id );
		System.out.println("money는 : " + money );
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
		System.out.println(this.id+": 1.입금   2.출금   3.종료 ");
		inputString = sc.nextLine();
		
		switch(inputString) {
		case "1": 
			display();
			System.out.println("입금액을 입력하세요>>");
			int money = Integer.parseInt(sc.nextLine());
			add(money);
			display();
			break;
		case "2":
			display();
			System.out.println("출금액을 입력하세요>>");
			money = Integer.parseInt(sc.nextLine());
			minus(money);
			display();
			break;
		case "3":
			System.out.println("사용종료 하셨습니다.");
			flag=false;
			break;
		default :
			System.out.println("잘못된 입력입니다.");
		}
	  }	
	}	
}

class Bank{
	public static int totalCount = 0;
	public String name = null;
	public Account [] account = new Account[10];
	public int accountCount = 0; //Account.total
	//로그인 되지 않으면 -1, 로그인 되면 해당 인덱스
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
		System.out.println("원하는 id를 입력하세요");
		String id = sc.nextLine();
		if(isId(id)) {//중복 확인
			System.out.println("아이디가 중복됩니다.");
			return;
		}
		
		System.out.println("원하는 pw를 입력하세요");
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
		System.out.println("로그아웃 되었습니다.");
	}
	public boolean login(String id, String pw) {
		//isLogin(id,pw)
		//아이디랑 패스워드가 같은 사람이 존재하면 true를 리턴한다.
		boolean returnValue = false;
		for(int i = 0; i < accountCount; i++) {
			if(account[i].isLogin(id,pw)) {
				returnValue = true;
				accountCurrent = i;
				break;
			};
		}//true이면 로그인 됨. false면 로그인 안됨.
		return returnValue;
	}
	
	public void displayAll() {
		System.out.println("총 은행수 : " + Bank.totalCount);
		System.out.println("현재 은행 이름: " + name);
		for(int i = 0; i < accountCount; i++ ) {
			account[i].display();
		}
	}
	public void useAccount() {
		if(accountCurrent!= -1) {
		account[accountCurrent].menu();  
		}else{
			System.out.println("잘못된 로그인");
		}
	}
	
	public void menu() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		boolean flag = true;
		//bank의 메뉴
		//1.계정 등록 2.모든 계정 출력 3.계정 로그인 4.로그아웃 5. 종료
		while(flag) {
			System.out.println("1.계정 등록  2.모든 계정 출력	3.계정 로그인 "+
								"4.로그아웃  5.계정삭제  6.종료 ");
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
				System.out.println("원하는 id를 입력하세요");
				String id = sc.nextLine();
				System.out.println("원하는 pw를 입력하세요");
				String pw = sc.nextLine();
				
				if(login(id, pw)) {
					System.out.println("로그인 되었습니다.");
					useAccount();
				}else {
					System.out.println("로그인 실패되었습니다.");
				};
				break;
			case "4":
				logout();
				break;
			case "5":
				if(accountCurrent != -1) {
					System.out.println("삭제할 pw입력");
	//				System.out.println("원하는 id를 입력하세요");
	//				id = sc.nextLine();
					System.out.println("원하는 pw를 입력하세요");
					pw = sc.nextLine();
					delete(pw);
				}else {
					System.out.println("로그인 하세요.");
				}
				break;
			case "6":
				System.out.println("종료되었습니다.");
				flag = false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	//계정등록 작업 및 모든계정 출력
	//  bk.accountAdd();
	//  bk.displayAll();
	//  bk.accountAdd();
	//  bk.displayAll();
	//  bk.accountAdd();
	//  bk.displayAll();
	  //로그인
	  //1. 사용자에게 id와 pw를 입력받는다.
	  //2. 기존 사용자가 맞는지 확인한다.
	  //3. 로그인한 사용자가 사용할수 있도록 설정한다.
	  //account배열중에 어떤 account를 사용할건지 선택
	  //4. 로그인 사용자 계정 사용
	  
	//  System.out.println("id를 입력하세요");
	//  String id=sc.nextLine();
	//  System.out.println("pw를 입력하세요");
	//  String pw=sc.nextLine();
	//  
	//  if(bk.isLogin(id, pw)) {
	//   System.out.println("로그인 되었습니다.");
	//   bk.useAccount();
	//  }else{
	//   System.out.println("로그인 실패되었습니다.");
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
		if(flag) {//찾으면 삭제
			for(int i = accountCurrent; i+1 < accountCount; i++) {
				account[i] = account[i+1];
			}
			Account.totalCount--;
			accountCount--;
			accountCurrent=-1;
			System.out.println("삭제되었습니다.");
			
		}else {
			System.out.println("삭제 실패");
		}
	}
}

public class BankPr {

	public static void main(String[] args) {
//		Account ac = new Account("park" , "1234");
//		ac.menu();
		Bank bk = new Bank("한국은행");
		bk.menu();

		
		
		
	}

}
