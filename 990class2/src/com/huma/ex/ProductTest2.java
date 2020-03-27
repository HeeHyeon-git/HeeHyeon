package com.huma.ex;
//��ǰ���� ���α׷�
//1. ��ǰ���
//2. �԰�
//3. ���
//4. ��ǰ�˻�
//5. ��ǰ��� Ȯ��
class ProductManger{
	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public int arrIndex=0;
	public Product [] arrProduct = new Product[10];
	
	public ProductManger() {}
	//1. ��ǰ���
	public void registTestData() {
		Product p1 = new Product("�����",100);
		registProduct(p1);
		Product p2 = new Product("����",100);
		registProduct(p2);
		Product p3 = new Product("���찳",90);
		registProduct(p3);
		Product p4 = new Product("å",70);
		registProduct(p4);
		Product p5 = new Product("����",90);
		registProduct(p5);
	}
	
	public void registProduct(Product p) {
		arrProduct[arrIndex++]=p;
		//arrProduct[Product.totalCount-1]=p;
	}
	public void registProduct() {
		//arrProduct[0]=new Product("�����", 10);
		System.out.println("��ǰ�� ��� ������");
		System.out.println("��ǰ��>>");
		String name=sc.nextLine();
		System.out.println("��ϰ���>>");
		int count=Integer.parseInt(sc.nextLine());
		arrProduct[arrIndex++]
				=new Product(name, count);
	}
	
	//2. �԰�
	public void inputProduct() {
		System.out.println("�԰��� ��ǰ �Է�>>");
		String name = sc.nextLine();
		System.out.println("�԰��� ��ǰ ���� �Է�>>");
		int count = Integer.parseInt(sc.nextLine());
		Product p= searchProduct(name);
		if(p==null) {
			System.out.println("���� ��ǰ�Դϴ�.");
		}else {
			p.count=p.count+count++;
		}
		p.display();
	}
	
	//3. ���
	public void outputProduct() {
		System.out.println("����� ��ǰ �Է�>>");
		String name = sc.nextLine();
		System.out.println("����� ��ǰ ���� �Է�>>");
		int count = Integer.parseInt(sc.nextLine());
		
		Product p= searchProduct(name);
		if(p==null) {
			System.out.println("���� ��ǰ�Դϴ�.");
		}else {
			p.count=p.count-count;
		}
		p.display();
	}
	
	//4. ��ǰ�˻�
	public Product searchProduct(String name) {
		Product returnValue=null;
		for(int i=0; i<arrIndex; i++) {
			if(arrProduct[i].name.equals(name)) {
				returnValue=arrProduct[i];
				break;
			};
		}
		return returnValue;
	}
	
	//5. ��ǰ��� Ȯ��
	public void displayProduct() {
		for(int i=0; i<Product.totalCount; i++) {
			arrProduct[i].display();
		}
	}	

	//6. play �Լ� �����
	public void start() {
		String op="";
		System.out.println("��ǰ ������ ���� �帮�ڽ��ϴ�. ���� �޴��� �������ּ���");
		while(!equals("6")) {
			System.out.println("1.��ǰ ���   2.�԰�  3.���  4.��ǰ �˻�  5.��ǰ��� Ȯ��  6.���� ");
			op=sc.nextLine();
			switch(op) {
			case "1":
				registProduct();
				break;
			case "2":
				inputProduct();
				break;
			case "3":
				outputProduct();
				break;
			case "4":
				System.out.println("ã���ô� ��ǰ�� �̸��� �Է����ּ���");
				String name=sc.nextLine();
				Product returnValue=null;
				for(int i=0; i<arrIndex; i++) {
					if(arrProduct[i].name.equals(name)) {
						returnValue=arrProduct[i];
					}
				}	
				break;		
				
			case "5":
				displayProduct();
				break;
			default:
				System.out.println("�߸� �����̽��ϴ�.");
			}
			
		}
		
	}


}
public class ProductTest2 {

	public static void main(String[] args) {
		
		ProductManger pm = new ProductManger();
		//pm.start() �Լ� �����
		pm.start();
//		pm.registProduct();
//		pm.registTestData();
//		pm.displayProduct();
		

	}

}
