package kr.co.kosta3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) {
		long milisecond = 0;
		try(FileOutputStream fos = new FileOutputStream("c1.pdf");
				FileInputStream fis = new FileInputStream("o1.pdf")) {
			milisecond = System.currentTimeMillis();		// 파일 복사를 시작하기 전 시간
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			milisecond = System.currentTimeMillis() - milisecond;	// 파일을 복사하는 데 걸린 시간
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("파일 복사하는 데 " +milisecond+ "(1/1000)초 시간이 소요되었습니다.");
	}
}
