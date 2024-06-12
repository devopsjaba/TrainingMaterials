package kr.co.kosta6;

public class Member {
	private int memberId;		
	private String memberName;
	public Member(int memberId, String memberName) {
		//super();
		this.memberId = memberId;
		this.memberName = memberName;
	}
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
		return "회원님의 아이디는 " + memberId + ", 이름은 " + memberName + "입니다.";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId)
				return true;
			else 
				return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}
	
	
}











