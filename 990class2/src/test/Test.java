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
		System.out.println("�� ����� ���̴� "+ this.age + "�̸�, �̸���  " + this.name+ "�̸�, ��ȥ ���δ� "
				+ this.isMarried+ " �̸�, �ڳ� ���� "+this.child + "�Դϴ�. ");
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
		System.out.println("�ֹ� ��ȣ : " + orderNumber);
		System.out.println("�ֹ��� ���̵� : " + this.orderID);
		System.out.println("�ֹ� ��¥ : " + orderDate);
		System.out.println("�ֹ��� �̸� : " + this.orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ: " + orderProduct);
		System.out.println("��� �ּ� : " + orderAddress);	
		System.out.println("-----------------------------");
	}
}



public class Test {

	public static void main(String[] args) {
	Person person1 = new Person(40, "James", true, 3);
	person1.showPersonInfo();
		
	Order order1 = new Order("ȫ���", "abc123");
	order1.orderAddress = "����� �������� ���ǵ��� 20����";
	order1.orderDate = "2018�� 3�� 12��";
	order1.orderNumber = "20183120001"; 
	order1.orderProduct = "PD0345-12";
	
	order1.showOrderInfo();

	}

}
