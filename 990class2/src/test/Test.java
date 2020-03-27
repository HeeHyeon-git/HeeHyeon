package test;
class Person{
	public int age;
	public String name;
	public boolean isMarried;
	public int child;
	
	public Person() {}
	public Person(int age, String name, boolean isMarried, int child) {
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
		this.child = child;
	}
	
	public void showPersonInfo() {
		System.out.println("----------------------------");
		System.out.println("이 사람의 나이는 "+ this.age + "이며, 이름은  " + this.name+ "이며, 결혼 여부는 "
				+ this.isMarried+ " 이며, 자녀 수는 "+this.child + "입니다. ");
		System.out.println("----------------------------");	
	}

}

class Order{
	public String orderNumber;
	public String orderID;
	public String orderDate;
	public String orderName;
	public String orderProduct;
	public String orderAddress;

	public Order() {}
	public Order(String orderName, String orderID) {
		this.orderNumber = orderName;
		this.orderID = orderID;
	}
	
	public void showOrderInfo() {
		System.out.println("----------------------------");
		System.out.println("주문 번호 : " + orderNumber);
		System.out.println("주문자 아이디 : " + this.orderID);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문자 이름 : " + this.orderName);
		System.out.println("주문 상품 번호: " + orderProduct);
		System.out.println("배송 주소 : " + orderAddress);	
		System.out.println("-----------------------------");
	}
}



public class Test {

	public static void main(String[] args) {
	Person person1 = new Person(40, "James", true, 3);
	person1.showPersonInfo();
		
	Order order1 = new Order("홍길순", "abc123");
	order1.orderAddress = "서울시 영등포구 여의도동 20번지";
	order1.orderDate = "2018년 3월 12일";
	order1.orderNumber = "20183120001"; 
	order1.orderProduct = "PD0345-12";
	
	order1.showOrderInfo();

	}

}
