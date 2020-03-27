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
			System.out.print("양면으로 ");
		}
		else {
			System.out.print("단면으로 ");
		}
		
		if(this.numOfPapers>amount) {
			numOfPapers = rest; 
			System.out.println(amount+" 장 출력했습니다. 현재 " + rest +"장 남아 있습니다.");
		}else if(numOfPapers<amount) {
			shortage = amount - numOfPapers;
			numOfPapers = 0;
			System.out.println("모두 출력하려면 용지가 "+ shortage +"매 부족합니다. " + (amount-shortage)+"장만 출력합니다." );
			System.out.println("용지가 없습니다.");
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
//				System.out.print(" 양면으로 ");
//			}else {
//				System.out.print(" 단면으로 ");
//			}
//			int rest=this.numOfPapers-amount;
//			int shortage=amount-numOfPapers;
//			if(this.numOfPapers>amount) {
//				System.out.println(amount+" 장 출력했습니다. 현재 " + (this.numOfPapers-amount) +"장 남아 있습니다.");
//			}else if(this.numOfPapers<amount) {
//				System.out.println("모두 출력하려면 용지가 "+ shortage +"매 부족합니다. " + (amount-shortage)+"장만 출력합니다." );
//			}else if(rest<0) {
//				System.out.println("용지가 없습니다.");
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

