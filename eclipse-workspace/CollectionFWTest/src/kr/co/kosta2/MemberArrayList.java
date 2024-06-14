package kr.co.kosta2;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> arrayList;		//ArrayList 선언
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();			//Member형으로 선언한 ArrayList 생성 
	}
	
	public void addMember(Member member) {		//ArrayList에 회원을 추가하는 메서드 
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for(int i = 0; i <arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {	// 회원 아이디가 매개변수와 일치하면 
				arrayList.remove(i);	// 해당 회원 삭제함
				return true;
			}
		}
		
		System.out.println(memberId +"가 존재하지 않습니다.");	// 해당 아이디 가진 회원을 ArrayList에서 찾지 못한경우
		return false;
	}
	
	// 전체 회원을 출력하는 메서드 
	public void showInfo() {				
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}




