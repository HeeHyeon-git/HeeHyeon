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
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				printMenu();
			}
		}
	}

	public void printMenu() {
		System.out.println("-----------");
		System.out.println("1. 회원등록    |");
		System.out.println("2. 회원삭제    |");
		System.out.println("3. 회원조회    |");
		System.out.println("4. 종료          |");
		System.out.println("-----------");
		System.out.println("번호를 입력하세요");
		num = Integer.parseInt(sc.nextLine());
	}

	public void join() {
		System.out.println("회원 등록을 시작합니다.");
		System.out.println("회원 번호를 입력해주세요");
		int memberId = Integer.parseInt(sc.nextLine());
		System.out.println(" ");

		System.out.println("회원 이름을 입력해주세요");
		String memberName = sc.nextLine();
		System.out.println(" ");

		System.out.println("회원 등급: 1.Basic 2.Gold 3.Vip");
		int choice = Integer.parseInt(sc.nextLine());
		System.out.println(" ");

		Member m;

		switch (choice) {
		case 1:
			m = new BasicMember();
			m.setMemberId(memberId);
			m.setMemberName(memberName);
			MemberList.add(m);
			System.out.println("완료되었습니다.");
			break;
		case 2:
			m = new GoldMember();
			m.setMemberId(memberId);
			m.setMemberName(memberName);
			System.out.println("완료되었습니다.");
			MemberList.add(m);
			break;
		case 3:
			m = new VipMember();
			m.setMemberId(memberId);
			m.setMemberName(memberName);
			System.out.println("완료되었습니다.");
			MemberList.add(m);
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}

	public void delete() {
		System.out.println("삭제할 회원의 번호를 입력하세요");
		int memberId = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < MemberList.size(); i++) {
			if (memberId == MemberList.get(i).getMemberId())
				MemberList.remove(i);
		}
		System.out.println("삭제 되었습니다.");
	}

	public void memberAll() {
		System.out.println("\t회원번호 \t\t회원이름\t운동종목\t회원등급");
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
