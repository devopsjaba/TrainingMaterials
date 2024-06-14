package kr.co.kosta2;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		//새로운 회원 객체 생성
		Member member1 = new Member(1001, "홍길동");
		Member member2 = new Member(1002, "신사임당");
		Member member3 = new Member(1003, "이성계");
		Member member4 = new Member(1004, "이방원");
		
		memberArrayList.addMember(member1);
		memberArrayList.addMember(member2);
		memberArrayList.addMember(member3);
		memberArrayList.addMember(member4);
		
		memberArrayList.showInfo();
		
		memberArrayList.removeMember(member3.getMemberId());
		memberArrayList.showInfo();
				
	}
}
