package test;
class BankManager{
	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public int arrIndex=0;
	public Bank [] arrBank = new Bank[100];
	
	public BankManager() {}
	
	
	//1.°èÁÂ»ý¼º
	//(-°èÁÂ¹øÈ£, °èÁÂÁÖ, ÃÊ±â ÀÔ±Ý¾×)-»ý¼ºÀÚ , °á°ú¹®±¸, id, pw	

	public void registcreateAccount(Bank b) {
		for(int i = 0; i<arrBank.length; i++) {
			if(arrBank[i]==null) {
			  arrBank[i]= new Bank(name, accountNumber, balance);
			  System.out.println("°èÁÂ°¡ »ý¼ºµÇ¾ú½À´Ï´Ù.");
			  break;
			}
		}
	}
	
	//2.°èÁÂ¸ñ·Ï
	//- °èÁÂ¹øÈ£, °èÁÂÁÖ, ÃÑ ±Ý¾×
	public void accountList() {
		for(int i=0; i<arrBank.length; i++) {
			if(arrBank[i]!=null) {
				
			}
		}
	}
	
	//3.¿¹±Ý
	//- °èÁÂ¹øÈ£, °èÁÂÁÖ, ¿¹±Ý¾×, ÀÜ¾×, °á°ú¹®±¸
	//4.Ãâ±Ý
	//-°èÁÂ¹øÈ£, °èÁÂÁÖ, Ãâ±Ý¾×, ÀÜ¾×, °á°ú¹®±¸
	//5.Á¾·á
	//-Á¾·á ¹®±¸
}

public class BankManagerTest {

	public static void main(String[] args) {
		BankManager bm = new BankManager();
		

		
	}

}
