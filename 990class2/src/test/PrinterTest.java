package test;
class Printer{
	private int numOfPapers = 0;
	private boolean duplex;
	
	public Printer() {}
	public Printer(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}
	
	public int getNumOfPapers() {
		return numOfPapers;
	}
	
	public void print(int amount) {
		int rest=numOfPapers-amount;
		int shortage=amount-numOfPapers;
		if(duplex) {
			System.out.print("������� ");
		}
		else {
			System.out.print("�ܸ����� ");
		}
		
		if(this.numOfPapers>amount) {
			numOfPapers = rest; 
			System.out.println(amount+" �� ����߽��ϴ�. ���� " + rest +"�� ���� �ֽ��ϴ�.");
		}else if(numOfPapers<amount) {
			shortage = amount - numOfPapers;
			numOfPapers = 0;
			System.out.println("��� ����Ϸ��� ������ "+ shortage +"�� �����մϴ�. " + (amount-shortage)+"�常 ����մϴ�." );
			System.out.println("������ �����ϴ�.");
		}
	}
	public boolean getDuplex() {
		return duplex;	
	}
	
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
}	
//	public int getNumOfPapers() {
//		return numOfPapers;
//	}
	
//	public void setNumOfPapers(int numOfPapers, int amount) {
//		this.numOfPapers = numOfPapers;
//		if(duplex==true) {
//				System.out.print(" ������� ");
//			}else {
//				System.out.print(" �ܸ����� ");
//			}
//			int rest=this.numOfPapers-amount;
//			int shortage=amount-numOfPapers;
//			if(this.numOfPapers>amount) {
//				System.out.println(amount+" �� ����߽��ϴ�. ���� " + (this.numOfPapers-amount) +"�� ���� �ֽ��ϴ�.");
//			}else if(this.numOfPapers<amount) {
//				System.out.println("��� ����Ϸ��� ������ "+ shortage +"�� �����մϴ�. " + (amount-shortage)+"�常 ����մϴ�." );
//			}else if(rest<0) {
//				System.out.println("������ �����ϴ�.");
//			}
//		}
//	}	

public class PrinterTest {

	public static void main(String[] args) {
	Printer p1 = new Printer(20, false);
	p1.print(25);
	System.out.println(p1.getNumOfPapers());
//	p1.setDuplex(false);
//	p1.print(10);
//	
		
	
		

		}
	}

