package gym;

public class BasicMember extends Member {
	
	private int period = 3; //ȸ�� �Ⱓ
	
	BasicMember(){
		super();
		setMemberGrade("Basic");
	}
	
	
	@Override
	public int getMembership() {
		
		return period;
	}
	
	public void print() {
		System.out.println(getMemberGrade()+"�Դϴ�.");
	}

}
