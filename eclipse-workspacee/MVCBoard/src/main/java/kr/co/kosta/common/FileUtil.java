package kr.co.kosta.common;

import java.io.File;
import java.io.IOException;
import java.rmi.ServerException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.Part;

public class FileUtil {
	
	//파일 업로드
	public static String uploadFile(HttpServletRequest request, String sDirectory) 
				throws ServletException, IOException{
		//Part 객체를 통해 서버로 전송된 파일명 읽어오기
		Part part = request.getPart("ofile");
		
		// Part 객체의 헤더값 중 Content-Disposition 값을 저장
		String partHeader = part.getHeader("Content-Disposition");
		System.out.println("partHeader = " + partHeader);  //form-data; name="myFile"; filename="foo.txt"
		
		// 헤더값에서 파일명 잘라내기
		String[] pArr = partHeader.split("filename=");
		String originalFileName = pArr[1].trim().replace("\"", "");
		
		//저장(업로드)
		if(!originalFileName.isEmpty())
			part.write(sDirectory + File.separator + originalFileName);
		
		// 원본 파일명 리턴
		return "originalFileName";
	}

}








