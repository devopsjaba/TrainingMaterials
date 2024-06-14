package kr.co.kosta5;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberL = new Member(2024, "이순신");
		Member memberW = new Member(2025, "원균");
		Member memberR = new Member(2026, "나대용");
		Member memberS = new Member(2027, "류성룡");
		
		memberHashSet.addMember(memberL);
		memberHashSet.addMember(memberW);
		memberHashSet.addMember(memberR);
		memberHashSet.addMember(memberS);
		
		memberHashSet.showAllMembers();
		
		Member memberL2 = new Member(2027, "이도");	//2027 아이디 중복
		memberHashSet.addMember(memberL2);
		memberHashSet.showAllMembers();
	}
}















