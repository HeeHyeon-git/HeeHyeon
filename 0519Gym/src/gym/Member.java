package gym;

public abstract class Member {
	private int memberId; 			// ȸ�� ��ȣ
	private String memberName; 		// ȸ�� �̸�
	private String memberGrade; 	// ȸ�� ���

	public String getMemberGrade() {
		return memberGrade;
	}

	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}
	
	public boolean equals(int memberId) {
		if (this.memberId == memberId) {
			return true;
		} else {
			return false;
		}
	}

	public Member() {
		memberId = 0;
		memberName = "";
	}

	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public abstract int getMembership();

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName 
				+ ", memberGrade=" + memberGrade + " ȸ��, membership=" + getMembership() + "����]";
	}

	

}
