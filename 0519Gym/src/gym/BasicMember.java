package gym;

public class BasicMember extends Member {
	
	private int period = 3; //회원 기간
	
	BasicMember(){
		super();
		setMemberGrade("Basic");
	}
	
	
	@Override
	public int getMembership() {
		
		return period;
	}
	
	public void print() {
		System.out.println(getMemberGrade()+"입니다.");
	}

}
