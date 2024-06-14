package kr.co.kosta3;

import java.util.ArrayList;

public class MovieListTest {
	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<>();
		list.add(new Movie("인사이드아웃2", "홍길동", "2024", "미국"));
		list.add(new Movie("인사이드아웃3", "홍길동", "2024", "미국2"));
		list.add(new Movie("인사이드아웃4", "홍길동", "2024", "미국3"));
		
		for(Movie m : list)
			System.out.println(m);
		
		String searchTitle = "인사이드아웃4";
		for(Movie m : list) {
			if(m.getTitle().equals(searchTitle)) {
				System.out.println("제목 : " + m.getTitle());
				System.out.println("감독 : " + m.getDirector());
				System.out.println("개봉년도 : " + m.getYear());
				System.out.println("국가 : " + m.getCountry());
			}
		}
		
	}
}
