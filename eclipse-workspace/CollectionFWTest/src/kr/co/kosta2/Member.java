package kr.co.kosta2;

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
	
	
	
}
