package test;
class BankManager{
	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public int arrIndex=0;
	public Bank [] arrBank = new Bank[100];
	
	public BankManager() {}
	
	
	//1.���»���
	//(-���¹�ȣ, ������, �ʱ� �Աݾ�)-������ , �������, id, pw	

	public void registcreateAccount(Bank b) {
		for(int i = 0; i<arrBank.length; i++) {
			if(arrBank[i]==null) {
			  arrBank[i]= new Bank(name, accountNumber, balance);
			  System.out.println("���°� �����Ǿ����ϴ�.");
			  break;
			}
		}
	}
	
	//2.���¸��
	//- ���¹�ȣ, ������, �� �ݾ�
	public void accountList() {
		for(int i=0; i<arrBank.length; i++) {
			if(arrBank[i]!=null) {
				
			}
		}
	}
	
	//3.����
	//- ���¹�ȣ, ������, ���ݾ�, �ܾ�, �������
	//4.���
	//-���¹�ȣ, ������, ��ݾ�, �ܾ�, �������
	//5.����
	//-���� ����
}

public class BankManagerTest {

	public static void main(String[] args) {
		BankManager bm = new BankManager();
		

		
	}

}
