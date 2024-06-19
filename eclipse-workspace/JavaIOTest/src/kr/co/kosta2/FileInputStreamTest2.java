package kr.co.kosta2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
	public static void main(String[] args) {
			
		try(FileInputStream fis = new FileInputStream("input.txt");	) {   //input.txt 파일 입력 스트림 생성
			int i;
			while((i = fis.read()) != -1) {		// i값이 -1이 아닌 동안 read() 메서드로 한 바이트를 반복해 읽음
				System.out.println((char)i);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} 
		System.out.println("end");
	}
}
