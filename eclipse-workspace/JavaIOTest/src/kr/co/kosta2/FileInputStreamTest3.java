package kr.co.kosta2;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			byte[] bs = new byte[10];
			int i,j;
			while((i = fis.read(bs)) != -1) {
				for(j = 0; j < i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(": " +j+ "바이트 읽음");
			}
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end");
	}
}
