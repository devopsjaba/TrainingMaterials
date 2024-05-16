package kr.co.kosta2;

/*
 * 6층 건물이 있습니다
 * 1층 김밥집, 2층 약국, 3층 피부과, 4층 내과, 5층 헬스 클럽, 6층 KOSTA입니다.
 * 건물의 층을 누르면 그 층이 어떤 곳인지 알려 주는 엘리베이터가 있다고 할때 
 * switch-case문으로 구현하시오.
 * 단, 그외은 "존재하지 않는 층입니다."라고 출력하시오.
 * 
 */
public class SwitchCaseTest2 {
	public static void main(String[] args) {
		int floor = 10;
		String descrition;

		switch (floor) {

		case 1:
			descrition = "1층 김밥집";
			break;
		case 2:
			descrition = "2층 약국";
			break;
		case 3:
			descrition = "3층 피부과";
			break;
		case 4:
			descrition = "4층 내과";
			break;
		case 5:
			descrition = "5층 헬스 클럽";
			break;
		case 6:
			descrition = "6층 KOSTA";
			break;
		default:
			descrition = "존재하지 않는 층";
		}

		System.out.println(descrition + "입니다.");

	}
}
