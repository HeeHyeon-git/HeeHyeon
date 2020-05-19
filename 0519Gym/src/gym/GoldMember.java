package gym;

public class GoldMember extends Member {
	
	private int period = 6;

	GoldMember(){
		super();
		setMemberGrade("Gold");
	}
	
	@Override
	public int getMembership() {
		// TODO Auto-generated method stub
		return period;
	}
	
	public void print() {
		System.out.println(getMemberGrade()+" ÀÔ´Ï´Ù.");
	}
	

}
