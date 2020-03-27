package com.huma.ex;
import java.util.*;
class Product{
	public static int totalCount=0;
	public String name;
	public int count=0;
	//�԰�,���,����
	public void add(int count) {
		this.count=this.count+count;
	}
	public void min(int count) {
		this.count=this.count-count;
	}
	public void display() {
		System.out.println("��ü ��ǰ ���� ���� : "+Product.totalCount);
		System.out.println("��ǰ �̸� : "+ this.name);
		System.out.println("��ǰ ���� : "+ this.count);
	}
	//������
	public Product() {
		Product.totalCount++;
	}
	public Product(String name) {
		this(name,0);
	}
	public Product(String name, int count) {
		this();
		this.name = name;
		this.count = count;
	}

	
}

public class ProductTest {
	
	public static void main(String[] args) {
		Product p1 = new Product("�����",100);
		Product p2 = new Product("����",100);
		Product p3 = new Product("���찳",100);
		p1.display();
		p2.display();
		p3.display();
		
		//����� 4�� �Ǹ�
		p1.min(4);
		//���찳 10�� �԰�
		p1.add(10);
		
		Product arr[] = new Product[5];
		arr[0]=p1;
		arr[1]=p2;
		arr[2]=p3;
		arr[3]= new Product("��Ʈ",10);
		
		//��� 20������ ��ǰ�� ����ϴ� ���α׷�
		for(Product p:arr) {
			if(p!=null) {
				if(p.count<=20) {
					p.display();
				}
			}
		}
		
		//������� �Է��� �޾� �ش� ǰ�� ������ ȭ�鿡 �������.		
		System.out.println("------------");
		String input="����";
		for(Product p:arr) {
			if(p!=null) {
				if(p.name.equals(input)) {
					p.display();
				}
			}
		}
		
		//��� 101������ ��ǰ�� ����ϴ� ���α׷�
		System.out.println("-------------");
		int number=101;
		for(int i=0; i<Product.totalCount; i++) {
			if(arr[i].count<number) {
				arr[i].display();
			}
		}
		
		//��ǰ���� ���α׷�
		//1. ��ǰ���
		//2. �԰�
		//3. ���
		//4. ��ǰ�˻�
		//5. ��ǰ��� Ȯ��
		//6. ���� ��ǰ
		
		// ����� ������� �ڹ� ������
		// html/css/javascript/jquery ������ 2��
		// �ٴ����� ������ ���̽� 1��
		// jdbc,java 1��
		// jsp, spring 2��
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
