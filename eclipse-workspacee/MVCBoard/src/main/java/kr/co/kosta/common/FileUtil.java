package kr.co.kosta.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.rmi.ServerException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

public class FileUtil {
	
	//파일 업로드
	public static String uploadFile(HttpServletRequest request, String sDirectory) 
				throws ServletException, IOException{
		//Part 객체를 통해 서버로 전송된 파일명 읽어오기
		Part part = request.getPart("ofile");
		
		// Part 객체의 헤더값 중 Content-Disposition 값을 저장
		String partHeader = part.getHeader("content-disposition");
		System.out.println("partHeader = " + partHeader);  //form-data; name="myFile"; filename="foo.txt"
		
		// 헤더값에서 파일명 잘라내기
		String[] pArr = partHeader.split("filename=");
		String originalFileName = pArr[1].trim().replace("\"", "");
		
		//저장(업로드)
		if(!originalFileName.isEmpty())
			part.write(sDirectory + File.separator + originalFileName);
		
		// 원본 파일명 리턴
		return originalFileName;
	}
	
	//파일명 변경
	public static String renameFile(String sDirectory, String fileName) {
		
		//원본파일명 확장자 제거하기
		String ext = fileName.substring(fileName.lastIndexOf("."));
		//새로운 파일명 생성하기
		String now = new SimpleDateFormat("yyyyMMdd_HmsS").format(new Date());
		//파일명 (날짜_시간.확장자)
		String newFileName = now + ext;
		
		//기존 파일명을 새로운 파일명으로 변경
		File oFile = new File(sDirectory + File.separator + fileName);
		File newFile = new File(sDirectory + File.separator + newFileName);
		oFile.renameTo(newFile);
		
		//변경된 파일명 반환
		return newFileName;
	}

	public static void download(HttpServletRequest request, HttpServletResponse response, 
				String directory, String sfileName, String ofileName) {
		String sDirectory = request.getServletContext().getRealPath(directory);
		try {
			// 파일을 찾아 iostream 생성
			File file = new File(sDirectory, sfileName);			
			InputStream iStream = new FileInputStream(file);
			
			// 브라우저 정보 획득 (한글 파일명 깨짐 보정)
			String client = request.getHeader("User-Agent");
			// 웹브라우저 IE가 아닌 경우에는 getBytes("UTF-8")로 원본 파일명을 바이트 배열로 변환함 
			// ISO-8859-1 캐릭터셋의 문자열로 재생성함 
			// 웹브라우저 IE 인 경우에는 getBytes("KSC56018")
			
			if (client.indexOf("WOW64") == -1) {
				ofileName = new String(ofileName.getBytes("UTF-8"), "ISO-8859-1");
			}
			else 
				ofileName = new String(ofileName.getBytes("KSC56018"), "ISO-8859-1");
			
			// 파일 다운로드위한 헤더 설정
			response.reset(); 		// 응답 헤더 초기화 
			response.setContentType("application/octet-stream");	//8비트 단위 바이너리 데이터 
			response.setHeader("Content-Disposition", "attachment; filename= \""  +ofileName+ "\"");
			response.setHeader("Content-Length", "" + file.length());
			
			//response 내장객체로부터 출력 스트림 생성
			OutputStream oStream = response.getOutputStream();
			
			//출력 스트림에 파일 내용 출력
			byte[] b = new byte[(int)file.length()];
			int readBuffer = 0;
			while((readBuffer = iStream.read(b)) > 0) {
				oStream.write(b, 0, readBuffer);
			}
			
			// 입출력 스트림 닫기
			iStream.close();
			oStream.close();
			
				
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			System.out.println("파일을 찾을 수 없거나 지원되지 않는 방식입니다.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("예외가 발생했습니다.");
			e.printStackTrace();
		}
		
	}

	public static void deleteFile(HttpServletRequest request, String directory, String filename) {
		String sDirectory = request.getServletContext().getRealPath(directory);
		File file = new File(sDirectory + File.separator + filename);
		if (file.exists())
			file.delete();
		
	}

}








