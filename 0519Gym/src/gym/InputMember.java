package gym;

import java.util.ArrayList;
import java.util.Scanner;

public class InputMember {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Member> MemberList = new ArrayList<Member>();
	public static int num;

	public void memberInfo() {
		boolean flag = true;
		while (flag) {
			printMenu();

			switch (num) {
			case 1:
				join();
				break;
			case 2:
				delete();
				break;
			case 3:
				memberAll();
				break;
			case 4:
				flag = false;
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				printMenu();
			}
		}
	}

	public void printMenu() {
		System.out.println("-----------");
		System.out.println("1. ȸ�����    |");
		System.out.println("2. ȸ������    |");
		System.out.println("3. ȸ����ȸ    |");
		System.out.println("4. ����          |");
		System.out.println("-----------");
		System.out.println("��ȣ�� �Է��ϼ���");
		num = Integer.parseInt(sc.nextLine());
	}

	public void join() {
		System.out.println("ȸ�� ����� �����մϴ�.");
		System.out.println("ȸ�� ��ȣ�� �Է����ּ���");
		int memberId = Integer.parseInt(sc.nextLine());
		System.out.println(" ");

		System.out.println("ȸ�� �̸��� �Է����ּ���");
		String memberName = sc.nextLine();
		System.out.println(" ");

		System.out.println("ȸ�� ���: 1.Basic 2.Gold 3.Vip");
		int choice = Integer.parseInt(sc.nextLine());
		System.out.println(" ");

		Member m;

		switch (choice) {
		case 1:
			m = new BasicMember();
			m.setMemberId(memberId);
			m.setMemberName(memberName);
			MemberList.add(m);
			System.out.println("�Ϸ�Ǿ����ϴ�.");
			break;
		case 2:
			m = new GoldMember();
			m.setMemberId(memberId);
			m.setMemberName(memberName);
			System.out.println("�Ϸ�Ǿ����ϴ�.");
			MemberList.add(m);
			break;
		case 3:
			m = new VipMember();
			m.setMemberId(memberId);
			m.setMemberName(memberName);
			System.out.println("�Ϸ�Ǿ����ϴ�.");
			MemberList.add(m);
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}

	public void delete() {
		System.out.println("������ ȸ���� ��ȣ�� �Է��ϼ���");
		int memberId = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < MemberList.size(); i++) {
			if (memberId == MemberList.get(i).getMemberId())
				MemberList.remove(i);
		}
		System.out.println("���� �Ǿ����ϴ�.");
	}

	public void memberAll() {
		System.out.println("\tȸ����ȣ \t\tȸ���̸�\t�����\tȸ�����");
		System.out.println("--------------------------------");
		for (Member m : MemberList) {
			System.out.println(m);
		}

	}

	public static void main(String[] args) {
		InputMember kim = new InputMember();
		kim.memberInfo();

	}

}
