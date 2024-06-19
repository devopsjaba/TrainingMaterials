package kr.co.kosta2;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest4 {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			byte[] bs = new byte[10];
			int i,j;
			while((i = fis.read(bs)) != -1) {
				for(int k=0; k<i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(" : " +i+ "바이트 읽음");
			}
			
			while((i = fis.read(bs, 1, 9)) != -1) {
				for(int k=0; k<i; i++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(" : " +i+ "바이트 읽음");
			}
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("end");
	}
}
