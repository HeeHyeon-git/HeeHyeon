package gym;

public class VipMember extends Member {
	private int period = 12;	//ȸ�� �Ⱓ
	
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
		System.out.println(getMemberGrade()+" �Դϴ�.");
	}
	
	
	
	
}
