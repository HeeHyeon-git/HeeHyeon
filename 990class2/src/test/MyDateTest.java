package test;
class MyDate{
	private int day;
	private int month;
	private int year;
	private boolean isValid;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
			this.day = day;
	}		
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
			this.month = month;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	public boolean getValid(){
		return isValid;	
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public MyDate() {}
	public MyDate(int month, int day, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public boolean isValid(){
		if(day < 1 || day > 31 || month < 1 || month > 12 ) {
			System.out.println("유효하지 않은 날짜입니다.");
		}
		else {
			System.out.println("유효한 날짜입니다.");
		}
		return this.isValid;			
	} 
}	

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date = new MyDate(30, 2, 2000);
		System.out.println(date.isValid());
		MyDate date1 = new MyDate(2,10,2006);
		System.out.println(date1.isValid());
	
	}

	
}
