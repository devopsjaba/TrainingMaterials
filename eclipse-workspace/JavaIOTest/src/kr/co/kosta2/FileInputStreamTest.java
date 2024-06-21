package kr.co.kosta2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");	 //input.txt 파일 입력 스트림 생성
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			System.out.println(e);
			//e.printStackTrace();
		} finally {
			try {
				fis.close();		// 열린 스트림은 finally 블록에서 close
			} catch (IOException e) {
				System.out.println(e);
				//e.printStackTrace();
			} catch (NullPointerException e) {		// 스트림이 null인 경우 
				System.out.println(e);
			}
		}
		System.out.println("end");
	}
}
