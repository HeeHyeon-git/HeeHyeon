package gym;

public class VipMember extends Member {
	private int period = 12;	//회원 기간
	
	public VipMember() {
		super();
		setMemberGrade("Vip");
	}
	
	@Override
	public int getMembership() {
		// TODO Auto-generated method stub
		return period;
	}
	
	public void print() {
		System.out.println(getMemberGrade()+" 입니다.");
	}
	
	
	
	
}
