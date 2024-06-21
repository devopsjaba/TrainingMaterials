package kr.co.kosta2;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output3.txt", true)) {
			// 파일에 숫자를 쓰면 해당하는 아스키 코드 값으로 변환됨 
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data++;			//A부터 Z까지 배열에 넣기
			}
			fos.write(bs, 2, 10); // 배열의 세 번째 위치부터 10개 바이트 출력
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
